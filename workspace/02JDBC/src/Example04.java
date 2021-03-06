import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example04 {
	public static void main(String[] args) {
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		String sql = null;
		Scanner scan = new Scanner(System.in);
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String driver = "oracle.jdbc.driver.OracleDriver";
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","tiger");
			//stmt = con.createStatement();
			
			//sql = "SELECT * FROM member";
			//res = stmt.executeQuery(sql);
			pstmt = con.prepareStatement("SELECT * FROM member");
			res = pstmt.executeQuery();
			while(res.next()) {
				System.out.print(res.getInt("no")+"\t");
				System.out.print(res.getString("id")+"\t");
				System.out.println(res.getString("pwd"));
			}
			
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩에 실패했습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("sql실행중 오류");
			e.printStackTrace();
		}finally {
			try{if(con!=null) con.close(); if(pstmt!=null) pstmt.close();}catch(Exception e) {}
		}
	}
}

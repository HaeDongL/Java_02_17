import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		String sql = null;
		Scanner scan = new Scanner(System.in);
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			//stmt = con.createStatement();
			System.out.print("삭제할 id 입력 : ");
			String value = scan.nextLine();
			//sql = "DELETE FROM member WHERE id='"+value+"'";
			//System.out.println("실행결과"+stmt.executeUpdate(sql));
			pstmt = con.prepareStatement("DELETE FROM member WHERE id = ?");
			pstmt.setString(1, value);
			pstmt.executeUpdate();
			System.out.println("실행완료");
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

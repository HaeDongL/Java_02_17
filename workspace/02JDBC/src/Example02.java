import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;



public class Example02 {

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
		System.out.print("no 입력 : ");
		int no = scan.nextInt();
		System.out.print("id 입력 : ");
		scan.nextLine();
		String id = scan.nextLine();
		System.out.print("pwd 입력 : ");
		String pwd = scan.nextLine();
		
		
//		sql = "INSERT INTO member "
//				+ "VALUES("+Integer.parseInt(values[0])+",'"+values[1]+"','"+values[2]+"'"
//						+ ")";
//		System.out.println("실행 결과 : "+stmt.executeUpdate(sql));
//		System.out.println("입력 완료");
		//sql = "INSERT INTO member(?,?,?)";
		//stmt = con.prepareStatement(sql);
		pstmt = con.prepareStatement("INSERT INTO member VALUES(?,?,?)");
		pstmt.setInt(1,no);
		pstmt.setString(2,id);
		pstmt.setString(3,pwd);
		System.out.println("실행결과: "+pstmt.executeUpdate());
		}catch(ClassNotFoundException e) {
			System.out.println("driver loading에 실패했습니다.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("SQL 실행중 오류");
			e.printStackTrace();
		}finally {
			try{if(con!=null) con.close(); if(pstmt!=null) pstmt.close();}catch(Exception e) {}
		}
	}

}

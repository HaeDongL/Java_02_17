package Test;

import java.sql.*;

public class CreateJDBC {

	/*
	 * FileName: CreateJDBC.java
	 * 1.JDBC Programming 절차
	 * 2.각각의 JDBC Programming 절차 에서 발생하는 Exception 이해
	 * 3.excuteQuery(SQL),executeUpdate(SQL)Method 이해
	 */
	
	//main
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		//1. Connection :: Login 과정을 추상화한 interface
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 해당 드라이버를 사용하겠다는 의미.
			System.out.println("1.driver login OK");
		}catch(ClassNotFoundException e) {
			System.out.println("\n==>Driver Loading시 Exception 발생 \n");
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(url,"scott","tiger");
			System.out.println("2.connection 인스턴스 생성 완료");
		}catch(SQLException e) {
			System.out.println("\n==> JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			e.printStackTrace();
		}
		
		//2.Statement::Query 전송을 추상화한 interface
		try {
			stmt = con.createStatement();
			System.out.println("3.statement객체 생성 완료");
		}catch(SQLException e) {
			System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			e.printStackTrace();
		}
		
		//Create Query 만들기
		String createSql=
				"CREATE TABLE firstJDBC"+
						"(no		NUMBER(3),"+
						"name		VARCHAR2(20),"+
						"email		VARCHAR2(30),"+
						"address	VARCHAR2(50))";
		try {
			System.out.println("::QUERY 전송결과 : "+stmt.executeLargeUpdate(createSql));
			System.out.println("4.query전송완료");
		}catch(SQLException e) {
			System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			e.printStackTrace();
		}
		
		try {
			if(stmt != null)	stmt.close();
			if(con != null)		con.close();
		}catch(SQLException e) {
			System.out.println("\n==>JDBC 절차 중 Exception 발생 : "+e.getErrorCode());
			e.printStackTrace();
		}
	}

}

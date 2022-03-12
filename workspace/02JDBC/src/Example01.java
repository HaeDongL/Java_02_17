

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Example01 {

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		try {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("driver �ε� �Ϸ�");
		String sql = "CREATE TABLE member("
				+ "no NUMBER,"
				+ "id VARCHAR2(10),"
				+ "pwd VARCHAR2(10))";
		
		con = DriverManager.getConnection(url,"scott","tiger");
		stmt = con.createStatement();
		System.out.println("::QUERY ���۰��"+stmt.executeUpdate(sql));
		System.out.println("���� �Ϸ�");
		
		}catch(ClassNotFoundException e) {
			System.out.println("����̹� �ε� ����");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("sql ������ ����");
			e.printStackTrace();
		}finally {
			try{if(con!=null) con.close(); if(stmt!=null) stmt.close();}catch(Exception e) {}
		}
	}

}

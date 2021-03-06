package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager02 {
		
		static {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		
		public void printEmployee(String name, int salary) throws SQLException {
			String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dburl,"hr","hr");
			Statement stmt = null;
			PreparedStatement pstmt = null;
			ResultSet res = null;
			/*이곳에 프로그램을 완성하십시오.*/
			String url = null;
			url = "SELECT\r\n"
					+ "employee_id, first_name, salary\r\n"
					+ "FROM employees \r\n"
					+ "WHERE LOWER(first_name) LIKE ?\r\n"
					+ "AND salary >= ?";//+salary;'
			//stmt = conn.createStatement();
			pstmt = conn.prepareStatement(url);
			pstmt.setString(1,"%"+name+"%");
			pstmt.setInt(2, salary);
			//res = stmt.executeQuery(url);
			res = pstmt.executeQuery();
			while(res.next()) {
				System.out.println(res.getInt("employee_id")+" "+res.getString("first_name")+" "+res.getInt("salary"));
			}
			
			conn.close();
			pstmt.close();
			res.close();
		}
		
		
	public static void main(String[] args) throws SQLException{
		new EmpManager02().printEmployee("al",4000);
	}

}

package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Prob6 {
	
	private static void printEmployeeList(String cityName, String deptName) throws Exception{

		Connection con = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String dburl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		con = DriverManager.getConnection(dburl,"hr","hr");
		//stmt = con.createStatement();
//		String sql = "SELECT\r\n"
//				+ "l.city, d.department_name, e.first_name, e.salary\r\n"
//				+ "FROM employees e, departments d, locations l\r\n"
//				+ "WHERE e.department_id = d.department_id\r\n"
//				+ "AND d.location_id = l.location_id\r\n"
//				+ "AND LOWER(l.city) LIKE '%"+cityName+"%'\r\n"
//				+ "AND LOWER(d.department_name) LIKE '%"+deptName+"%'";
		
		String sql = "SELECT\r\n"
		+ "l.city, d.department_name, e.first_name, e.salary\r\n"
		+ "FROM employees e, departments d, locations l\r\n"
		+ "WHERE e.department_id = d.department_id\r\n"
		+ "AND d.location_id = l.location_id\r\n"
		+ "AND LOWER(l.city) LIKE ?\r\n"
		+ "AND LOWER(d.department_name) LIKE ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, "%"+cityName+"%");
		pstmt.setString(2, "%"+deptName+"%");
		rs = pstmt.executeQuery();
		
		while(rs.next()) {
			System.out.println(rs.getString("city")+" "+rs.getString("department_name")
			+" "+rs.getString("first_name")+" "+rs.getInt("salary"));
		}
		
	}
	
	public static void main(String[] args) throws Exception {
		printEmployeeList("lon","resource");
	}
}

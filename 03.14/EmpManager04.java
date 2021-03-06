package jdbcexam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpManager04 {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void printEmployee(String[] jobs) throws SQLException {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(dburl, "hr", "hr");
		// Statement stmt = null;
		ResultSet res = null;
		PreparedStatement pstmt = null;
//		String sql = "SELECT\r\n"
//				+ "e.employee_id, e.first_name, e.salary\r\n"
//				+ "FROM employees e, jobs j\r\n"
//				+ "WHERE j.job_title IN('"+jobs[0]+"','"+jobs[1]+"') "
//				+ "ORDER BY e.employee_id";

		String sql = "SELECT\r\n" + "e.employee_id, e.first_name, e.salary\r\n" + "FROM employees e, jobs j\r\n"
				+ "WHERE j.job_title IN(?,?) " + "ORDER BY e.employee_id";
		// stmt = conn.createStatement();
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, jobs[0]);
		pstmt.setString(2, jobs[1]);
		res = pstmt.executeQuery();
		while (res.next()) {
			System.out.println(
					res.getInt("employee_id") + " " + res.getString("first_name") + " " + res.getInt("Salary"));
		}
		conn.close();
		pstmt.close();
		res.close();

	}

	public static void main(String[] args) throws SQLException {
		String[] jobs = { "Accountant", "Stock Clerk" };
		new EmpManager04().printEmployee(jobs);
	}
}

package servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import oracle.jdbc.pool.OracleConnectionPool;

/*
 * FileName : UserPoolDao.java
 * ::JDBC ���� �� Connection �ν��Ͻ� ���� �� ���� �����ϴ� Connection Pool ���
 */

public class UserPoolDao {
	
	//Field
	//String dburl="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	//String dbuser="scott";
	//String dbpwd = "tiger";
	
	//Constructor
	public UserPoolDao() {
	}
	
	//Method
	public void getUser(UserVO userVO) {
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet rs = null;
		
		try {
			//1�ܰ� Connection
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			//Connection con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			
			//==>OracleConnectionPool�� ���� Connecton �ν��Ͻ� Get
			con = OracleConnectionPool.getInstance().getConnection();
			//2�ܰ� Statement
			pStmt = con.prepareStatement("SELECT id, pwd FROM users WHERE id=? AND pwd=?");
			pStmt.setString(1, userVO.getId());
			pStmt.setString(2, userVO.getPwd());
			
			//3�ܰ� resultSet
			rs = pStmt.executeQuery();
			if(rs.next()) {
				System.out.println("db���� Ȯ�� �� ip,pwd ==> : "+userVO.getId()+":"+userVO.getPwd());
				//==> Data�� ���� �Ѵٸ�...
				userVO.setActive(true);
			}else {
				System.out.println("db�� <"+userVO.getId()+">�� �ش��ϴ� �ڷᰡ �����ϴ�.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception e) {}
			}
			
			if(pStmt!=null) {
				try {
					pStmt.close();
				}catch(Exception e) {}
			}
			
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e) {}
			}
			
		}
	}
	
}

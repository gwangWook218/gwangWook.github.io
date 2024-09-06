package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl21v", "akw", "1234");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("DB 연결 실패");
			e.printStackTrace();
		}
		
		return con;
	}
	
	public static void close(Connection con, PreparedStatement psmt) {
		if(psmt != null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("PreparedStatement close 실패");
				e.printStackTrace();
			}
		}
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Connection close 실패");
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection con, PreparedStatement psmt, ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("ResultSet close 실패");
				e.printStackTrace();
			}
		}
		close(con, psmt);
	}
}
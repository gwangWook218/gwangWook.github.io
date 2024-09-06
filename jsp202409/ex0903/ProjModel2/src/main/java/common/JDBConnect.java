package common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnect {
	public Connection con;
	public Statement stmt;
	public PreparedStatement psmt;
	public ResultSet rs;
	
	public JDBConnect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:orcl21v";
			String id = "akw";
			String pass = "1234";
			con = DriverManager.getConnection(url, id, pass);
			
			System.out.println("DB 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		try {
			if (rs != null) rs.close();
			if (stmt != null) stmt.close();
			if (psmt != null) psmt.close();
			if (con != null) con.close();
			
			System.out.println("JDBC 자원 해체");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

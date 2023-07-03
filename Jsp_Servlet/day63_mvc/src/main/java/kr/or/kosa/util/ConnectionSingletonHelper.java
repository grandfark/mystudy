package kr.or.kosa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionSingletonHelper {

	private static Connection conn;

	private ConnectionSingletonHelper() {
	}

	public static Connection getConnection(String dsn) {
		if (conn != null) {
			return conn;
		}
		try {
			if (dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:mysqsl:thin:@localhost:3305:kosaDB", "system", "mysql");
				System.out.println("MYSQL connection success!!");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
				System.out.println("Oracle connection success!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return conn;
	}
	/*
	public static void close() throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
	}
	 */
	public static void close(Connection conn) throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
	}

	public static void close(Statement stmt) throws SQLException {
		if(stmt != null) {
			stmt.close();
		}
	}
	public static void close(PreparedStatement pstmt) throws SQLException{
		if(pstmt != null) {
			pstmt.close();
		}
	}
	public static void close(ResultSet rs) throws SQLException{
		if(rs != null) {
			rs.close();
		}
	}
}

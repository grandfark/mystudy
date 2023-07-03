package kr.or.kosa.util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ConnectionHelper {
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("oracle")) {
				try {
					Context ctx = new InitialContext();
					DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/MemoDB");
					conn = ds.getConnection();

					return conn;
				} catch (Exception e) {
					System.out.println("Connection : " + e.getMessage());
					return null;
				}

			} else if (dsn.equals("mysql")) {
				try {
					Class.forName("oracle.jdbc.OracleDriver");
					conn = DriverManager.getConnection("jdbc:mysqsl:thin:@localhost:3305:kosaDB", "system", "mysql");

					return conn;
				} catch (Exception e) {
					return null;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
		return conn;
	}
}

package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
  ConnectionHelper 클래스의 문제
  매번 드라이버 load connection 객체 생성
	
  하나의 프로세스에 하나만 만들어서 재사용하게 하는것
	
  해결방법--> 공유자원(싱글톤) 
 */
public class ConnectionSingletonHelper {
	//하나의 프로ㅔ스에서 공통으로 사용할 수 있는 공용자원(static)
	private static Connection conn;
	private ConnectionSingletonHelper() {}
	
	public static Connection getConnection(String dsn) {
		if(conn != null) { return conn ; }//중요
		try {
			if(dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:mysqsl:thin:@localhost:3305:kosaDB","system", "mysql");
				System.out.println("MYSQL connection success!!");
			}else if(dsn.equals("oracle")){
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system", "oracle");
			System.out.println("Oracle connection success!!");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			return conn;
		}
	}
	public static void close() throws SQLException{
		if(conn != null) {
			if(!conn.isClosed()) {//열려야 닫는다.
				conn.close();
			}
		}
	}
}

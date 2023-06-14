package util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
	DB 연결 정보 반복적인 코딩 해결 목적
	다른 클래스에서 아래 코드를 구현하지 않도록 설계한다.
	
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		ConnectionHelper.getConnection("mysql")or("oracle"),...;//오라클이나 mysql이나 
		dsn ==> date source name으로 처리한다.
 */
public class ConnectionHelper {
	// method(접근 지정자: public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:mysqsl:thin:@localhost:3305:kosaDB", "system", "mysql");
				System.out.println("MYSQL connection success!!");
			}
			
			else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
				System.out.println("Oracle connection success!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menuHelp() {
		System.out.println("\n-=-=-=-=-=-=-JDBC-=-=-=-=-=-=-=-=-");
		System.out.println("\t 0. rollback");
		System.out.println("\t 1. 전체보기 ");
		System.out.println("\t 2. 레코드 삽입(추가) ");
		System.out.println("\t 3. 레코드 수정 ");
		System.out.println("\t 4. 레코드 삭제 ");
		System.out.println("\t 5. 조건에 의한 레코드 검색(ex>gno) ");
		System.out.println("\t 6. 프로그램 종료 ");
		System.out.println("\t 9. commit ");
		System.out.println("\t>>원하는 메뉴를 선택하시오.");
	}
}

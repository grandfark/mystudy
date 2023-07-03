package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
	DB ���� ���� �ݺ����� �ڵ� �ذ� ����
	�ٸ� Ŭ�������� �Ʒ� �ڵ带 �������� �ʵ��� �����Ѵ�.
	
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		ConnectionHelper.getConnection("mysql")or("oracle"),...;//����Ŭ�̳� mysql�̳� 
		dsn ==> date source name���� ó���Ѵ�.
 */
public class ConnectionHelper {
	// method(���� ������: public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:mysqsl:thin:@localhost:3305:kosaDB", "system", "mysql");
//				System.out.println("MYSQL connection success!!");
			}
			
			else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
//				System.out.println("Oracle connection success!!");
				
				System.out.println("guset Book connection success!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-=-=-JDBC-=-=-=-=-=-=-=-=-");
		System.out.println("\t 0. rollback");
		System.out.println("\t 1. ��ü���� ");
		System.out.println("\t 2. ���ڵ� ����(�߰�) ");
		System.out.println("\t 3. ���ڵ� ���� ");
		System.out.println("\t 4. ���ڵ� ���� ");
		System.out.println("\t 5. ���ǿ� ���� ���ڵ� �˻�(ex>gno) ");
		System.out.println("\t 6. ���α׷� ���� ");
		System.out.println("\t 9. commit ");
		System.out.println("\t>>���ϴ� �޴��� �����Ͻÿ�.");
	}
}

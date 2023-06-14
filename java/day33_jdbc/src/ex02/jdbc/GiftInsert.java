package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		//insert (DML사용 - insert) Statement/ PreparedStatement
		Statement stmt = conn.createStatement();
		
		//insert into gift values(11,'종합과자', 1000, 20000);
		//1. 고정값 레코드 입력
//		String sql = "INSERT INTO GIFT VALUES(11,'종합과자22', 1000, 20000)";
		
		//2. 레코드 값을 입력 받아서 처리 - 스캐너, IO, main.args
		String sql = "INSERT INTO GIFT VALUES("+args[0]+",'"+args[1]+"',"+ args[2] + "," +args[3]+")";
		System.out.println(sql);
		
		int result = stmt.executeUpdate(sql);
		System.out.println(result+"개 데이터 추가 성공함");
		stmt.close(); conn.close();
	}
}

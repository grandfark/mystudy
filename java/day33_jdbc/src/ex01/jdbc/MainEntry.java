package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1단계 Driver load. 예외가 발생한다.
//		Class.forName("oracle.jdbc.driver.OracleDriver");//일반적인 문자열을 객체로 바꿔주는 역할, 드라이버를 불러오는 역할
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!!");
		//2단계 Connection & Open
					//driver:@IP:portNumber:SID(or 전역데이터베이스명);
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "parks";
		String pwd = "parks";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		System.out.println("Connection success!!!");
		//3단계 사용(DML 명령어)
		//4단계 Close (자원반환)
	}
	//SQL,Tag는 자바에서 문자열 취급한다.
}





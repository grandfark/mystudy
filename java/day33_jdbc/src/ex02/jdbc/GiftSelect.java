package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//1단계 Driver load. 예외가 발생한다.
		Class.forName("oracle.jdbc.OracleDriver");
		//2단계 Connection & Open
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		//3단계 사용(DML 명령어)
		Statement stmt = conn.createStatement();
		stmt.executeQuery("select * from gift");
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");//자바는 대소문자 구분
		System.out.println("상품번호\t상품명\t\t최저가\t최고가");
		while(rs.next()) {//필드를 내리지 않으면 보기 않좋으니 바로 내리면서 돌린다.
			int gno = rs.getInt(1);
			
			String gname = rs.getString("gname");
			int g_s =rs.getInt(3);
			int g_e = rs.getInt("g_end");
			System.out.println(gno + "\t\t" +gname+ "\t" +g_s+"\t"+g_e);
		}
		//4단계 Close (자원반환)
		rs.close(); stmt.close(); conn.close();
	}
}

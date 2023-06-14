package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		//insert (DML사용 - insert) Statement/ PreparedStatement
		String sql = "insert into gift values(?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, 20);
		pstmt.setString(2, "초콜렛");
		pstmt.setInt(3, 3000);
		pstmt.setInt(4, 9999);
		
		int result =pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete
				
		System.out.println(result+"개 데이터 추가 성공함");

		pstmt.close(); conn.close();
	}
}

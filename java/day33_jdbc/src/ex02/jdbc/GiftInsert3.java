package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Scanner sc = new Scanner(System.in);
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		//insert (DML사용 - insert) Statement/ PreparedStatement
		System.out.println("Gift table data input : 상품번호/ 상품명/ 최저가/ 최고가");
		String sql = "insert into gift values(?,?,?,?)";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		
		int result =pstmt.executeUpdate(); //반환값이 없는 경우 - insert, update, delete
				
		System.out.println(result+"개 데이터 추가 성공함");

		pstmt.close(); conn.close();
	}
}

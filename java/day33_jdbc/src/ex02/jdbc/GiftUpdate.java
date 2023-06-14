package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		
		Scanner sc = new Scanner(System.in);
		
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url,uid,pwd);
		
		System.out.println("Gift table data input : 상품번호/ 상품명/ 최저가/ 최고가");
		String update = "update gift set gname=?, g_start=?, g_end=? where gno = ?";		
		
		PreparedStatement pstmt = conn.prepareStatement(update);
		pstmt.setInt(4, sc.nextInt());
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		
		int result =pstmt.executeUpdate();
		
		System.out.println(result+"개 데이터 변경 성공함");
		pstmt.close(); conn.close();
	}
}

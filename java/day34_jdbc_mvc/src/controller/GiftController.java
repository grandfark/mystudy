package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.GiftVO;

public class GiftController {//controller
	public static void main(String[] args) throws SQLException {

	}
	//연결, 삽입, 삭제, 수정, 검색
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static PreparedStatement pstmt = null;
	static Connection conn = null;
	//connect
	public static void connect() {
		try {
			conn=ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false);//자동 커밋 기능 끄기
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//close
	public static void close() {
		try {
			CloseHelper.close(rs); CloseHelper.close(stmt);CloseHelper.close(pstmt); CloseHelper.close(conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void menu() throws SQLException{
		GiftVO vo = new GiftVO();
			while(true) {
			System.out.println();
			ConnectionHelper.menu();
			
				switch(sc.nextInt()) {
				case 0: System.out.println("commit 하시겠습니까?(Y/N)");
						System.out.println("안하시면 Rollback 됩니다.");
						if(sc.next().equalsIgnoreCase("Y")) {
							conn.commit();//예외 발생 가능
							selectAll(vo.getClassName());
						}else {
							conn.rollback();
							selectAll(vo.getClassName());
						break;
						}
						
				case 1: selectAll(vo.getClassName()); break;
				case 2: insert(); selectAll(vo.getClassName()); break;
				case 3: update(vo.getClassName()); selectAll(vo.getClassName());break;
//				case 4: delete(vo.getClassName()); break;
//				case 5: delete(vo.getClassName()); break;
//				case 6: selectByGno(vo.getClassName()); break;
//				case 77: close(); System.out.println("프로그램을 종료합니다"); 
//					System.exit(0); break;
				case 9: conn.commit();
				System.out.println("성공적으로 완료되었습니다."); break;
					
				}
			}//end while 
	}// end menu
	
	
	//selectAll
	public static void selectAll(String className)throws SQLException{
		rs = stmt.executeQuery("Select * from " + className);
		
		ResultSetMetaData rsmd = rs.getMetaData();//해당 테이블에 대한 정보
		int count = rsmd.getColumnCount();//칼럼의 개수
		
		while(rs.next()) {
			for(int i = 1; i <= count ; i++) {//각 타입별로 출력하기
				
				switch(rsmd.getColumnType(i)) {
				case Types.NUMERIC:
				case Types.INTEGER:
					System.out.println(rsmd.getColumnLabel(i)+":"+rs.getInt(i)+" ");
					break;
				
				case Types.FLOAT:
					System.out.println(rsmd.getColumnClassName(i)+":"+rs.getFloat(i)+" ");
					break;

				case Types.DOUBLE:
					System.out.println(rsmd.getColumnLabel(i)+":"+rs.getDouble(i)+" ");
					break;
					
				case Types.CHAR:
					System.out.println(rsmd.getColumnLabel(i)+":"+rs.getString(i)+" ");
					break;
					
				case Types.DATE:
					System.out.println(rsmd.getColumnLabel(i)+":"+rs.getDate(i)+" ");
					break;
					
				default:
					System.out.println(rsmd.getColumnLabel(i)+":"+rs.getString(i)+" ");
					break;
				}//switch end
			}//for end
			System.out.println();
		}//while end
		
	}//end selectAll
	
	
	//insert
	public static void insert() {
		System.out.print("GNO : ");String gno = sc.next();
		System.out.print("GNAME: ");String gname = sc.next();
		System.out.print("G_START: ");String g_start = sc.next();
		System.out.print("G_END: ");String g_end = sc.next();
		try {
			pstmt = conn.prepareStatement("insert into gift values(?,?,?,?)");
			pstmt.setString(1, gno);
			pstmt.setString(2, gname);
			pstmt.setString(3, g_start);
			pstmt.setString(4, g_end);
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터가 추가 되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}//end insert()
	public static void update(String string)  {
	      System.out.println("상품번호를 입력하시오."); String gno = sc.next();
	      System.out.println("상품이름을 새로 입력하시오."); String gname = sc.next();
	      System.out.println("상품최저가를 새로 입력하시오."); String g_start = sc.next();
	      System.out.println("상품최고가를 새로 입력하시오."); String g_end = sc.next();
	      
	      try {
	         pstmt = conn.prepareStatement("update gift set gname=?, g_start = ?, g_end=? where gno=?");
	         pstmt.setString(4, gno);  pstmt.setString(4, gno);
	         pstmt.setString(1, gname);pstmt.setString(1, gname);
	         pstmt.setString(2, g_start); pstmt.setString(2, g_start);
	         pstmt.setString(3, g_end); pstmt.setString(3, g_end);
	         
	         int result = pstmt.executeUpdate();
	         System.out.println(result + "데이터가 변경 되었습니다.");
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      
	   }// end update
}

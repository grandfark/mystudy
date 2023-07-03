package kr.or.kosa.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.sql.DataSource;

import kr.or.kosa.dto.MemoDTO;
import kr.or.kosa.util.ConnectionHelper;
import kr.or.kosa.util.ConnectionSingletonHelper;

//싱글톤
//	Connection conn = null;
//	public MemoDao() {
//	conn = ConnectionSingletonHelper.getConnection("oracle");
//}

public class MemoDAO {
	// Pool
	Connection conn = null;
	DataSource ds = null;

	public MemoDAO() {
		try {
			// jndi
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/MemoDB");
//			System.out.println("connection test success");//연결확인
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 삽입
	public int insertMemo(MemoDTO dto) {
		int resultrow = 0;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO MEMO(ID, EMAIL, CONTENT) VALUES(?,?,?)";

		// pool
		Connection conn = null;

		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getEmail());
			pstmt.setString(3, dto.getContent());

			resultrow = pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ConnectionSingletonHelper.close(pstmt);
				ConnectionSingletonHelper.close(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return resultrow;
	}// insert end

	// 전체조회
	public List<MemoDTO> selectAllMemo() throws Exception {
		PreparedStatement pstmt = null;
		String sql = "SELECT * FROM MEMO";// "*"를 사용해도 된다.
		// pool///////
//		Connection conn = ds.getConnection();
		Connection conn = ConnectionHelper.getConnection("oracle");// dbcp

		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();

		List<MemoDTO> list = new ArrayList<>();

		while (rs.next()) {
			MemoDTO dto = new MemoDTO();
			dto.setId(rs.getString("id"));
			dto.setEmail(rs.getString("email"));
			dto.setContent(rs.getString("content"));

			list.add(dto);
		}
		// pool에게 연결 객체 반환///////
		conn.close();
		///////////////////////////
		return list;
	}// select end

	// id중복 확인
	public String isCheckById(String id) throws ServletException, IOException, SQLException {

		Connection conn = ConnectionHelper.getConnection("oracle");
		String sql = "select id from memo where id = ?";
		String isDbId = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			// 같은 ID가 존재한다면
			isDbId = "false";
		} else {
			// 사용가능한 ID
			isDbId = "true";
		}

		rs.close();
		pstmt.close();
		conn.close();
		return isDbId;
	}// id check end

	// update
	public int updateMemo(MemoDTO dto) throws Exception {
		int updatetrow = 0;
		PreparedStatement pstmt = null;
		String sql = "update memo set content =? where id=? and email=?";
		Connection conn = null;
		try {
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getContent());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getContent());

			updatetrow = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return updatetrow;

		/*
		 * // pool
		 * 
		 * try { conn = ds.getConnection(); pstmt = conn.prepareStatement(sql);
		 * 
		 * pstmt.setString(1, dto.getId()); pstmt.setString(2, dto.getEmail());
		 * pstmt.setString(3, dto.getContent());
		 * 
		 * resultrow = pstmt.executeUpdate();
		 * 
		 * } catch (Exception e) { e.printStackTrace(); } finally { try {
		 * ConnectionSingletonHelper.close(pstmt);
		 * ConnectionSingletonHelper.close(conn); } catch (Exception e) {
		 * e.printStackTrace(); } }
		 */

	}
	// delete

	// selectbyid(String id)

}
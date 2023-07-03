package edu.kosa.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.spi.DirStateFactory.Result;
import javax.sql.DataSource;

import dbConn.util.CloseHelper;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}

	// ����κ�
	public Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
//		Context envCtx = (Context) initCtx.lookup("java:comp/env");
//		DataSource ds = (DataSource) envCtx.lookup("jdbc:MemberDB");

		DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc:MemberDB");

//		Connection conn = ds.getConnection();
//		System.out.println("Connection.");
		return ds.getConnection();
	}// ���� Ȯ�� ����

	// insert ó��: ȸ������ ó�� �޼ҵ�(����)
	public void insert(MemberVO vo) throws Exception {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO MEMBERS (ID, PASSWD, NAME, JUMIN1, JUMIN2,");
		sb.append(" EMAIL, BLOG, REG_DATE) VALUES(?,?,?,?,?,?,?,?)");

		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setString(1, vo.getId());
		pstmt.setString(2, vo.getPasswd());
		pstmt.setString(3, vo.getName());
		pstmt.setString(4, vo.getJumin1());
		pstmt.setString(5, vo.getJumin2());
		pstmt.setString(6, vo.getEmail());
		pstmt.setString(7, vo.getBlog());
		pstmt.setTimestamp(8, vo.getReg_date());

		int result = pstmt.executeUpdate();
		System.out.println("result:" + result);
	}// insert() end

	// userCheck(id, pwd) - �α��ν� ����� �޼ҵ�
	public int userCheck(String id, String pwd) throws Exception {
		String sql = "SELECT * FROM MEMBERS WHERE ID = ? ";
		String dbpwd = "";
		int result = -1;
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();// ��ȯ ���� �ִ� ���

		if (rs.next()) {
			dbpwd = rs.getString("passwd");
			if (dbpwd.equals(pwd)) {
				result = 1;
			} // ��������
			else {
				result = 0;
			} // ��������
		} else {
			result = -1;
		}
		CloseHelper.close(rs);
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);
		return result;
	}

	public int confirmID(String id) throws Exception {
		String sql = "SELECT ID FROM MEMBERS WHERE ID = ? ";
		int result = -1;

		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);

		ResultSet rs = pstmt.executeQuery();

		if (rs.next())
			result = 1;
		else
			result = -1;
		CloseHelper.close(rs);
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);

		return result;
	}

	// getMember(id) - update 
	public MemberVO getMember(String id) throws Exception {
		String sql = "SELECT * FROM MEMBERS WHERE ID = ?";
		MemberVO vo = null;
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setPasswd(rs.getString("passwd"));
			vo.setJumin1(rs.getString("jumin1"));
			vo.setJumin2(rs.getString("jumin2"));
			vo.setEmail(rs.getString("email"));
			vo.setBlog(rs.getString("blog"));
			vo.setReg_date(rs.getTimestamp("reg_date"));
		} // if end
		CloseHelper.close(rs);
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);
		return vo;
	}// getMember(id) end

	public void update(MemberVO vo) throws Exception {
		String sql = "UPDATE MEMBERS SET PASSWD = ?, EMAIL = ?, BLOG = ? WHERE ID = ?";
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, vo.getPasswd());
		pstmt.setString(2, vo.getEmail());
		pstmt.setString(3, vo.getBlog());
		pstmt.setString(4, vo.getId());
		pstmt.executeUpdate();
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);
	}// update(vo) end

	public ArrayList<MemberVO> selectAll() throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append("select id, name, jumin1, email, blog, reg_date from members");
		sb.append(" order by name desc");
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		ResultSet rs = pstmt.executeQuery();

		MemberVO vo = null;
		ArrayList<MemberVO> list = new ArrayList<>();

		while (rs.next()) {
			vo = new MemberVO();
			vo.setId(rs.getString("id"));
			vo.setName(rs.getString("name"));
			vo.setJumin1(rs.getString("jumin1"));
			vo.setEmail(rs.getString("email"));
			vo.setBlog(rs.getString("blog"));
			vo.setReg_date(rs.getTimestamp("reg_date"));

			list.add(vo);
		} // while end
		CloseHelper.close(rs);
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);
		return list;
	}// selectAll()end

	public void delete(MemberVO vo) throws Exception {
		String sql = "DELETE FROM MEMBERS WHERE PASSWD=?";
		Connection conn = getConnection();
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, vo.getPasswd());
		pstmt.executeUpdate();
		CloseHelper.close(pstmt);
		CloseHelper.close(conn);
	}
}

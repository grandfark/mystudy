package gifts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class giftDAO {
	private static giftDAO instance = new giftDAO();

	public static giftDAO getinstance() {
		return instance;
	}

	private giftDAO() {
	}
	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		DataSource ds = (DataSource) initCtx.lookup("java:comp/env/jdbc:giftDB");

		return ds.getConnection();
	}
	public void giftinsert(giftVO vo) throws Exception {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;

		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO GIFT (GNO, GNAME, G_START, G_END)");
		sb.append(" VALUES(?,?,?,?)");

		pstmt = conn.prepareStatement(sb.toString());
		pstmt.setInt(1, vo.getGno());
		pstmt.setString(2, vo.getGname());
		pstmt.setInt(3, vo.getG_start());
		pstmt.setInt(4, vo.getG_end());

		int result = pstmt.executeUpdate();
	}

	public int checkGift(String gno) throws Exception {
	    String sql = "select gno from gift where gno = ?";
	    int result = -1;
	    
	    Connection conn = getConnection();
	    PreparedStatement pstmt = conn.prepareStatement(sql);
	    pstmt.setString(1, gno);
	    ResultSet rs = pstmt.executeQuery();
	    
	    if (rs.next()) result = 1;
	    else result = -1;
	    return result;
	}

}

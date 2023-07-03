package com.kosa.boardAction;

import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kosa.boardModel.BoardDAO;
import com.kosa.boardModel.BoardVO;

public class WriteProAction implements CommandAction {

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		request.setCharacterEncoding("utf-8");
		BoardVO vo = new BoardVO();
		vo.setNum(Integer.parseInt(request.getParameter("num")));
		vo.setWriter(request.getParameter("name"));
		vo.setSubject(request.getParameter("title"));
		vo.setEmail(request.getParameter("email"));
		vo.setContent(request.getParameter("content"));
		vo.setPasswd(request.getParameter("passwd"));

		vo.setReg_date(new Timestamp(System.currentTimeMillis()));
		vo.setRef(Integer.parseInt(request.getParameter("ref")));
		vo.setRe_step(Integer.parseInt(request.getParameter("re_step")));
		vo.setRe_level(Integer.parseInt(request.getParameter("re_level")));
		vo.setIp(request.getRemoteAddr());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		return "/board/writePro.jsp";
	}

}

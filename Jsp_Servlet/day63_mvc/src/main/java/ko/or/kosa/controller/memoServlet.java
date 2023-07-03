  package ko.or.kosa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.MemoDAO;
import kr.or.kosa.dto.MemoDTO;

@WebServlet("/memo")
public class memoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 1 한글처리
		// 2 데이터 받기
		// 3 DB 연결
		// 4 insert 실행
		// 5 응답구성

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");// 클라이언트에게 전달한 페이지 정보구성

		PrintWriter  out = response.getWriter();

		String id = request.getParameter("id");
		String email = request.getParameter("email");
		String content = request.getParameter("content");

		// out.print(id+", "+email+", "+content);//출력확인(한글처리확인)

		MemoDAO dao = new MemoDAO();
		int su = dao.insertMemo(new MemoDTO(id, email, content));

		if (su > 0) {
			out.print("<script>");
			out.print("alert('등록 성공!!!' );" );
			out.print("location.href='memoList';" );  // jsp >> /memoList.jsp
			out.print("</script>");
			
		}else {
			out.print("<script>");
			out.print("alert('등록 실패!!!' );" );
			out.print("location.href='memo.html';" );  
			out.print("</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

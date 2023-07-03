package ko.or.kosa.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.MemoDAO;

@WebServlet("/Memoid")
public class Memoid extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 비동기 요청을 받아서 전달한 id 값을 받고 request

		// DB연결

		// select id from memo where id = ?
		// isCheckById(String id)

		// isCheckById 호출해서 return 값 받고 ]

		// view생략 out.print로 호출만 한다.
		System.out.println(request.getParameter("id"));

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		MemoDAO dao = new MemoDAO();
		String idcheck = null;
		try {
			idcheck = dao.isCheckById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		request.setAttribute("idcheck", idcheck);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/check.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

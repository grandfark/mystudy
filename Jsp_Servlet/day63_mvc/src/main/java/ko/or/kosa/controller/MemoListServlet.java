package ko.or.kosa.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.kosa.dao.MemoDAO;
import kr.or.kosa.dto.MemoDTO;

@WebServlet("/memoList")
public class MemoListServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		System.out.println("List Servlet!");
		MemoDAO dao = new MemoDAO();

		try {
			List<MemoDTO> list = dao.selectAllMemo();
			request.setAttribute("list", list);
			RequestDispatcher rd = request.getRequestDispatcher("/memoList.jsp");
			rd.forward(request, response);
			
			RequestDispatcher rd2 = request.getRequestDispatcher("/memodelete.jsp");
			rd2.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

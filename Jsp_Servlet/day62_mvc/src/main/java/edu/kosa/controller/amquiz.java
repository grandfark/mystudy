package edu.kosa.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class amquiz extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String info = request.getParameter("info");
		String name = "박광우";
		String addr = "서울시 도봉구";
		String tel = "010-4101-7453";
		Object result = null;

		if (info == null || info.equals("error")) {
			result = "입력된 이름이 없거나, error가 발생하였습니다.";
		} else if (info.equals("name")) {
			result = "입력된 이름은 " + name + " 입니다.";
		} else if (info.equals("addr")) {
			result = "입력된 주소는" + addr + "입니다.";
		} else if (info.equals("tel")) {
			result = "입력된 연락처는" + tel + "입니다.";
		} else {
			result = "입력된 값이 없습니다.";
		}

		request.setAttribute("result", result);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/infoView.jsp");// view page
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}

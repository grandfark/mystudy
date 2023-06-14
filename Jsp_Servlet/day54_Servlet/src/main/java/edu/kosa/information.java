package edu.kosa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

@WebServlet("/info")
public class information extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	request.setCharacterEncoding("utf-8");
	String name =	request.getParameter("name");
	String tel = request.getParameter("tel");
	String addr = request.getParameter("addr");
	
	response.setCharacterEncoding("euc-kr");
	PrintWriter pw = response.getWriter();
	pw.println("<html><head><title>Info Result</title></head><body><br>");
	pw.println("<table><tr><td>이름</td><td>"+name+"</td></tr>");
	pw.println("<table><tr><td>연락처</td><td>"+tel+"</td></tr>");
	pw.println("<table><tr><td>주소</td><td>"+addr+"</td></tr></table><br/>");
	pw.println("<a href='html/infoForm.html'>Info input</a>");
	pw.println("</body></html>");
	System.out.println("이름: "+name);
	System.out.println("연락처: " +tel);
	System.out.println("주소: "+addr);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
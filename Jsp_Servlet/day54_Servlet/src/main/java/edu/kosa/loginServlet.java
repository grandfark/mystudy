package edu.kosa;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login") // @webServlet annotation은 모든 정보를 지닌다. URLPattern만 기재하면 된다."/login"은 <-url
						// pattern
public class loginServlet extends HttpServlet {

	public String user = "park";
	public String pass = "1111";

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse Response)
			throws ServletException, IOException {
		System.out.println("login call~~");

		String id = request.getParameter("id");
		String passwd = request.getParameter("pwd");

//		System.out.println("id: "+id + ", " + "pw: " +password);
		Response.setCharacterEncoding("euc-kr");
		PrintWriter pw = Response.getWriter();
		pw.write("<html><head><title>Login Result</title></head><body><b><br>");

		if (user.equals(id) && !passwd.equals(pass)) {
			pw.println("암호가 틀렸습니다.<br/>");
			pw.println("<a href='html/loginForm.html'>Login</a>");
		} else if (user.equals(id) && passwd.equals(pass)) {
			pw.println("반갑습니다.<br/>");
			pw.println(id + "님<br/>");
			pw.println(passwd + "님<br/>");
			pw.println("<a href='html/loginForm.html'>Login</a>");
		} else {
			pw.println("등록되지 않은 사용자 입니다. 회원 가입을 부탁합니다.");
//			pw.println("<a href='html/loginForm.html'>Login</a>");
			pw.println("javascript:history.back()");
		}
		pw.println("</b></body></html>");
		pw.close();
		
	
		/*
		 * pw.write("<html><head><title>hi</title></head>");
		 * pw.write("<body><h1>hello Servlet</h1></body></html>");
		 */
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse Response)
			throws ServletException, IOException {

		doGet(request, Response);
	}

}
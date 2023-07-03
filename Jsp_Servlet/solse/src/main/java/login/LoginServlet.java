package login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DAODTO.DAO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("ID");
		String pwd = request.getParameter("PWD");
		DAO dao = new DAO();
		String selectedPwd = dao.getPwd(id);
		String result = "";
		if(selectedPwd == null) {//�Է��� ������ DB�� ���� ���
			result="NOID";
		}else {
			if(pwd.equals(selectedPwd)) {//�α��� ����
				result="OK";
				HttpSession session = request.getSession();
				if(id.equals("manager")) {
					session.setAttribute("MANAGER", id);
				}else {
					session.setAttribute("USERID", id);
				}
			}else {//��ȣ�� ��ġ���� �ʴ� ���
				result="NOPWD";
			}
		}
		response.sendRedirect(
			"main.jsp?BODY=loginResult.jsp?R="+result+"&ID="+id);
	}

}









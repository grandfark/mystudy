<%@page import="javax.websocket.SendResult"%>
<%@page import="edu.kosa.members.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");

	MemberDAO dao = MemberDAO.getInstance(); //db연결
	int check = dao.userCheck(id, pwd);
	
	if(check == 1){
		session.setAttribute("memID", id);
		response.sendRedirect("main.jsp");
	}else if(check == 0 ){
	%>
<script type="text/javascript">
	<!--
		alert("비밀번호가 틀렸습니다.");
		history.go(-1);
	//-->
	//미작동시 출력할 문구
</script>
<% } else { %>
	<script type="text/javascript">
	<!--
		alert("아이디가 없습니다.");
		history.go(-1);
	//-->
	//미작동시 출력할 문구
</script>
<% }	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginPro.jsp</title>
</head>
<body>

</body>
</html>
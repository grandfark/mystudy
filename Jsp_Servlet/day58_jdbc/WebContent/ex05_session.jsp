<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05_session.jsp Session</title>
</head>
<body>
	<%
	String id = request.getParameter("uid");
	String pwd = request.getParameter("pwd");

	boolean loginState = false;
	//DB연결확인
	//id == pwd 같으면 회원이라 가정하면

	if (id == pwd) {
		session.setAttribute("uid", id);
		loginState = true;
	}
	String userID = (String) session.getAttribute("uid");
	%>
	<h2><%= userID %></h2>
	<%
	if (loginState == true) {
		out.print(id + "님 로그인한 상태");
	} else {
		out.print("로그인 되어있지  않은 상태");
	}

	//	session 제거
	session.invalidate();
	%>
</body>
</html>
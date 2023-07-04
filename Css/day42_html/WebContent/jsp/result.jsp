<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>결과창</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");//언어 설정
// 	response.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String pass = request.getParameter("pwd");
	String mail = request.getParameter("mail");
	
	out.print(name+"님 반갑습니다.");
	out.print("비번은: "+pass+" 입니다.");
	out.print("메일은: "+mail+" 입니다.");
%>
<hr>
<h2><%=name+"님 반갑습니다. 비번은 "+pass+"<br>"+mail %></h2>
</body>
</html>
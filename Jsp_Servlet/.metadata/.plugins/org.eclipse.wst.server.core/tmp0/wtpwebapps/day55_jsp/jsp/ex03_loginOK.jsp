<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_loginOK.jsp</title>
</head>
<body>
	<%
	/*
	1. 한글처리 2.전송방식 method = "post"
	<Connector URIEncoding="UTF-8" connectionTimeout="20000" maxParameterCount="1000" port="8080" protocol="HTTP/1.1" redirectPort="8443" reloadable="true"/>
	*/
	
	request.setCharacterEncoding("utf-8");
	String id = request.getParameter("userid");
	String pw = request.getParameter("pwd");

	String[] hobbys = request.getParameterValues("hobby");//동일한 이름의 checkbox들을 배열로 처리하는 방식
// 	Map map = request.getParameterMap();
// 	String[]hobbys = (String[])map.get("hobby");
	%>
	당신의 id: <%= id %> &nbsp;
	<br> 당신의 pw: <%=pw%> &nbsp;
	<br> 당신의 취미는: &nbsp;
	<%
	if (hobbys != null) {
		for (int i = 0; i < hobbys.length; i++) {
	%>
	<%= hobbys[i] %> &nbsp;&nbsp;&nbsp;&nbsp;
	<%
		} //for end
	} //if end
	%>


</body>
</html>
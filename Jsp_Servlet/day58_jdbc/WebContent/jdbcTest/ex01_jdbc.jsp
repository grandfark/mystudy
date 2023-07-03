<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ex01_jdbc.jsp JDBC</title>
</head>
<body>
	<%
	Connection conn = null;
	try{
		//1.2. 드라이버 로드 및 오픈
		Class.forName("oracle.jdbc.OracleDriver");
		out.print("driver load Success<br/>");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","oracle");
		out.print("Connection Success<br/>");
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		
	}
	%>
</body>
</html>
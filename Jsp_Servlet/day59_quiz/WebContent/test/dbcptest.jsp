<%@page import="javax.naming.InitialContext"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page
	import="javax.naming.Context, javax.naming.Context, javax.sql.DataSource, java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dbcpConnection.jsp</title>
</head>
<body>
	<%
	try {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc:dbcpTest");

		Connection conn = ds.getConnection();

		out.print("DBCP Connection success!!<br><br>");

	} catch (Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>
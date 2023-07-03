<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex06_session.jsp Session Check</title>
</head>
<body>
	<%
	Date time = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:MM:SS");
	%><h3>세션정보</h3>
	브라우저 마다 고유하게 부여하는 Sesison Value :
	<%=session.getId()%><hr>
	<%
	time.setTime(session.getCreationTime());
	%>
	세션이 생성된시간:<%= sdf.format(time) %><hr>

	<%
	time.setTime(session.getLastAccessedTime());
	%> 
	Client 마지막시간:<%= sdf.format(time) %>

</body>
</html>
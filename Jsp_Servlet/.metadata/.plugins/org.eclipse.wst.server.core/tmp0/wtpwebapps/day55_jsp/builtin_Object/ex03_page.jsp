<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="false" %><%-- 에러 발생원인 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_page.jsp page - buffer 사용하기</title>
</head>
<body>
	<%
	for (int i = 0; i < 1000; i++) {
	%>

	hello<%= i %>
	<%
	}//for end
	%>


</body>
</html>
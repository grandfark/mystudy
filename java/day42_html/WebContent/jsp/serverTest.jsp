<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Server Test- Tomcat실행</title>
</head>
<body>
<%-- <% %> 자바를 사용한다.
<%! %> 
<%= %> 바로 출력한다.  --%>
<%= new Date() %><hr color = "red" size="2">
<%
	for(int i = 1; i < 10; i++){
		out.print(i + " ");
	}
%><br>

<%for(int i = 1; i < 10; i++){%>
	hello<%=i %><br>
<%}	%>

</body>
</html>
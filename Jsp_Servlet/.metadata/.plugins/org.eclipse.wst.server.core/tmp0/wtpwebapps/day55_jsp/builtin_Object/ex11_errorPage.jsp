<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- error page로 사용할 페이지에는 기재 되엉 있어야함--%>
<%@ page errorPage="/Error/CommonError.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex11_errorPage.jsp</title>
</head>
<body>
<h2>Error Page Test</h2>

<h3>name:Value: <%= request.getParameter("id").toUpperCase() %></h3>
</body>
</html>
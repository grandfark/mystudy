<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>messageView.jsp</title>
</head>
<body>
	<h1>${result}</h1>
	<c:set value="${str}" var="aa" />
	<h2><font color="red" size="5"> <c:out value="${aa}" /></font></h2>
	<h3>${message}</h3>
</body>
</html>
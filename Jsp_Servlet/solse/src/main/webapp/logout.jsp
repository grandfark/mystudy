<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
	prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="logout.do">
ȯ���մϴ�~ 
	<c:if test="${sessionScope.USERID != null }">
		${sessionScope.USERID}��~<br/>
	</c:if>
	<c:if test="${sessionScope.MANAGER != null }">
		${sessionScope.MANAGER}��~<br/>
	</c:if>	
	<input type="submit" value="�α� �ƿ�"/>
</form>
</body>
</html>









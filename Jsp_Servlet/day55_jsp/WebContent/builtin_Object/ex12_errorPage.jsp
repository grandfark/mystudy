<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="2kb" autoFlush="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex12_errorPage.jsp</title>
</head>
<body>
<h2>web.xml 설정파일을 통해서 에러처리</h2>

<!-- 500 -->
<%
	for(int i = 0 ;i < 5000; i++){
		out.print(i +"<br>");
	}
//위에 autoflush를 false로 지정시 페이지에 에러가 발생한다. 이를 통해 에러테스트를 진행한다.
%>

<%-- 
<!-- 404 error -->
<jsp:forward page="ex1_request.jsp"/><!-- 에러 유발을 위한 없는 주소-->
--%>

</body>
</html>
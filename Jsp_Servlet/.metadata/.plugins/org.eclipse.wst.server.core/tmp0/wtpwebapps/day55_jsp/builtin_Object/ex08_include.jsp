<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%@ include file="/module/SubInclude.jsp" %>  --%>
<!-- 해당 파일을 현재파일 내부에 포함하고 있다. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex08_include.jsp</title>
</head>
<body>
	<jsp:include page="/module/SubInclude.jsp"/>
	<!-- 해당 파일로 이동했다가 돌아오기를 호출하는 만큼 반복한다. num을 고정된 값이 아닌 변하는 값으로 인식한다. -->
	<% int num = 200; %> <!--  동일 변수 선언 되어있는 것으로 확인 가능 -->
	<h3>include File Data</h3>
	SubInclude file data : <%= num %><br>
	<% num =900; %>
	Change Data:<%= num %>
</body>
</html>
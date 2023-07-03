<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex08_quiz.jsp</title>
</head>
<body>
	<div>
		1. name= 자기이름 , address=자기 집 주소 출력하기 JSTL<br>
		<fmt:bundle basename="bundle.quiz">
			이름 : <fmt:message key="name" />
			<br>
			거주지 : <fmt:message key="address" />
			<br>
		</fmt:bundle>
	</div>
	<hr>
	<div>
		2. 1~100 까지 숫자 중에서 3의 배수의 개수와 합을 출력하는 프로그램 작성<br>

		<c:set var="sum" value="0" />
		<c:forEach var="k" begin="3" end="99" step="3">
			<c:set var="sum" value="${sum +k }" />
			<c:set var="count" value="${count+1}" />
		</c:forEach>
		<span>개수:${count }</span> <span>총합:
			${sum }</span>0
	</div>
</body>
</html>
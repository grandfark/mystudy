<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex05_jstl.jsp</title>
</head>
<body>
<c:set var="country" value="${'Canada' }"/>
<c:if test="${ country != NULL}">
	국가명: <c:out value="${country }"/><br><br>
</c:if>

<c:choose>
	<c:when test="${country == 'Canada' }">
		<c:out value="${country }"/>의 날씨는 캐나다...<br>
	</c:when>
	<c:when test="${country == 'Korea' }">
		<c:out value="${country }"/>의 날씨는 흐림...<br>
	</c:when>
	<c:otherwise>그 외 국가 날씨는 모릅니다.</c:otherwise>
</c:choose><p><hr>

<c:forTokens items="소나타-그랜저-현대차-삼성차-기아차" delims="-" var="car">
	구분한 글자들 출력 : <c:out value="${car }"/><br>
</c:forTokens>
</body>
</html>
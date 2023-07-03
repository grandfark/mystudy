<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex01_jstl.jsp</title>
</head>
<body>
<c:set var="y">100</c:set>
<c:set var="x" value="1000"/><!-- 단항태그로 만들어 그 안에 값 넣기 -->
<h2><c:out value="${x }"/></h2>
<h3><c:out value="${y }"></c:out></h3>
,<hr>
<h3>EL 표현으로 출력:${x }</h3>
<%
	String str = "Hello JSTL!!";// 스크립트 릿으로 출력
	out.print(str);
%><p>
<h2><%= str %></h2>
<c:set var="str2" value="으아ㅏ아아아아ㅏ아아ㅏㅏㅏㅏㅏ"/>
<h2><font color="red">${str2} </font></h2>
<h3>&lt;c:set&gt;사용후:<c:out value="${x }"/></h3><hr>
<c:set var="nickname">parkpark</c:set>
<h3>${nickname }</h3>
<hr>
<c:catch var="error">
	<%= 10/0 %>
</c:catch>
<h3>&lt;c:catch&gt;로 잡아낸 오류: <c:out value="${error }"/></h3><hr>
<%
	String name = "parkkkkk";
	pageContext.setAttribute("id", "woo");
	session.setAttribute("pwd", "oracle");
	application.setAttribute("team", "우리팀");
	request.setAttribute("age", 33);
%>
<c:set value="<%=name %>" var="irum"/>
name1 = ${irum }<br>
name2 =	<c:out value="${name }" default="무명씨야!"/><br><hr>
EL표현식 출력<br>
id = ${id }<br/>
pwd = ${pwd }<br/>
team = ${team }<br/>
age = ${age }<br/><hr>
<%
	int y = 30;
	if(y % 2 == 0) out.print("odd");
	else out.print("even");
%><hr>
<%-- <c:if test="조건">참일때 처리구문 </c:if>jstl 에서는 else 구문이 존재하지 않는다. --%>
<c:set value="50" var="a"/>
<c:if test="${a%2 ==0 }"><h1>even</h1></c:if>
<c:if test="${a%2 !=0 }"><h1>odd</h1></c:if>
${a }<hr>
<c:if test="${5 < 10 }"><h3> 5는 10보다 작다</h3></c:if>
<c:if test="${5 > 10 }"><h3> 5는 10보다 크지 않다.</h3></c:if>

<c:if test="${6 + 3 == 9 }"><h1>6 + 3 == 9</h1></c:if>
<c:if test="${6 + 4 != 9 }"><h1>6 + 4 != 9</h1></c:if>

<%-- <c:choose>
<%-- <c:when test="조건"></c:when> --%>
<%-- </c:choose> --%>

<!-- switch의 default 값과 동일역할 -->
<c:choose>
<c:when test="${5 + 10 == 50 }">5 + 10 == 50</c:when>
<c:when test="${50 + 10 == 50 }">50 + 10 == 50 </c:when> 
<c:when test="${10 + 10 == 50 }">10 + 10 != 50 </c:when>
<c:otherwise>아무것도 없다. 선택할 것이 없습니다.</c:otherwise>
</c:choose>

</body>
</html>
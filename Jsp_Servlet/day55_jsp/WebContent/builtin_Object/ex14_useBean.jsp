<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>    
    
<jsp:useBean id="e" class="com.kosa.ex04.Emp"/>
<!-- setter method -->
<jsp:setProperty property="name" name="e" value="이순신"/>
<jsp:setProperty property="pay" name="e" value="200"/>
<jsp:setProperty property="empno" name="e" value="837"/>
<!-- name이 객체명을 의미한다. e로 지정하는 경우 Emp e 와 동일한 기능을 한다. property는 세팅값을 의미한다. -->

<h2><%= e.toString() %></h2>

<jsp:setProperty property="*" name="e"/>

<!-- getter method -->
이름:<jsp:getProperty property="name"  name="e">
사번:<jsp:getProperty property="empno"  name="e">
급여:<jsp:getProperty property="pay"  name="e">

<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex14_useBean.jsp</title>
</head>
<body>
	<h1>useBean Login</h1>
	<%
	Date today = new Date();
	out.print(today+"<br>");
	%>
	useBean을 이용해서 객체 생성하기
	<jsp:useBean id="now" class="java.util.Date"/>
	<h3><%= now %></h3>
	
</body>
</html>
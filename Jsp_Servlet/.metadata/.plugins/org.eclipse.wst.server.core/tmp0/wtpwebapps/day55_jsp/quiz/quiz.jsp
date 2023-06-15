<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="gift" class="com.kosa.quiz.GiftVO" />
<%@ page import="com.kosa.quiz.GiftVO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz.jsp</title>
</head>
<body>
	<h1>Gift Info</h1>
	
	<jsp:setProperty property="g_name" name="gift" value="선물세트이름"/>
	<jsp:setProperty property="g_no" name="gift" value="1231"/>
	<jsp:setProperty property="g_start" name="gift" value="1000000000"/>
	<jsp:setProperty property="g_end" name="gift" value="2333"/>
	
	상품이름: <jsp:getProperty property="g_name" name="gift"/><br/>
	상품번호: <jsp:getProperty property="g_no" name="gift" /><br/>
	상품최고가: <jsp:getProperty property="g_start" name="gift" /><br/>
	상품최저가: <jsp:getProperty property="g_end" name="gift" /><hr>
	
	<%
	GiftVO gi = new GiftVO();
	out.print(gi.toString()+"<hr>");
	gi.setG_name("선물선물");
	gi.setG_no(98766);
	gi.setG_start(40000);
	gi.setG_end(9000);
	%>
	<%= gi %>
	
</body>
</html>
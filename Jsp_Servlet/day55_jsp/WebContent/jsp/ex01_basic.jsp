<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex01_basic.jsp</title>
</head>
<body>
<h2>JSP basic</h2>
<div>아무거나</div>
<%
	//스크립트 릿 : 함수를 제외한 자바 코드 - 변수선언, 제어문
	String str = "Hello Jsp를 이용한 웹브라우저에 출력합니다.";
%>
<h3><%= str %></h3><hr>

<%
	String str2 = "H2llo Jsp를 222 웹브라우저에 출력합니다.";
	out.println(str);
	
	int su = 300;
	
	for(int i =1; i < 11 ;i++){	//out.print(i + "<br/>");
%>
	<h3><%= i %></h3>
<% }%><hr>

<%!
	//선언문: 자바문법, 변수선언, 함수
	public String show(){
		return "안녕Jsp입니다";
	}
%>

<!-- 표현식 -->
<%=  show() %><br/>
<%= "String output!!" %><br/>
<%= 12345 %><br/>
<%= 12.34 %><br/>
<h2>su + 200 = <%=su+200 %></h2>
<br/><%= str2 %>
<%-- <%= num %> --%>

</body>
</html>
<%@ page import="com.kosa.ex04.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_emp.jsp</title>
</head>
<body>
	<%!public String message() {
		return "Daebo th2";
	}%>
	<%
	Emp e = new Emp();
	out.print(e.toString() + "<P><hr>");

	e.setEmpno(7788);
	e.setName("강감찬");
	e.setPay(8000);
	int num = 88;
	%>
	<%=e.toString()%>
	외부패키지에 있는 클래스 객체 생성
	<br />
	<%=message()%>

</body>
</html>
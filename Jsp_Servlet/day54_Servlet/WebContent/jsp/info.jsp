<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info.jsp</title>
</head>
<body>
<table>
	<form action="../info" method="post">
	<tr><td>이름</td><td><input type="text" name="name"></td></tr>
	<tr><td>연락처</td><td><input type="tel" name="tel"></td></tr>
	<tr><td>주소</td><td><input type="text" name="addr"></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="submit" name="submit">
	<input type="reset" value="reset"></td></tr>
	</form>
</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<form action="" method="post">
		<table>
			<tr>
				<td>ID</td>
				<td><input type="text" name="wid"></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Content</td>
				<td><input type="text" name="content" readonly="readonly"></td>
			</tr>
		</table>
	</form>
</body>
</html>
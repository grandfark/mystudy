<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<form action="logincheck.servlet" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="id" placeholder="ID"></td>
			</tr>
			<tr>
				<td>PWD:</td>
				<td><input type="password" name="pwd" placeholder="PWD"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					name="login" value="로그인"> <input type="button" name="join"
					value="회원가입"></td>
			</tr>

		</table>
	</form>
</body>
</html>
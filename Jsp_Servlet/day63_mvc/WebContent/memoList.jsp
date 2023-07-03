<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memoList.jsp</title>
<style type="text/css">
table {
	font-family: arial, sans-serif;
	border-collaspe: collapse;
	width: 100%;
}

th, td {
	border: 1px solid #ddd;
	text-align: center;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #ddd;
}
/*
	td {
		border: 1px solid #ddd;
		text-align: left;
		padding: 8px;
	}
*/
</style>
</head>
<body>
	<hr color="GREEN" width="400">
	<h2 align="center">Daebo Memo List</h2>
	<hr color="GREEN" width="400">
	<table border="1">
		<tr>
			<th>NickName</th>
			<th>Email</th>
			<th>Content</th>
			<th>비고</th>
		</tr>
		<c:forEach var="list" items="${list}">
			<tr>
				<td><input type="text" value="${list.id}" readonly="readonly"/></td>
				<td><input type="text" value="${list.email}"
					readonly="readonly" /></td>
				<td><input type="text" value="${list.content}" /></td>
				<td><input type="button" value="수정">&nbsp;/&nbsp;<input
					type="button" value="삭제"
					onclick="window.open('./delete.jsp' ,'PopupWin',''width=500,height=600');"></td>
			</tr>
		</c:forEach>
	</table>
	<input type="button" value="글쓰기"
		onclick="javascript:location.href='memo.html'" />
	<a href="memo.html">글쓰기</a>
</body>
</html>
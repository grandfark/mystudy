<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>������ ���</h2>
<table width="100%">
	<tr><th align="center">�۹�ȣ</th><th>�� ��</th><th>�ۼ���</th><th>�ۼ���</th>
		<c:forEach items="${LIST }" var="cin">
		<tr><td align="center">${cin.seqno }</td>
			<td align="center"><a href="commentDetail.do?NO=${cin.seqno }">${cin.title }</a></td>
			<td align="center">${cin.writer }</td>
			<td align="center">${cin.reg_date }</td></tr>
		</c:forEach>
</table>
<c:forEach begin="1" end="${PAGES }" var="page">
<a href="commentlist.do?PAGE=${page }"> ${page }</a>
</c:forEach>
</div>
</body>
</html>
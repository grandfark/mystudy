<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ include file = "../view/color.jsp" %>

<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jstl/fmt_rt" %>

<!DOCTYPE html>
<html>
<head>

<title>���� �۾���</title>
<link href = "../view/mystyle.css" rel = "stylesheet" type = text/css">
<script type = "text/javascript" src = "../view/script.js"></script>

</head>

<!-- �亯���� ��� : �θ���� �۹�ȣ, �׷�ȭ��ȣ, �׷�ȭ���� ����, �鿩����  
		<=== content.jsp ���������� �Ѿ��.....
-->
<body bgcolor = "${ bodyback_c }">
<center><b>�� �����ϱ�</b></center><br>
<form action = "updatePro.do?pageNum=${ pageNum }" method="post" name = "updateForm" onsubmit="return writeSave()">

<table width='400' border='1' cellspacing='0' cellpadding='0' bgcolor="${ bodyback_c }"
align="center">

<tr>
	<td align = "right" colspan="2"  bgcolor="${ value_c }">
	<a href = "list.do"> �۸�� ����</a>
	</td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330"><input type="text" size= "10" maxlenth="10" name ="writer" value="${ bean.writer }">
		<input type="hidden" name="num" value="${ bean.num }"></td>
	</td>
	
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330">
<!-- 	�亯�ΰͿ� ���� ó�� -->
<input type= "text" size = "40" maxlength="50" name = "subject" value = "${ bean.subject }"></td>
</tr>

<!--  --------------------------------------------------------------------------------------------- -->
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> EMAIL</td>
	<td width="330"><input type="text" size= "40" maxlenth="30" name ="email" value =" ${ bean.email }"></td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330"><textarea rows="13" cols="40" name = "content">${ bean.content }</textarea></td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��й�ȣ</td>
	<td width="330"><input type="password" size= "8" maxlenth="10" name ="passwd" ></td>
</tr>
<tr>
	<td align="center" colspan="2" bgcolor="${ value_c }">
	<input type = "submit" value = "�ۼ���">
	<input type= "reset" value = "�ٽ��ۼ�">
	<input type = "button" value = "��Ϻ���" onclick="windows.location='list.do?pageNum=${ pageNum }'">
</tr>
</table>
</form>
</body>
</html>
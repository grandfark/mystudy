<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ include file = "../view/color.jsp" %>

<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jstl/fmt_rt" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>���� �۾���</title>
<link href = "../view/mystyle.css" rel = "stylesheet" type = text/css">
<script type = "text/javascript" src = "../view/script.js"></script>
</head>


<body bgcolor = "${ bodyback_c }">
<center><b>�۾���</b></center><br>
<form action = "writePro.do" method="post" name = "writeform" onsubmit="return writeSave()">
<input type="hidden" name="num" value="${num }">
<input type="hidden" name="ref" value="${ref }">
<input type="hidden" name="re_step" value="${ re_step }">
<input type="hidden" name="re_level" value="${ re_level }">

<table width='400' border='1' cellspacing='0' cellpadding='0' bgcolor="<%=bodyback_c %>"
align="center">

<tr>
	<td align = "right" colspan="2"  bgcolor="${ value_c }"">
	<a href = "list.do"> �۸�� ����</a>
	</td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330"><input type="text" size= "10" maxlenth="10" name ="writer"></td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330">
<!-- 	�亯�ΰͿ� ���� ó�� --------------------------- -->
 <c:if test="${ num == 0 }">  <!-- ����� -->
 	<input type= "text" size = "40" maxlength="50" name = "subject"></td>
 </c:if>

<c:if test="${ num != 0 }">   <!-- �亯�� -->
	<input type= "text" size = "40" maxlength="50" name = "subject" value ="[�亯]"></td>
</c:if>
</tr>

<!--  --------------------------------------------------------------------------------------------- -->
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> EMAIL</td>
	<td width="330"><input type="text" size= "40" maxlenth="30" name ="email"></td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��  ��</td>
	<td width="330"><textarea rows="13" cols="40" name = "content"></textarea></td>
</tr>
<tr>
	<td width="70" bgcolor = "${ value_c }" align = "center"> ��й�ȣ</td>
	<td width="330"><input type="password" size= "8" maxlenth="10" name ="passwd"></td>
</tr>
<tr>
	<td align="center" colspan="2" bgcolor="${ value_c }">
	<input type = "submit" value = "�۾���">
	<input type= "reset" value = "�ٽ��ۼ�">
	<input type = "button" value = "��Ϻ���" onclick="windows.location='list.do'">
</tr>
</table>
</form>
</body>
</html>
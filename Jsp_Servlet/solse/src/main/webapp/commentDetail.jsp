<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<c:if test="${empty CIN }">
	<h1>���� ���� �ʴ� ������ �Դϴ�.</h1>
</c:if>
<c:if test="${! empty CIN }">
	<form action="updateComment.do" method="post" onSubmit="return check(this)">
		<h1>������ �󼼺���</h1>
			<table>
				<tr><th>�۹�ȣ</th><td><input type="text" name="SEQ" value="${CIN.seqno }" readOnly="readonly"/></td></tr>
				<tr><th>�ۼ���</th><td><input type="text" name="WRITER" value="${CIN.writer }" readOnly="readonly"/></td></tr>
				<tr><th>������</th><td><input type="text" name="TITLE" value="${CIN.title }"/></td></tr>
				<tr><th>�ۼ���</th><td><input type="text" name="R_DATE" value="${CIN.reg_date }" readOnly="readonly"></td></tr>
				<tr><th>�� ��</th><td><textarea rows="5" cols="40" name="CONTENT">
				${CIN.content }
				</textarea></td></tr>
				<tr><td colspan="2" align="center">
				<input type="reset" value="���ΰ�ħ" >
				<c:if test="${sessionScope.MANAGER != null || sessionScope.USERID == CIN.writer }">
					<input type="submit" value="�� ��" name="BTN">
				</c:if>
				<c:if test="${sessionScope.USERID == CIN.writer }">
				<input type="submit" value="�� ��" name="BTN">
				</c:if>
				</td></tr>
			</table>
	</form>
</c:if>
</div>
</body>
</html>
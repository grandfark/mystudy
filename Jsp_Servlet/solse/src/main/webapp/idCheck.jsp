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
<h2>���� �ߺ� Ȯ��</h2>
<form action="idCheck.do" name="idCheck">
<input type="hidden" name="OkId" value="${ID }"/><!-- �θ��������� �ű�� ���� �Ķ���ͷ� �����. -->
�� ��:<input type="text" name="USER_ID" 
		value="${ID }"/>
<input type="submit" value="�ߺ� �˻�"/>
</form>
<c:if test="${ ! empty DUP }">
	${DUP }�� �̹� ����� �Դϴ�.
	<script type="text/javascript">
		opener.document.fr.ID.value = "";//���� ��Ī �θ��������� ������ opener�� �ٿ��ش�. 
		//opener�� �ٴ°� �θ�document�̴�. value�� �������� ID���� null�� �ƴϸ� ������. 
	</script>
</c:if>
<c:if test="${ empty DUP }">
	${ID }�� ��� �����մϴ�.
	<input type="button" value="���" onClick="idOk()"/>
</c:if>	
<script type="text/javascript">
function idOk(){
	opener.document.fr.ID.value =
		document.idCheck.OkId.value;
	opener.document.fr.idChecked.value= "OK";
	opener.document.getElementById("ID").readOnly=true;// ������Ʈ ���� ��ɾ� ���̵� ����ư Ŭ���� ����Ұ�
	self.close();
}
</script>
</div>
</body>
</html>
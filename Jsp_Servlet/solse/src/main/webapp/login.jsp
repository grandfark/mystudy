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
<form action="login.do" method="post" onSubmit="return check()" name="frm">
���� : <input type="text" name="ID" size="15" placeHolder="������ �Է��ϼ���."/><br/>
��ȣ : <input type="password" name="PWD" size="15"/><br/>
<input type="submit" value="�α���"/>
<input type="reset" value="�� ��"/>
</form>
<script type="text/javascript">
function check(){
	if(document.frm.ID.value == ''){
		alert("������234 �Է��ϼ���."); return false;
	}
	if(document.frm.PWD.value == ''){
		alert("��ȣ�� �Է��ϼ���."); return false;
	}
}
</script>
<div align="right">
<a href="joinFood.jsp">�����ϱ�</a></div>
</body>
</html>









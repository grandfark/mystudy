<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>������ ����ϱ�</h2>
<form action="insertRecipe.do" method="post" onSubmit="return check(this)">
<table>
	<tr><th>�޴� �̸�:</th><td><input type="text" name="TITLE" /></tr>
	<tr><th>���� ���:</th><td><textarea rows="10" cols="40" name="CONTENT"></textarea></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="�ۼ��ϱ�"/>
	<input type="reset" value="���ξ���"/></td></tr>
</table>
<script type="text/javascript">
function check(fm){
	if(fm.TITLE.value == ''){
		alert("�޴��̸��� �Է��ϼ���."); return false;
	}else{
		if(fm.TITLE.value.length > 30){
			alert("�޴��̸��� 30�� �̳��� �Է��ϼ���."); return false;
		}
	}
	if(fm.CONTENT.value == ''){
		alert("�����Ǹ� �Է��ϼ���."); return false;
	}else{
		if(fm.CONTENT.value.length > 200){
			alert("�����Ǵ� 200�� �̳��� �ۼ��ϼ���."); return false;
		}
	}
	if( ! confirm("���ε� �Ͻðڽ��ϱ�?")) return false;
}
</script>
</form>
</div>
</body>
</html>
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
<h1>������ ������ ����</h1>
<form action="commentIn.do" method="post" onSubmit="return check(this)">
<table>
	<tr><th>�� ��</th><td><input type="text" size="30" name="TITLE"></td></tr>
	<tr><th>�� ��</th><td><textarea rows="12" cols="30" name="CONTENT"></textarea></td></tr>
	<tr><td colspan="2" align="center"><input type="submit" value="�� ��"/>
	<input type="reset" value="���������"/></td></tr>
	</table>
<br/>
<script type="text/javascript">
function check(fm){
	if(fm.TITLE.value == ''){
		alert("������ �Է��ϼ���."); return false;
	}else{
		if(fm.TITLE.value.length > 30){
			alert("������ 30�� �̳��� �Է��ϼ���."); return false;
		}
	}
	if(fm.CONTENT.value == ''){
		alert("������ �Է��ϼ���."); return false;
	}else{
		if(fm.CONTENT.value.length > 100){
			alert("������ 100�� �̳��� �ۼ��ϼ���."); return false;
		}
	}
	if( ! confirm("���ε� �Ͻðڽ��ϱ�?")) return false;
}
</script>
</form>
</div>
</body>
</html>
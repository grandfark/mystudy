<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style type="text/css">
</style>
<body>
<div align="center">
</div>
<div align="center" id="main">
<h2>ȸ������ ��ļ�</h2>
<form action="joinMemer.do" method="post" name="fr"
	onSubmit="return checkk(this)">
<input type="hidden" name="idChecked">
ID: <input type="text" name="ID" id="ID"/>
<input type="button" value="�ߺ��˻�" onClick="idCheck()"/><br/>
��ȣ: <input type="password" name="PWD"/><br/>
��ȣ Ȯ��: <input type="password" name="CONF"/><br/>
�̸�: <input type="text" name="NAME"/><br/>
����ó: <input type="text" name="TEL"/><br/>
E-mail: <input type="text" name="EMAIL"/><br/>
�ּ�: <input type="text" name="ADDR"/><br/>
<input type="submit" value="�����ϱ�"/>
</form>
</div>
<script type="text/javascript">
function idCheck(){
	if(document.fr.ID.value==""){
		alert("������ �Է��ϼ���."); return;
	}
	var url="idCheck.do?USER_ID="+document.fr.ID.value;
	window.open(url,"_Blank_","width=450,height=600");
}
function checkk(frm){
	if(frm.NAME.value==""){
		alert("�̸��� �Է��ϼ���."); return false;		
	}	
	if(frm.ID.value==""){
		alert("������ �Է��ϼ���."); return false;
	}
	if(frm.PWD.value==""){
		alert("��ȣ�� �Է��ϼ���."); return false;
	}
	if(frm.PWD.value != frm.CONF.value){
		alert("��ȣ�� ��ġ�����ʽ��ϴ�. �ٽ� �Է��ϼ���."); return false;
	}
	if(frm.EMAIL.value==""){
		alert("�̸����� �Է��ϼ���."); return false;
	}
	if(frm.TEL.value==""){
		alert("����ó�� �Է����ּ���"); return false;
	}
	if(frm.ADDR.value==""){
		alert("�ּҸ� �Է����ּ���."); return false;
	}
	if( ! confirm("�����Ͻðڽ��ϱ�?")) return false;
}
</script>
</body>
</html>
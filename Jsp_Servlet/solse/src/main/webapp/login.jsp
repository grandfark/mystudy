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
계정 : <input type="text" name="ID" size="15" placeHolder="계정을 입력하세요."/><br/>
암호 : <input type="password" name="PWD" size="15"/><br/>
<input type="submit" value="로그인"/>
<input type="reset" value="취 소"/>
</form>
<script type="text/javascript">
function check(){
	if(document.frm.ID.value == ''){
		alert("계정을234 입력하세요."); return false;
	}
	if(document.frm.PWD.value == ''){
		alert("암호를 입력하세요."); return false;
	}
}
</script>
<div align="right">
<a href="joinFood.jsp">가입하기</a></div>
</body>
</html>









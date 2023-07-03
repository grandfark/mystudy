<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
#login {
	margin-left:10px; margin-top:10px;
	width:80%; height:70%; border:1px dashed red;
	background-color:pink;
}
#content{
	background-color:lightyellow;
}
.main{
	margin:10px; width:20%;
	background-color:lightgreen;
}
#body{
	align:"center"
}
#first{
background-color: lightgreen;
}
#second{
background-color: blue;
}
#third{
background-color:red;
}
#fourth{
background-color:gray;
}
</style>
</head>
<body>
<h1 align="center"><a href="main.jsp">FooD RecipE</a></h1>
<section>
	<table id="body" align="center" border="1">
		<tr>
		<td width="70%" id="content">
			<jsp:include page="${param.BODY }"/>
		</td>
			<td class="main">
			<div id="login">
			<c:choose>
			<c:when test="${sessionScope.USERID ==null &&
					sessionScope.MANAGER == null}">
					<jsp:include page="login.jsp"/>
			</c:when>
			<c:otherwise>
				<jsp:include page="logout.jsp"/>
			</c:otherwise>
			</c:choose>
			</div>
 			<table border="1">
				<div>
					<a href="main.jsp?BODY=intro.jsp">�� ����Ʈ �Ұ�</a><br/><!-- ��ü ���� -->
					<c:if test="${sessionScope.USERID != null }" ><!-- session �� �Ϲ� ������ �α��� �Ǿ������� -->
						<a href="main.jsp?BODY=commentinput.jsp">�� ������ ���ϱ�</a><br/>
					</c:if>
					<c:if test="${sessionScope.MANAGER != null }"><!-- �����ڰ� �α��� �Ǿ����� -->
						<a href="main.jsp?BODY=recipeInput.jsp">�� ������ ����</a><br/>
					</c:if>	
						<a href="main.jsp?BODY=commentlist.do">�� ������</a><br/>
						<a href="main.jsp?BODY=recipeList.do">�� ������ �� ���ٰ���</a><br/><!-- ��α��� �б� ���� -->									
				</div>
				</table>
			</td></tr>
	</table>
</section>
<h2><table align="center"><tr><td>Copyright</td>
<td id="first"><font color="red">F</font></td>
<td id="second"><font color="yellow">D</font></td>
<td id="third"><font color="lightgreen">R</font></td>
<td id="fourth"><font color="violet">E</font></td></tr></table></h2>
</body>
</html>
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
<c:choose>
	<c:when test="${param.R == 'Y' }">
		<script type="text/javascript">
			alert("�����մϴ�. ���ԵǾ����ϴ�.")
		</script>
	</c:when>
	<c:when test="${param.R == 'N' }">
		<script type="text/javascript">
			alert("���Ե����ʾҽ��ϴ�. �����ڿ��� �����ϼ���.")
		</script>
	</c:when>
</c:choose>
<script type="text/javascript">
	location.href="main.jsp";//����ȭ������ ��ȯ
</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ page import="java.net.*, java.util.*, java.io.*"%>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<h3>썸네일 이미지 예제</h3>
	<form action="thumbnailPro.jsp" method="post"
		enctype="multipart/form-data">
		원본 이미지: <input type="file" name="image"><br><br>
		<input type="submit" value="썸네일 이미지 만들기">
	</form>
</body>
</html>
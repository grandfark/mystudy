<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>fileUploadForm.jsp - 파일 업로드 예제</title>
</head>
<body>
<!-- enctype="multipart/form-data" 파일 업로드시 필수 속성 -->
<form action="fileUploadPro.jsp" method="post" enctype="multipart/form-data">
	작성자:<input type="text" name="user"><br>
	제 목:<input type="text" name="title"><br>
	파일명:<input type="file" name="uploadFile"><br>
	<input type="submit" value="파일 올리기"><br>
</form>
</body>
</html>
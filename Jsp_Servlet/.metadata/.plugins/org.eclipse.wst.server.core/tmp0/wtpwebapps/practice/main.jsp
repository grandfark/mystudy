<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>practice.jsp</title>
<link href="clock.css" rel="stylesheet">
</head>
<body>
<div align="center"><h2><a href="">메뉴고 뭐고 그냥 대충 해본다.</a></h2></div>
	<table align="center" border="1">
		<tr>
			<td align="center"><a href="">메뉴</a></td>
			<td align="center"><a href="">손흥민</a></td>
			<td align="center"><a href="">이강인</a></td>
			<td align="center"><a href="">그냥 써봄</a></td>
			<td rowspan="1"><jsp:include page="login.jsp"></jsp:include></td>
		</tr>
		<tr>
			<td colspan="4" style="width: 80%; height: 600px;" align="center">body</td>
			<td>
			<ul>
				<li><a href="">music</a></li>
				<li><a href="">youtube</a></li>
			</ul>
			</td>
		</tr>
		<tr>
			<td colspan="5" align="center">
			<div class="container">
				<div class="clock">
				<h1 id="time"></h1>
				</div>
				<button id="stop">STOP</button>
				<button id="go">GO</button>
			</div>
			<script type="text/javascript" src="clock.js"></script>
			</td>
		</tr>
	</table>
</body>
<footer align="center">copyright by parks</footer>
</html>
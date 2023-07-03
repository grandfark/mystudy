<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03_cookie.jsp Cookie</title>
</head>
<body>
	<%
	Cookie newCookie = new Cookie("newName", "Yuna");
// 	newCookie.setMaxAge(15);
	newCookie.setMaxAge(60);
	response.addCookie(newCookie);
	%><hr>
	
	<%
	Cookie[] cs = request.getCookies();
	
	if (cs != null || cs.length > 0) {
		for (int i = 0; i < cs.length; i++) {
			if (cs[i].getName().equals("newName")) {
		//재설정
		Cookie x = new Cookie("newName", "기면아");
		response.addCookie(x);
		x.setMaxAge(60*60);
			}
			out.print(cs[i].getName()+"<br>");
			out.print(cs[i].getValue()+"<br>");
		}
	} else {
		out.print("client 저장된 쿠키 정보다 없습니다.");
	}
	%>
</body>
</html>
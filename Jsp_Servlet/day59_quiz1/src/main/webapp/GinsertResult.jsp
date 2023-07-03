<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Timestamp"%>
<%@ page import="gifts.giftDAO" %>

<jsp:useBean id="vo" class="gifts.giftVO"/>
<jsp:setProperty property="*" name="vo"/><!-- bean의 id 값이 property의 name이 된다 -->
<%
	giftDAO dao = giftDAO.getinstance();
	dao.giftinsert(vo);
%>
상품번호<jsp:getProperty property="gno" name="vo"/> 번이 등록되었습니다.
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>상품등록창</title>
</head>
<body>
<form action="memberList.jsp">
	<input type="submit" value="회원목록보기">
</form>
</body>
</html>
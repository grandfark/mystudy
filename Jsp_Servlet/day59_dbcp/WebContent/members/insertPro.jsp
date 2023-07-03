<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.Timestamp"%>
<%@ page import="edu.kosa.members.MemberDAO" %>

<jsp:useBean id="vo" class="edu.kosa.members.MemberVO"/>
<jsp:setProperty property="*" name="vo"/><!-- bean의 id 값이 property의 name이 된다 -->
<%
	vo.setReg_date(new Timestamp(System.currentTimeMillis()));
	MemberDAO dao = MemberDAO.getInstance();
	dao.insert(vo);
%>
<jsp:getProperty property="name" name="vo"/>님의 회원가입을 축하합니다.
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>insertPro.jsp 가입 메시지 출력 창</title>
</head>
<body>
<form action="memberList.jsp">
	<input type="submit" value="회원목록보기">
</form>
</body>
</html>
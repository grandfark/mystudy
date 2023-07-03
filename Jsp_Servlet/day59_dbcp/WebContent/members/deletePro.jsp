<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="edu.kosa.members.*"%>
<%@ include file="../view/color.jsp"%>
<%
request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="vo" class="edu.kosa.members.MemberVO">
	<jsp:setProperty name="vo" property="*" />
</jsp:useBean>
<%
String passwd = (String) session.getAttribute("memID");
vo.setId(passwd);

MemberDAO dao = MemberDAO.getInstance();
dao.delete(vo);

session.invalidate(); 
response.sendRedirect("memberList.jsp");
%>
<script type="text/javascript">
</script>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
<table>
<tr><td>삭제되었습니다. 메인으로 돌아갑니다.</td></tr>
<tr><td><input type="button" value="회원목록으로" onclick="window.location='memberList.jsp'"></td></tr>
</table>

</body>
</html>
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
String id = (String) session.getAttribute("memID");
vo.setId(id);

MemberDAO dao = MemberDAO.getInstance();
dao.update(vo);
%>
<link href="../view/mystyle.css" rel="stylesheet" type="text/css">
<table>
	<tr bgcolor="<%=title_c%>">
		<td><b>회원정보가 수정되었습니다</b></td>
	</tr>
	<td bgcolor="<%=title_c%>">
	<tr>
		<td>
			<p>입력하신 내용이 수정완료 되었습니다.</p>
		</td>
	</tr>
	<tr>
		<td bgcolor="<%=title_c%>" align="center">
			<form>
				<input type="button" value="메인으로" onclick="window.location='main.jsp'">
			</form> 5초후에 메인으로 이동합니다.
			<meta http-equiv="Refresh" content="5; url=main.jsp">
		</td>
	</tr>
</table>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modifyPro.jsp 회원 정보 수정 및 탈퇴</title>
</head>
<body>
	<a href="modifyForm.jsp">정보 수정</a>&nbsp;&nbsp;
	<a href="deleteForm.jsp">회원 탈퇴</a>
</body>
</html>
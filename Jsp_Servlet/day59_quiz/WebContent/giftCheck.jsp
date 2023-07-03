<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<%@ page import="gifts.*" %>

<title>gift 중복 확인</title>
<% request.setCharacterEncoding("utf-8"); %>

<%
	int gno = Integer.parseInt(request.getParameter("gno"));
	giftDAO dao = giftDAO.getinstance();
	int check = dao.checkGift(request.getParameter("gno"));
%>

<!-- int gno = Integer.parseInt(request.getParameter("gno")); -->
		
<!-- 		//AdminGoodsDAO 객체생성 -> getGoods(gno) -->
<!-- 		//상품번호에 해당하는 상품정보 전체 가져오기 -->
<!-- 		AdminGoodsDAO agdao = new AdminGoodsDAO(); -->
<!-- 		GoodsDTO gdto = agdao.getGoods(gno); -->
<!-- 		System.out.println("M : "+gdto); -->
</head>
<body>
<% if(check == 1) { %>

<table width="270" border="0" cellpadding="5" cellspacing="0">
	<tr>
	   <td>이미 사용중인 상품번호입니다.</td>
	</tr>
</table>

<form action="giftCheck.jsp" method="post" name="checkForm">
<table width="270" border="0" cellspacing="0" cellpadding="5">
	<tr>
		<td align="center">
		다른 상품번호를 선택하세요<p>
		<input type="text" size="10" maxlength="12" name="id">
		<input type="submit" value="선물중복확인" >
		</td>
	</tr>
</table>

</form>
<%   }else { %>


<table width="270" border="0" cellspacing="0" cellpadding="5">
 	<tr>
 		<td align="center">
 			<p> 입력하신 사용하실 수 있는 상품번호 입니다 </p>
 			<input type="button" value="닫기" onclick="setid()" >
 		</td>
 	</tr> 	
</table>
<% } %>
</body>
</html>


<script language="javascript">

	function setid(){
	self.close();  ///<-------------------수정할것!!!
	}
</script>
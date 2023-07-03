<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert gift.jsp</title>
<script language="JavaScript">
<!--
	// 아이디 중복 여부 판단 함수
    function openConfirmid(userinput) {
        if (!userinput.gno.value) { 
            alert("상품번호를 넣으세요");
            return;
        }
        //url과 사용자 입력 id를 조회합니다.
        url = "giftCheck.jsp?gno=" + userinput.id.value ;
        
        //새로운 윈도우를 연다.
        open(url, "confirm", 
        "toolbar=no, location=no,status=no,menubar=no,scrollbars=no,resizable=no,width=300, height=200");
    }
    //-->
</script>
<body>
	<table align="center">
		<form method="post" action="GinsertResult.jsp" name="userinput"
			onSubmit="return checkIt()">
			<tr>
				<td>상품 번호</td>
				<td><input type="text" name="gnum"></td>
				<td><input type="button" name="giftCheck" value="상품중복확인"
					OnClick="openConfirmid(this.form)"></td>
			</tr>
			<tr>
				<td>상품 이름</td>
				<td><input type="text" name="gname"></td>
			</tr>
			<tr>
				<td>상품 최저가</td>
				<td><input type="number" name="g_start"></td>
			</tr>
			<tr>
				<td>상품 최고가</td>
				<td><input type="number" name="g_end"></td>
			</tr>
			<tr><td colspan="2" align="center">
				<input type="submit"value="등록하기" onclick="">
				<input type="reset" value="지우기">
			</td></tr>
		</form>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
</script>
<script defer="defer">
$(function(){
	$('#searchBtn').click(function(){
		$.ajax({
			url:"./naverSearch.do",
			type:"get",
			data:{ keyword : $('#keyword').val(), startNum : $('#startNum option:selected').val()},
			dataType : "json",
			success : sucFuncJson,
			error : errFunc
		});
	});
});

function sucFuncJson(d){
	var str = "";
	$.each(d.items, function(index, item){
	str += "<ul>";
	str += " <li>" + (index +1) +"</li>";
	str += " <li>" + item.title+"</li>";
	str += " <li>" + item.description + "</li>";
	str += " <li>" + item.bloggername+"</li>";
	str += " <li>" + item.bloggerlink+"</li>";
	str += " <li>" + item.postdate+"</li>";
	str += " <li><a href='"+item.link+"'tatget='_blank'>바로가기</a></li>";
	str += "</ul>";	
	});
	$('#searchResult').html(str);
}
function errFunc(e){
	alert("실패:" + e.status);
}
</script>
</head>
<body>
<div>
	<div>
		<form id="searchFrm">
		한페이지에 10개씩 출력됨<br>
			<select id="startNum">
				<option value="1">1페이지</option>
				<option value="11">2페이지</option>
				<option value="21">3페이지</option>
				<option value="31">4페이지</option>
				<option value="41">5페이지</option>
			</select>
			<input type ="text" id="keyword" placeholder="검색어를 입력하시오"/>
			<button type="button" id="searchBtn">검색</button>
		</form>
	</div>
	<div class="row" id="searchResult">
		여기에 검색결과가 출력됩니다.		
	</div>
</div>
</body>
</html>
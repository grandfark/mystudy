<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql_rt"%>
<!DOCTYPE html>
<html><head><meta charset="UTF-8">
<title>ex11_sql_quiz </title>
</head>
<body>
	<sql:update dataSource="jdbc/MemoDB">
	DELETE FROM MEMO WHERE ID = ?
	<sql:param value="${'새로고침' }"/>
	</sql:update>
	<table border="1">
		<tr>
			<!-- 필드명 출력 -->
			<c:forEach var="columnName" items="${rs.columnNames }">
				<th><c:out value="${columnName }" /></th>
			</c:forEach>
		</tr>
		<c:forEach var="row" items="${rs.rowsByIndex }">
			<!-- 레코드 수만큼 반복 -->
			<tr>
				<c:forEach var="column" items="${row }" varStatus="i">
					<!-- 레코드의 필드수 만큼 반복:3 3개만 존재중 -->
					<td><c:if test="${column != null }">
							<!-- 해당 필드 값이 null이 아니면  -->
							<c:out value="${column }" />
						</c:if> <c:if test="${column == null }">
							<!-- 해당 필드 값이 null이면 -->
						&nbsp;
					</c:if></td>
				</c:forEach>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
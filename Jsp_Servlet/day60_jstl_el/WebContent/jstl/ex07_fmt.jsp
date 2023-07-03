<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page import="java.util.Date"%>


<fmt:requestEncoding value="utf-8" />
<fmt:setLocale value="ko_kr" />
<!-- en_us, jp, ko_kr -->
<jsp:useBean id="date" class="java.util.Date" />
<%
Date date2 = new Date();
out.print(date2);
%>
<fmt:bundle basename="bundle.testBundle">
	<fmt:message key="name" /><br>
	<fmt:message key="message" /><br>
	<fmt:message key="say" /><br>
	<fmt:message key="say2"><br>
		<fmt:param>kosa</fmt:param>
	</fmt:message>
</fmt:bundle>
<hr>
<fmt:formatNumber value="50000" type="currency" /><br>
<fmt:formatNumber value="0.15" type="percent" /><br>
<fmt:formatNumber value="57839289" pattern="###,###,###" /><br><hr>

<fmt:formatDate value="${ date}" type="date"/><br>
<fmt:formatDate value="${ date}" type="time"/><br>
<fmt:formatDate value="${ date}" type="both"/><br><hr>

<fmt:formatDate value="${ date}" type="both" timeStyle="short" dateStyle="short"/><br>
<fmt:formatDate value="${ date}" type="both" timeStyle="long" dateStyle="long"/><br><hr>

<p>number : <fmt:formatNumber value="12345.6789" type="number"/><br/>
<p>currency : <fmt:formatNumber value="12345.6789" type="currency" currencySymbol="$"/><br/>














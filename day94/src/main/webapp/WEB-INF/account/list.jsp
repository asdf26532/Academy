<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Account 테이블</h1>
	<hr>
	
	<table>
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.userid }</td>
			<td>${row.userpw }</td>
			<td>${row.nick }</td>
			<td>${row.email }</td>
			<td>${row.j_date }</td>
			<td>${row.profile }</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1.jsp</title>

<style>
	table { 
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<h1>Quiz1</h1>
	<hr>
	
	<h4>JSP 구문을 활용해서 구구단 2단을 출력(x1 ~ x9)</h4>

	<table>
		<tr>
			<th>구구단</th>
			<th>결과</th>
		</tr>
		
		<% for (int i = 1; i <= 9; i++) { %>
		<tr>
			<td>2 x <%=i %></td>
			<td><%=2 * i %></td>
		</tr>
		<% } %>
	</table>

</body>
</html>
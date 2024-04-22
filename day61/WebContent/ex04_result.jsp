<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex04_result.jsp</title>
</head>
<body>

	<%
		String color = request.getParameter("color");
		Cookie ck = new Cookie("color", color);
	
		ck.setMaxAge(60 * 60 * 24);
		
		response.addCookie(ck);
	%>

	<h1>쿠키 발급</h1>
	<hr>
	
	<a href="ex04.jsp">
		<button>ex04</button>
	</a>

</body>
</html>
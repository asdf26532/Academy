<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>logout.jsp</title>
</head>
<body>
	<%
		session.removeAttribute("user");
	%>
	
	<script>
		alert('로그아웃 되었습니다');
		location.href = 'home.jsp';
	</script>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>회원 등록</h4>
	
	<form method="POST">
		<p><input name="userid" placeholder="ID" value="${row.userid }" required></p>
		<p><input name="userpw" placeholder="PW" value="${row.userpw }" required></p>
		<p><input name="nick" placeholder="닉네임" value="${row.nick }" required></p>
		<p><input name="email" placeholder="이메일" value="${row.email }" required></p>
		
		<button>가입</button>
	</form>

</body>
</html>
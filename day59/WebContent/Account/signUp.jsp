<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<fieldset>
		<legend>회원가입</legend>
		
		<form action="signUpPro.jsp" method="POST">
			<p><input name="userid" placeholder="아이디" required></p>
			<p><input name="userpw" type="password" placeholder="패스워드" required></p>
			<p><input name="nick" placeholder="닉네임" required></p>
			<p><input name="email" type="email" placeholder="이메일" required></p>
		
			<button>join</button>
		</form>
	</fieldset>
</body>
</html>
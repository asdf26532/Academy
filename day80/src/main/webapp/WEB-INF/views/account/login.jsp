<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>로그인</button>
		<button type="button">PW 찾기</button>
	</form>
	
	<script>
		let btn = document.querySelectorAll('button')[1];

		btn.onclick = () => {
			location.href = 'findPw';
		}
	</script>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<article>
		<form method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			<p><input name="nick" placeholder="닉네임" required></p>
			<p><input name="email" placeholder="이메일" required></p>
			
			<button>가입</button>
		</form>
	</article>
</main>

</body>
</html>
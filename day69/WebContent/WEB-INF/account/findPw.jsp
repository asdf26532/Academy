<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<article>
		<form method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="email" type="email" placeholder="이메일" required></p>
			
			<button>PW 찾기</button>
		</form>
	</article>
</main>

</body>
</html>
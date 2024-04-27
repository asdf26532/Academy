<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<article>
		<form method="POST">
			<p><input name="userid" placeholder="ID" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			
			<button>로그인</button>
			
			<a href="${cpath }/account/findPw">
				<button type="button">PW 찾기</button>
			</a>
		</form>
	</article>
</main>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<article>
		<form method="POST">
		<table class="board w70">
			<tr>
				<th>회원번호</th>
				<td>${user.idx }</td>
			</tr>
			<tr>
				<th>아이디</th>
				<td>${user.userid }</td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><input name="userpw" type="password" required></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><input name="nick" value="${user.nick }" required></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input name="email" type="email" value="${user.email }" required></td>
			</tr>
			<tr>
				<th>가입일자</th>
				<td>${user.j_date }</td>
			</tr>
			<tr>
				<td>
					<button>수정</button>
				</td>
			</tr>
		</table>
		
		</form>
	</article>
</main>
</body>
</html>
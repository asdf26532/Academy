<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<main>
	<form action="updatePro.jsp" method="POST">
		<table class="board write">
			<tbody>
				<tr>
					<th>계정 No</th>
					<td>${user.idx }</td>
				</tr>
				<tr>
					<th>ID</th>
					<td>${user.userid }</td>
				</tr>
				<tr>
					<th>패스워드 변경</th>
					<td><input name="userpw" type="password" required></td>
				</tr>
				<tr>
					<th>닉네임</th>
					<td>${user.nick }</td>
				</tr>
				<tr>
					<th>이메일</th>
					<td><input name="email" value="${user.email }" type="email" required></td>
				</tr>
				<tr>
					<th>가입일</th>
					<td>${user.join_date }</td>
				</tr>
			</tbody>
		</table>
		
		<br>
		
		<input name="idx" type="hidden" value="${user.idx }">
		
		<button>수정</button>
		
		<a href="${cpath }/account/delete.jsp?idx=${user.idx }">
			<button type="button">탈퇴</button>
		</a>
	</form>
</main>

<%@ include file="../footer.jsp" %>
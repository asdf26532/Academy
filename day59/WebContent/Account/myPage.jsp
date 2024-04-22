<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


	<%
		if (user.getUserid() == null) {
			response.sendRedirect("login.jsp");
		}
	%>

	<form action="update.jsp" method="POST">
		<table>
			<tbody>
				<tr>
					<th>IDX</th>
					<td><%=user.getIdx() %></td>
				</tr>		
				<tr>
					<th>아이디</th>
					<td><%=user.getUserid() %></td>
				</tr>	
				<tr>
					<th>패스워드</th>
					<td><input name="userpw" type="password" required></td>
				</tr>	
				<tr>
					<th>닉네임</th>
					<td><%=user.getNick() %></td>
				</tr>	
				<tr>
					<th>이메일</th>
					<td><input name="email" type="email" value="<%=user.getEmail() %>"></td>
				</tr>	
				<tr>
					<th>가입일</th>
					<td><%=user.getJoin_date() %></td>
				</tr>	
			</tbody>
		</table>
		
		<br>
		
		<input name="idx" type="hidden" value="<%=user.getIdx() %>">
		
		<button>수정</button>
		<a href="delete.jsp?idx=<%=user.getIdx() %>">
			<button type="button">탈퇴</button>
		</a>
	</form>

</body>
</html>
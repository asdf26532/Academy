<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>마이 페이지~</h4>
	
	<table class="myPage">
		<tbody>
			<tr>
				<th>아이디</th>
				<td><%=user.getUserid() %></td>
			</tr>
			<tr>
				<th>패스워드</th>
				<td><%=user.getUserpw() %></td>
			</tr>
			<tr>
				<th>닉네임</th>
				<td><%=user.getNick() %></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><%=user.getName() %></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>
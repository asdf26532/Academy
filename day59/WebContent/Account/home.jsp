<%@page import="model.vo.AccountVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>현재 접속 : <%=user.getNick() %></h4>
	
	<table>
		<thead>
			<tr>
				<th>idx</th>
				<th>아이디</th>
				<th>패스워드</th>
				<th>닉네임</th>
				<th>이메일</th>
				<th>가입일</th>
			</tr>
		</thead>
		<tbody>
			<% for (AccountVO row : dao.selectAll()) { %>
			<tr>
				<td><%=row.getIdx() %></td>
				<td><%=row.getUserid() %></td>
				<td><%=row.getUserpw().substring(0, 6) %></td>
				<td><%=row.getNick() %></td>
				<td><%=row.getEmail() %></td>
				<td><%=row.getJoin_date() %></td>
			</tr>
			<% } %>
		</tbody>
	</table>

</body>
</html>
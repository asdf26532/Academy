<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<p>접속 : ${user.nick }</p>
	
	<table>
		<tr>
			<th>계정번호</th>
			<th>아이디</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.userid }</td>
			<td>${row.nick }</td>
			<td>${row.email }</td>
			<td>
				<fmt:formatDate 
					pattern="yyyy년 MM월 dd일" 
					value="${row.j_date }"/>
			</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>
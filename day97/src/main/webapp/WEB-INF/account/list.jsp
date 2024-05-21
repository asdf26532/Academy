<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<%-- c##user1의 account 테이블 모두 출력 --%>
	<h4>Account 테이블</h4>
	
	<table>
		<tr>
			<th>계정번호</th>
			<th>아이디</th>
			<th>패스워드</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>가입일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.userid }</td>
			<td>${fn:substring(row.userpw, 0, 12) }</td>
			<td>${row.nick }</td>
			<td>${row.email }</td>
			<td>${row.j_date }</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>
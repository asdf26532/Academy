<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<h4>board 테이블</h4>
	
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>${row.title }</td>
			<td>${row.nick }</td>
			<td>${row.v_count }</td>
			<td>${row.w_date }</td>
		</tr>
		</c:forEach>
	</table>
	
	<br>
	
	<a href="/board/write">
		<button>글작성</button>
	</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<p>${ver }</p>
	
	<table>
		<thead>
			<tr>
				<th>학번</th>
				<th>이름</th>
				<th>국어</th>
				<th>영어</th>
				<th>수학</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="row" items="${list }">
			<tr>
				<td>${row.idx }</td>
				<td>${row.name }</td>
				<td>${row.kor }</td>
				<td>${row.eng }</td>
				<td>${row.mat }</td>
				<td>
					<a href="${cpath }/student/update?idx=${row.idx }">클릭</a>
				</td>
				<td>
					<a href="${cpath }/student/delete?idx=${row.idx }">클릭</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>
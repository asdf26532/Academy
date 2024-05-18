<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table>
		<tr>
			<td colspan="6">${row.idx }. ${row.title }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${row.nick }</td>
			<th>조회수</th>
			<td>${row.v_count }</td>
			<th>작성일</th>
			<td>${row.w_date }</td>
		</tr>
		<tr>
			<td colspan="6"><pre>${row.contents }</pre></td>
		</tr>
	</table>

</body>
</html>
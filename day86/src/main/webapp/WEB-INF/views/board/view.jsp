<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<table class="board">
		<tr>
			<td>${row.idx }. ${row.title }</td>
		</tr>
		<tr>
			<td
				>${row.nick } | 
				${row.v_count } | 
				${row.w_date }
			</td>
		</tr>
		<tr>
			<td>
				<p><a href="${cpath }/fileTest/${row.upload }" download>
					첨부파일 : ${row.upload }
				</a></p>
				<pre>${row.contents }</pre>
			</td>
		</tr>
	</table>

</body>
</html>
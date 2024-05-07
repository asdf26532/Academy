<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<ul>
		<li>${row.idx } ${row.title }</li>
		<li>${row.nick } | ${row.v_count } | ${row.w_date }</li>
		<li>${row.contents }</li>
	</ul>

	<br>
	
	<c:if test="${row.nick == user.nick }">
		<a href="${cpath }/board/update/${row.idx }">
			<button>수정</button>
		</a>
		
		<a href="${cpath }/board/delete/${row.idx }">
			<button>삭제</button>
		</a>
	</c:if>
	
	<hr>
	
	<h5>댓글</h5>
	
	<form class="replyWrite" method="POST">
		<textarea name="contents" placeholder="바른말을 사용합시다"></textarea>
		
		<button>작성</button>
	</form>
	
	<c:forEach var="row" items="${replys }">
	<fieldset class="reply">
		<p>${row.nick } | ${row.w_date }</p>
		
		<pre>${row.contents }</pre>
	</fieldset>
	</c:forEach>

</body>
</html>
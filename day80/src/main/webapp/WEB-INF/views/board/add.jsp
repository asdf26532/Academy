<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST">
		<p><input name="title" value="${row.title }" placeholder="제목" required></p>
		<p><input name="user_idx" value="${user.idx }" type="hidden" placeholder="유저번호" required></p>
		<p><textarea name="contents" placeholder="내용">${row.contents }</textarea></p>
		
		<button>전송</button>
	</form>

</body>
</html>
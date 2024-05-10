<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<form method="POST" enctype="multipart/form-data">
		<p><input name="memo" placeholder="메모"></p>
		<p><input name="upload" type="file"></p>
		
		<button>전송</button>
	</form>

</body>
</html>
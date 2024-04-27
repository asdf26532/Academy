<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<main class="home">
	<%@ include file="../sideMenu.jsp" %>

	<article>
		<form method="POST">
			
			<table>
				<tr>			
					<td>제목</td>
					<td><input name="title" required></td>
				</tr>
				<tr>
					<td colspan="2">
					<textarea name="contents"></textarea>
					</td>
				</tr>				
			</table>
			
			<br>
			
			<button>작성</button>
		</form>
	</article>

</main>
</body>
</html>
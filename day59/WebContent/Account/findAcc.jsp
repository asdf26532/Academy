<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<div class="find">
		<fieldset>
			<legend>ID 찾기</legend>
			
			<form action="findId.jsp" method="POST">
				<p><input name="email" type="email" placeholder="이메일" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
		
		
		<fieldset>
			<legend>PW 찾기</legend>
			
			<form action="findPw.jsp" method="POST">
				<p><input name="userid" placeholder="아이디" required></p>
				<p><input name="email" type="email" placeholder="이메일" required></p>
			
				<button>find</button>
			</form>
		</fieldset>
	</div>
	
</body>
</html>
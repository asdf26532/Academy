<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<h4>정보 입력</h4>
	
	<form method="POST">
		<p><input name="name" placeholder="이름" value="${stu.name }" required></p>
		<p><input name="kor" type="number" placeholder="국어" value="${stu.kor }" required></p>
		<p><input name="eng" type="number" placeholder="영어" value="${stu.eng }" required></p>
		<p><input name="mat" type="number" placeholder="수학" value="${stu.mat }" required></p>
		
		<button>작성</button>
	</form>

</body>
</html>
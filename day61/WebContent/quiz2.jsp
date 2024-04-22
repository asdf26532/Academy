<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2.jsp</title>

<style>
	.wrap {
		display: flex;
	    width: 550px;
    	flex-wrap: wrap;
	}
</style>
</head>
<body>
	<h1>Quiz2</h1>
	<hr>
	
	<ul>
		<li>사용자에게 구구단을 입력 받아서 현재 페이지에 출력</li>
		<li>JSTL/EL을 최대한 활용할 것</li>
	</ul>
	
	<form>
		<input name="dan" type="number" placeholder="구구단" required>
		<button>전송</button>
	</form>

	<hr>
	
	<c:if test="${not empty param.dan }">
		<h4>결과1</h4>
		
		<ul>
			<c:forEach var="i" begin="1" end="9">
				<li>${param.dan } x ${i } = ${param.dan * i }</li>
			</c:forEach>
		</ul>
	
		<hr>
	
		<h4>결과2</h4>
		
		<div class="wrap">
			<c:forEach var="i" begin="2" end="9">
				<ul>
					<c:forEach var="j" begin="1" end="9">
						<li>${i } x ${j } = ${i * j }</li>
					</c:forEach>
				</ul>
			</c:forEach>
		</div>
	</c:if>

</body>
</html>
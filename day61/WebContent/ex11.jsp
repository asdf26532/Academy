<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex11.jsp</title>
</head>
<body>
	<h1>JSTL - 반복문</h1>
	<hr>
	
	<h4>증가 반복</h4>
	
	<%-- var : 반복되는 값이 저장되는 공간. pageContext의 Attribute에 저장된다 --%>
	<%-- begin : 반복의 시작 값 --%>
	<%-- end : 반복의 끝 값 --%>
	<%-- step : 반복의 증감 값. 기본값 1 --%>
	<c:forEach var="i" begin="1" end="5" step="1">
		<p>${i } : Hello JSTL</p>
	</c:forEach>
	
	
	
	<h4>감소 반복</h4>
	
	<c:forEach var="i" begin="1" end="5">
		<p>${6 - i } : Hello JSP</p>
	</c:forEach>
	
	
	
	<h4>연습 - 년도 (2024 ~ 1900)</h4>
	
	<select>
		<c:forEach var="i" begin="1900" end="2024">
			<option>${3924 - i }</option>
		</c:forEach>
	</select>

</body>
</html>
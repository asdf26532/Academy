<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>

<link href="${cpath }/css/style.css" rel="stylesheet">
</head>
<body>

<%-- 로그인 여부에 따른 값 --%>
<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
<c:set var="nick" value="${empty user ? 'signUp' : user.nick }"/>
<c:set var="signUp" value="${empty user ? 'signUp' : 'myPage' }"/>

<header>
	<h1>ITBANK</h1>
	
	<ul>
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/board/write.jsp">write</a></li>
		<li><a href="${cpath }/account/${login }.jsp">${login }</a></li>
		<li><a href="${cpath }/account/${signUp}.jsp">${nick }</a></li>
	</ul>
</header>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>

<link href="${cpath }/resources/css/style.css" rel="stylesheet">
</head>
<body>
	<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
	<c:set var="signUp" value="${empty user ? 'signUp' : 'myPage' }"/>
	
	<h1>home</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/account/list">accounts</a></li>
		<li><a href="${cpath }/account/${login }">${login }</a></li>
		<li><a href="${cpath }/account/${signUp }">${signUp }</a></li>
	</ul>
	
	<hr>
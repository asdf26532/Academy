<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home</title>
<link href="${cpath }/css/style.css" rel="stylesheet">
</head>
<body>

<c:set var="login" value="${empty user ? 'login' : 'logout' }"/>
<c:set var="nick" value="${empty user ? 'signUp'  : user.nick }"/>
<c:set var="signUp" value="${empty user ? 'signUp' : 'myPage' }"/>

<header>
	<h1>${cpath }</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/account">test</a></li>
		<li><a href="${cpath }/account/${login }">${login }</a></li>
		<li><a href="${cpath }/account/${signUp }">${nick }</a></li>
	</ul>
</header>
<hr>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${cpath }</title>

<style>
	a {
		color: inherit;
		text-decoration: none;
	}
	a:hover {
		color: red;
		text-decoration: underline; 
	}
	.menu {
		list-style: none;
		padding: 0;
		display: flex;
	}
	.menu > li {
		margin: 0 10px;
	}
	table {
		border-collapse: collapse;
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<h1>REST Test</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/login">login</a></li>
		<li><a href="${cpath }/signUp">signUp</a></li>
	</ul>
	
	<hr>
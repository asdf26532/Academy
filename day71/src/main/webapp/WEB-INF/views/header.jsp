<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<style>
		.menu {
			display: flex;
			list-style: none;
			padding: 0;
		} 
		.menu > li {
			margin: 0 10px;
		}
	</style>
</head>
<body>
	<h1>Hello world!</h1>
	
	<ul class="menu">
		<li><a href="${cpath }">home</a></li>
		<li><a href="${cpath }/ex01">ex01</a></li>
		<li><a href="${cpath }/ex02">ex02</a></li>
		<li><a href="${cpath }/ex03">ex03</a></li>
		<li><a href="${cpath }/ex04/test1">ex04</a></li>
		<li><a href="${cpath }/ex05">ex05</a></li>
		<li><a href="${cpath }/ex05/test1">ex06</a></li>
	</ul>
	
	<hr>
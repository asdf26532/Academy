<%@page import="model.vo.AccountVO"%>
<%@page import="model.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String cpath = request.getContextPath(); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account 테이블</title>

<link rel="stylesheet" href="<%=cpath %>/css/style.css">
</head>
<body>
	<%
		AccountDAO dao = new AccountDAO();
		AccountVO user = (AccountVO)session.getAttribute("user");
		
		String login = "logout";
		String signUp = "myPage";
		
		if (user == null) {
			user = new AccountVO();
			user.setNick("로그인 중 아님");
			
			login = "login";
			signUp = "signUp";
		}
	%>

	<header>
		<h1>ITBANK</h1>
	
		<ul class="menu">
			<li><a href="home.jsp">home</a></li>
			<li><a href="<%=login %>.jsp"><%=login %></a></li>
			<li><a href="<%=signUp %>.jsp"><%=signUp %></a></li>
		</ul>
	</header>
	
	<hr>
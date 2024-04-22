<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>home.jsp</title>
	
<style>
	header {
		display: flex;
		align-items: center;
	}
	.menu {
		margin: 0 30px;
		list-style: none;
		display: flex;
	}
	.menu > li {
		margin: 0 20px;
	}
	.myPage {
		border-collapse: collapse;
	}
	.myPage th, .myPage td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<%
		Account user = (Account) session.getAttribute("user");
		String userNick = "로그인된 계정 없음";
	
		// 로그인이 안돼 있으면
		if (user == null) {
			user = new Account();
		}
		else {
			userNick = user.getNick() + "님 로그인 중";	
		}
	%>

	<header>
		<h1>Quiz</h1>
		
		<ul class="menu">
			<li><a href="home.jsp">Home</a></li>
			<li><a href="mypage.jsp">MyPage</a></li>
			<li><a href="logout.jsp">Logout</a></li>
		</ul>
	</header>
	
	<hr>
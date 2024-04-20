<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result.jsp</title>
</head>
<body>

	<%!
		Account[] db = new Account[] {
			new Account("itbank", "it12", "아뱅"),
			new Account("test1", "1", "테스트1"),
			new Account("root", "qwe", "관리자")
		};
	
		Account login(Account acc) {
			for (int i = 0; i < db.length; i++) {
				if (db[i].equals(acc)) {
					return db[i];
				}
			}
			
			return null;
		}
	%>
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="beans.Account"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		acc = login(acc);
		String msg = "로그인 실패";
		
		if (acc != null) {
			msg = acc.getNick() + "님 로그인";
		}
	%>
	
	<h1>결과</h1>
	<hr>
	
	<h4><%=msg %></h4>
	
</body>
</html>
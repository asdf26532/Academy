<%@page import="beans.Account"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>
	<%!
		Account[] db = new Account[] {
			new Account("itbank", "it12", "아뱅", "홍길동"),
			new Account("test1", "1234", "테스트1", "김철수"),
			new Account("root", "qwe", "관리자", "리누스")
		};
	
		Account login(Account user) {
			for (int i = 0; i < db.length; i++) {
				if (db[i].equals(user)) {
					return db[i];
				}
			}
			
			return null;
		}
	%>
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="user" class="beans.Account"/>
	<jsp:setProperty property="*" name="user"/>
	
	<%
		String save = request.getParameter("save");
		user = login(user);
		
		if (user != null) {
			// 쿠키 생성 및 수명 초기화
			Cookie[] cs = new Cookie[] {
				new Cookie("userid", user.getUserid()),
				new Cookie("save", "checked")
			};
			
			for (int i = 0; i < cs.length; i++) {
				cs[i].setMaxAge(0);
				
				// 쿠키 체크 여부
				if (save != null) {
					cs[i].setMaxAge(60 * 60 * 24);
				}
				
				// 쿠키를 응답에 추가
				response.addCookie(cs[i]);
			}
			
			// 세선에 저장			
			session.setAttribute("user", user);
			response.sendRedirect("home.jsp");
		}
	%>
	
	<script>
		let user = '<%=user %>';
		
		if (user == 'null') {
			alert('로그인 실패');
			location.href = 'home.jsp';
		}
	</script>
</body>
</html>
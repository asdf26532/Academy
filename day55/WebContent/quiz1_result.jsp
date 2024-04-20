<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%!
		String[] ids = new String[] { "itbank", "test1", "root"};
		String[] pws = new String[] { "it12",	"1234",	 "qwe" };
		
		String login(String userid, String userpw) {
			
			for (int i = 0; i < ids.length;i ++) {
				boolean sameId = ids[i].equals(userid);
				boolean samePw = pws[i].equals(userpw);
				
				if (sameId && samePw) {
					return ids[i] + "님 로그인";
				}
			
			}
			
			return "로그인 실패";
		}
	%>

	<%
		String userid = request.getParameter("userid");
		String userpw = request.getParameter("userpw");
		
		// System.out.println(userid);
		// System.out.println(userpw);
		
		String msg = login(userid, userpw);
	%>
	
	<h1>로그인 결과</h1>
	<hr>
	
	<h4><%=msg %></h4>

</body>
</html>
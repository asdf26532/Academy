<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1_result.jsp</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		String sage = request.getParameter("age");
		int age = Integer.parseInt(sage); 
				
		String adult = (age >= 19) ? "성인" : "미성년자";
		pageContext.setAttribute("adult", adult);
	
		Cookie[] cs = new Cookie[] {
				new Cookie("adult", adult),
				new Cookie("name", name)
		};
		
		for (int i = 0; i < cs.length; i++) {
			cs[i].setMaxAge(60 * 60 * 2);
			response.addCookie(cs[i]);
		}
	%>

	<h1>Quiz1 결과</h1>
	<hr>
	
	<ul>
		<li>이름 : ${param.name }</li>
		<li>나이 : ${param.age }세</li>
		<li>${adult } 입니다~</li>
	</ul>
	
</body>
</html>
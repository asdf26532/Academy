<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex05_result.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="stu" class="beans.Student"/>
	<jsp:setProperty property="*" name="stu"/>
	
	<%
		int sum = stu.total();
		double avg = sum / 3.0;
		
		avg = Math.round(avg * 10) / 10.0;
	%>
	
	<h1>결과</h1>
	<hr>
	
	<ul>
		<li>이름 : <%=stu.getName() %></li>
		<li>국어 : <%=stu.getKor() %></li>
		<li>영어 : <%=stu.getEng() %></li>
		<li>수학 : <%=stu.getMat() %></li>
		<li>합계 : <%=sum %> (= <%=avg %>)</li>
	</ul>
	
</body>
</html>
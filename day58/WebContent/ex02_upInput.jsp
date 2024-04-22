<%@page import="model.vo.PersonVO"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_upInput.jsp</title>
</head>
<body>
	<%
		PersonDAO dao = new PersonDAO();
		String name = request.getParameter("name");
		
		PersonVO row = dao.selectOne(name);
	%>

	<h1>Person 수정</h1>
	<hr>
	
	<form action="ex02_update.jsp" method="POST">
		<p><input name="name" placeholder="이름" value="<%=row.getName() %>" required></p>
		<p><input name="height" type="number" step="0.1"  placeholder="신장" value="<%=row.getHeight() %>" required></p>
		<p><input name="birth" type="date" placeholder="생년월일" value="<%=row.getBirth() %>" required></p>

		<p><input name="oldName" type="hidden" value="<%=name %>" required></p>

		<button>전송</button>	
	</form>
	

</body>
</html>
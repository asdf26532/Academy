<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02_insert.jsp</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>

	<jsp:useBean id="per" class="model.vo.PersonVO"/>
	<jsp:setProperty property="*" name="per"/>
	
	<%
		String birth = request.getParameter("birth");
		per.setBirth(birth);
		
		PersonDAO dao = new PersonDAO();
		int row = dao.insert(per);
	%>
	
	<script>
		let row = <%=row %>;
		
		if (row != 0) {
			alert('추가 성공');
			location.href = 'ex02.jsp';
		}
		else {
			alert('추가 실패');
			history.go(-1);
		}
		
	</script>

</body>
</html>
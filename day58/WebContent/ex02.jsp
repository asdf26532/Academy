<%@page import="model.vo.PersonVO"%>
<%@page import="java.util.List"%>
<%@page import="model.PersonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>

<style>
	table {
		border-collapse: collapse;		
	}
	th, td {
		border: 1px solid black;
		padding: 5px 10px;
	}
</style>
</head>
<body>
	<%
		PersonDAO dao = new PersonDAO();
		String ver = dao.test();
		List<PersonVO> list = dao.selectAll();
	%>

	<h1>Person 테이블</h1>
	<hr>

	<h4><%=ver %></h4>
	
	<ul>
		<li>현 페이지에 Person 테이블을 출력한다</li>
		<li>table 태그에다 출력하며</li>
		<li>DAO를 상속 받은 PersonDAO로 작업한다</li>
		<li>Person은 열정보가 복수개</li>
		<li>따라서, VO를 사용해야 한다</li>
	</ul>
	
	<table>
		<thead>
			<tr>
				<th>이름</th>
				<th>신장</th>
				<th>생년월일</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
			<% for (PersonVO row : list) { %>
			<tr>
				<td><%=row.getName()%></td>
				<td><%=row.getHeight() %></td>
				<td><%=row.getBirth() %></td>
				<td><a href="ex02_upInput.jsp?name=<%=row.getName() %>">
					클릭
				</a></td>
				<td><a href="ex02_delete.jsp?name=<%=row.getName() %>">
					클릭
				</a></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	
	<br>
	
	<a href="ex02_input.jsp">
		<button>추가</button>
	</a>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz2_result.jsp</title>
</head>
<body>
	<%
		String sn1 = request.getParameter("n1");
		String sn2 = request.getParameter("n2");
	
		// 파라미터가 없으면 null이 저장된다
		if (sn1 == null || sn2 == null) {
			sn1 = sn2 = "0";
		}
		
		// null을 정수로 변환하면 예외 발생
		int n1 = Integer.parseInt(sn1);
		int n2 = Integer.parseInt(sn2);
	%>

	<h1>Quiz2 결과</h1>
	<hr>
	
	<ul>
		<li>n1 = <%=n1 %></li>
		<li>n2 = <%=n2 %></li>
		<li><%=n1 %> + <%=n2 %> = <%=n1 + n2 %></li>
	</ul>
	

</body>
</html>
<%@page import="service.Hash"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		Hash hash = new Hash();
	
		String srcPw = acc.getUserpw();
		String hashPw = hash.getHash(srcPw); 
		
		acc.setUserpw(hashPw);
	
		acc = dao.selectOne(acc);
		int row = 0;
		String nick = "";
		
		
		if (acc != null) {
			session.setAttribute("user", acc);
			row = 1;
			nick = acc.getNick();
		}
	%>


	<script>
		let result = <%=row %>;
		
		if (result != 0) {
			alert('<%=nick %>님 로그인');
			location.href = 'home.jsp';
		}
		else {
			alert('로그인 실패');
			history.go(-1);
		}
	</script>

</body>
</html>
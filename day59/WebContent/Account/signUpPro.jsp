<%@page import="service.Hash"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
	
	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		Hash hs = new Hash();	
	
		String srcPw = acc.getUserpw();		// 원본 PW를 받아
		String hashPw = hs.getHash(srcPw);	// Hash에 전달
		
		acc.setUserpw(hashPw);				// 해시 PW로 세팅 후
		
		int row = dao.insert(acc);			// DB에 전달
	%>
	
	<script>
		let result = <%=row %>;
		
		if (result != 0) {
			alert('가입을 환영합니다');
			location.href = 'home.jsp';
		}
		else {
			alert('가입 실패');
			history.go(-1);
		}
	</script>

</body>
</html>
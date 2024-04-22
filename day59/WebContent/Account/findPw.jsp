<%@page import="service.Hash"%>
<%@page import="service.NewPw"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<% request.setCharacterEncoding("utf-8"); %>
	
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%
		acc = dao.findPw(acc);
		String newPw = null;
	
		// 1. 일치하는 정보가 있으면 임시 패스워드를 생성 후 발급
		if (acc != null) {
			NewPw np = new NewPw();
			newPw = np.getPw();
			
			// 2-1. 사용자에게는 해시 처리 전의 패스워드를 보여주고
			
			// 2-2. DB는 해시 처리 후의 패스워드로 수정한다
			Hash hash = new Hash();
			String hashPw = hash.getHash(newPw);
			
			acc.setUserpw(hashPw);
			dao.update(acc);
		}
	%>
	
	<script>
		// 여기 2-1
		let newPw = '<%=newPw %>';
		
		if (newPw != 'null') {
			alert('임시 패스워드는 ' + newPw + '입니다');
			location.href = 'login.jsp';
		}
		else {
			alert('일치하는 정보가 존재하지 않습니다');
			history.go(-1);
		}
	</script>

</body>
</html>
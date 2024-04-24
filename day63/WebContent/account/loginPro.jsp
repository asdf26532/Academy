<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<%-- 1. 전달 받은 파라미터 저장 --%>
	<jsp:useBean id="acc" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="acc"/>
	
	<%-- 2. 패스워드 해시 처리 --%>
	<jsp:useBean id="sha" class="service.SHA512"/>
	<jsp:setProperty property="userpw" value="${sha.getHash(acc.userpw) }" name="acc"/>
	
	<%-- 3. dao로 DB에 insert --%>
	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<c:set var="user" value="${dao.selectOne(acc) }" scope="session"/>
	
	<%--
		※ EL에 null을 작성하면 아무것도 출력되지 않는다
		※ c:set의 value에 빈값이 채워지면 Attribute는 생성되지 않는다
	--%>
	
	<c:set var="result" value="${empty user ? 0 : 1}"/>
	
	<script>
		var row = ${result };
	
		if (row != 0) {
			alert('로그인을 환영합니다');
			location.href = '${cpath }/home.jsp';
		}
		else {
			alert('일치하는 정보가 존재하지 않습니다');
			history.go(-1);
		}
	</script>

	</body>
</html>
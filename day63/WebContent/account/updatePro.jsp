<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<jsp:useBean id="input" class="model.vo.AccountVO"/>
	<jsp:setProperty property="*" name="input"/>

	<jsp:useBean id="hash" class="service.SHA512"/>
	<jsp:setProperty property="userpw" value="${hash.getHash(input.userpw) }" name="input"/>

	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<c:set var="row" value="${dao.update(input) }"/>

	<script>
		let row = ${row };
		
		if (row != 0) {
			alert('변경이 완료 되었습니다');
			location.href = '${cpath}/account/logout.jsp';
		}
		else {
			alert('변경 실패');
			history.go(-1);
		}
	</script>

</body>
</html>
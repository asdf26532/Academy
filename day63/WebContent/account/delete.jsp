<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<jsp:useBean id="dao" class="model.AccountDAO"/>
	<c:set var="row" value="${dao.delete(param.idx) }"/>
	
	<script>
		let row = ${row };
		
		if (row != 0) {
			alert('탈퇴가 완료 되었습니다');
			location.href = '${cpath}/account/logout.jsp';
		}
		else {
			alert('탈퇴 실패');
			history.go(-1);
		}
	</script>

</body>
</html>
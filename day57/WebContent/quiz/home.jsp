<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

	<%--
		home.jsp		ID/PW를 입력 받아서 login.jsp로 전송
						단, POST로 전송하고
						현재 로그인 중인 계정이 있으면 '닉네임님 로그인 중'을 출력
						없으면 '로그인된 계정 없음'을 출력
					
		login.jsp		선언부에 Account 클래스로 계정을 3개 정도 생성
						전달 받은 ID/PW와 일치하는 정보가 있으면 session에 저장
						그 후 home.jsp로 리다이렉트
						
		Account.java	필드는 ID, PW, Nick, Name을 가진다
						메서드는 필요한거 마음대로 추가~
						
		myPage.jsp		테이블 형태로 현재 로그인 중인 계정 정보 모두를 출력
	
		logout.jsp		현재 세션에 저장된 정보를 제거
	 --%>

	<%
		Cookie[] cs = request.getCookies();
		String userid, save;
		
		userid = save = "";
	
		if (cs != null) {
			for (int i = 0; i < cs.length; i++) {
				switch(cs[i].getName()) {
				case "userid":
					userid = cs[i].getValue();
					break;
				case "save":
					save = cs[i].getValue();
					break;
				}
			}
		}
	%>


	<h4>메인 페이지 : <%=userNick %></h4>

	<main>
		<form action="login.jsp" method="POST">
			<p><input name="userid" placeholder="ID" value="<%=userid %>" required></p>
			<p><input name="userpw" type="password" placeholder="PW" required></p>
			
			<p><input name="save" type="checkbox" <%=save %> value="yes">ID 저장</p>
			
			<button>Login</button>
		</form>
	</main>

</body>
</html>
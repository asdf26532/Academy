<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz1.jsp</title>
</head>
<body>

	<%--
		quiz1.jsp			ID/PW를 입력 받을 form을 작성
							전송은 POST로 quiz1_result.jsp에 전송
	
	
		quiz1_result.jsp	Account 클래스로 계정을 3개정도 선언부에 생성해 둔다
							그 후 넘어오는 ID/PW와 만들어둔 계정의 ID/PW와 
							일치하면 success.jsp로 리다이렉트
							일치하지 않으면 fail.jsp로 리다이렉트
		
		success.jsp			'ID'님 로그인 성공을 출력한다
							단, ID 부분이 출력이 안될것이다
							
		fail.jsp			로그인 실패를 출력					
							
		beans.Account		필드는 ID, PW을 문자열로 가진다
							메서드는 자유~
	 --%>
	
	<h1>Quiz1</h1>
	<hr>
	
	<form action="quiz1_result.jsp" method="POST">
		<p><input name="userid" placeholder="ID" required></p>
		<p><input name="userpw" type="password" placeholder="PW" required></p>
		
		<button>로그인</button>
	</form>
	

</body>
</html>
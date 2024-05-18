<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	<c:set var="list" value="${map['list'] }"/>
	<c:set var="pg" value="${map['pg'] }"/>
	
	<form class="search">
		<select name="type">
			<option value="title">제목</option>
			<option value="nick">작성자</option>
			<option value="contents">내용</option>
		</select>
		
		<input name="search">
		
		<button>검색</button>
	</form>
	
	<table>
		<tr>
			<th>글번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>조회수</th>
			<th>작성일</th>
			<th>수정</th>
			<th>삭제</th>
		</tr>
		
		<c:forEach var="row" items="${list }">
		<tr>
			<td>${row.idx }</td>
			<td>
				<a href="/board/view?idx=${row.idx }">
				${row.title }
				</a>
			</td>
			<td>${row.nick }</td>
			<td>${row.v_count }</td>
			<td>${row.w_date }</td>
			<td><a href="/board/update?idx=${row.idx }">클릭</a></td>
			<td><a href="/board/delete?idx=${row.idx }">클릭</a></td>
		</tr>
		</c:forEach>
	</table>

	<c:if test="${not empty param.type }">
		<c:set var="search" value="&type=${param.type }&search=${param.search }"/>
	</c:if>

	<ul class="menu">
		<c:if test="${pg.prev }">
		<li><a href="/board?page=${pg.begin - 1 }${search }">이전</a></li>
		</c:if>
	
		<c:forEach var="i" begin="${pg.begin }" end="${pg.end }">
		<li><a href="/board?page=${i }${search }">${i }</a></li>
		</c:forEach>
		
		<c:if test="${pg.next }">
		<li><a href="/board?page=${pg.end + 1 }${search }">다음</a></li>
		</c:if>
	</ul>
	
	<a href="/board/add">
		<button>글작성</button>
	</a>

</body>
</html>
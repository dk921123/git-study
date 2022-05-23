<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Board</title>
<style>
.container {
	
	display: flex;
	flex-direction: column;
	align-items: center;
}

.btn_area {
	width: 80%;
	margin:5px;
}

a:link { color: black; text-decoration: none;}

a:visited { color: black; text-decoration: none;}

table {
	width: 80%;
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	border: 1px solid black;
	text-align: center;
}

th {
	background: gray;
}
</style>
</head>
<body>
	<div class="container">
		<h2>Main Page</h2>
		<div class="btn_area">
			<button type="button" onclick="self.location='/board/register'">Register New Board</button>
		</div>
		<table>
			<tr>
				<th>#번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정일</th>
			</tr>
			<c:forEach items="${boardList}" var="board">
				<tr>
					<td><c:out value="${board.bno}" /></td>
					<td><a href="/board/details?bno=<c:out value='${board.bno}'/>"><c:out value="${board.title}" /></a></td>
					<td><c:out value="${board.userName}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.regDate}" /></td>
					<td><fmt:formatDate pattern="yyyy-MM-dd" value="${board.updateDate}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>
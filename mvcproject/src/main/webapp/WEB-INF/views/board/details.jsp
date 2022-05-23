<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.registerForm {
	display: flex;
	flex-direction: column;
	align-items: center;
}

form {
	width: 60%;
	
	display: flex;
	flex-direction: column;
	align-items: center;
}
.btn_area{
margin-top: 10px; 

}
.btn_area button{ width :70px}


table {
	width: 600px;
	
	border: 1px solid black;
	border-collapse: collapse;
}

th, td {
	padding: 10px;
	border: 1px solid black;
}

th {
	background: gray;
}

.content_area{
	width:500px;
	height: 200px;
}
</style>
<script src="/resources/js/jquery-3.6.0.min.js"></script>

<script type="text/javascript">

</script>

<body>

	<div class="registerForm">
		<h2>Details Page</h2>
		<div class="btn_area">
				<button type="button" onclick="self.location='/board/modify?bno=${board.bno}'">Modify</button>
				<button type="button" onclick="self.location='/board/list'">List</button>
			</div>

			<table>
				<tr>
					<th>No.</th>
					<td><c:out value="${board.bno}"/></td>
				<tr>
				<tr>
					<th>Title</th>
					<td><c:out value="${board.title}"/></td>
				<tr>
				<tr>
					<th>User Name</th>
					<td><c:out value="${board.userName}"/></td>
				</tr>
				<tr>
				<th>Content</th>
				<td class="content_area"><c:out value="${board.content}"/></td>
				</tr>
				<tr>
					<th>Register Date</th>
					<td><fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<th>Update Date</th>
					<td><fmt:formatDate value="${board.updateDate}" pattern="yyyy-MM-dd"/></td>
				</tr>
				<tr>
					<th colspan="2"></th>
				</tr>
				<tr>
					<th>Register Reply</th>
					<td>
						<input type="text" class="reg-userName">
						<textarea class="reg-reply"></textarea><button class="regBtn">Reply Register</button>
					</td>
				</tr>
				<tr>
					<td colspan="2">reply</td>
				</tr>
			</table>
			
	</div>
	
	<script type="text/javascript">
/*
	$(document).ready(function(){
		var bno = '<c:out value="${board.bno}"/>';



		
		getReplyList();
		function getReplyList(){
			$.ajax({
				type: "GET",
				url: "/reply/" + bno + ".json",
				dataType: "json",
				success: function(result,status,xhr){
					console.log(result);
				},error: function(xhr, status, err){
					error();
				}
			});// getReplyList ajax end
		}//getReplyList end

		$(".regBtn").on("click", function(){
			var userName = $(".reg-userName").val();
			var reply = $(".reg-reply").val();
			var replyVO = {bno:bno, reply:reply, userName:userName };

			registerReply(replyVO);
			
		}); //regBtn click end

		function registerReply(replyVO){
			$.ajax({
				type: "POST",
				url: "/reply/" + bno,
				data: JSON.stringify(replyVO),
				contentType: "application/json",
				success: function(result, status, xhr){
					console.log(result);
				},error: function(xhr, status, err){
					console.log("error");
				}
			});// registerReply ajax end
		}//registerReply end;

		$(".modBtn").on("click", function(){
			var reply = $(".reg-reply").val();
			var replyVO = {bno:bno, reply:reply};
			modifyReply(replyVO);
			
		}); 

		function modifyReply(replyVO){
			$.ajax({
				type: "PUT",
				url: "/reply/" + rno,
				data: JSON.stringify(replyVO),
				contentType: "application/json",
				success: function(result, status, xhr){
					console.log(result);
				},error: function(xhr, status, err){
					console.log("error");
				}
			});// modifyReply ajax end
		}//modifyReply end;

		var rno = 2;
		function deleteReply(rno){
			$.ajax({
				type: "DELETE",
				url: "/reply/" + rno,
				success: function(result, status, xhr){
					console.log("---success----")
					console.log(result);
					console.log(xhr);
					console.log(status);
				},error: function(xhr, status, err){
					console.log("----error----")
					console.log(xhr);
					console.log(status);
					console.log(err);
				}
			});// modifyReply ajax end
		}//modifyReply end;
		deleteReply(rno);

		
		
		



		

	});// doucmemt ready end;
	*/
	</script>
	
	
</body>
</html>
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

textarea{
	width:500px;
	height: 200px;
}
</style>


<body>

	<div class="registerForm">
		<h2>Modify Page</h2>
			<form id="form-id" action="/board/modify" method="POST">
				<table>
					<tr>
						<th>No.</th>
						<td><input type="number" name="bno" value="${board.bno }" readonly></td>
					<tr>
					<tr>
						<th>Title</th>
						<td><input type="text" name="title" value="${board.title }"></td>
					<tr>
					<tr>
						<th>User Name</th>
						<td><input type="text" name="userName" value="${board.userName }" readonly></td>
					</tr>
					<tr>
					<th>Content</th>
					<td><textarea name="content" value="${board.content}">${board.content}</textarea></td>
					</tr>
					<tr>
						<th>Register Date</th>
						<td><input type="text" name="regDate" value='<fmt:formatDate value="${board.regDate}" pattern="yyyy-MM-dd"/>' readonly></td>
					</tr>
					<tr>
						<th>Update Date</th>
						<td><input type="text" name="regDate" value='<fmt:formatDate value="${board.updateDate}" pattern="yyyy-MM-dd"/>' readonly></td>
					</tr>
					
	
				</table>
			<div class="btn_area">
				<button class = "modify"type="submit" value="modify" >Modify</button>
				<button class = "remove" type="button" value="remove" ">Remove</button>
				<button class = "list" type="button" value="list">List</button>
			</div>
			
		</form>
		
		
		<script type="text/javascript">
		/*
		document.addEventListener("DOMContentLoaded", function(){
			var form = document.getElementById("form-id");
			var btn = document.getElementsByTagName("button");

			for(var i=0; i<btn.length; i++){
				btn[i].addEventListener("click", function(){
					console.log(this.value);
					form.setAttribute("action", "/board/"+this.value);
					console.log(form.getAttribute("action"));
				});
			}
			
		

		});//DOMContentLoaded

		*/
			
		
		</script>
	
	</div>
</body>
</html>
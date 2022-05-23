<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
.btn_area input{ width :70px}


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
		<h2>Register Page</h2>
		<form action="/board/register" method="POST">

			<table>
				<tr>
					<th>Title</th>
					<td><input type="text" name="title"></td>
				<tr>
				<tr>
					<th>User Name</th>
					<td><input type="text" name="userName"></td>
				</tr>
				<tr>
				<th>Content</th>
				<td><textarea name="content"></textarea></td>
				</tr>

			</table>
			<div class="btn_area">
				<input type="submit" value="submit"> 
				<input type="reset"value="reset"> 
				<input type="button" value="list">
			</div>
		</form>
	</div>
</body>
</html>
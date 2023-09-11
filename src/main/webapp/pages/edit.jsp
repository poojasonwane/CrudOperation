<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit page</h2>
	
	<form action="updatestud" method="post">
		<input type="hidden" name="id" value="${data.id}"><br><br>
		<input type="text" name="fullname" value="${data.fullname}"><br><br>
		<input type="email" name="email" placeholder="Email" value="${data.email}"><br><br>
		<input type="password" name="password" placeholder="Password" value="${data.password}"><br><br>
		
		<button type="submit">Update</button>
	</form>
</body>
</html>
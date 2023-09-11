<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<h2>Welcome Student Information Page</h2>
	<table border="2px">
		<tr>
			<th>Id</th>
			<th>Fullname</th>
			<th>Email</th>
			<th>Password</th>
			<th>Action</th>
		</tr>
		
		<c:forEach var="s" items="${data}">
		<tr>
			<td>${s.id}</td>
			<td>${s.fullname}</td>
			<td>${s.email}</td>
			<td>${s.password}</td>
			<td>	
				<a href="deletestud?id=${s.id}">Delete</a>
				
				<a href="editstud?id=${s.id}">Edit</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</center>
</body>
</html>
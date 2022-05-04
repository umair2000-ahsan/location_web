<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All the location</title>
</head>
<body>
	<h2>List All the Location.......</h2>
	<table border="2">
		<tr> 
			<th>ID</th>
			<th>NAME</th>
			<th>CITY</th>
			<th>CODE</th>
			<th>DELETE</th>
			<th>UPDATE<th>
			
		
		</tr>
		<c:forEach items="${location}"  var="location">
			<tr> 
				<td>${location.id} </td>
				<td>${location.name} </td>
				<td>${location.city} </td>
				<td>${location.code} </td>
				<td> <a href="delete?id=${location.id}">Delete</a></td>
				<td> <a href="update?id=${location.id}">Update</a></td>
			</tr>
		
		 </c:forEach>
	 
		
	
	</table>
</body>
</html>
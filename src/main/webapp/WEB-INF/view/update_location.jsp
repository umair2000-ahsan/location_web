<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location | Update Location</title>
</head>
<body>
 <h1> Update Data</h1>
 <form action="updateLocation" method="post">
 ID:<input type="text" name="id" value="${location.id}"> <br>
 NAME:<input type="text" name="name" value="${location.name}"><br>
 CITY:<input type="text" name="city" value="${location.city}"> <br>
 CODE:<input type="text" name="code" value="${location.code}"><br>
  <input type="submit" value="update" >
 
 </form>
 ${msg}
</body>
</html>
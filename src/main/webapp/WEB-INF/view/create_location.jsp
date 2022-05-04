<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location | Create Location</title>
</head>
<body>
 <h1> Create Location</h1>
 <form action="savePage" method="post">
 ID:<input type="text" name="id"> <br>
 NAME:<input type="text" name="name"><br>
 CITY:<input type="text" name="city"> <br>
 CODE:<input type="text" name="code"><br>
  <input type="submit" value="save">
 
 </form>
 ${msg}
</body>
</html>
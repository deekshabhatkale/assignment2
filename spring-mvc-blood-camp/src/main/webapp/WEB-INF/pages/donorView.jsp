<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donor View</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  width: 200px;
  background-color: #f1f1f1;
}

li a {
  display: block;
  color: #000;
  padding: 8px 16px;
  text-decoration: none;
}

/* Change the link color on hover */
li a:hover {
  background-color: #555;
  color: white;
}
h1
{
text-align:center;
}
</style>
</head>
<body>
<h1>${heading}</h1>
<ul>
	<li><a href="addDonor">I want to be a Donor</a></li>
	<li><a href="deleteMe">I want to unregister</a></li>
	<li><a href="registerForCamp">I want to join a blood camp near me</a></li>
	
</ul>
</body>
</html>
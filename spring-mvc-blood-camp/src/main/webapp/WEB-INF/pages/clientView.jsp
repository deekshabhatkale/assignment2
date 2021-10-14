<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Client View</title>
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
	<li><a href="getAllDonor">Show me All Donors</a></li>
	<li><a href="searchThisBloodGroup">Show me All Donors of specific blood group</a></li>
	<li><a href="searchThisBloodGroupA">Show me available Donors of specific blood group</a></li>
	<li><a href="searchThisArea">Show me All Donors based on location</a></li>
	<li><a href="searchThisCamp">Show me All Donors of specific camp</a></li>
</ul>

</body>
</html>
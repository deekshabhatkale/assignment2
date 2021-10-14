<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>index page</title>
<style>
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 620px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

h1
{
	text-align:center;
	color:red;
}
h2
{
	text-align:center;
	
}
</style>
</head>
<body>
<h1>${majHeading}</h1>
<br />
<h2>I am a </h2>
<ul>
	<li><a href="client">Client</a></li>
	<li><a href="donor">Donor</a></li>
	
</ul>
</body>
</html>
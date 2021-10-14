<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib   uri="http://www.springframework.org/tags/form"  prefix="form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donor Registration Form</title>
<style>
input[type=text], select {
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 100%;
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #45a049;
}

div {
  border-radius: 5px;
  background-color: #f2f2f2;
  padding: 20px;
}
header
{
	font-size:30px;
	text-align:center;
}</style>
</head>

<body>

<header>Donate and Save Lives !</header>
<ul>
	<li>Karwar</li>
	<li>Bengaluru</li>
	<li>Mumbai</li>
	<li>Hyderabad</li>
	<li>Chennai</li>
	<li>Kolkatta</li>
</ul>
<div>
<form:form action="/registerForCamp" modelAttribute="command" method="post"  >

        
            <label for="">Select a camp from above list<label>
            <form:input path="campName" type="text" />
        
             <label for="">Enter your name<label>
            <form:input path="donorName" type="text" />
             <label for="">Enter your blood Group type<label>
            <form:input path="bloodGroup" type="text" />
       
            <input type = "submit" value = "Lets join !">
        
</form:form>
</div>

</body>
</html>
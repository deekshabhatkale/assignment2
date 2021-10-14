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
</style>
</head>
<body>
<h1>${heading}</h1>
<div>
<form:form action="/addDonor" modelAttribute="command" method="post"  >
        
            <label for="">Donor ID</label>
            <form:input path="id"/>
       
            <label for="">Donor first Name</label>
            <form:input path="firstName"/>
        
            <label for="">Donor last name</label>
            <form:input path="lastName"/>
        
            <label for="">Donor contact number</label>
            <form:input path="phone"/>
        
        <label for="">Blood Group</label>
        <form:input path="bloodGroup"/>
       
<label for="">Last date of donation</label>
<form:input type="date" path="donationDate" />
</div>
        <label for="">Location</label>
        <form:input path="location"/>
        
            <input type = "submit" value = "Register !">
       
</form:form>
</div>




</body>
</html>
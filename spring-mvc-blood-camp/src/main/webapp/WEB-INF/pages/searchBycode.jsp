<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donors List By Area code</title>
</head>
<body>
<header>List Of Donors Availabe by Area Code</header>
<table>
	<tr>
		<th>ID</th>
		<th>Donor Name</th>
		
		<th>Blood group </th>
		<th>Area /Location </th>
	</tr>
	
<c:forEach  items="${data}"  var="eachItem">
     <tr>
          <th>${eachItem.id }</th>
          <th>${eachItem.firstName }</th>
          
          <th>${eachItem.bloodGroup }</th>
          <th>${eachItem.location }</th>
     </tr>
</c:forEach>
</table>

</body>
</html>
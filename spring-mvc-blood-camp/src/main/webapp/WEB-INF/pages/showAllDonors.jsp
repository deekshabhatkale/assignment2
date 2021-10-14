<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show All Donors</title>
<style>
#customers {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#customers td, #customers th {
  border: 1px solid #ddd;
  padding: 8px;
}

#customers tr:nth-child(even){background-color: #f2f2f2;}

#customers tr:hover {background-color: #ddd;}

#customers th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>
</head>
<body>

<table id="customers">
	<tr>
		<th>ID</th>
		<th colspan="2">Donor Name</th>
		
		<th>Blood group </th>
		<th>Area /Location </th>
		
	</tr>
	
<c:forEach  items="${data}"  var="eachItem">
     <tr>
          <td>${eachItem.id }</td>
          <td>${eachItem.firstName }</td>
          <td>${eachItem.lastName }</td>
          <td>${eachItem.bloodGroup }</td>
          <td>${eachItem.location }</td>
           

          
     </tr>
</c:forEach>
</table>

</body>
</html>
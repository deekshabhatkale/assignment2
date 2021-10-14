<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Donors</title>
</head>
<body>
<header>Donos Of particular Blood Group</header>
<table>
	<tr>
		<th>ID</th>
		<th>Donor Name</th>
		<th>Blood group </th>
		<th>Area </th>
	</tr>
	
<c:forEach  items="${data}"  var="eachItem">
     <tr>
          <th>${eachItem.id }</th>
          <th>${eachItem.firstName }</th>
          <th>${eachItem.bloodGroup}</th>
          <th>${eachItem.location }</th>

          
     </tr>
</c:forEach>
</table>
</body>
</html>
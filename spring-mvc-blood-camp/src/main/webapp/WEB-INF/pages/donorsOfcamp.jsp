<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donors List By Area code</title>
</head>
<body>
<header>Donors Availabe for Particular Camp</header>
<table>
	<tr>
		<th>Camp Name</th>
		<th>Donor Name</th>
		
		<th>Blood Group </th>
		
	</tr>
	
<c:forEach  items="${data2}"  var="eachItem">
     <tr>
          <th>${eachItem.campName }</th>
          <th>${eachItem.donorName }</th>
          <th>${eachItem.bloodGroup }</th>
          
     </tr>
</c:forEach>
</table>

</body>
</html>
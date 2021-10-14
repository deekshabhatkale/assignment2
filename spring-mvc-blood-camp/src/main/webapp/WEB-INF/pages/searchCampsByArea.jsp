<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Serach Camps By Area Code</title>
</head>
<body>
<header>List Of Camps By AreaCode</header>
<table>
	<tr>
		<th>Camp ID</th>
		<th>Donoration Camp Location</th>
		
	</tr>
	
<c:forEach  items="${data}"  var="eachItem">
     <tr>
          <th>${eachItem.campname }</th>
          <th>${eachItem.donorname }</th>
         
     </tr>
</c:forEach>
</table>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search <c:out value="${artist}"/></title>
<style>
	table, td {
		border: 3px solid black;
	}
 	td {
 	padding: 30px;
 	}
</style>
</head>
<body>

	<a href="/dashboard">Dashboard</a>
	
	<br>

	<p>Songs by artist: <c:out value="${artist}"/></p>
	
	<form method="POST" action="/search">
    	<input type="text" name="search" placeholder="Search Songs by Artist"/>
    	<input type="submit" value="New Search"/>
    </form>
    
    <br>
    
    
    <table>
	
	<tr>
	<th>Name</th>
	<th>Rating</th>
	<th>Actions</th>
	</tr>
	
	<c:forEach var="result" items="${results}" varStatus="loop">
	<tr>
		<td><a href="/song/${loop.index}"><c:out value="${result.getTitle()}"/></td>
		<td><c:out value="${result.getRating()}"/></td>
		<td><a href="/song/delete/${id}">Delete</a></td>
	</tr>
	</c:forEach>
	
	</table>
	
</body>
</html>
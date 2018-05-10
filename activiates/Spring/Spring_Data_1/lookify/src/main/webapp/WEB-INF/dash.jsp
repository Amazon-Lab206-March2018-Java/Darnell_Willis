<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lookify!</title>
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

	<a href="/songs/new">Add New</a> &nbsp; &nbsp; &nbsp;<a href="/search/topTen">Top Songs</a>  
	
	<br>
	<br>
    
    <form method="POST" action="/search">
    	<input type="text" name="search" placeholder="Search Songs by Artist"/>
    	<input type="submit" value="New Search"/>
    </form>
	
	<br>
	<br>
	
	<table>
	
	<tr>
	<th>Name</th>
	<th>Rating</th>
	<th>Actions</th>
	</tr>
	
	<c:forEach var="song" items="${all_songs}" varStatus="loop">
	<tr>
		<td><a href="/song/${loop.index}"><c:out value="${song.title}"/></a></td>
		<td><c:out value="${song.rating}"/></td>
		<td><a href="/song/delete/${loop.index}">Delete</a></td>
	</tr>
	</c:forEach>
	
	</table>
	
</body>
</html>
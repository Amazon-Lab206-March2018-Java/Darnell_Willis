<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
<style>
.songs {
border: 2px solid black;
padding: 20px;
width: 400px;
}

</style>
</head>
<body>
		<h4>Top Ten Songs:</h4>
		
		<a href="/dashboard">Dashboard</a>
		
		<br>
		<br>
		
		<div class="songs">
		<c:forEach var="result" items="${results}" >
		<p><c:out value="${result.id}"/> - <c:out value="${result.title}"/> - <c:out value="${result.artist}"/></p>
		</c:forEach>
		</div>
</body>
</html>
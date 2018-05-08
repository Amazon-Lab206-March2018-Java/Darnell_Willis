<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey Index</title>
<style>
.display {
	padding: 20px;
	border: 2px solid black;
	width: 400px;
}

</style>
</head>
<body>

	<div class='display'>

	<h3><u>Submitted Info</u></h3>
	
	<p>Name:  <c:out value="${name}"/></p>
	<p>Dojo Location:  <c:out value="${location}"/></p>
	<p>Favorite Language:  <c:out value="${lang}"/></p>
	<p>Comment:  <c:out value="${comment}"/></p>
	
	<a href='/'>Go Back</a>
	
	</div>
	
</body>
</html>
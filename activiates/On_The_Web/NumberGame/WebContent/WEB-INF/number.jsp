<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Great Number Game</title>
<style>
	body {
		text-align: center;
	}
</style>
</head>
<body>
	<h3>Welcome to the Great Number Game!</h3>
	<p>I am thinking of a number between 1 and 100</p>
	<p>Take a guess!</p>
	
	
	<c:set var="number1" value="${45}"/>
	
	
	
	
	<form action='Generate', method=post>
		<input type='text' name="guess" />
		<br>
		<br>
		<input type='submit' value='Submit' />
	</form>
	
</body>
</html>
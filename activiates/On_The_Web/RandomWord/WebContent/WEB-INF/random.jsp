<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Random Word Generator</title>
<style>
	.word {
		border: 2px solid black;
		width: 250px;
		padding: 20px;
	}
</style>

</head>
<body>
	<p>You have generated a word <c:out value="${sessionScope.counter}"/> times</p>
	
	<h2 class='word'><c:out value="${sessionScope.word}"/></h2>
	
	<form action='', method="post">
		<input type='submit' value='Generate'/>
	</form>
	
	<p>The last time you generated a word was:</p>
	
	<p class='word'><c:out value="${sessionScope.date}"/></p>
	
</body>
</html>
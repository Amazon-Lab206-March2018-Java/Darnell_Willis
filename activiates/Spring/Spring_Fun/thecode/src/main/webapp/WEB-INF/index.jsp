<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Secret Code</title>
<style>
.red {
color: red;
}
</style>
</head>
<body>
	
	<h3 class='red'><c:out value="${errors}"/></h3>
	
	<h3>What is the code?</h3>
	
	<form action='code' method='POST'>
		<input type='text' name='code'/>
		<br>
		<br>
		<input type='submit' value='Try Code' />
	</form>
	
</body>
</html>
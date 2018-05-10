<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Song</title>
</head>
<body>

	<a href="/dashboard">Dashboard</a>
	
	<br>
	<br>
	
	<form:form method="POST" action="/song/create" modelAttribute="song">
	
		<form:label path="title">Title:
    	<form:hidden path="id"/>
    	<form:errors path="title"/>
    	<form:input path="title"/></form:label>
    	
    	<br>
		<br>
    
    	<form:label path="artist">Artist:
    	<form:errors path="artist"/>
    	<form:input path="artist"/></form:label>
    	
    	<br>
		<br>
    
    	<form:label path="rating">Rating(1-10):
    	<form:errors path="rating"/>
    	<form:select path="rating">
    		<form:option value="1">1</form:option>
    		<form:option value="2">2</form:option>
    		<form:option value="3">3</form:option>
    		<form:option value="4">4</form:option>
    		<form:option value="5">5</form:option>
    		<form:option value="6">6</form:option>
    		<form:option value="7">7</form:option>
    		<form:option value="8">8</form:option>
    		<form:option value="9">9</form:option>
    		<form:option value="10">10</form:option>
    	</form:select>
    	</form:label>
    	
    	<br>
		<br>
    
    	<input type="submit" value="Add Song"/>
    
	</form:form>

</body>
</html>
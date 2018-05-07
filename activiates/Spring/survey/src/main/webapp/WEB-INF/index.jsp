<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Dojo Survey Index</title>
<style>
	body {
		text-align: center;
	}
	form {
		padding: 20px;
		border: 2px solid black;
		width: 400px;
	}
</style>
</head>
<body>
	
	<form action='/result' method='POST'>
	<label for='name'>Your name</label>
	<input type='text' name=name />
	
	<br>
	<br>
	
	<label for='location'>Dojo Location:</label>
	<select name=location>
  		<option value="sanjose">San Jose</option>
  		<option value="Seattle">Seattle</option>
  		<option value="Phoenix">Phoenix</option>
  		<option value="Miami">Miami</option>
  		<option value="newyork">New York</option>
	</select>
	
	<br>
	<br>
	
	<label for='lang'>Favorite Language:</label>
	<select name=lang>
  		<option value="Python">Python</option>
  		<option value="Java">Java</option>
  		<option value="C#">C#</option>
  		<option value="Ruby">Ruby</option>
  		<option value="Javascript">JavaScript</option>
	</select>
	
	<br>
	<br>
	
	<label for='comment'>Comment (optional):</label>
	<textarea rows="2" cols="8" name="comment"></textarea>
	
	<br>
	<br>
	
	<input type='submit' value='Button'/>
	
	</form>
	
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Make a Pet</title>
</head>
<body>

	<h2>Create a Dog</h2>
	<form action="dogTest" method="GET">
	    <input type="text" placeholder="Name" name="dog_name" />
	    <input type="text" placeholder="Breed" name="dog_breed" />
	    <input type="text" placeholder="Weight" name="dog_weight" />
	    <input type="submit" value='Create Dog'/>
	</form>
	
	<br>
	<br>
	
	<h2>Create a Cat</h2>
	<form action="catTest" method="GET">
	    <input type="text" placeholder="Name" name="cat_name" />
	    <input type="text" placeholder="Breed" name="cat_breed" />
	    <input type="text" placeholder="Weight" name="cat_weight" />
	    <input type="submit" value='Create Cat'/>
	</form>

	

</body>
</html>
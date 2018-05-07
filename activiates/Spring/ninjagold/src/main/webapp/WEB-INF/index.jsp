<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ninja Gold Game</title>
<link rel="stylesheet" href="/ninja.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<style>

.box {
	border: 2px solid black;
	padding: 20px;
	margin: 20px;
	text-align: center;
}

h4, #logs {
	margin-left: 270px;
}

#logs {
	border: 3px solid black;
	width: 1200px;

}

.green {
	color: green;
}

.red {
	color: red;
}

</style>
</head>
<body>

	<h4>Your Gold: <b><c:out value="${gold}"/></b></h4>	
	
	<div class='container'>
		<div class='row'>
		
			<div class='col-md-2 box'>
				<p>Farm</p>
				<p>(earns 10-20 gold)</p>
			<form action='/farm' method='POST'>
				<input type="hidden" name="hidden" value="farm" />
				<input type='submit' value='Find Gold!' class="btn btn-warning"/>
			</form>	
			</div>
				
			<div class='col-md-2 box'>
				<p>Cave</p>
				<p>(earns 5-10 gold)</p>
			<form action='/cave' method='POST'>	
				<input type="hidden" name="hidden" value="cave" />
				<input type='submit' value='Find Gold!' class="btn btn-warning"/>
			</form>	
			</div>
			
			<div class='col-md-2 box'>
				<p>House</p>
				<p>(earns 2-5 gold)</p>
			<form action='/house' method='POST'>	
				<input type="hidden" name="hidden" value="house" />
				<input type='submit' value='Find Gold!' class="btn btn-warning"/>
			</form>	
			</div>
			
			<div class='col-md-2 box'>
				<p>Casino</p>
				<p>(earns/takes 0-50 gold)</p>
			<form action='/casino' method='POST'>	
				<input type="hidden" name="hidden" value="casino" />
				<input type='submit' value='Find Gold!' class="btn btn-warning"/>
			</form>	
			</div>
			
		</div>
	</div>
	
	<br>
	<br>
	
	<h4>Activites:</h4>
	
	<div id="logs">
			<c:forEach var="timestamp" items="${stamps}" >
        		<span class="green"><c:out value="${timestamp}" /></span>
        		<br>
    		</c:forEach>
	</div>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
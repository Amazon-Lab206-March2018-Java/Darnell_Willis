<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Languages</title>
<style>
span {
color: red;
}
</style>
</head>
<body>
	<table>
	
	<tr>
    	<th>Name</th>
    	<th>Creator</th>
    	<th>Version</th>
    	<th>action</th>
  	</tr>
  	<c:forEach var="lang" items="${all_langs}" varStatus="loop">
  	<tr>
  		<td><a href="/languages/${loop.index}"><c:out value="${lang.name}"/></a></td>
  		<td><c:out value="${lang.creator}"/></td>
  		<td><c:out value="${lang.version}"/></td>
  		<td> <a href="/languages/delete/${loop.index}">Delete</a>  <a href="/languages/update/${loop.index}">Edit</a> </td>
  	</tr>
	</c:forEach>
	</table>
	
	<br>
	<br>
	<br>
	
	
	<form:form method="POST" action="/lang/new" modelAttribute="lang">
	
		<form:label path="name">Name:
    	<form:hidden path="id"/>
    	<form:errors path="name"/>
    	<form:input path="name"/></form:label>
    	
    	<br>
		<br>
    
    	<form:label path="creator">Creator:
    	<form:errors path="creator"/>
    	<form:input path="creator"/></form:label>
    	
    	<br>
		<br>
    
    	<form:label path="version">Version:
    	<form:errors path="version"/>
    	<form:input path="version"/></form:label>
    	
    	<br>
		<br>
    
    	<input type="submit" value="Submit"/>
    
	</form:form>
		
	
</body>
</html>
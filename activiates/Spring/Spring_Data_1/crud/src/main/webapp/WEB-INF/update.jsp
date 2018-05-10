<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><c:out value="${current_lang.getName()}"/></title>
</head>
<body>

	<a href="/languages/delete/${id}">Delete</a> |
	
	<a href="/languages">Dashboard</a>
	
	<br>
	<br>
	
	<form:form method="POST" action="/languages/update/${current_lang.getId()}" modelAttribute="lang">
			<form:hidden path="id"/>
			<p><form:label path="name">Name:
			<span class="error"><form:errors path="name"/></span>
			<form:input path="name" value="${current_lang.getName()}"/></form:label></p>
					
			<p><form:label path="creator">Creator:
			<span class="error"><form:errors path="creator"/></span>
			<form:input path="creator" value="${current_lang.getCreator()}"/></form:label></p>
					
			<p><form:label path="version">Current Version:
			<span class="error"><form:errors path="version"/></span>
			<form:input path="version" value="${current_lang.getVersion()}"/></form:label></p>
					
			<input type="submit" value="Update" class="submit">
	</form:form>
	
</body>
</html>
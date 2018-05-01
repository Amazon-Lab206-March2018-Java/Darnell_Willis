<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A Web Page</title>
<link rel="stylesheet" href="static/styles.css">
</head>
<body>
	
	
	<% 
	int width = 0;
	int height = 0; 
	%>
	
		<h1>Checkerboard: <%=width %>w X <%=height %>h</h1>
		
			<% for(int i = 0; i < height; i++) { %>
			
				<div class="blocks">
				<% for(int j = 0; j < width; j++) { %>
					<% if(i % 2 == 0) { %>
					
						<% if(j % 2 == 0) { %>
							<div class="red"></div>
						<% } else { %> 
							<div class="gold"></div>
						<% } %>
						
					<% } else { %>
					
						<% if(j % 2 == 0) { %>
							<div class="gold"></div>
						<% } else { %> 
							<div class="red"></div>
						<% } %>
					<% } %>
				<% } %>
					</div>	
			<% } %>
	
</body>
</html>
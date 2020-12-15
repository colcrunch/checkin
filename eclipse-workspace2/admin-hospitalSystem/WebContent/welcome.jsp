<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<title>Welcome</title>
		<link rel="stylesheet" href="WEB-INF/css/welcome.css">
	</head>
	<body>
	
	<form action="patientServlet" method="post">
			<input type="hidden" name="source" value="login">
			<div id = "button">
				<button type="submit" class="btn btn-primary btn-block">Login</button>
			</div>
		</form>
		<hr />
		Welcome to the Online Bookstore 
	</body>
</html>
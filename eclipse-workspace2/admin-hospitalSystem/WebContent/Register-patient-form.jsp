<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>

<link type="text/css" rel="stylesheet" href="/css/generalStyle.css">

</head>
<body>
	<div	id="wrapper">
		<div	id="header">
			<h2 class="hospital_title">NewLife Hospital</h2>
		</div>
	</div>
	
	<div	id="container" align="center">
		<h3 >Patient Registration</h3>
	
	<!-- SEND INFORMATION TO THE PATIENT SERVLET HENCE ACTION="pATIENTsERVLET 
		this will call the doGet method in the servlet
	-->
		<form action="patientServlet" method="GET">
			<input type="hidden" name="command"	value="REGISTER"/>
			
			<table>
				<tbody>
					<tr>
					
						
					<!-- The name fields are the paramets you read the form data in your servlet code-->
						<tr>
							<td><label>First Name:</label></td>
							<td><input type="text" name="firstName"/></td>
						<br></br>
						</tr>
						<tr>
							<td><label>Last Name:</label></td>
							<td><input type="text" name="lastName"/></td>
						</tr>
						<tr>
							<td><label>Age:</label></td>
							<td><input type="text" name="age"/></td>
						</tr>
						<tr>
							<td><label>Gender:</label></td>
							<td><input type="text" name="gender"/></td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<td><input type="text" name="email"/></td>
						</tr>
						<tr>
							<td><label>Phone Number:</label></td>
							<td><input type="text" name="phone_number"/></td>
						</tr>
						<tr>
							<td><label>Height:</label></td>
							<td><input type="text" name="height"/></td>
						</tr>
						<tr>
							<td><label>Weight:</label></td>
							<td><input type="text" name="weight"/></td>
						<tr>
							<td><label>Temperature:</label></td>
							<td><input type="text" name="temp"/></td>
						</tr>
						<tr>
							<td><label>Blood Pressue:</label></td>
							<td><input type="text" name="bp"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value="Register" class="save"/></td>
						</tr>
					</tr>
				</tbody>
			</table>
		</form>
		<div style="clear: both;"></div>
		
			<p>
				<a href="patientServlet">Main</a>
			</p>
	</div>

</body>
</html>
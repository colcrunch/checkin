<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Patient Information</title>

<link type="text/css" rel="stylesheet" href="css/generalStyle.css">

</head>
<body>
	<div	id="wrapper">
		<div	id="header">
			<h2 class="hospital_title">NewLife Hospital</h2>
		</div>
	</div>
	
	<div	id="container" align="center">
		<h3 >Patient Update </h3>
	
	<!-- SEND INFORMATION TO THE PATIENT SERVLET HENCE ACTION="pATIENTsERVLET 
		this will call the doGet method in the servlet
	-->
		<form action="patientServlet" method="GET">
			<input type="hidden" name="command"	value="UPDATE"/>
		
			<input type="hidden" name="ID" value="${THE_PATIENT.getID()}"/>
			
			<table>
				<tbody>
					<tr>					
					<!-- The name fields are the paramets you read the form data in your servlet code-->
						<tr>
							<td><label>First Name:</label></td>
							<td><input type="text" name="firstName"
							value="${THE_PATIENT.getFirst_name()}"/></td>
						<br></br>
						</tr>
						<tr>
							<td><label>Last Name:</label></td>
							<td><input type="text" name="lastName"
							value="${THE_PATIENT.getLast_name()}"/></td>
						</tr>
						<tr>
							<td><label>Age:</label></td>
							<td><input type="text" name="age"
							value="${THE_PATIENT.getAge()}"/></td>
						</tr>
						<tr>
							<td><label>Gender:</label></td>
							<td><input type="text" name="gender"
							value="${THE_PATIENT.getGender()}"/></td>
						</tr>
						<tr>
							<td><label>Email:</label></td>
							<td><input type="text" name="email"
							value="${THE_PATIENT.getEmail()}"/></td>
						</tr>
						<tr>
							<td><label>Phone Number:</label></td>
							<td><input type="text" name="phone_number"
							value="${THE_PATIENT.getPhone_number()}"/></td>
						</tr>
						<tr>
							<td><label>Height:</label></td>
							<td><input type="text" name="height"
							value="${THE_PATIENT.getHeight()}"/></td>
						</tr>
						<tr>
							<td><label>Weight:</label></td>
							<td><input type="text" name="weight"
							value="${THE_PATIENT.getWeight()}"/></td>
						<tr>
							<td><label>Temperature:</label></td>
							<td><input type="text" name="temp"
							value="${THE_PATIENT.getTemp()}"/></td>
						</tr>
						<tr>
							<td><label>Blood Pressue:</label></td>
							<td><input type="text" name="bp"
							value="${THE_PATIENT.getBp()}"/></td>
						</tr>
						
						<tr>
							<td><label></label></td>
							<td><input type="submit" value=Save class="save"/></td>
						</tr>
					</tr>
				</tbody>
			</table>
		</form>
		<button id="admission">Admission</button>
		<div style="clear: both;"></div>
		
			<p>
				<a href="patientServlet">Main</a>
			</p>
	</div>

</body>
</html>
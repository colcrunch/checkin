<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
<%@ include file="header.jsp" %>
</head>
<body>

	<div id="wrapper">
		<div id="header"> 
		<h2>NewLife Hospital</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
		<form action=patientServlet>
				<input type="text" name="patientName" class="search_field">
				<input type="hidden" name="command" value="SEARCH" /> <i
					class="fas fa-search"></i> <input type="submit" value="Search"
					class="search-button">
			</form>
		
			<table border="2">
				<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Gender</th>
				<th>Email</th>
				<th>Phone Number</th>
				<th>Height</th>
				<th>Weight</th>
				<th>Temperature</th>
				<th>Blood Pressue</th>
				<th></th>
				</tr>
				
				<c:forEach var="tempPatient"	items="${PATIENT_LIST}">
				
				<!--  set up a link for each patient -->
					<c:url var="tempLink" value="patientServlet">
						<c:param name="command" value="LOAD"/>	
						<c:param name="patientID" value="${tempPatient.getID()}"/>
					
					</c:url>
					   
					<!--  set up a link to delete a student -->
					<c:url var="deleteLink" value="patientServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="patientID" value="${tempPatient.getID()}" />
					</c:url>
					
					<!-- Set up a link to search a student -->
								
					<tr>
						<td>${tempPatient.getFirst_name() }</td>
						<td>${tempPatient.getLast_name()}</td>
						<td>${tempPatient.getAge()}</td>
						<td>${tempPatient.getGender() }</td>
						<td>${tempPatient.getEmail()}</td>
						<td>${tempPatient.getPhone_number()}</td>
						<td>${tempPatient.getHeight()}</td>
						<td>${tempPatient.getWeight()}</td>
						<td>${tempPatient.getTemp()}</td>
						<td>${tempPatient.getBp()}</td>
						<td><button><a href="${tempLink}">Update</a></button>
										<br>
						<button><a href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this patient?'))) return false">
							Delete</a></button>
						
						</td>	
					</tr>
				</c:forEach>
			</table>
		<!-- put new button: Add patient -->
		<br><br>
		<div>
			<input type="button" value="Register"
			onclick="window.location.hre f='Register-patient-form.jsp'; return false;"
			class="Register-patient-button">
			</div>
		</div>
	</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="css/style.css" >
<title>Home</title>

<style>

	.paragraph{
		align: center;
	
	}

	head, body{	
	border-bottom:2px solid gray;
	background-image: url("css/background.png");
	background-repeat: no-repeat;
	background-size: cover;
	padding:10px;
	color: #778899;
	max-width:75%;
	color: black;	
	
	}
}

</style>

</head>
<%@ include file="header.jsp" %>

<body>

<aside>
	


</aside>


<%
String userName = (String)session.getAttribute("userName");
%>

<div align="center">
<h2>Newlife Hospital</h2>
<label>Welcome <%= userName %><img src="Images/ADMIN.png " style="width:20px;height:20px;"></label>
</div>
<article>
<p style="align:center;"><h1></h1>

<div class="paragraph" >
		<div class="container" align="justify">
		<pre><br><br><br>At the Newlife, we have always been committed to delivering exceptional patient care.  
		Now, more than ever, we remain devoted to achieving this high standard.  Our expert, compassionate teams at 
		Newlife Hospital, and other related clinical programs and facilities across weatern Massachusetts are ready 
		to deliver compassionate, personalized care that's tailored to your needs.

		The health and safety of our patients, families and staff are our top priorities and we are taking a 
		comprehensive approach to prevent the spread of infectious diseases. Through our Safe Care Commitment,
		 we have implemented new measures to provide the safest possible environment as we continue to care for you.  
		 Whether you're in need of routine care to keep you healthy or specialized clinical expertise, don't let COVID-19 
		 delay your care. Schedule an appointment today.
		 </pre>
		 </div> 
		 </div>
</p>
</article>

<div id="overlay-area"></div>
</body>
</html>
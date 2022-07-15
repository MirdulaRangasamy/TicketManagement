<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TICKET MANAGEMENT</title>
</head>
<body>
<h1 style="color:green">TICKET MANAGEMENT</h1>
<h2 style="color:blue">VIEW A TICKET</h2>
<form action="viewTicket" method="get">
	Enter Ticket's No:<br> <input type="text" name="tno"><br><br>
	<input type="submit" value="VIEW TICKET">
</form><br><br>
<h2 style="color:blue">VIEW ALL TICKETS</h2>
<form action="viewAllTicket" method="get">
	<input type="submit" value="VIEW ALL TICKETS">
</form>
</body>
</html>
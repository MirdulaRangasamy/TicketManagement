<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TICKET MANAGEMENT</title>
</head>
<body>
<h1 style="color:green">TICkET MANAGEMENT</h1>
<h2 style="color:blue">ADD A TICKET</h2>
<form action="addTicket" method="get">
	Enter Ticket's Ticket No:<br> <input type="text" name="tno"><br><br>
	Enter  Name:<br> <input type="text" name="name"><br><br>
	Enter  Age:<br> <input type="text" name="age"><br><br>
	Enter  Gender:<br> <input type="text" name="gender"><br><br>
	Enter  Nationality:<br> <input type="text" name="nationality"><br><br>
	Enter  Mobile:<br> <input type="text" name="mobile"><br><br>
	Enter  From:<br> <input type="text" name="from"><br><br>
	Enter  To:<br> <input type="text" name="to"><br><br>
	Enter  Date:<br> <input type="text" name="date"><br><br>
	<input type="submit" value="ADD TICKET">
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ page import="com.himanshu.entity.Ticket"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TICKET MANAGEMENT</title>
</head>
<body>
<h1 style="color:green">TICKET MANAGEMENT</h1>
<h2 style="color:blue">VIEW A TICKET</h2>
	<%
	String mode = (String) request.getAttribute("mode");
	if (mode.equals("single")) {
		boolean flag = (Boolean) request.getAttribute("flag");
		if (flag) {
			Ticket t = (Ticket) request.getAttribute("result");
			out.println("<table border=1px><tr><th>TICKET NO</th><th>NAME</th>><th>AGE</th><th>GENDER</th><th>NATIONALITY</th><th>MOBILE</th><th>FROM</th><th>TO</th><th>DATE</th></tr>");
			out.println("<tr><td>" + t.getTno() + "</td><td>" + t.getName() + "</td><td>" + t.getAge()
			+ "</td><td>" + t.getName() + "</td><td>" + t.getGender() + "</td><td>" + t.getNationality() + "</td><td>" + t.getMobile() + "</td><td>" + t.getFrom() + "</td><td>" + t.getTo() + "</td><td>" + t.getDate() + "</td></tr></table>");
		} else {
			out.println("<h1> " + (String) request.getAttribute("result") + "</h1>");
		}
	} else if (mode.equals("list")) {
		ArrayList<Ticket> tlist = (ArrayList<Ticket>) request.getAttribute("result");
		out.println("<table border=1px><tr><th>TICKET NO</th><th>NAME</th><th>AGE</th><th>GENDER</th><th>NATIONALITY</th><th>MOBILE</th><th>FROM</th><th>TO</th><th>DATE</th></tr>");
		for(Ticket t:tlist)
		{
			out.println("<tr><td>" + t.getTno() + "</td><td>" + t.getName() + "</td><td>" + t.getAge()
			+ "</td><td>" + t.getName() + "</td><td>" + t.getGender() + "</td><td>" + t.getNationality() + "</td><td>" + t.getMobile() + "</td><td>" + t.getFrom() + "</td><td>" + t.getTo() + "</td><td>" + t.getDate() + "</td></tr></table>");
		}
		out.println("</table>");
	}
	%>
	<h1>${result}</h1>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to Tables</h2>

<%
	try {
		Integer s = Integer.parseInt(request.getParameter("number"));
		
		for(int i = 1; i <= 10; i++) {
			%>
				<%= s  %> X <%= i %> = <%= i * s %><br />
		<%
	        //out.println(s + " X " + i + " = " + (s * i) + "<br />");
	    }
	} catch(NumberFormatException nfe) {
%>
	<h2>Sorry. Enter Valid Number</h2>

<%@ include file="MultiplicationForm.html" %>

<% 
	}
%>
	

</body>
</html>
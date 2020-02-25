<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Welcome to LoginValidate() page</h2>

<%
	String userName = request.getParameter("uname");
	String password = request.getParameter("password");
	
	if(userName.equals("sapient") && password.equals("india")) {
		out.println("Welcome User");
	} else {
		out.println("Sorry! Invalid Credentials.");
%>
<%@ include file="LoginForm.html" %>
<%
	}
%>

</body>
</html>
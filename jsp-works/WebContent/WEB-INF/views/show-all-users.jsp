<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="ps" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table> 
		<ps:forEach items="${USERS}" var="iter">
			<tr>
				<td>${iter.username}</td>
				<td>${iter.city}</td>
			</tr>
		</ps:forEach>
	</table>
</body>
</html>
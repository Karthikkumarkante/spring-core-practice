<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hi</h2>
	<h>Send Results To Your Email.</h>
	<table>
		<tr>
			<th>Enter Your Email Id</th>
			<form action="sendMail">
			<th><input type="text"></th>
			<th><input type="submit"></th></form>
		</tr>
	</table>
</body>
</html>
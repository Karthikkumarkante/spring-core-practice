<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WelCome To Love Calculator</title>
</head>
<body style="background-color: pink">
	<h1 style="text-align: center; color: red">LOVE CALCULATOR</h1>
	<form action="register" style="align-items: flex-end">
		<input type="submit" value="Register" style="align-self: center"/>
	</form>
	<form:form action="loveResult-page" method="get" modelAttribute="userInfo">
		<div align="center">
			<p>
				<label for="yn">Your Name:</label>
				<form:input id="yn" path="userName"/>
			</p>
			<p>
				<label for="cn">Crush Name:</label>
				<form:input id="cn" path="crushName"/>
			</p>
			<p>
				<form:checkbox id="terms" path="termsAndCondition"/>
				<label for="terms">I agree to this terms</label>
			</p>
			<input type="submit" value="Calculate"/>
		</div>
	</form:form>
</body>
</html>
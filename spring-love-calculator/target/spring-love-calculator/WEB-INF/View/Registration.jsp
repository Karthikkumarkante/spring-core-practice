<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body style="background-color: pink">
	<h1 style="text-align: center; color: red">LOVE CALCULATOR</h1>
	<div align="center">
		<form:form action="save" method="GET"  modelAttribute="registrationDto">
			<table style="border-bottom-style:solid;">
				<tr>
					<td>Name :</td>
					<td><form:input type="text" path="name"/></td>
				</tr>
				<tr>
					<td dir="left">UserName :</td>
					<td><form:input type="text" path="userName"/></td>
				</tr>
				<tr>
					<td dir="left">Password :</td>
					<td><form:input type="password" path="password"/></td>
				</tr>
				<tr>
					<td dir="left">Country :</td>
					<td><label for="country"/>
					 <form:select path="country">
							<form:option value="ind" label="ind">India</form:option>
							<form:option value="usa" label="usa">United states</form:option>
							<form:option value="australia" label="aust">Australia</form:option>
							<form:option value="canada" label="canada">Canada</form:option>
					</form:select></td>
				</tr>
				
				<tr>
					<td dir="left">Age :</td>
					<td><label for="age"/>
					 <form:input path="age"/>
				</tr>
				
				<tr>
					<td dir="left">Hobby :</td>
					<td><form:checkbox path="hobby" value="cricket"/>
					<label> Cricket</label>
						<form:checkbox path="hobby" value="read"/>
						<label>Reading</label>
						<form:checkbox path="hobby" value="code"/>
						<label>Coding</label>
					</td>
				</tr>
				<tr>
					<td dir="left">Gender :</td>
					<td><form:radiobutton path="gender" value="male"/>
						<label for="male">Male</label>
						<form:radiobutton path="gender" value="female"/>
						<label for="Female">FeMale</label>
						<form:radiobutton path="gender" value="others"/>
						<label for="trans">Other</label>
					</td>
				</tr>
				<tr>
					<td dir="left">Communication :</td>
					<td><label>Email :</label><form:input path="communicationDto.email"/>
						<label>Phone :</label><form:input path="communicationDto.phone"/>
					</td>
				</tr>
			</table>
			<input type="submit" value="Submit"/>
		</form:form>
	</div>
</body>
</body>
</html>
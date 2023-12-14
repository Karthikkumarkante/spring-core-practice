<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: pink">
	<h1 style="text-align: center; color: red">LOVE CALCULATOR</h1>
	<marquee direction="right" behavior="alternate" style="background:red;border:RED 3px SOLID"	>
		<h2 style="text-align: center;">
			<i style="color: white"><blink>************Your Registration Is Successful************</blink></i>
		</h2>
	</marquee>
	<div>
		<table>
			<tr>
				<td align="right">Name&emsp;&emsp;:</td>
				<td>&emsp;${userInfo.name}</td>
			</tr>
			<tr>
				<td align="right">UserName&emsp;&emsp;:</td>
				<td>&emsp;${userInfo.userName}</td>
			</tr>
			<tr>
				<td align="right">Password&emsp;&emsp;:</td>
				<td>&emsp;${userInfo.password}</td>
			</tr>
			<tr>
				<td align="right">Country&emsp;:</td>
				<td>&emsp;${userInfo.country}</td>
			</tr>
			<tr>
				<td align="right">Hobbies&emsp;:</td>
				<td>${userInfo.hobby}
					<!--<c:forEach var="temp" items="${userInfo.hobby}">
						${temp}
					</c:forEach>-->
				</td>
			</tr>
			<tr>
				<td align="right">Gender&emsp;:</td>
				<td>&emsp;${userInfo.gender}</td>
			</tr>
			<tr>
				<td align="right">Communication&emsp;:</td>
				<td>Phone :&emsp;${userInfo.communicationDto.phone}</td>
			</tr>
			<tr>
				<td align="right">Date&emsp;:</td>
				<td>&emsp;${userInfo.date}</td>
			</tr>
		</table>
	</div>
</body>
</html>
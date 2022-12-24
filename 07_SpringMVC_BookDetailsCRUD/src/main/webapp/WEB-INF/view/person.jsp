<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library Management System</title>
</head>
<body>
	<h3>Add New Book</h3>
	<hr>
	<f:form action="custom-validator" modelAttribute="person">
		<table>
			<tr>
				<td>Name</td>
				<td><f:input path="name" /> <f:errors path="name" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><f:input path="email" /></td>
			</tr>
			<tr>
				<td>confirm Email</td>
				<td><f:input path="confirmEmail" /> <f:errors /></td>
			</tr>

			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
	<br>
	<h3>${message}</h3>
</body>
</html>
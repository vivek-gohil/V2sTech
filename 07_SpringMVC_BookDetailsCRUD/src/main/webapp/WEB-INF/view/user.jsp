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
	<h3>New User</h3>
	<hr>
	<f:form action="user" modelAttribute="newUserForm">
		<table>
			<tr>
				<td>email</td>
				<td><f:input path="email" /> <f:errors path="email" /></td>
			</tr>
			<tr>
				<td>Verify Email</td>
				<td><f:input path="verifyEmail" /> <f:errors
						path="verifyEmail" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><f:input path="password" /> <f:errors path="password" /></td>
			</tr>
			<tr>
				<td>verify Password</td>
				<td><f:input path="verifyPassword" /> <f:errors
						path="verifyPassword" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Clear"></td>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</f:form>
</body>
</html>
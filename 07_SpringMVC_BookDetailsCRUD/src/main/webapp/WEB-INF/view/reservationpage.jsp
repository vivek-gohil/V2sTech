<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<h3>Railway Reservation Form</h3>
	<form:form action="submitform" modelAttribute="reservation">
		First Name <form:input path="firstName" />
		<br>
		<br>
		Last Name <form:input path="lastName" />
		<br>
		<br>
		Gender: Male <form:radiobutton path="gender" value="Male" />
		Female <form:radiobutton path="gender" value="Female" />
		<br>
		<br>
		Meals:
		BreakFast <form:checkbox path="food" value="BreakFast" />
		Lunch <form:checkbox path="food" value="Lunch" />
		Dinner <form:checkbox path="food" value="Dinner" />
		<br>
		<br>
		Leaving From <form:select path="cityFrom">
			<form:option value="Gaziabad" label="Gaziabad"></form:option>
			<form:option value="Modinagar" label="Modinagar"></form:option>
			<form:option value="Meerut" label="Meerut"></form:option>
			<form:option value="Amritsar" label="Amritsar"></form:option>
		</form:select>
		<br>
		<br>
		Going To <form:select path="cityTo">
			<form:option value="Gaziabad" label="Gaziabad"></form:option>
			<form:option value="Modinagar" label="Modinagar"></form:option>
			<form:option value="Meerut" label="Meerut"></form:option>
			<form:option value="Amritsar" label="Amritsar"></form:option>
		</form:select>
		<br>
		<br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please register here</h1>

	<form:form modelAttribute="userReg">
		<label>Name : </label>
		<form:input path="name" />

		<br />

		<label>User Name : </label>
		<form:input path="userName" />

		<br />

		<label>Password : </label>
		<form:password path="password" />

		<br />

		<label>Country : </label>
		<form:select path="countryName">
			<form:option value="Usa" label="USA"></form:option>
			<form:option value="Nig" label="Nigeria"></form:option>
			<form:option value="Chi" label="China"></form:option>
			<form:option value="Eng" label="England"></form:option>

		</form:select>
		<br />

		<label>Hobbies : </label>
		Workout : <form:checkbox path="hobbies" value="workout" />
		Travel : <form:checkbox path="hobbies" value="travel" />
		Biking : <form:checkbox path="hobbies" value="biking" />
		Running : <form:checkbox path="hobbies" value="running" />
		Reading : <form:checkbox path="hobbies" value="reading" />
		
		
		


	</form:form>

</body>
</html>
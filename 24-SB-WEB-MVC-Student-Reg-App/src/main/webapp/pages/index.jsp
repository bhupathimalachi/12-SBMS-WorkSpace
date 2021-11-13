<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Student Registration Form</h3>

	<form:form action="saveStudent" method="POST" modelAttribute="student">

		<table>
			<tr>
				<td>Name :</td>
				<td><form:input path="name" /></td>
			</tr>

			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Phno :</td>
				<td><form:input path="phno" /></td>
			</tr>

			<tr>
				<td>Gender :</td>
				<td>
					<form:radiobutton path="gender" value="M" />Male 
					<form:radiobutton path="gender" value="F" />Fe-Male</td>
			</tr>
			<tr>
				<td>Course :</td>
				<td><form:select path="course">
						<form:option value="">-select-</form:option>
						<form:option value="Java">Java</form:option>
						<form:option value="python">Python</form:option>
						<form:option value="devops">DevOps</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td>Timings :</td>
				<td>
					<form:checkbox path="timings" value="mrng"/>Morning
					<form:checkbox path="timings" value="noon"/>Afternoon
					<form:checkbox path="timings" value="evng"/>Evening
				</td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register"/></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>
<body>
	<form action="/SpringMVCException/addStudent" method="post">
		<table>
			<tr>
				<td>ID: </td>
				<td><input name="id"/></td>
			</tr>
			<tr>
				<td>NAME: </td>
				<td><input name="name"/></td>
			</tr>
			<tr>
				<td>AGE: </td>
				<td><input name="age"/></td>
			</tr>
			<tr>
				<td><input type = "submit"/></td>
			</tr>			
		</table>
	</form>
</body>
</html>
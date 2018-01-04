<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h5>Result</h5>
	<table>
		<tr>
			<td>ID</td>
			<td>${st.getId()}</td>
		</tr>
		<tr>
			<td>Namee</td>
			<td>${st.getName()}</td>
		</tr>
		<tr>
			<td>Age</td>
			<td>${st.getAge()}</td>
		</tr>
	</table>
</body>
</html>
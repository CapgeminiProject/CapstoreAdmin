<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome To CapStore</title>
</head>
testtttttttttt
<body>
	<h1 align="center">Welcome To CapStore</h1>
	<hr>
	<br>
	<form:form action="/test" method="post" modelAttribute="admin">
		<table align="center">
			<tr>
				<td>Enter User Name :</td>
				<td><form:input path="username" size="30" /></td>
				<td><form:errors path="username" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Enter Password :</td>
				<td><form:input path="password" size="30" /></td>
				<td><form:errors path="password" cssClass="error" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="LogIn"/></td>
			</tr>

		</table>


	</form:form>
</body>
</html>
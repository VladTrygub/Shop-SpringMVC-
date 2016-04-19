<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<c:url var="loginUrl" value="/login" />
	<form action="${loginUrl}" method="post">
		<table>
			<tr>
				<td>login</td>
				<td><input type="text" id="login" name="login"></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="password" id="password" name="password"></td>
			</tr>
		</table>
		<input type="hidden" name="${_csrf.parameterName}"  value="${_csrf.token}" />
		<input type="submit" value="Log in">
	</form>
</body>
</html>

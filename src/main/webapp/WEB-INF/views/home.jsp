<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Home</title>
	<link rel="stylesheet" href='<c:url value="/resources/css/bootstrap.min.css"/>'>
	<link rel="stylesheet" href='<c:url value="/resources/css/style.css"/>'>
</head>
<body>

	<h1>Hello</h1>

	<a href="category">categories</a>
	<br>
	<a href="item">items</a>
	<br>
	<a href="login">login</a>
	<br>
	<a href="admin">admin</a>

	<script src="http://code.jquery.com/jquery.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
</body>
</html>

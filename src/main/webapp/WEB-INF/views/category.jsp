<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Category</title>
</head>
<body>
	<c:if test="${not empty categories}">
		<ul>
			<c:forEach var="category" items="${categories}">
				<li>${category.name}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Item</title>
</head>
<body>
	<c:if test="${not empty items}">
		<ul>
			<c:forEach var="item" items="${items}">
				<li>${item.name}</li>
				<li>${item.category.name}</li>
			</c:forEach>
		</ul>
	</c:if>
</body>
</html>

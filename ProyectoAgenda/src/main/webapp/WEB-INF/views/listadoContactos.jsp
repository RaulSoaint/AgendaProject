<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado</title>
</head>
<body>
<center>
	<table>
	<tr>
	<th>Nombre:</th>
	<th>Apellido:</th>
	</tr>
	<c:forEach items="${listado}" var="persona">
	<tr>
	<td><c:out value="${persona.nombre}"></c:out></td>
	<td><c:out value="${persona.apellido}"></c:out></td><br>
	</tr>
	</c:forEach>
	</table>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado</title>
</head>
<body>
<center>
<form:form method="POST" modelAttribute="filtro">
	<form:label path="seleccion">Filtrar por:</form:label>
	<form:select path="seleccion">
		<form:option value="nombre">Nombre</form:option>
		<form:option value="apellido1">Primer apellido</form:option>
		<form:option value="apellido2">Segundo apellido</form:option>
	</form:select>
	<input type="submit" value="Ordenar"/>
</form:form>

	<table>
	<tr>
	<th>Nombre</th>
	<th>Primer apellido</th>
	<th>Segundo apellido</th>
	<th>DNI</th>
	<th>Fecha de nacimiento</th>
	<th>Teléfonos</th>
	</tr>
	<c:forEach items="${listado}" var="persona">
	<tr>
	<td><c:out value="${persona.nombre}"></c:out></td>
	<td><c:out value="${persona.apellido1}"></c:out></td>
	<td><c:out value="${persona.apellido2}"></c:out></td>
	<td><c:out value="${persona.dni}"></c:out></td>
	<td><c:out value="${persona.fechaNacimiento}"></c:out></td>
	<td>
			<select>
		<c:forEach items="${persona.telefonoses}" var="telefono">
			<option><c:out value="${telefono.telefono}"></c:out></option>
		</c:forEach>
			</select>
		</td>
	</tr>
	</c:forEach>
	</table>
</center>
</body>
</html>
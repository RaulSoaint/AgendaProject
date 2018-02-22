<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
	<th>Nombre</th>
	<th>Primer apellido</th>
	<th>Segundo apellido</th>
	<th>DNI</th>
	<th>Fecha de nacimiento</th>
	<th>Direccion</th>
	<th>Código postal</th>
	<th>Localidad</th>
	<th>Provincia</th>
	<th>Teléfonos</th>
	</tr>
	
	<tr>
	<td><c:out value="${persona.nombre}"></c:out></td>
	<td><c:out value="${persona.apellido1}"></c:out></td>
	<td><c:out value="${persona.apellido2}"></c:out></td>
	<td><c:out value="${persona.dni}"></c:out></td>
	<td><c:out value="${persona.fechaNacimiento}"></c:out></td>
		<c:forEach items="${persona.direccioneses}" var="direccion">
			<td><c:out value="${direccion.direccion}"/></td>
			<td><c:out value="${direccion.codPostal}"/></td>
			<td><c:out value="${direccion.localidad}"/></td>
			<td><c:out value="${direccion.provincia}"/></td>
		</c:forEach>
		<td>
			<select>
		<c:forEach items="${persona.telefonoses}" var="telefono">
			<option><c:out value="${telefono.telefono}"></c:out></option>
		</c:forEach>
			</select>
		</td>
		
	</tr>
	
	</table>
</body>
</html>
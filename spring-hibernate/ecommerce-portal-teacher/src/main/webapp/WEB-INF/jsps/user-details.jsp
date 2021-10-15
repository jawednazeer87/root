<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form modelAttribute="userDTO">
		<div>id: ${userDTO.id}</div>
		<div>name: ${userDTO.name}</div>
		<div>email: ${userDTO.email}</div>
	</form>
</body>
</html>
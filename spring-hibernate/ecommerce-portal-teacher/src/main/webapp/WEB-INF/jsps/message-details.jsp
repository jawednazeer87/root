<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/messageId" modelAttribute="messageDto">
		<table>
			<tbody>
                        <c:forEach items="${messages}" var="message">
                            <tr>
                                <td>${message.id}</td>
                                <td>${message.message}</td>
                                <td>${message.dateCreated}</td>
                                <td>${message.sender}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
		</table>	
	</form>
	
</body>
</html>
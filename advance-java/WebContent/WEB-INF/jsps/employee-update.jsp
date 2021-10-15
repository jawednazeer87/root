<%@page import="org.ecom.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	</head>
	<body>
		<%
			Employee employee = (Employee)request.getAttribute("employee");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/EmployeeController/list">Employees Detail</a></h2>
		</div>
		
		<h1>Update Employee</h1>
		
		<form action="/advance-java/employeeUpdateController/update" method="post">
		
		  <input type="hidden" id="employeeId" name="employeeId" value="<%= employee.getId() %>" />
		  
		  <label for="name">Employee Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employee.getName() %>" /><br><br>
		  
		  <label for="age">Age:</label><br>
		  <input type="text" id="age" name="age" value="<%= employee.getAge() %>" /><br><br>
		  
		 
		  
		 <label for="salary"> Salary: </label>
		   <select id="salary" name="salary">
		   		<option value="-1">Please Select</option>
		   		<option value="$1000">$1000</option>
		   		<option value="$2000">$2000</option>
		   		<option value="$3000">$3000</option>
		   		<option value="$4000">$4000</option>
		   </select>
		   
		   <br><br>
		   
		  <input type="submit" value="Submit">
		</form> 
	
	
		  
		  
	</body>
</html>
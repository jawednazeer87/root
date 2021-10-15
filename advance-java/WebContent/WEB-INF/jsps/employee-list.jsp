<%@page import="org.ecom.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employee List</title>
		<style>
			table {
			  font-family: arial, sans-serif;
			  border-collapse: collapse;
			  width: 100%;
			}
			
			td, th {
			  border: 1px solid #dddddd;
			  text-align: left;
			  padding: 8px;
			}
			
			tr:nth-child(even) {
			  background-color: #dddddd;
			}
		</style>
		</head>
	<body>
	
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<h1>Employees Detail</h1>
		
		<div>
			<form action="/advance-java/employeeCreateController/add">
				<input type="submit" value="Add Employee" style="float: right;" />
			</form>
		</div>
		
		<br />
		<br />

		<div>
			<form action="/advance-java/employeeSearchController/search">
				<input type="text" placeholder="Enter Name" name="name" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />
		<table>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Salary</th>
				
				<th>Action</th>
			</tr>
			<%
				List<Employee> employeeList = (List<Employee>)request.getAttribute("employeeList");
				if(!employeeList.isEmpty()){	
					for(Employee employee : employeeList){
				%>
					<tr>
						<td>
							<a href="/advance-java/employeeDetailController/detail?employeeId=<%= employee.getId() %>">
								<%= employee.getName() %>
							</a>
						</td>
						<td><%= employee.getAge() %></td>
						<td><%= employee.getSalary() %></td>
						
						<td>
							<a href="/advance-java/employeeDeleteController/delete?employeeId=<%= employee.getId() %>">Delete</a>
							<a href="/advance-java/employeeUpdateController/update?employeeId=<%= employee.getId() %>">Update</a>
						</td>
					</tr>
				<%
				}
			}
				else{
					%>
						<tr>
							<td colspan="4">No employee found</td>
						</tr>
					<%
				}
			%>		</table>
	</body>
</html>
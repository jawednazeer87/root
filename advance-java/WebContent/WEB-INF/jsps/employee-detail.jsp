<%@page import="org.ecom.model.Address"%>
<%@page import="java.util.List"%>
<%@page import="org.ecom.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Employee Detail</title>
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
		<%
			Employee employee = (Employee)request.getAttribute("employee");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/employeeController/list">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		
		  <label for="name">Employee Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employee.getName() %>" readonly="readonly" /><br><br>
		  
		  <label for="age">Employee Age:</label><br>
		  <input type="text" id="age" name="age" value="<%= employee.getAge() %>" readonly="readonly" /><br><br>
		  
		  <label for="salary"> Salary: </label>
		   <select id="salary" name="salary" onchange="changeSalary();">
		   		<option value="-1">Please Select</option>
		   		<option value="$1000">$1000</option>
		   		<option value="$2000">$2000</option>
		   		<option value="$3000">$3000</option>
		   		<option value="$4000">$4000</option>
		   </select>
		   <br><br><br><br><br><br>
				  <input type="Submit" value="Submit">
		
		   <br><br>
		  <br>
		  <br>
		  <h1>Addresses Detail</h1>
		  <table>
			<tr>
				<th>Street</th>
				<th>City</th>
				<th>State</th>
				<th>Country</th>
				<th>Pincode</th>
			</tr>
			<%
				List<Address> addressList = (List<Address>)request.getAttribute("addressList");
				if(!addressList.isEmpty()){	
					for(Address address : addressList){
				%>
					<tr>
						<td><%= address.getStreet() %></td>
						<td><%= address.getCity() %></td>
						<td><%= address.getState() %></td>
						<td><%= address.getCountry() %></td>
						<td><%= address.getPincode() %></td>
					</tr>
				<%
				}
			}
				else{
					%>
						<tr>
							<td colspan="5">No Address found</td>
						</tr>
					<%
				}
			%>
		</table>
		
		</body>
	</html>
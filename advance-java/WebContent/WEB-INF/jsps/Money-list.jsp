<%@page import="org.ecom.model.MoneyDetail"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Money Detail List</title>
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
		
		<h1>Money Detail</h1>
		
		<div>
			<form action="/advance-java/MoneyDetail/add">
				<input type="submit" value="Add MoneyDetail" style="float: right;" />
			</form>
		</div>
		
		<table>
			<tr>
				<th>User Id </th>
				<th>Balance </th>
				<th>Create Date </th>
				<th>Update Date </th>
			</tr>
			<%
				List<MoneyDetail> moneydetList = (List<MoneyDetail>)request.getAttribute("moneydetList");
				for(MoneyDetail moneydet : moneydetList){
				%>
					<tr>
						<td>
						<!-- this is link for user id detail -->
							<a href="/advance-java/user/detail?userId=<%= moneydet.getId() %>">
								<%= moneydet.getUserid() %>
							</a>
						</td>
						<td><%= moneydet.getBalance() %></td>
						<td><%= moneydet.getCreatedate() %></td>
						<td><%= moneydet.getUpdatedate() %></td>
						
						<td>
							<a href="/advance-java/MoneyDetail/delete?Id=<%= moneydet.getId() %>">Delete</a>
							<a href="/advance-java/MoneyDetail/update?Id=<%= moneydet.getId() %>">Update</a>
						</td>
					</tr>
				<%
				}
			%>
		</table>
	</body>
</html>
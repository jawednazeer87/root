<%@page import="org.ecom.model.CreditCard"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>CreditCard List</title>
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
		
		<h1>CreditCard Detail</h1>
		
		<div>
			<form action="/advance-java/CreditCard/add">
				<input type="submit" value="Add CreditCard" style="float: right;" />
			</form>
		</div>
		
		<br />
		<br />

		<div>
			<form action="/advance-java/CreditCard/Search">
				<input type="text" placeholder="Enter Holder_Name" name="hname" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />
		<table>
			<tr>
				<th>Cc_Num</th>
				<th>Holder_Name</th>
				<th>Expiry_Date</th>
				<th>Action</th>
			</tr>
			<%
				List<CreditCard> creditcardList = (List<CreditCard>)request.getAttribute("creditcardList");
				if(!creditcardList.isEmpty()){	
					for(CreditCard creditcard : creditcardList){
				%>
					<tr>
						<td>
							<a href="/advance-java/CreditCard/Detail?creditcardcc_Id=<%= creditcard.getCc_id() %>">
								<%= creditcard.getCc_num() %>
							</a>
						</td>
						<td><%= creditcard.getHolder_name() %></td>
						<td><%= creditcard.getExpiry_date() %></td>
						<td>
							<a href="/advance-java/CreditCard/Delete?creditcardcc_Id=<%= creditcard.getCc_id() %>">Delete</a>
							<a href="/advance-java/CreditCard/Update?creditcardcc_Id=<%= creditcard.getCc_id() %>">Update</a>
						</td>
					</tr>
				<%
				}
			}
				else{
					%>
						<tr>
							<td colspan="4">No credit card found</td>
						</tr>
					<%
				}
			%>		</table>
	</body>
</html>
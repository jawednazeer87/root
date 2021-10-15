<%@page import="org.ecom.model.Address"%>
<%@page import="org.ecom.model.MoneyDetail"%>
<%@page import="java.util.List"%>
<%@page import="org.ecom.model.CreditCard"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>CreditCard Detail</title>
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
			CreditCard creditcard = (CreditCard)request.getAttribute("creditcard");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/CreditCard/list">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		  
		  <label for="cc_num">Cc_Num:</label><br>
		  <input type="text" id="cc_num" name="cc_num" value="<%= creditcard.getCc_num() %>" readonly="readonly" /><br><br>
		  
		  <label for="hname">Holder_Name:</label><br>
		  <input type="text" id="hname" name="hname" value="<%= creditcard.getHolder_name() %>" readonly="readonly" /><br><br>
		  
		  <label for="Edate">Expiry_Date:</label><br>
		  <input type="text" id="datepicker" name="Edate" value="<%= creditcard.getExpiry_date() %>" readonly="readonly" /><br><br>
		  
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
		
		  <h1>Money Details</h1>
		  <table>
			<tr>
				<th>balance </th>
				<th>Create date </th>
				<th>Update date </th>
			</tr>
			<%
				List<MoneyDetail> monetdetList = (List<MoneyDetail>)request.getAttribute("monetdetList");
				for(MoneyDetail moneydet : monetdetList){
				%>
					<tr>
						<td><%= moneydet.getBalance() %></td>
						<td><%= moneydet.getCreatedate() %></td>
						<td><%= moneydet.getUpdatedate() %></td>
						
					</tr>
				<%
				}
			%>
		</table>
		
	</body>
</html>
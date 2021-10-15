<%@page import="org.ecom.model.Employeefive"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User List</title>
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
		
		<h1>Employeefive Detail</h1>
		
		<div>
			<form action="/advance-java/Employeefive/add">
				<input type="submit" value="Add Employeefive" style="float: right;" />
			</form>
		</div>

		<br />
		<br />

		<div>
			<form action="/advance-java/Employeefive/search">
				<input type="text" placeholder="Enter Name" name="name" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />

		<div>
			<form action="/advance-java/Employeefive/searchEmail">
				<input type="text" placeholder="Enter Email" name="Email" />
				<input type="submit" value="Search" />
			</form>
		</div>
		<br />

		<div>
			<form action="/advance-java/Employeefive/searchPeriod">
				<input type="text" placeholder="Enter NoticePeriod" name="Period" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />

		<div>
			<form action="/advance-java/Employeefive/searchGender">
				<input type="text" placeholder="Enter Gender" name="gender" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		
		<div>
			<form action="/advance-java/Employeefive/searchAge">
				<input type="text" placeholder="Enter fromDobDate" name="fromDobDate" />
				<input type="text" placeholder="Enter toDobDate" name="toDobDate" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		
		<div>
			<form action="/advance-java/Employeefive/searchJoined">
				<input type="text" placeholder="Enter fromJoinedDate" name="fromJoinedDate" />
				<input type="text" placeholder="Enter toJoinedDate" name="toJoinedDate" />
				<input type="submit" value="Search" />
			</form>
		</div>
		<br />
		
		<div>
			<form action="/advance-java/Employeefive/searchRelease">
				<input type="text" placeholder="Enter fromReleaseDate" name="fromReleaseDate" />
				<input type="text" placeholder="Enter toReleaseDate" name="toReleaseDate" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />

		<table>
			<tr>
				<th>Name</th>
				<th>Date Of Birth</th>
				<th>Joined Date</th>
				<th>Create Date</th>
				<th>Update Date</th>
				<th>Release Date:</th>
				<th>Notice Period</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Action</th>
		
			</tr>
			<%
				List<Employeefive> empList = (List<Employeefive>)request.getAttribute("empList");
				if(!empList.isEmpty()){
					for(Employeefive emp : empList){
						%>
							<tr>
								<td>
									<a href="/advance-java/Employeefive/detail?empId=<%= emp.getId() %>">
										<%= emp.getName() %>
									</a>
								</td>
								
								<td><%= emp.getDob() %></td>
								<td><%= emp.getJoined_date() %></td>
								<td><%= emp.getCreate_date() %></td>
								<td><%= emp.getUpdate_date() %></td>
								<td><%= emp.getRelease_date() %></td>
								<td><%= emp.getNotice_period()%></td>
								<td><%= emp.getEmailid() %></td>
								<td><%= emp.getGender() ? "male" : "female" %></td>
								<td>
									<a href="/advance-java/Employeefive/update?empId=<%= emp.getId() %>">Update</a>
								</td>
							</tr>
						<%
					}
				}
				else{
					%>
						<tr>
							<td colspan="4">No user found</td>
						</tr>
					<%
				}
			%>
		</table>
	</body>
</html>
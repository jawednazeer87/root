<%@page import="org.ecom.model.EmployeeTwo"%>
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
		
		<h1>Employee Detail</h1>
		
		<div>
			<form action="/advance-java/EmployeeTwo/add">
				<input type="submit" value="Add EmployeeTwo" style="float: right;" />
			</form>
		</div>

		<br />
		<br />

		<div>
			<form action="/advance-java/EmployeeTwo/Name">
				<input type="text" placeholder="Enter Name" name="name" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		<br />

		<div>
			<form action="/advance-java/EmployeeTwo/Email">
				<input type="text" placeholder="Enter Email" name="email" />
				<input type="submit" value="Search" />
			</form>
		</div>
		<br />

		<div>
			<form action="/advance-java/EmployeeTwo/Noticeperiod">
				<input type="text" placeholder="Enter NoticePeriod" name="notice_period" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />

		<div>
			<form action="/advance-java/EmployeeTwo/Gender">
				<input type="text" placeholder="Enter Gender" name="gender" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		
		<div>
			<form action="/advance-java/EmployeeTwo/Dob">
				<input type="text" placeholder="Enter fromDobDate" name="fromDobDate" />
				<input type="text" placeholder="Enter toDobDate" name="toDobDate" />
				<input type="submit" value="Search" />
			</form>
		</div>
		
		<br />
		
		<div>
			<form action="/advance-java/EmployeeTwo/JoinedDate">
				<input type="text" placeholder="Enter fromJoinedDate" name="fromJoinedDate" />
				<input type="text" placeholder="Enter toJoinedDate" name="toJoinedDate" />
				<input type="submit" value="Search" />
			</form>
		</div>
		<br />
		
		<div>
			<form action="/advance-java/EmployeeTwo/ReleaseDate">
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
				<th>Release Date:</th>
				<th>Notice Period</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Action</th>
		
			</tr>
			<%
				List<EmployeeTwo> employeetwoList = (List<EmployeeTwo>)request.getAttribute("employeetwoList");
				if(!employeetwoList.isEmpty()){
					for(EmployeeTwo employeetwo : employeetwoList){
						%>
							<tr>
								<td>
									<a href="/advance-java/EmployeeTwo/Detail?employeetwoid=<%= employeetwo.getId() %>">
										<%= employeetwo.getName() %>
									</a>
								</td>
								
								<td><%= employeetwo.getDob() %></td>
								<td><%= employeetwo.getJoined_date() %></td>
								<td><%= employeetwo.getRelease_date() %></td>
								<td><%= employeetwo.getNotice_period()%></td>
								<td><%= employeetwo.getEmail() %></td>
								<td><%= employeetwo.getGender() ? "male" : "female" %></td>
								<td>
									<a href="/advance-java/EmployeeTwo/Delete?employeetwoid=<%= employeetwo.getId() %>">Delete</a>
									<a href="/advance-java/EmployeeTwo/Update?employeetwoid=<%= employeetwo.getId() %>">Update</a>
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
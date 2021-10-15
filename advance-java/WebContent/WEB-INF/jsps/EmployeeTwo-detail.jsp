<%@page import="java.util.List"%>
<%@page import="org.ecom.model.EmployeeTwo"%>
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
		EmployeeTwo employeetwo = (EmployeeTwo)request.getAttribute("employeetwo");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/EmployeeTwo/list">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		
		  <label for="name">Name:</label><br>
		  <input type="text" id="name" name="name" value="<%= employeetwo.getName() %>" readonly="readonly" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= employeetwo.getDob() %>" readonly="readonly" /><br><br>
		  
		  <label for="jdate">Joined Date:</label><br>
		  <input type="text" id="jdatepicker" name="jdate" value="<%= employeetwo.getJoined_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="rdate">Release Date:</label><br>
		  <input type="text" id="rdatepicker" name="rdate" value="<%= employeetwo.getRelease_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="notice_period">Notice Period:</label><br>
		  <input type="text" id="notice_period" name="notice_period" value="<%= employeetwo.getNotice_period() %>" readonly="readonly"/><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= employeetwo.getEmail() %>" readonly="readonly"/><br><br>
		  
		  <label for="gender">Gender:</label><br>
		  <input type="text" id="gender" name="gender" value="<%= employeetwo.getGender() ? "male" : "female" %>" readonly="readonly" /><br><br>
		  <br>
		  <br>
		
	</body>
</html>

<%@page import="java.util.List"%>
<%@page import="org.ecom.model.Employeefive"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User Detail</title>
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
		Employeefive emp = (Employeefive)request.getAttribute("emp");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/Employeefive/list">Back</a></h2>
		</div>
		
		<h1>Update Detail</h1>
		
		  <label for="fname">Name:</label><br>
		  <input type="text" id="fname" name="fname" value="<%= emp.getName() %>" readonly="readonly" /><br><br>
		  
		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob" value="<%= emp.getDob() %>" readonly="readonly" /><br><br>
		  
		  <label for="jdate">Joined Date:</label><br>
		  <input type="text" id="jdatepicker" name="jdate" value="<%= emp.getJoined_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="cdate">Create Date:</label><br>
		  <input type="text" id="cdatepicker" name="cdate" value="<%= emp.getCreate_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="udate">Update Date:</label><br>
		  <input type="text" id="udatepicker" name="udate" value="<%= emp.getUpdate_date() %>" readonly="readonly" /><br><br>
		  
		  <label for="rdate">Release Date:</label><br>
		  <input type="text" id="rdatepicker" name="rdate" value="<%= emp.getRelease_date() %>" readonly="readonly"/><br><br>
		  
		  <label for="period">Notice Period:</label><br>
		  <input type="text" id="period" name="period" value="<%= emp.getNotice_period() %>" readonly="readonly"/><br><br>
		  
		  <label for="email">Email:</label><br>
		  <input type="text" id="email" name="email" value="<%= emp.getEmailid() %>" readonly="readonly"/><br><br>
		  
		  <label for="gender">Gender:</label><br>
		  <input type="text" id="gender" name="gender" value="<%= emp.getGender() ? "male" : "female" %>" readonly="readonly" /><br><br>
		  <br>
		  <br>
		
	</body>
</html>
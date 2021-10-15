<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create Employee</title>
	</head>
	
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	   
  <body>
	 <div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/employeeController/list">Employee Detail</a></h2>
		</div>
		
		<h1>Add Employee</h1>
		<form action="/advance-java/employeeCreateController/add" method="post"  id="userForm">
		  <label for="name">Employee Name:</label><br>
		  <input type="text" id="name" name="name" onmouseover="testing();"><br>
		  
		  <label for="age">Employee Age:</label><br>
		  <input type="text" id="age" name="age" onmouseover="testing();"><br><br>
		    
		   <label for="salary"> Salary: </label>
		   <select id="salary" name="salary" onchange="changeSalary();">
		   		<option value="-1">Please Select</option>
		   		<option value="$1000">$1000</option>
		   		<option value="$2000">$2000</option>
		   		<option value="$3000">$3000</option>
		   		<option value="$4000">$4000</option>
		   </select>
		   <br><br>
		   
		  <input type="button" value="Submit" onclick="submitForm();">
		</form> 
		
		
		<script type="text/javascript">
		
			function testing(){
				alert("on mouse over this element");
			}
			function submitForm(){
				console.log('print in browser console');
				
				var name = document.getElementById("name").value;
				if(name.length==0){
					alert('Please provide Employee Name');
					return false;
				}
				
				var age = document.getElementById("age").value;
				if(age.length==0){
					alert('Please provide Employee Age');
					return false;
				}
				
				var salaryValue = document.getElementById("salary").value;
				if(salaryValue==-1){
					alert('Please select salary from drop down');
					return false;
				}
				
				document.getElementById("userForm").submit();
		}
			
			function changeSalary(){
				var val = document.getElementById('salary').value;	
				console.log('salary change : '+val);
			}
		  </script>
      </body>
  </html>
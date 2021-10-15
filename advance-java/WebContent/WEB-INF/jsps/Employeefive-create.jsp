<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create User</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#datepicker").datepicker();
			  });
			  $(function() {
			    $("#jdatepicker").datepicker();
			  });
			  $(function() {
			    $("#cdatepicker").datepicker();
			  });
			  $(function() {
			    $("#udatepicker").datepicker();
			  });
			  $(function() {
			    $("#rdatepicker").datepicker();
			  });
  	    </script>
	</head>
	
	<body>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/Employeefive/list">Employeefive Detail</a></h2>
		</div>
		
		<h1>Add User</h1>
		<form action="/advance-java/Employeefive/add" method="post">
		  <label for="fname">name:</label><br>
		  <input type="text" id="fname" name="fname"><br>

		  <label for="dob">Date Of Birth:</label><br>
		  <input type="text" id="datepicker" name="dob"><br>
		  
		  <label for="jdate">Joined Date:</label><br>
		  <input type="text" id="jdatepicker" name="jdate"><br><br>
		  
		  <label for="cdate">Create Date:</label><br>
		  <input type="text" id="cdatepicker" name="cdate"><br><br>
		  
		  <label for="udate">Update Date:</label><br>
		  <input type="text" id="udatepicker" name="udate"><br><br>
		  
		  <label for="rdate">Release Date:</label><br>
		  <input type="text" id="rdatepicker" name="rdate"><br><br>
		 
		  
		  <label for="period">Notice Period:</label><br>
		  <input type="text" id="period" name="period"><br><br>
		  
		  <label for="email">Email: </label><br>
		  <input type="text" id="email" name="email"><br><br>
		  
		  
		  <input type="radio" id="male" name="gender" value="true">
		  <label for="male">Male</label>
		  
		  <input type="radio" id="female" name="gender" value="false">
		  <label for="female">Female</label><br><br>
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>
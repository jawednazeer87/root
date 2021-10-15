<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create CreditCard</title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#datepicker").datepicker();
			  });
  	    </script>
	</head>
	
	<body>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/CreditCard/list">CreditCard Detail</a></h2>
		</div>
		
		<h1>Add CreditCard</h1>
		<form action="/advance-java/CreditCard/add" method="post">
		  <label for="cc_num">Cc_Num :</label><br>
		  <input type="text" id="cc_num" name="cc_num"><br>
		  
		  <label for="hname">Holder_Name :</label><br>
		  <input type="text" id="hname" name="hname"><br>
		  
		  <label for="Edate">Expiry_date :</label><br>
		  <input type="text" id="datepicker" name="Edate"><br>
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>
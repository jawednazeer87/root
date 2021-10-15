<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Create Money Detail </title>
		<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	    <link rel="stylesheet" href="/resources/demos/style.css">
	    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	    <script>
			  $(function() {
			    $("#datepicker").datepicker();
			  });
			  
			  $(function() {
				    $("#updatepicker").datepicker();
				  });
  	    </script>
	</head>
	
	<body>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/MoneyDetail/list">Money Detail</a></h2>
		</div>
		
		<h1>Add Money Detail</h1>
		<form action="/advance-java/MoneyDetail/add" method="post">
		  <label for="id">User Id :</label><br>
		  <input type="text" id="id" name="id"><br>
		  
		  <label for="num">Balance :</label><br>
		  <input type="text" id="num" name="num"><br>
		  
		  <label for="Cdate">Create date:</label><br>
		  <input type="text" id="datepicker" name="Cdate"><br>
		  
		  <label for="Udate">Update date :</label><br>
		  <input type="text" id="updatepicker" name="Udate"><br>
		  

		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>
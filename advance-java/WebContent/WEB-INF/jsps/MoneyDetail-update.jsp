<%@page import="org.ecom.model.MoneyDetail"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
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
		<%
		MoneyDetail moneydet = (MoneyDetail)request.getAttribute("moneydet");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/MoneyDetail/list">Money Detail</a></h2>
		</div>
		
		<h1>Update MoneyDetail</h1>
		
		<form action="/advance-java/MoneyDetail/update" method="post">
		
		  <input type="hidden" id="Id" name="Id" value="<%= moneydet.getId() %>" />
		  
		  <label for="Uid">User Id:</label><br>
		  <input type="text" id="Uid" name="Uid" value="<%= moneydet.getUserid() %>" /><br><br>
		  
		  <label for="num">Balance:</label><br>
		  <input type="text" id="num" name="num" value="<%= moneydet.getBalance() %>" /><br><br>
		  
		  
		  <label for="Cdate">Create Date :</label><br>
		  <input type="text" id="datepicker" name="Cdate" value="<%= moneydet.getCreatedate() %>" /><br><br>
		  
		  <label for="Udate">Update Date:</label><br>
		  <input type="text" id="updatepicker" name="Udate" value="<%= moneydet.getUpdatedate() %>" /><br><br>
		  
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>
<%@page import="org.ecom.model.CreditCard"%>
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
			  
  	    </script>		
	</head>
	<body>
		<%
		CreditCard creditcard = (CreditCard)request.getAttribute("creditcard");
		%>
		<div>
			<h2><a href="/advance-java">Home</a></h2>
		</div>
		
		<div>
			<h2><a href="/advance-java/CreditCard/list">CreditCard Detail</a></h2>
		</div>
		
		<h1>Update CreditCard</h1>
		
		<form action="/advance-java/CreditCard/Update" method="post">
		
		  <input type="hidden" id="creditcardcc_id" name="creditcardcc_id" value="<%= creditcard.getCc_id() %>" />
		  
		  <label for="cc_num">Cc_Num:</label><br>
		  <input type="text" id="cc_num" name="cc_num" value="<%= creditcard.getCc_num() %>" /><br><br>
		  
		  <label for="hname">Holder_Name:</label><br>
		  <input type="text" id="hname" name="hname" value="<%= creditcard.getHolder_name() %>" /><br><br>
		  
		  <label for="Edate">Expiry_Date:</label><br>
		  <input type="text" id="datepicker" name="Edate" value="<%= creditcard.getExpiry_date() %>" /><br><br>
		  
		  
		  <input type="submit" value="Submit">
		</form> 
	</body>
</html>
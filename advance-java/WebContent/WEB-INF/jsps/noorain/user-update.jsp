<%@page import="org.ecom.noor.model.User"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">User</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/user/list/noorain" role="button">Back</a>
	</h2>
</div>
<%
	User user = (User)request.getAttribute("user");
%>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Update User</medium></h3>
</div>
<form action="/advance-java/user/update/noorain" method="post" class="container mb-5">

  <input type="hidden" id="userId" name="userId" value="<%= user.getId() %>" />
  <div class="form-group">
		<label for="fname">First Name</label>
		<input type="text" class="form-control" name="fname" id="fname" aria-describedby="firstNameHelp" 
				value="<%= user.getFirstName() %>" placeholder="Enter First Name">
		<small id="firstNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="lname">Last Name</label>
		<input type="text" class="form-control" name="lname" id="lname" aria-describedby="lastNameHelp" 
				value="<%= user.getLastName() %>" placeholder="Enter Last Name">
		<small id="lastNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>  
	<div class="form-group">
		<label for="fatherName">Father Name</label>
		<input type="text" class="form-control" name="fatherName" id="fatherName" aria-describedby="fatherNameHelp" 
				value="<%= user.getFatherName() %>"  placeholder="Enter Father Name">
		<small id="fatherNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>  
	<div class="form-group">
		<label for="datepicker">Date Of Birth</label>
		<input type="text" name="dob" class="form-control" name="datepicker" id="datepicker" 
				value="<%= user.getDob() %>" aria-describedby="datepickerHelp" placeholder="Enter Dob">
		<small id="datepickerHelp" class="form-text text-muted">
			Please provide dob
		</small>
	</div>
	<div class="form-group">
		<label for="email">Email</label>
		<input type="email" class="form-control" name="email" id="email" aria-describedby="emailNameHelp" 
				value="<%= user.getEmail() %>" placeholder="Enter Email">
		<small id="emailNameHelp" class="form-text text-muted">
			We'll never share your email with anyone else.
		</small>
	</div>
	<div class="form-check form-check-inline">
		<input class="form-check-input" type="radio" name="gender" id="male" value="true">
		<label class="form-check-label" for="male">
			Male
		</label>
	</div>
	<div class="form-check form-check-inline">
		<input class="form-check-input" type="radio" name="gender" id="female" value="false">
		<label class="form-check-label" for="female">
			Female
		</label>
	</div>
	<div class="form-group">
		<label for="country">Country</label>
		<input type="text" class="form-control" name="country" id="country" aria-describedby="countryNameHelp" 
				value="<%= user.getCountry() %>"  placeholder="Enter country Name">
		<small id="countryNameHelp" class="form-text text-muted">
			Please provide your country name
		</small>
	</div>   
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/user/list/noorain" role="button">Cancel</a>
</form> 
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
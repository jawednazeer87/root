<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
<div class='text-center'>
	<h1 class="display-1">Employee</h1>
</div>
<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create Employee</medium></h3>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/employee/list/jawed" role="button">Back</a>
	</h2>
</div>

<form action="/advance-java/employee/add/jawed" method="post" id="employeeForm" class="container mb-5">
	<div class="form-group">
		<label for="name">First Name</label>
		<input type="text" class="form-control" name="firstName" id="firstName" aria-describedby="firstNameHelp" 
			placeholder="Enter First Name">
		<small id="firstNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="name">Last Name</label>
		<input type="text" class="form-control" name="lastName" id="lastName" aria-describedby="lastNameHelp" 
			placeholder="Enter Last Name">
		<small id="lastNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="salary">Salary</label>
		<input type="text" class="form-control" name="salary" id="salary" aria-describedby="salaryHelp" 
			placeholder="Enter Salary">
		<small id="salaryHelp" class="form-text text-muted">
			Please provide number
		</small>
	</div>
	<div class="input-group date" data-provide="datepicker">
	    <input type="text" class="form-control">
	    <div class="input-group-addon">
	        <span class="glyphicon glyphicon-th"></span>
	    </div>
	</div>
	
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/employee/list/asif" role="button">Cancel</a>
</form> 

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
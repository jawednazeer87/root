<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 

<div class='text-center'>
	<h1 class="display-1">User</h1>
</div>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/user/list/shoaeeb" role="button">Back</a>
	</h2>
</div>

<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create User</medium></h3>
</div>
<form action="/advance-java/user/create/shoaeebcreate" method="post" id="userForm" class="container mb-5">
	<div class="form-group">
		<label for="fname">First Name</label>
		<input type="text" class="form-control" name="fname" id="fname" aria-describedby="firstNameHelp" placeholder="Enter First Name">
		<small id="firstNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="lname">Last Name</label>
		<input type="text" class="form-control" name="lname" id="lname" aria-describedby="lastNameHelp" placeholder="Enter Last Name">
		<small id="lastNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="fatherName">Father Name</label>
		<input type="text" class="form-control" name="fatherName" id="fatherName" aria-describedby="fatherNameHelp" placeholder="Enter Father Name">
		<small id="fatherNameHelp" class="form-text text-muted">
			Please provide alphabets
		</small>
	</div>
	<div class="form-group">
		<label for="datepicker">Date Of Birth</label>
		<input type="text" name="dob" class="form-control" id="datepicker" aria-describedby="datepickerHelp" placeholder="Enter Dob">
		<small id="datepickerHelp" class="form-text text-muted">
			Please provide dob
		</small>
	</div>
	<div class="form-group">
		<label for="email">Email</label>
		<input type="email" class="form-control" name="email" id="email" aria-describedby="emailNameHelp" placeholder="Enter Email">
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
      <select id="country" name="country" class="form-control" onchange="changeCountry();">
        <option value="-1">Please Select</option>
	    <option value="india">India</option>
	    <option value="yemen">Yemen</option>
	    <option value="syria">Syria</option>
	    <option value="saudi">Saudi</option>
	    <option value="nigeria">Nigeria</option>
      </select>
    </div>
  	<input type="submit" value="Submit" class="btn btn-primary">
  	<a class="btn btn-dark mx-3" href="/advance-java/user/list/jawed" role="button">Cancel</a>
</form> 


	
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
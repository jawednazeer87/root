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

<div class='text-center mb-3'>
	<h3><medium class="text-muted">Create User</medium></h3>
</div>
<form action="/advance-java/user/add/noorain" method="post" id="userForm" class="container mb-5">
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
  	<a class="btn btn-dark mx-3" href="/advance-java/user/list/noorain" role="button">Cancel</a>
</form> 

<script type="text/javascript">

	function testing(){
		console.log("on mouse hover this element");
	}
	function submitForm(){
		console.log('print in browser console');
		
		var firstName = document.getElementById("fname").value;
		console.log("firstName: "+firstName);
		if(firstName.length==0){
			alert('Please provide first name');
			return false;
		}
		
		var fatherName = document.getElementById("fatherName").value;
		if(fatherName.length==0){
			alert('Please provide father name');
			return false;
		}
		
		
		var dob = document.getElementById("datepicker").value;
		if(dob.length==0){
			alert('Please provide Date of Birth');
			return false;
		}
		
		var email = document.getElementById("email").value;
		if(email.length==0){
			alert('Please provide email');
			return false;
		}
		if(!validateEmail(email)){
			alert('Please provide correct email format');
			return false;
		}
		
		var countryValue = document.getElementById("country").value;
		if(countryValue==-1){
			alert('Please select country from drop down');
			return false;
		}
		
		document.getElementById("userForm").submit();
	}
	
	function changeCountry(){
		var val = document.getElementById('country').value;
		console.log('country change : '+val);
	}
	
	$(document).ready(function(){
		console.log("page loaded/refresh");
		/*
	    $("#fname").keydown(function(event){
	        var inputValue = event.which;
	        console.log('inputValue: '+inputValue);
	        // allow letters and whitespaces only.
	        if(!(inputValue >= 65 && inputValue <= 120) && (inputValue != 32 && inputValue != 0)) { 
	            event.preventDefault(); 
	        }
	    });
	    
	    $("#lname").keydown(function(event){
	        var inputValue = event.which;
	        // allow letters and whitespaces only.
	        if(!(inputValue >= 65 && inputValue <= 120) && (inputValue != 32 && inputValue != 0)) { 
	            event.preventDefault(); 
	        }
	    });
	    */
	});
	
	function validateEmail(email) {
		  const re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		  return re.test(email);
		}
	
</script>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
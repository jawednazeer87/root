<%@page import="java.util.List"%>
<%@page import="org.ecom.student.shoaeeb.model.Employee"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 

<div class='text-center'>
	<h1 class="display-1">User</h1>
</div>

<%
	Employee employee= (Employee)request.getAttribute("employee");
%>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/user/list/shoaeeb" role="button">Back</a>
	</h2>
</div>

<div class='text-center mb-3'>
	<h3><medium class="text-muted">User Details</medium></h3>
</div>
<div class="container-fluid text-dark mb-5">
	<div class="row justify-content-center align-items-center">
		<form>
			<div class="form-group row">
				<label for="fname" class="col-sm-6 col-form-label">First Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="fname" 
							value="<%= employee.getFirstName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="lname" class="col-sm-6 col-form-label">Last Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="lname" 
							value="<%= employee.getLastName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="fatherName" class="col-sm-6 col-form-label">Father Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="fatherName" 
							value="<%= employee.getFatherName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="datepicker" class="col-sm-6 col-form-label">Date Of Birth</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="datepicker" 
							value="<%= employee.getDob() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="email" class="col-sm-6 col-form-label">Email</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="email" 
							value="<%= employee.getEmail() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="gender" class="col-sm-6 col-form-label">Gender</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="gender" 
							value="<%= employee.getGender() ? "male" : "female" %>" >
				</div>
			</div>
			<div class="form-group row">
				<label for="country" class="col-sm-6 col-form-label">Country</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="country" 
							value="<%= employee.getCountry() %>" >
				</div>
			</div>
		</form>
	</div>
</div>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
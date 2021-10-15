<%@page import="org.ecom.model.Address"%>
<%@page import="org.ecom.model.MoneyDetail"%>
<%@page import="java.util.List"%>
<%@page import="org.ecom.elhadj.model.User"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 

<div class='text-center'>
	<h1 class="display-1">User</h1>
</div>

<%
	User user = (User)request.getAttribute("user");
%>
<div>
	<h2>
		<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
		<a class="btn btn-link mx-3" href="/advance-java/user/list/elhadj" role="button">Back</a>
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
							value="<%= user.getFirstName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="lname" class="col-sm-6 col-form-label">Last Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="lname" 
							value="<%= user.getLastName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="fatherName" class="col-sm-6 col-form-label">Father Name</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="fatherName" 
							value="<%= user.getFatherName() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="datepicker" class="col-sm-6 col-form-label">Date Of Birth</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="datepicker" 
							value="<%= user.getDob() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="email" class="col-sm-6 col-form-label">Email</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="email" 
							value="<%= user.getEmail() %>">
				</div>
			</div>
			<div class="form-group row">
				<label for="gender" class="col-sm-6 col-form-label">Gender</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="gender" 
							value="<%= user.getGender() ? "male" : "female" %>" >
				</div>
			</div>
			<div class="form-group row">
				<label for="country" class="col-sm-6 col-form-label">Country</label>
				<div class="col-sm-6">
					<input type="text" readonly class="form-control-plaintext" id="country" 
							value="<%= user.getCountry() %>" >
				</div>
			</div>
		</form>
	</div>
</div>
<div class='text-center'>
	<h3><medium class="text-muted">Address Details</medium></h3>
</div>
<table class="table table-hover">
  	<thead class="table-primary">
  		<tr>
			<th scope="col">Street</th>
			<th scope="col">City</th>
			<th scope="col">State</th>
			<th scope="col">Country</th>
			<th scope="col">Pincode</th>
  		</tr>
  	</thead>
  	<tbody>
	<%
		List<Address> addressList = (List<Address>)request.getAttribute("addressList");
		
		if(!addressList.isEmpty()){
			for(Address address : addressList){
				%>
					<tr>
						<td><%= address.getStreet() %></td>
						<td><%= address.getCity() %></td>
						<td><%= address.getState() %></td>
						<td><%= address.getCountry() %></td>
						<td><%= address.getPincode() %></td>
					</tr>
				<%
			}
		}
		else{
			%>
				<tr>
					<td colspan="5">No Address found</td>
				</tr>
			<%
		}
	%>
	<tbody>
</table>
<div class='text-center'>
	<h3><medium class="text-muted">Money Details</medium></h3>
</div>	
<table class="table table-hover">
 	<thead class="table-primary">
		<tr>
			<th scope="col">balance </th>
			<th scope="col">Create date </th>
			<th scope="col">Update date </th>
		</tr>
	</thead>
	<tbody>
		<%
			List<MoneyDetail> monetdetList = (List<MoneyDetail>)request.getAttribute("monetdetList");
			if(!monetdetList.isEmpty()){
				for(MoneyDetail moneydet : monetdetList){
					%>
						<tr>
							<td><%= moneydet.getBalance() %></td>
							<td><%= moneydet.getCreatedate() %></td>
							<td><%= moneydet.getUpdatedate() %></td>
							
						</tr>
					<%
				}
			}
			else{
				%>
					<tr>
						<td colspan="5">No Transaction found</td>
					</tr>
				<%
			}
		%>
	</tbody>
</table>
<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
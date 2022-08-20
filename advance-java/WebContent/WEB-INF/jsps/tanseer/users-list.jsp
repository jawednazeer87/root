
<%@page import="org.jn.adv.student.tanseer.jdbc.model.Users"%>
<%@page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %> 
	
<div class='text-center'>
	<h1 class="display-1">User</h1>
	<h3><medium class="text-muted">Tanseer's User List</medium></h3>
</div>
<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
			</div>
			<div class="col-sm">
				<form action="/advance-java/tanseer/user/add">
					<div class="form-group mx-sm-3 mb-2 container">
						<input type="submit" value="Add User" style="float: right;" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="/advance-java/tanseer/user/search" class="form-inline">
		<div class="form-group mx-sm-3 mb-2 container">
			<label for="name" class="mr-2">Search By Name</label>
	    	<input type="text" class="form-control mx-2" id="name" placeholder="Enter Name" name="name" />
	    	<input type="submit" value="Search" class="btn btn-outline-primary mx-2" />
		</div>
	</form>
</div>

<div>
	<form action="/advance-java/tanseer/user/date/range/search" class="form-inline">
		<div class="form-group mx-sm-3 mb-2 container mt-4">
			<label for="name" class="mr-2">Search By Date Range</label>
	    	<input type="text" name="startDate" class="form-control" id="datepicker" placeholder="Enter Start Date">
			<input type="text" name="endDate" class="form-control ml-3" id="datepicker2"	placeholder="Enter End Date">
	    	<input type="submit" value="Search" class="btn btn-outline-primary mx-2" />
		</div>
	</form>
</div>

<br />
<br />

<table class="table table-hover">
	<thead class="table-primary">
		<tr>
			<th scope="col">First Name</th>
			<th scope="col">Email</th>
			<th scope="col">Gender</th>
			<th scope="col" class="pl-5">Action</th>
		</tr>
	</thead>
	<tbody>
		<%
			List<Users> usersList = (List<Users>) request.getAttribute("usersList");
			if(!usersList.isEmpty()){
				for(Users users : usersList){
					%>
						<tr>
							<td>
								<a href="/advance-java/tanseer/user/detail?userId=<%= users.getId() %>">
									<%= users.getFullName() %>
								</a>
							</td>
							<td><%= users.getEmail() %></td>
							<td><%= users.isGender() ? "male" : "female" %></td>
							<td>
								<div class="row">
									<div class="col-sm-3">
										<a href="/advance-java/tanseer/user/delete?userId=<%= users.getId() %>" 
											class="btn btn-danger">Delete</a>
									</div>
									<div class="col-sm-3">
										<a href="/advance-java/tanseer/user/update?userId=<%= users.getId() %>"
											class="btn btn-secondary">Update</a>
									</div>
								</div>
							</td>
						</tr>
					<%
				}
			}
			else{
				%>
					<tr>
						<td colspan="4">No user found</td>
					</tr>
				<%
			}
		%>
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %> 
	
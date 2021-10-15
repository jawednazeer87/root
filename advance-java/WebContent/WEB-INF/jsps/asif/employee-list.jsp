<%@ page import="org.ecom.asif.model.Employee"%>
<%@ page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp" %>
<div class='text-center'>
	<h1 class="display-1">Employee</h1>
	<h3><medium class="text-muted">Employee List</medium></h3>
</div>

<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java" role="button">Home</a>
			</div>
			<div class="col-sm">
				<form action="/advance-java/employee/add/asif">
					<div class="form-group mx-sm-3 mb-2 container">
						<input type="submit" value="Add Employee" style="float: right;" class="btn btn-primary" />
					</div>
				</form>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="/advance-java/employee/search/asif" class="form-inline">
		<div class="form-group mx-sm-3 mb-2 container">
			<label for="name" class="mr-2">Search By Name</label>
	    	<input type="text" class="form-control mx-2" id="name" placeholder="Enter Name" name="name" />
	    	<input type="submit" value="Search" class="btn btn-outline-primary mx-2" />
		</div>
	</form>
</div>

<br />
<br />

<table class="table table-hover">
	<thead class="table-primary">
		<tr>
			<th scope="col">Name</th>
			<th scope="col">Age</th>
			<th scope="col">Salary</th>
			<th scope="col" lass="pl-5">Action</th>
		</tr>
	</thead>
	<tbody>
		<%
		List<Employee> employeeList = (List<Employee>)request.getAttribute("employeeList");
			if(!employeeList.isEmpty()){
				for(Employee employee : employeeList){
					%>
						<tr>
							<td>
								<a href="/advance-java/user/detail/asif?userId=<%= employee.getId() %>">
									<%= employee.getName() %>
								</a>
							</td>
							<td><%= employee.getAge() %></td>
							<td><%= employee.getSalary() %></td>
							<td>
								<div class="row">
									<div class="col-sm-3">
										<a href="/advance-java/employee/delete/asif?userId=<%= employee.getId() %>" 
											class="btn btn-danger">Delete</a>
									</div>
									<div class="col-sm-3">
										<a href="/advance-java/employee/update/asif?userId=<%= employee.getId() %>"
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
						<td colspan="4">No employee found</td>
					</tr>
				<%
			}
		%>
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp" %>
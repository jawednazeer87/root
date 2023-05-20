<%@page import="org.ecom.student.shoaeeb.model.User"%>
<%@page import="java.util.List"%>
<%@ include file="/WEB-INF/jsps/common/header.jsp"%>

<div class='text-center'>
	<h1 class="display-1">User</h1>
	<h3>
		<medium class="text-muted">User List</medium>
	</h3>
</div>
<div>
	<div class="container">
		<div class="row">
			<div class="col-sm">
				<a class="btn btn-outline-dark mx-3" href="/advance-java"
					role="button">Home</a>
			</div>
			<div class="col-sm">
				<a class="btn btn-primary" href="#"
					role="button" style="float: right;">
						Create User
				</a>
			</div>
		</div>
	</div>
</div>

<br />
<br />

<div>
	<form action="#" class="form-inline">
		<div class="form-group mx-sm-3 mb-2 container">
			<label for="name" class="mr-2">Search By Name</label> <input
				type="text" class="form-control mx-2" id="name"
				placeholder="Enter Name" name="name" /> <input type="submit"
				value="Search" class="btn btn-outline-primary mx-2" />
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
		List<User> userList = (List<User>) request.getAttribute("userList");
		if (!userList.isEmpty()) {
			for (User user : userList) {
		%>
		<tr>
			<td><a
				href="#=<%=user.getId()%>">
					<%=user.getFirstName()%>
			</a></td>
			<td><%=user.getEmail()%></td>
			<td><%=user.getGender() ? "male" : "female"%></td>
			<td>
				<div class="row">
					<div class="col-sm-3">
						<a
							href="#<%=user.getId()%>"
							class="btn btn-danger">Delete</a>
					</div>
					<div class="col-sm-3">
						<a
							href="#=<%=user.getId()%>"
							class="btn btn-secondary">Update</a>
					</div>
				</div>
			</td>
		</tr>
		<%
		}
		} else {
		%>
		<tr>
			<td colspan="4">No user found</td>
		</tr>
		<%
		}
		%>
	
	<tbody>
</table>

<%@ include file="/WEB-INF/jsps/common/footer.jsp"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Servlet Project</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		<script src="js/main.js"></script>
		<style>
			.masthead {
			  height: 100vh;
			  min-height: 500px;
			  background-image: url('img/BtbjCFUvBXs.jpg');
			  background-size: cover;
			  background-position: center;
			  background-repeat: no-repeat;
			}
			body, html {
			  height: 100%;
			  margin: 0;
			  font-family: Arial, Helvetica, sans-serif;
			}
			
			.hero-image {
			  background-image: linear-gradient(rgba(0, 0, 0, 0.5), rgba(0, 0, 0, 0.5)), url("images/iqra_home_1.jpg");
			  height: 80%;
			  background-position: center;
			  background-repeat: no-repeat;
			  background-size: cover;
			  position: relative;
			}
			
		</style>
	</head>
	<body>
	<!-- 
		<img src="images/iqra_home_1.jpg" alt="Student" width="500" height="600">
		<img src="img/iqra_home_1.jpg" alt="Student" width="500" height="600">
		<img src="${pageContext.request.contextPath}/img/iqra_home_1.jpg" alt="Student" width="500" height="600">
		<div class="hero-image"></div>
	-->
		<nav class="navbar navbar-expand-lg navbar-light bg-light shadow fixed-top">
		  <div class="container">
		    <span class="navbar-brand">Student Page</span>
		    <div class="collapse navbar-collapse" id="navbarResponsive">
		      <ul class="navbar-nav ms-auto">
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/asif">Asif</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/tahir">Tahir D</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/noorain">Noorain</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/nizam">Nizam</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/abdul">Abdul R</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/jamal">Jamal</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/elhadj">Elhadj</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/aameen">Aameen</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/bakeel">Bakeel</a>
		        </li>
		        <li class="nav-item active">
		          <a class="nav-link" href="user/list/sajid">Sajid</a>
		        </li>
		      </ul>
		    </div>
		  </div>
		</nav>
		<!-- Full Page Image Header with Vertically Centered Content -->
		<header class="masthead">
		  <div class="container h-100">
		    <div class="row h-100 align-items-center">
		      <div class="col-12 text-center">
		        <h1 class="fw-light">Student Project</h1>
		        <p class="lead">This is our project landing page</p>
		      </div>
		    </div>
		  </div>
		</header>
	</body>
</html>
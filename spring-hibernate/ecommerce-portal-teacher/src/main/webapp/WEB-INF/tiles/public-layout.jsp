<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<head>
	    <title> Ecommerce </title>
		<link rel="shortcut icon"
			href="http://localhost:9292/teacher/favicon.ico">
		<link href="/teacher/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
			rel="stylesheet">
		<link href="/teacher/webjars/bootstrap-datepicker/1.0.1/css/datepicker.css"
			rel="stylesheet">
		<link href="/teacher/css/custom.css" rel="stylesheet">
		
	</head>
	<body class="bg-light">
		
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />
		<tiles:insertAttribute name="footer" />
		
		<script src="/teacher/webjars/jquery/1.9.1/jquery.min.js"></script>
		<script src="/teacher/webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
		<script src="/teacher/webjars/bootstrap-datepicker/1.0.1/js/bootstrap-datepicker.js"></script>
		<script src="/teacher/js/custom.js"></script>
		
	</body>
</html> 
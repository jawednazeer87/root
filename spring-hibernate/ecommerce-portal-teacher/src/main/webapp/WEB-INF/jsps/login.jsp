
<div class="container mb-4">
	<form action="/teacher/login" method="post" modelAttribute="userDto">

		<p class="h4 mb-4 text-center mt-4">Login</p>

		<div class="container border">

			<div class="form-group">
				<label for="email">Email</label> <input type="email"
					class="form-control" id="username" placeholder="Enter Email"
					name="username">
			</div>

			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" placeholder="Password"
					name="password">
			</div>

			<div class="form-group mt-3">
				<button type="submit" class="btn btn-primary">Login</button>
			</div>
		</div>
	</form>
</div>

<a class="btn btn-primary ml-5"
		href="/teacher/registration" role="button"> Don't have an account? </a>

	
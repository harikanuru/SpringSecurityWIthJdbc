

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring Boot POC</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0rc1/angular-route.min.js?v=1"></script>

<style>
.bg-1 {
	background-color: #1abc9c; /* Green */
	color: #ffffff;
}
</style>
</head>
<body class="bg-1">
	Í
	<h1 style="color: blue">Access is Denied!</h1>
			<div class="row">
				<div class="col-xs-6 col-sm-6 col-md-6">
					<form th:action="@{/logout}" method="post">
						<input class="btn btn-lg btn-primary btn-block" type="submit"
							value="Sign Out" />
					</form>

				</div>
				<div class="col-xs-6 col-sm-6 col-md-6"></div>
			</div>
</body>
</html>
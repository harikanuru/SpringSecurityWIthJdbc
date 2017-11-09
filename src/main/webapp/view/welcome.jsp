<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en" ng-app="myApp" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:th="http://www.thymeleaf.org"
	xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<title>Spring Boot POC</title>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="css/homecss.css" rel="stylesheet" type="text/css"></link>
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">


<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>

<script src="https://code.angularjs.org/1.6.4/angular-route.min.js"></script>


<script src="js/app.js"></script>
<script src="js/services.js"></script>
<script src="js/dashboard.js"></script>
<style>
.bg-1 {
	background-color: #1abc9c; /* Green */
	color: #ffffff;
}
</style>
</head>

<body class="bg-1">
	<div>
		<div ng-include="'view/header.jsp'"></div>

		<div class="container">
			<div class="row">
				<div class="col-sm-3"></div>
				<div class="col-sm-6  form-group"></div>
				<div class="col-sm-3">
					<form action="j_spring_security_logout">

						<input type="submit" value="logout">

					</form>
				</div>
			</div>



			<div class="row">
				<br>
			</div>
			<ul class="nav nav-pills nav-justified">
				<li class="active"><a data-toggle="pill" href="#!home">Register</a></li>
				<li><a data-toggle="pill" href="#!/register">Register</a></li>
				<li><a data-toggle="pill" href="#!/display">DiplayEmp</a></li>
				<li><a data-toggle="pill" href="#!/portfolio">PortFolio</a></li>
			</ul>

			<div ng-view></div>


		</div>


	</div>


</body>
</html>


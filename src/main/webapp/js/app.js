var app = angular.module('myApp', [ "ngRoute", 'app.services' ]);

/*
 * Registration Controller 
 */
app.controller('registrationCtrl', function($rootScope, $scope, $http,
		$location, services) {

	$scope.registerUser = function() {

		var emp = {
			"empId" : $scope.empId,
			"firstname" : $scope.firstName,
			"lastname" : $scope.lastName,
			"email" : $scope.email,
			"mobile" : $scope.mobile,
			"city" : $scope.city
		};
		console.log(emp);
		$scope.empId = "";
		$scope.firstName = "";
		$scope.lastName = "";
		$scope.email = "";
		$scope.mobile = "";
		$scope.city = "";

		services.registerUser(emp, function(data) {
			console.log(data);
		});

	};
});


/*
 * Login Controller 
 */
app.controller('loginController', function($rootScope, $scope, $http,
		$location, services) {

	console.log("Loading Controller")
	$scope.loginUser = function() {
		
		
		
		var admin = {
				"username" : $scope.username,
				"password" : $scope.password
		};
		
		services.adminLogin(admin, function(data){
			console.log(data);

		});
        
		 // window.location = "http://localhost:2020/welcome";

	
	};
});

/*
 * Admin  Controller 
 */
app.controller('adminController', function($rootScope, $scope, $http,
		$location, services) {

	console.log("Loading Controller")
	$scope.loginUser = function() {
		
		var conformPassword = $scope.conformpassword;
		var password = $scope.password;
		var employee = {
				"username" : $scope.username,
				"password" : $scope.password,
				
		};
		console.log(employee);
        
		  window.location = "http://localhost:2020/welcome";
		console.log(employee);

	
	};
});


/*
 * Display Controller 
 */
app.controller('displayCtrl', function($rootScope, $scope, $location, $http,
		services) {
	$scope.employeeDetails = {};

	$scope.employeeDetails = services.getEmployee(function(data) {
		$scope.employeeDetails = data;

	});
	
	$scope.deleteEmployee = function(emp) {

		var empObj = {
			"empId" : emp.empId
		};
		var index = $scope.employeeDetails.indexOf(emp);
		console.log(index);

		services.deleteEmployee(empObj, function(data) {
			$scope.employeeDetails.splice(index, index);

		});

	};

	$scope.navigateToUpdate = function(emp) {

		$rootScope.updateEmpDetails = emp;
		$location.path('/update');
	};

});



/*
 * Update Controller 
 */
app.controller('updateCtrl', function($rootScope, $scope, $http, $location,
		services) {

	console.log($rootScope.updateEmpDetails);
	$scope.empId = $rootScope.updateEmpDetails.empId;
	$scope.firstName = $rootScope.updateEmpDetails.firstname;
	$scope.lastName = $rootScope.updateEmpDetails.lastname;
	$scope.email = $rootScope.updateEmpDetails.email;
	$scope.mobile = $rootScope.updateEmpDetails.mobile;
	$scope.city = $scope.updateEmpDetails.city;

	$scope.updateEmp = function() {

		var emp = {
				"empId" : $scope.empId,
				"firstname" : $scope.firstName,
				"lastname" : $scope.lastName,
				"email" : $scope.email,
				"mobile" : $scope.mobile,
				"city" : $scope.city
			};
		
		console.log(emp);
		services.updateEmployee(emp, function(data){
			$location.path('/display');
		})


	};

});

/*
 * Routing Configuration
 */

app.config(function($routeProvider) {
	$routeProvider.when("/display", {
		templateUrl : "view/display.jsp"
	}).when("/register", {
		templateUrl : "view/registration.jsp"
	}).when("/portfolio", {
		templateUrl : "view/portfolio.jsp"
	}).when("/update", {
		templateUrl : "view/update.jsp"
	}).when("/home", {
		templateUrl : "view/welcome.jsp"
	});
});

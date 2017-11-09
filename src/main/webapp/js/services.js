/**
 * 
 */
var app = angular.module('app.services', []);
app.factory("services", [ '$http', '$rootScope', function($http, $rootScope) {

	return {

		registerUser : function(empObject, callback) {

			$http({
				url : 'registerUser',
				method : "POST",
				data : empObject
			}).then(function(response) {
				callback(response);
			}, function(response) { // optional
				callback(response);

			});

		},
		adminLogin : function (user, callback){
		
			http({
				url : "adminLogin",
				method : "POST",
				data : user
			}).then(function(response){
				callback(response);
			}, function(response){
				callback(response);
			})
		},
		deleteEmployee : function(empId, callback) {

			$http({
				url : 'deleteEmp',
				method : "POST",
				data : empId
			}).then(function(response) {
				callback(response);
			}, function(response) { // optional
				callback(response);

			});

		},
		getEmployee : function(callback) {

			$http({
				url : 'getEmployees',
				method : "GET",
			}).then(function(response) {
				console.log(response);
				callback(response.data);
			}, function(response) { // optional
				callback(response);

			});

		},
		updateEmployee : function(emp , callback) {

			$http({
				url : 'updateEmp',
				method : "POST",
				data : emp

			}).then(function(response) {
				console.log(response);
				callback(response.data);
			}, function(response) { // optional
				callback(response);

			});

		},
	}
} ]);
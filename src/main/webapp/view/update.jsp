
<div class="container" bgcolor="#518F97" ng-controller="updateCtrl">
	<div class="row">
		<h1>
			<center>Employee Details</center>
		</h1>
	</div>
	<div>

		<div class="col-sm-2"></div>
		<div class="col-sm-8">
			<form name="myForm" class="form-horizontal"
				ng-submit="updateEmp()">
				<div class="form-group">
					<input class="form-control" type="text" data-ng-model="empId"
						name="empid" placeholder="Id" ng-required="required" /> <br>
					<input class="form-control" type="text" data-ng-model="firstName"
						name="firstname" placeholder="First name" ng-required="required" />
					<br> <input class="form-control" type="text"
						data-ng-model="lastName" name="lastname" placeholder="Last name"
						ng-required="required" /> <br> <input class="form-control"
						type="text" data-ng-model="email" name="email" placeholder="email"
						ng-required="required" /> <br> <input class="form-control"
						type="text" data-ng-model="mobile" name="mobile"
						placeholder="Mobile" ng-required="required" /> <br> <input
						class="form-control" type="text" data-ng-model="city" name="city"
						placeholder="City" ng-required="required" /> <br> <br>
					<br> <input type="submit" id="submit" value="Update" />

				</div>
			</form>
			<span ng-model="response" name="response"></span>
		</div>
		<div class="col-sm-2"></div>
	</div>
</div>

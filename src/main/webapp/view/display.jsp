
<div class="container" ng-controller="displayCtrl">
	<div class="table-responsive">
		<table class="table">
			<thead>
				<tr>
              		<th>Id</th>
					<th>Firstname</th>
					<th>Lastname</th>
					<th>Email</th>
					<th>Mobile</th>
					<th>City</th>
					<th>Action</th>
					
				</tr>
			</thead>
			<tbody>
				<tr ng-repeat="employee in employeeDetails">
				    <td>{{employee.empId}}</td>
					<td>{{employee.firstname}}</td>
					<td>{{employee.lastname}}</td>
					<td>{{employee.email}}</td>
					<td>{{employee.mobile}}</td>
					<td>{{employee.city}}</td>
					<td><img ng-click="deleteEmployee(employee)" alt="" src="images/trash.jpg" height="30" width="30"><img ng-click="navigateToUpdate(employee)" alt="" src="images/edit.ico" height="30" width="30"></td>

				</tr>
			</tbody>
		</table>
	</div>
</div>
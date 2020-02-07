<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="author" content="Kodinger">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Affordable Packers and Movers Services in all our India
	contact +91- 9827898278</title>
<meta name="description"
	content="Welcome to Packers and Movers System Delhi NCR- We are one of the well established and eminent service providers of Packing and Moving services in Delhi NCR. providing packers movers Services at affordable charges." />
<meta name="keywords"
	content="Best & Cheapest packers and movers Secunderabad Telangana | movers and packers Secunderabad" />



</head>
<body>
	<style>
.at4-follow-inner {
	visibility: hidden;
}
</style>
	<%@include file="adminHeader.jsp"%>


	<form:form action="addServices" method="post" id="contactFrm" modelAttribute="addServices"
		name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">Add Services</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
				</div>
				<div class="col-md-4 col-md-offset-4">
					<div class="form-group">
						<label for="service_name">Services Name</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon  glyphicon-user"></span></span> <input type="text"
								name="service_name" class="form-control" id="service_name"
								placeholder="Enter Services Name" required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="service_type"> Type :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span>

							<!--  <input type="date"
								name="date" class="form-control" id="email4"
								placeholder="Enter Moving Date" required="required" /> -->
							<select class="browser-default custom-select form-control"
								required="required" name="service_type">
								<option selected>Select any one user</option>
								<option value="Shipping Services">Shipping Services</option>
								<option value="Household Shifting Service">Household Shifting Service</option>
								<option value="Relocation Service">Relocation Service</option>
								<option value="Cargo Services">Cargo Services</option>
								<option value="Packing Unpacking Service">Packing Unpacking Service</option>
								<option value="Warehousing Storage Service">Warehousing Storage Service</option>
								<option value="Warehousing Storage Service">Car Carriers Movers Services</option>
								<option value="Warehousing Storage Service">Loading & Unloading Services</option>
								<option value="Transport Services">Transport Services</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="charge_per_km">Charge Per KiloMeter :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-phone"></span></span> <input type="number"
								name="charge_per_km" class="form-control" id="charge_per_km"
								placeholder="Enter Charge Per KM " required="required" />
						</div>
					</div>


					<!-- <div class="form-group">
						<label for="type"> Type :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span>

							 <input type="date"
								name="date" class="form-control" id="email4"
								placeholder="Enter Moving Date" required="required" />
							<select class="browser-default custom-select form-control"
								required="required" name="cust_type" >
								<option selected>Select any one user</option>
								<option value="SYSTEM_USER">System User</option>
								<option value="CUSTOMER">Customer</option>
								<option value="ADMINISTRATOR">Administrator</option>
							</select>

						</div>
					</div> -->
					<!--  <input type="hidden" name="cust_credit_limit" value="4"  /> -->
					<!-- <div class="form-group">
						<label for="email5"> Moving To :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-menu-up"></span></span> <input type="text"
								name="to" class="form-control" id="email5"
								placeholder="Enter Moving To" required="required" />
						</div>
					</div> -->
					<!-- <div class="form-group">
						<label for="email6"> Moving From :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-menu-down"></span></span> <input type="text"
								name="from" class="form-control" id="email6"
								placeholder="Enter Moving From" required="required" />
						</div>
					</div> -->
					<!-- <div class="form-group">
						<label for="name"> Message</label>
						<textarea name="Message" id="message" class="form-control"
							rows="9" cols="25" required="required" placeholder="Message"></textarea>
					</div> -->
				</div>

				<div class="col-md-12 text-center mrbtm">
					<input type="submit" name="submit" id="button" value="Submit"
						class="btn btn-primary" /> <input type="reset" name="button2"
						id="button2" value="Reset" class="btn btn-primary" />
				</div>
			</div>
		</div>
	</form:form>
	<%@include file="footer.jsp"%>


</body>
</html>
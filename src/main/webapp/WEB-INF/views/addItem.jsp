<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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


	<form:form action="addItem" method="post" id="contactFrm" modelAttribute="addItem"
		name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">Add Item</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
				</div>
				<div class="col-md-4 col-md-offset-4">
					<div class="form-group">
						<label for="item_name">Item Name</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon  glyphicon-user"></span></span> <input type="text"
								name="item_name" class="form-control" id="item_name"
								placeholder="Enter Item Name" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="item_type">Item Type:</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input type="text"
								name="item_type" class="form-control" id="item_type"
								placeholder="Enter Item Type" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="service_id">Service Type :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="service_id">
								<option selected>Select any one user</option>
								<c:forEach items="${serviceList}" var="item">
									<option value="${item.service_id}">Service Id ${item.service_id}-Service Name ${item.service_name}-Service Type ${item.service_type}- Item Per KM ${item.charge_per_km}</option>
								</c:forEach>
							</select>

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
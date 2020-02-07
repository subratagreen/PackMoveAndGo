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
	<%@include file="systemUserHeader.jsp"%>


	<form:form action="advanceSearchUpdateConsignmentStatus" method="post" id="contactFrm"
		name="contactFrm" modelAttribute="advanceSearchUpdateConsignmentStatus">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">Update Consignment Status</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
				</div>
				<div class="col-md-4 col-md-offset-4">
					<div class="form-group">
						<label for="facility">Consignment Recieved Current Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="branch_id">
								<option selected>Select any one user</option>
								<c:forEach items="${branchList}" var="branchItem">
									<option value="${branchItem.branch_id}">${branchItem.branch_name}-${branchItem.branch_address}-${branchItem.branch_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					<div class="form-group">
						<label for="cust_name"> Customer Name :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span> <input type="text"
								name="cust_name" value="${details.cust_name}" class="form-control" id="cust_name" disabled="disabled"
								placeholder="Enter Customer Name" required="required" />
						</div>
					</div>
					 <input type="hidden" name="order_id" value="${details.order_id}" />
					 <input type="hidden" name="cust_id" value="${details.cust_id}" />
					 <input type="hidden" name="booking_id" value="${details.booking_id}" />
					<div class="form-group">
						<label for="cust_ph"> Mobile No :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-phone"></span></span> <input type="number"
								name="cust_ph" value="${details.cust_ph}" class="form-control" id="cust_ph" disabled="disabled"
								placeholder="Enter Mobile No" required="required" />
						</div>
					</div>

					<div class="form-group">
						<label for="cust_address"> Address :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="text"
								name="cust_address" value="${details.cust_address}" class="form-control"
								disabled="disabled" id="cust_address"
								placeholder="Enter Address" required="required" />
						</div>
					</div>
					<div class="form-group">
							<label for="monthly"> Booking Date :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="booking_date" value="${details.booking_date}" class="form-control" 
									disabled="disabled" id="booking_date"
									placeholder="Enter Booking Date" required="required" />
							</div>
						</div>
					<div class="form-group">
						<label for="src_branch">Source Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span>
							<input type="text"
									name="src_branch" value="${details.src_branch}" class="form-control"
									disabled="disabled"
									 id="src_branch"
									placeholder="Enter Source Branch" required="required" />

						</div>
					</div>
					<div class="form-group">
						<label for="dest_branch">Destination Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span>
							<input type="text"
									name="src_branch" value="${details.dest_branch}" class="form-control" id="dest_branch"
									disabled="disabled"
									placeholder="Enter Destination Branch" required="required" />
						</div>
					</div>
					<div class="col-md-12 text-center mrbtm">
					<input type="submit" name="Update" id="button" value="Consignment Recieved"
						class="btn btn-primary" /> 
				</div>
			</div>
		</div>
		</div>
	</form:form>
	<%@include file="footer.jsp"%>


</body>
</html>
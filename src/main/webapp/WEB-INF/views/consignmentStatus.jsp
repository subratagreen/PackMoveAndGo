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
	<%@include file="systemUserHeader.jsp"%>


	<form:form action="consignmentStatus" method="post" id="contactFrm"
	 modelAttribute="consignmentStatus"
		name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee"> Consignment Tracking</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
				</div>
				<div class="col-md-4 col-md-offset-4">
					<!-- <div class="form-group">
						<label for="company_name">Company Name</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon  glyphicon-home"></span></span> <input type="text"
								name="company_name" class="form-control" id="company_name"
								placeholder="Enter Company Name" required="required" />
						</div>
					</div> -->
					<!-- <div class="form-group">
						<label for="address"> Customer Name :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span> <input type="text"
								name="customer_name" class="form-control" id="customer_name"
								placeholder="Enter Customer Name" required="required" />
						</div>
					</div> -->
					<div class="form-group">
						<label for="orderId"> Order Number :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="orderId" class="form-control"
								id="orderId" placeholder="Enter Order Number " />
						</div>
					</div>
					<!-- <div class="form-group">
						<label for="quotation_id"> Quotation Id :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="quotation_id" class="form-control"
								id="quotation_id" placeholder="Enter Quotation Id" />
						</div>
					</div> -->

					<!-- <div class="form-group">
						<label for="bill_number"> Bill Number :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="bill_number" class="form-control"
								id="bill_number" placeholder="Enter Bill Number" />
						</div>
					</div> -->

					<!-- <div class="form-group">
						<label for="bill_number"> Select any one :</label>
						<div class="input-group">
							<label class="radio-inline"> <input type="radio"
								name="survey" id="Radios1" value="Yes"> Way-Bill

							</label> <label class="radio-inline"> <input type="radio"
								name="survey" id="Radios2" value="No"> Consignment Bill

							</label> <label class="radio-inline"> <input type="radio"
								name="survey" id="Radios3" value="Notsure" disabled>
								Payment Receipt
							</label>
						</div>
					</div> -->
					<div class="col-md-12 text-center mrbtm">
						<input type="submit" name="submit" id="button" value="Search"
							class="btn btn-primary" /> <input type="reset" name="button2"
							id="button2" value="Reset" class="btn btn-primary" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<%@include file="footer.jsp"%>


</body>
</html>
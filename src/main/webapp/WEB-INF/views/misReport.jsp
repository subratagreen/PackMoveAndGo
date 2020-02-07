<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page trimDirectiveWhitespaces="true"%>

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
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/jquery/latest/jquery.min.js"></script>
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/momentjs/latest/moment.min.js"></script>
<script type="text/javascript"
	src="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="https://cdn.jsdelivr.net/npm/daterangepicker/daterangepicker.css" />
	
</head>
<body>
	<style>
.at4-follow-inner {
	visibility: hidden;
}
</style>
	<%
		if (session.getAttribute("userType") == null) {
	%>

	<%@include file="loginHeader.jsp"%>

	<%
		} else if (session.getAttribute("userType").equals("SYSTEM_USER")) {
	%>

	<%@ include file="systemUserHeader.jsp"%>

	<%
		} else if (session.getAttribute("userType").equals("ADMINISTRATOR")) {
	%>

	<%@include file="adminHeader.jsp"%>

	<%
		} else {
	%>

	<%@include file="loginHeader.jsp"%>

	<%
		}
	%>



	<form:form action="misReport" method="post" id="misContactFrm"
		modelAttribute="misReport" name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">MIS Reports</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>

				</div>
				<div class="col-md-4 col-md-offset-4">

					<div class="form-group">
						<label for="bill_number"> Select any one :</label>
						<div class="input-group">
							<label class="radio-inline"> <input type="radio"
								name="misReportRadioButton" id="Radios1" value="Monthly">Monthly
							</label> <label class="radio-inline"> <input type="radio"
								name="misReportRadioButton" id="Radios2" value="Yearly">Yearly
							</label> <label class="radio-inline"> <input type="radio"
								name="misReportRadioButton" id="Radios3" value="DateWise">
								Date Wise
							</label>
						</div>
					</div>
					<div class="datewise">
						<div class="form-group">
							<label for="datewise"> Datewise :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="datewise" class="form-control" id="datewise"
									placeholder="Enter Moving Date" />
							</div>
						</div>
					</div>

					<div class="monthwise">
						<div class="form-group">
							<label for="monthly"> Monthly :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="monthlyDate" class="form-control" id="monthly"
									placeholder="Enter Moving Date" />
							</div>
						</div>
					</div>
					<div class="yearwise">
						<div class="form-group">
							<label for="email4"> Yearly :</label></br> <label for="startDate">
								Start Date :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="startDate" class="form-control" id="startDate"
									placeholder="Enter Moving Date" />
							</div>
						</div>

						<div class="form-group">
							<label for="endDate"> End Date :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="endDate" class="form-control" id="endDate"
									placeholder="Enter Moving Date" />
							</div>
						</div>

					</div>




					<div class="col-md-12 text-center mrbtm">
						<input type="submit" name="submit" id="button" value="Submit"
							class="btn btn-primary" /> <input type="reset" name="button2"
							id="resetid" value="Reset" class="btn btn-primary" />
					</div>
				</div>
			</div>
		</div>
	</form:form>
	<%@include file="footer.jsp"%>


</body>
</html>
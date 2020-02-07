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
		<%if(session.getAttribute("userType") == null){%>

	<%@include file="loginHeader.jsp"%>

<% }else if(session.getAttribute("userType").equals("SYSTEM_USER")){ %>
    
    <%@ include file="systemUserHeader.jsp" %>
    
<% } else if(session.getAttribute("userType").equals("ADMINISTRATOR")){ %>

	<%@include file="adminHeader.jsp"%>

<% } else if(session.getAttribute("userType").equals("CUSTOMER_USER")){ %>

	<%@include file="customerHeader.jsp"%>

<% } else{%>

	<%@include file="loginHeader.jsp"%>

<% }%>



	<form action="#" method="post" id="contactFrm"
		name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">Documentation of the Consignment</h3>
					<h3 class="colorcoffee">${message}</h3>
					<hr />
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
						<label for="docket_number"> Way-Bill :<a href="
				                  	<c:url value='wayBill'>
				                  	<c:param name="order_id" value="${order_id}"/>
									</c:url>">Click Here</a></label>
					</div>
					<div class="form-group">
						<label for="quotation_id"> Consignment Bill :<a href="
				                  	<c:url value='consignmentBill'>
				                  	<c:param name="order_id" value="${order_id}"/>
									</c:url>">Click Here</a></label>
					</div>

					<div class="form-group">
						<label for="bill_number"> PaymentReceipt :<a href="
				                  	<c:url value='paymentReceipt'>
				                  	<c:param name="order_id" value="${order_id}"/>
									</c:url>">Click Here</a></label>
					</div>

					<!-- <div class="form-group">
						<label for="bill_number"> Select any one :</label>
						<div class="input-group">
							<label class="radio-inline"> <input type="radio"
								name="survey" id="Radios1" value="Way-Bill"> Way-Bill

							</label> <label class="radio-inline"> <input type="radio"
								name="survey" id="Radios2" value="Consignment Bill"> Consignment Bill

							</label> <label class="radio-inline"> <input type="radio"
								name="survey" id="Radios3" value="PaymentReceipt" >
								Payment Receipt
							</label>
						</div>
					</div> -->
					<!-- <div class="col-md-12 text-center mrbtm">
						<input type="submit" name="submit" id="button" value="Submit"
							class="btn btn-primary" /> <input type="reset" name="button2"
							id="button2" value="Reset" class="btn btn-primary" />
					</div> -->
				</div>
			</div>
		</div>
	</form>
	<%@include file="footer.jsp"%>


</body>
</html>
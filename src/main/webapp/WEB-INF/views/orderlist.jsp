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
	<br><br><br><br>

	<form:form action="addItem" method="post" id="contactFrm" modelAttribute="addItem"
		name="contactFrm">
		<div class="container mrtopbtm">
			<h3 class="colorcoffee">${tableMessage}</h3>
			<div class="table-responsive">
              <table class="table table-bordered" id="dataTable" style="width:100%;border-spacing:0px">
                <thead>
                  <tr>
                    <th>Customer Name</th>
                    <th>Customer Mobile No</th>
                    <th>Order Number</th>
                    <th bgcolor="#00FF00">Current Status </th>
                     <th>Status of Consignment </th>
                    <th>Source Branch</th>
                    <th>Destination Branch </th>
                    <th>Order Date</th>
                    <th>Agent Name</th>
                    <th bgcolor="#00FF00">Booking Status</th>
                    <th>Booking Cancel</th>
                    <th>View/Update/Delete</th>
                    <th>Find in Map</th>
                  </tr>
                </thead>           
                  <tr>
					<td> ${details.cust_name}</td>
                    <td> ${details.cust_ph}</td>
                    <td> ${details.order_id}</td>
                    <td> ${details.branch_name}</td>
                    <td> <marquee bgcolor="yellow" style="border: thick;">  ${details.statusOfConsignment}</marquee> </td>
					<td> ${details.src_branch}</td>
                    <td> ${details.dest_branch}</td>
                    <td> ${details.booking_date}</td>
                    <td> ${details.agent_name}</td>
                     <td> ${details.status}</td>
                    <td><a href="
                  	<c:url value='cancelorder'>
                  	<c:param name="order_id" value="${details.order_id}"/>
					</c:url>" >Cancel</a>
                 	</td>
                  	<td><a href="
                  	<c:url value='vieworder'>
                  	<c:param name="order_id" value="${details.order_id}"/>
					</c:url>" >View Order/Update Consignment Status</a>/
                 	</td>
                 	<td><a href="https://www.google.com/maps/dir/${details.src_branch}/${details.branch_name}/${details.dest_branch}" target=_blank>Click</a></td>
                  </tr>
              </table>
            </div>
		</div>
	</form:form>
		<br>
		
	<div align="center">
		<div class="form-group">
			<label for="docket_number"> Way-Bill :<a href="
	               	<c:url value='wayBill'>
	               	<c:param name="order_id" value="${details.order_id}"/>
			</c:url>">Click Here</a></label>
		</div>
		<div class="form-group">
			<label for="quotation_id"> Consignment Bill :<a href="
	               	<c:url value='consignmentBill'>
	               	<c:param name="order_id" value="${details.order_id}"/>
			</c:url>">Click Here</a></label>
		</div>
		<div class="form-group">
			<label for="bill_number"> PaymentReceipt :<a href="
	               	<c:url value='paymentReceipt'>
	               	<c:param name="order_id" value="${details.order_id}"/>
			</c:url>">Click Here</a></label>
		</div>
	</div>
	
	<br><br><br>
	
	<%@include file="footer.jsp"%>


</body>
</html>
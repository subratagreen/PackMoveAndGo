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

<%@ include file="systemUserHeader.jsp"%>

<% } else if(session.getAttribute("userType").equals("ADMINISTRATOR")){ %>

<%@include file="adminHeader.jsp"%>

<% } else{%>

<%@include file="loginHeader.jsp"%>

<% }%>
	
	
	<br><br><br><br>

	<form:form action="addItem" method="post" id="contactFrm" modelAttribute="addItem"
		name="contactFrm">
		<div class="container mrtopbtm">
			<h3 class="colorcoffee">${fileUploadMessage}</h3>
			<div class="table-responsive">
              <table class="table table-bordered" id="dataTable" style="width:100%;border-spacing:0px">
                <thead>
                  <tr>
                    <th>Customer Name</th>
                    <th>Customer Mobile No</th>
                    <th>Order Number</th>
                    <th>Current Status </th>
                     <th>Status of Consignment </th>
                    <th>Source Branch</th>
                    <th>Destination Branch </th>
                    <th>Order Date</th>
                    <th>Agent Name</th>
                    <th>Booking Status</th>
                    <th>Cancel Booking</th>
                    <th>View/Update/Delete</th>
                    <th>Proof Of Delivery</th>
                    
                  </tr>
                </thead>
                <!-- <tfoot>
                  <tr>
                    <th>Customer Name</th>
                    <th>Customer Mobile No</th>
                    <th>Order Number</th>
                    <th>Current Order Place </th>
                    <th>Source Branch</th>
                    <th>Destination Branch </th>
                    <th>Order Date</th>
                    <th>Agent Name</th>
                    <th>View/Update/Delete</th>
                  </tr>
                </tfoot>   -->             
                  <tr>
					<td> ${details.cust_name}</td>
                    <td> ${details.cust_ph}</td>
                    <td> ${details.order_id}</td>
                    <td> ${details.branch_name}</td>
                    <td> ${details.statusOfConsignment}</td>
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
                 	
                 	<td>
                 	<%-- <%if(session.getAttribute("proofOfDelivery") == null){%>
						<a href="
                  		<c:url value='proofOfDelivery'>
                  		<c:param name="order_id" value="${details.order_id}"/>
						</c:url>" >Upload Proof Of Delivery </a>
                 		
					<% }else if(session.getAttribute("proofOfDelivery").equals("exists")){ %>
						Proof of delivery exists.
					<% } %> --%>
					<c:choose>
					<c:when test="${proofOfDelivery.equals('exists')}">
					    Proof of delivery exists.
					    ${proofOfDeliveryPath}
					</c:when>    
					<c:otherwise>
					   <a href="
                  		<c:url value='proofOfDelivery'>
                  		<c:param name="order_id" value="${details.order_id}"/>
						</c:url>" >Upload Proof Of Delivery </a>
					</c:otherwise>
					</c:choose>
					</td>
                 	
                  </tr>
              </table>
            </div>
		</div>
	</form:form>
		<br><br><br><br>
	
	<%@include file="footer.jsp"%>


</body>
</html>
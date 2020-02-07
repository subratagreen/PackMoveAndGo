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
	<br>
	<br>
	<br>
	<br>
	<form:form action="enquiryList" method="post" id="contactFrm"
		modelAttribute="enquiryList" name="contactFrm">
		<div class="container mrtopbtm">
			<div class="table-responsive">
				<table class="table table-bordered" id="dataTable"
					style="width: 100%; border-spacing: 0px">
					<thead>
						<tr>
							<th>sendEnquiryId</th>
							<th>Customer name</th>
							<th>mobile</th>
							<th>moveFrom</th>
							<th>moveTo</th>
							<th>moveDate</th>
							<th>message</th>
							<th>status</th>
						</tr>
					</thead>

					<c:forEach items="${allEnquiries}" var="enquiry">
						<tr> 
							<td>${enquiry.sendEnquiryId}</td>
							<td>${enquiry.name}</td>
							<td>${enquiry.mobile}</td>
							<td>${enquiry.moveFrom}</td>
							<td>${enquiry.moveTo}</td>
							<td>${enquiry.moveDate}</td>
							<td>${enquiry.message}</td>
							<td>${enquiry.status}</td>
						</tr>
					</c:forEach>


				</table>
			</div>
		</div>
	</form:form>
	<br>
	<br>
	<br>
	<br>

	<%@include file="footer.jsp"%>


</body>
</html>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="author" content="Kodinger">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Best & Cheapest packers and movers Secunderabad Telangana
	| movers and packers Secunderabad</title>
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
	<%@include file="loginHeader.jsp"%>


	<div class="container mrtopbtm">
		<div class="row">
			<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 pull-right maintxt">
				<div class="page-header">
					<h1>
						<span class="glyphicon glyphicon-copy" aria-hidden="true"></span>
						Contact Us <small class="colorred"> Packers and
							Movers System - Delhi NCR</small>
					</h1>
				</div>
				<div class="col-md-12  wow fadeInDown" data-wow-delay="0.4s">
					<div class="row">
						<div class="col-md-6 col-sm-6 col-xs-12 pull-right mrbtm2">
							<img
								src="${pageContext.request.contextPath}/resources/images/contact-us.jpg"
								width="" height="" alt="Car Carrier Services"
								class="img-responsive img-rounded img-thumbnail"
								data-toggle="tooltip" data-placement="left"
								title="24x7 Customer Care Support" />
						</div>
						<%-- <img
							src="${pageContext.request.contextPath}/resources/images/logo.jpg"
							width="320" height="" alt="logo" />
						<hr /> --%>
						<p class="colorblack">
							<strong><span class="glyphicon glyphicon-home"
								aria-hidden="true"></span> Address :</strong>
						</p>
						<p class="maintxt">
							Lalbag Chowk Gurgaon<br /> Haryana 122451 India<br />
						</p>
						<hr />
						<p class="colorblack">
							<strong><span class="glyphicon glyphicon-phone"
								aria-hidden="true"></span> Mobile No :</strong>
						</p>
						<h4>
							+91- 9827898278<br />
							<!--+91- 8376999929-->
							<br />
						</h4>
						<hr />
						<p class="colorblack">
							<strong><span class="glyphicon glyphicon-envelope"
								aria-hidden="true"></span> E-Mail :</strong>
						</p>
						<p>
							<a href="mailto:info@packmoverandgo.com">info@PackMoveAndGo.com</a>
						</p>
						<!--<p><a href="mailto:ravindrakk32@gmail.com">ravindrakk32@gmail.com</a></p>-->
						<hr />
						<p class="colorblack">
							<strong><span class="glyphicon glyphicon-globe"
								aria-hidden="true"></span> Website :</strong>
						</p>
						<p>
							<a href="http://www.PackMoveAndGo.com">www.PackMoveAndGo.com</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-12 col-xs-12">

				<div class="col-md-12  wow fadeInDown" data-wow-delay="0.4s">

					<div class=" row well redbg2">

						<form:form action="sendEnquiry" method="post" id="contactFrm" modelAttribute="sendEnquiry"
							name="contactFrm">
							<div class="col-md-12 mainmrg">
								<h2 class="h2clr">
									<span class="glyphicon glyphicon-align-left" aria-hidden="true"></span>
									Send Enquiry
								</h2>
							</div>
							<div class="col-lg-12 col-md-12 col-sm-4 col-xs-6 mainmrg">
								<input type="text" required="" placeholder="Your Name" value=""
									tabindex="1" name="name" class="con_txt2">
									
									 <input
									type="number" required="" placeholder="Your Mobile No"
									tabindex="2" value="" name="mobile" class="con_txt2"> 
									
									<input
									type="email" required="" placeholder="Your Email" tabindex="3"
									value="" name="email" class="con_txt2">
							</div>
							<div class="col-lg-12 col-md-12 col-sm-4 col-xs-6 mainmrg">
								<!-- <input type="text" required="" placeholder="Move From" value=""
									tabindex="1" name="from" class="con_txt2"> -->
									
									<select 
								required="required" name="moveFrom" class="con_txt2">
								<option selected>Move From Select any one user</option>
								<c:forEach items="${branchList}" var="item">
									<option value="${item.branch_name}">Move From :${item.branch_name}, Branch Address:${item.branch_address}, Branch Phone No. :${item.branch_ph}</option>
								</c:forEach>
							</select> 
									
									<!--  <input
									type="text" required="" placeholder="Move To" tabindex="2"
									value="" name="to" class="con_txt2"> -->
									
									<select 
								required="required" name="moveTo" class="con_txt2">
								<option selected>Move To Select any one user</option>
								<c:forEach items="${branchList}" var="item">
									<option value="${item.branch_name}">Move To :${item.branch_name}, Branch Address:${item.branch_address}, Branch Phone No. :${item.branch_ph}</option>
								</c:forEach>
							</select>
							
									 <input type="date"
									required="" placeholder="Moving Date" tabindex="3" value=""
									name="moveDate" class="con_txt2">
							</div>
							<div class="col-lg-12 col-md-12 col-sm-4 col-xs-12 mainmrg">
								<textarea placeholder="Type here Your Message" name="Message"
									type="text" class="con_txt2" tabindex="4"></textarea>
								<input type="submit" value="Submit" name="submit"
									class="btn btn-warning btn-sm button"> <input
									type="reset" value="clear" name=""
									class="btn btn-warning btn-sm button">
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>


</body>
</html>
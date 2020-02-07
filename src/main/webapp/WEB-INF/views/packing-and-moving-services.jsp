<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="author" content="Kodinger">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="description"
	content="We, at Packers and Movers System - Delhi NCR offer Car Transportation Services in all over India. Movers and Packers in Delhi NCR ( Movers) offers worthwhile Car Transportation Services and make sure that our clients or customers for a quick, smooth, and prompt deliveries of your most prized cars. " />
<meta name="keywords"
	content="Car Carrier Services Ved vihar | Packing and Moving Services in Secunderabad " />

</head>
<body>
	<style>
.at4-follow-inner {
	visibility: hidden;
}
</style>
	<%@include file="loginHeader.jsp"%>

	<div id="myCarousel" class="carousel slide blackbg mrbtm"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox">

			<div class="item active">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height=""
					class="img-responsive">
				<div class="carousel-caption">
					<h1>
						Worried of <span class="colorred">Relocation?</span>
					</h1>
					<h5>We are Specialized in Office / Home Relocation</h5>
				</div>
			</div>

			<div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner2.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">
				<div class="carousel-caption">
					<h1 class="orangecolor">
						We Annsurance Your Smile<br /> Till The End of Shifting
					</h1>
				</div>
			</div>

			<%-- <div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner3.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">
				<div class="carousel-caption">
					<h1>Planning Your Next Move?</h1>
					<h4>We are the company for all moves and Storage needs</h4>
				</div>
			</div> --%>

			<%-- <div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner4.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">
				<div class="carousel-caption">
					<h1>Make Your Move The Right Move</h1>
					<p>Packers and Movers</p>
				</div>
			</div> --%>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>

	<div class="container mrtopbtm">
		<div class="row">
			<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12 pull-right maintxt">
				<div class="page-header">
					<h1>
						<span class="glyphicon glyphicon-copy" aria-hidden="true"></span>
						Services <small class="colorred"> Packers and
							Movers - Delhi NCR</small>
					</h1>
				</div>
				<div class="col-md-12  wow fadeInDown" data-wow-delay="0.4s">
					<div class="row">

						<h3 class="colorred">Packing and Moving Services</h3>
						<div class="col-md-6 col-sm-6 col-xs-12 pull-right mrbtm2">
							<img src="${pageContext.request.contextPath}/resources/images/packing-and-moving-services.jpg" width="450"
								height="300" alt="packing and Moving Services"
								class="img-responsive img-rounded img-thumbnail"
								data-toggle="tooltip" data-placement="left"
								title="Packing and Moving Services" />
						</div>
						<p>
							<strong> Movers and Packers - Delhi NCR</strong> offers
							the comprehensive packing solution both for corporate and
							domestic relocation purposes. Services of Packers and Movers in
							Delhi NCR (Packers and Movers System) are designed in a manner
							that they undertake the entire package and help in providing you
							with the complete moving solutions. The fact that it provides the
							complete package ensures that Movers and Packers in Delhi NCR (<strong>
								Movers and Packers</strong>) do it in a more systematic manner that
							further, allows no errors and no provision for any avoidable
							mishaps. Further, each and every stage is monitored skilled
							professionals of Packers and Movers in Delhi NCR (
							Packers Movers) do not let any damage to your goods.
						</p>
						<a class="btn btn-default" href="${pageContext.request.contextPath}/services" role="button">[+]
							More Services</a>
						<hr />
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
									tabindex="1" name="name" class="con_txt2"> <input
									type="number" required="" placeholder="Your Mobile No"
									tabindex="2" value="" name="mobile" class="con_txt2"> <input
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


	<div class="container-fluid wybg pdtopbtm">
		<div class="container">
			<div class="row">
				<div class="col-lg-9 col-md-9 col-sm-12 col-xs-12">
					<div class="row">
						<div class="col-md-12 mrbtm  wow bounceInDown"
							data-wow-delay="0.4s">
							<h2 class="coloryellow">Our Services</h2>
							<h5 class="aashclr">Shipping Services,Loading and Unloading
								Services,Car Carriers Services,Household Shifting Services,Cargo
								services,Warehousing Services</h5>
						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.4s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-packing.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Shipping Services</strong>
							</h5>
							<p>
								<span class="colorash2">offers the comprehensive packing
									solution both for corporate and domestic </span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>
						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.5s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-car.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Car Carrier Services </strong>
							</h5>
							<p>
								<span class="colorash2">offers worthwhile Car
									Transportation Services and make sure that our clients </span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>
						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.6s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-transportation.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Transportation Services</strong>
							</h5>
							<p>
								<span class="colorash2">is provided as per the client's
									specifications and requirements. These services</span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>

						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.4s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-corporate.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Household Shifting </strong>
							</h5>
							<p>
								<span class="colorash2">is counted amongst trusted names
									for providing best corporate relocation</span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>

						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.5s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-warehouse.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Warehousing</strong>
							</h5>
							<p>
								<span class="colorash2">we provide best warehousing and
									storage services for storing goods for a specified</span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>

						</div>
						<div
							class="col-lg-4 col-md-4 col-sm-6 col-xs-12 mrbtm2 wow fadeInDown"
							data-wow-delay="0.6s">
							<div class="orgbg">
								<img
									src="${pageContext.request.contextPath}/resources/images/icon-loading.png"
									width="69" height="60" alt="packing and moving services"
									class="img-responsive" />
							</div>
							<h5 class="colorred">
								<strong>Loading and Unloading </strong>
							</h5>
							<p>
								<span class="colorash2">handled by expert professionals,
									well versed in handling the goods with responsibility </span>
							</p>
							<p>
								<a href="${pageContext.request.contextPath}/services"
									class="readmore">[+] Readmore</a>
							</p>

						</div>
					</div>
				</div>
				<div
					class="col-lg-3 col-md-3 col-sm-12 col-xs-12 hidden-sm hidden-xs"
					style="margin-top: 70px;">
					<img
						src="${pageContext.request.contextPath}/resources/images/services.png"
						width="323" height="360" alt="our services" class="img-responsive" />
				</div>
			</div>
		</div>

	</div>

	<div class="container pdtopbtm">
		<div class="row">
			<div class="col-md-12">
				<div id="Carousel" class="carousel slide">

					<ol class="carousel-indicators">
						<li data-target="#Carousel" data-slide-to="0" class="active"></li>
						<li data-target="#Carousel" data-slide-to="1"></li>
						<li data-target="#Carousel" data-slide-to="2"></li>
					</ol>

					<!-- Carousel items -->
					<div class="carousel-inner">

						<div class="item active">
							<div class="row">
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients1.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients2.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients3.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients4.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients5.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients6.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
							</div>
							<!--.row-->
						</div>
						<!--.item-->

						<div class="item">
							<div class="row">
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients7.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients8.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients9.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients10.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients11.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients12.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
							</div>
							<!--.row-->
						</div>
						<!--.item-->

						<div class="item">
							<div class="row">
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients13.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients14.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients15.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients16.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients17.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
								<div class="col-md-2 col-xs-4">
									<a href="#" class="thumbnail"><img
										src="${pageContext.request.contextPath}/resources/images/clients18.gif"
										alt="Image" style="max-width: 100%;"></a>
								</div>
							</div>
							<!--.row-->
						</div>
						<!--.item-->

					</div>
					<!--.carousel-inner-->
					<a data-slide="prev" href="#Carousel" class="left carousel-control">‹</a>
					<a data-slide="next" href="#Carousel"
						class="right carousel-control">›</a>
				</div>
				<!--.Carousel-->

			</div>
		</div>
	</div>
	<div class="container-fluid bgbtm">
		<div class="container">
			<div class="row">
				<div class="col-md-12 text-center">
					<h1 class="colorwhite">Our Shifting Process</h1>
					<p>The process of packing and moving of goods for various
						services undergoes various steps. The steps can be defined as
						follows...</p>
				</div>
				<div class="process pdtop">
					<div class="process-row">
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-1.png"
								width="60" />
							<p class="colorash2">Customer</p>
						</div>
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-2.png"
								width="60" />
							<p class="colorash2">Planning</p>
						</div>
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-3.png"
								width="60" />
							<p class="colorash2">Pick & Pack</p>
						</div>
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-4.png"
								width="60" />
							<p class="colorash2">Distribution</p>
						</div>
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-5.png"
								width="60" />
							<p class="colorash2">Delivery</p>
						</div>
						<div class="process-step">
							<img
								src="${pageContext.request.contextPath}/resources/images/process-6.png"
								width="60" />
							<p class="colorash2">Received</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>

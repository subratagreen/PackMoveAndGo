<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
	content="Best packers and movers Secunderabad Telangana, Cheapest packers and movers Secunderabad, packers and movers Secunderabad Telangana | movers and packers Secunderabad" />

<!-- Go to www.addthis.com/dashboard to customize your tools -->
<script type="text/javascript"
	src="//s7.addthis.com/js/300/addthis_widget.js#pubid=ra-596302b450b55a61"></script>



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
	<%-- <div id="myCarousel" class="carousel slide blackbg mrbtm"
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

			<div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner3.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">
				<div class="carousel-caption">
					<h1>Planning Your Next Move?</h1>
					<h4>We are the company for all moves and Storage needs</h4>
				</div>
			</div>

			<div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/banner4.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">
				<div class="carousel-caption">
					<h1>Make Your Move The Right Move</h1>
					<p>Packers and Movers</p>
				</div>
			</div>

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
	</div> --%>

	<%-- <div class="container-fluid redbg">
		<div class="container">
			<div class="row">
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12  wow fadeInLeft"
					data-wow-delay="0.4s">
					<form action="mail.aspx" method="post" id="contactFrm"
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
							<input type="text" required="" placeholder="Move From" value=""
								tabindex="1" name="from" class="con_txt2"> <input
								type="text" required="" placeholder="Move To" tabindex="2"
								value="" name="to" class="con_txt2"> <input type="date"
								required="" placeholder="Moving Date" tabindex="3" value=""
								name="date" class="con_txt2">
						</div>
						<div class="col-lg-12 col-md-12 col-sm-4 col-xs-12 mainmrg">
							<textarea placeholder="Type here Your Message" name="Message"
								type="text" class="con_txt2" tabindex="4"></textarea>
							<input type="submit" value="Submit" name="submit"
								class="btn btn-warning btn-sm button"> <input
								type="reset" value="clear" name=""
								class="btn btn-warning btn-sm button">
						</div>
					</form>
				</div>
				<div class="col-lg-6 col-md-6 col-sm-12 col-xs-12  wow fadeInRight"
					data-wow-delay="0.4s">
					<h2 class="h2clr">Welcome to Packers and Movers System</h2>
					<p class="colorwhite maintxt">
						.Welcome to <strong>Packers and Movers System - Delhi NCR</strong>
						Established in 2015 in the city of pearls (Delhi NCR) and one of
						the largest city of capital gain in India. <strong>Packers
							and Movers in Delhi NCR ( Packers)</strong> is specialized in: within
						India, within state, within city &amp; all India services. You can
						be confident that your household goods will arrive at their
						destinations in the same condition you handed them over to <strong>Movers
							and Packers in Delhi NCR ( Movers)</strong>.
					</p>
					<p class="colorwhite maintxt">
						<strong>Packers and Movers System - Delhi NCR</strong> moves all
						over India to states like Karnataka, Maharashtra, Oddisa, Andhra
						Pradesh, Uttar Pradesh, TamilNadu, Haryana, Madhya Pradesh,
						Gujarat etc...
					</p>
				</div>
			</div>
		</div>
	</div> --%>

	<%-- <div class="container mrtopbtm">
		<div class="row">
			<div
				class="col-lg-5 col-md-5 col-sm-6 col-xs-12 col-md-offset-1  wow fadeInLeftBig"
				data-wow-delay="0.4s">
				<h2>
					<img
						src="${pageContext.request.contextPath}/resources/images/our-quality.jpg"
						width="760" height="352" alt="our quality"
						class="img-responsive img-rounded mrbtm" />Our Quality Assurance
				</h2>
				<p>Quality is the prime focus of Packers and Movers System -
					Delhi NCR and it distinguishes us from our competitors. Packers and
					Movers in Delhi NCR</p>
				<a class="btn btn-default" href="#" role="button">[+] Read more</a>
			</div>
			<div class="col-lg-5 col-md-5 col-sm-6 col-xs-12  wow fadeInRightBig"
				data-wow-delay="0.4s">
				<h2>
					<img
						src="${pageContext.request.contextPath}/resources/images/our-team.jpg"
						width="760" height="352" alt="our quality"
						class="img-responsive img-rounded mrbtm" />Our Team
				</h2>
				<p>Since our inception Packers and Movers System - Delhi NCR is
					engaged in providing services for transportation, relocation and
					other related services</p>
				<a class="btn btn-default" href="#" role="button">[+] Read more</a>
			</div>
		</div>
	</div> --%>

	<%-- <div class="container-fluid wybg pdtopbtm">
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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
								<a href="services.html" class="readmore">[+] Readmore</a>
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

	</div> --%>

	<%-- <div class="container pdtopbtm">
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
	</div> --%>
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

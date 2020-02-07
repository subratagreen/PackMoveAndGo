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
					src="${pageContext.request.contextPath}/resources/images/small-banner.jpg"
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
					src="${pageContext.request.contextPath}/resources/images/small-banner2.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">

			</div>

			<%-- <div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/small-banner3.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">

			</div> --%>

			<%-- <div class="item">
				<img
					src="${pageContext.request.contextPath}/resources/images/small-banner4.jpg"
					alt="Packers and Movers System - Delhi NCR" width="" height="">

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
	<form action="enquiry" method="post" id="contactFrm"
		name="contactFrm">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4 text-center">
					<h3 class="colorcoffee">Get a Free Online Quotation</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
					
				</div>
				<div class="col-md-4 col-md-offset-4">
					<div class="form-group">
						<label for="person_name"> Name</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon  glyphicon-user"></span></span> <input type="text"
								name="person_name" class="form-control" id="person_name"
								placeholder="Enter Your Name" required="required" />
						</div>
					</div>
					
					<div class="form-group">
						<label for="person_ph"> Mobile No :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-phone"></span></span> <input type="number"
								name="person_ph" class="form-control" id="person_ph"
								placeholder="Enter Mobile No" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="person_address"> Address :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="text"
								name="person_address" class="form-control" id="person_address"
								placeholder="Enter Address" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="facility"> Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span>
								 <select
								class="browser-default custom-select form-control"
								required="required" name="branch_id">
								<option selected>Select any one user</option>
								<c:forEach items="${branchList}" var="item">
									<option value="${item.branch_id}">Branch Name :${item.branch_name}, Branch Address:${item.branch_address}, Branch Phone No. :${item.branch_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					<div class="form-group">
						<label for="service_id">Service Type :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="service_id">
								<option selected>Select any one user</option>
								<c:forEach items="${serviceList}" var="item">
									<option value="${item.service_id}">Service Name :${item.service_name},	Service Type :${item.service_type}, Item Per KM :${item.charge_per_km}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					
					<!-- <div class="form-group">
						<label for="movingDate"> Moving Date :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-calendar"></span></span> <input type="date"
								name="date" class="form-control" id="movingDate"
								placeholder="Enter Moving Date" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="movingTo"> Moving To :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-menu-up"></span></span> <input type="text"
								name="to" class="form-control" id="movingTo"
								placeholder="Enter Moving To" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="movingFrom"> Moving From :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-menu-down"></span></span> <input type="text"
								name="from" class="form-control" id="movingFrom"
								placeholder="Enter Moving From" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="message"> Message</label>
						<textarea name="Message" id="message" class="form-control"
							rows="9" cols="25" required="required" placeholder="Message"></textarea>
					</div> -->
				</div>
				<!-- <div class="col-md-9">
					<div class="row">
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">Drawing Room :</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										A/c/Coolers/fan/Table Fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										T.VPortable/full size/Trolley
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Sofa, 2+1
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Table /
										Chairs
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Deewan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Show Case
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Music
										System
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">Centre Room :</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Carpets
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										Writing/Side/Center Table
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Chairs
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Sofa 2+1
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Wall Frames
										/ Clocks
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Sewing
										Machine
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Computer
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Dining Room</strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										A/c/Coolers/fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Dining
										Table (4+1/6+1)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" /> Water Cooler
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" /> Fridge (90/165/180/289 Ltr.)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" />
									</label> Serving Trolly
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" />
									</label> Show Case
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" /> Wall Frames
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="textfield" value=""
										class="formwidth" />
									</label> Chest of Drawer
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">Bed Room 1 :</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										A/c/Coolers/fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										Double/Single Cot (Dism/Fix/Box)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Side Table
										/ Corner Table
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> TV / VCR
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Almirah
										(Big/Small Size)
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Children Room</strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										A/c/Coolers/fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Children
										Cot
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Computer /
										Bookshelf
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										Chairs/Table (Folding /Fixed)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Almirah
										(big / Small)
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Kitchen</strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Exhaust Fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Gas Stove
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Oven /
										Cooking Range
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Utensils
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Wet Grinder
										/ Mixie
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Fridge
										(90/165/180/289 Ltr.)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Crockery
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Microware
									</label>
								</div>
							</div>
						</div>
						<div class="col-md-4 col-sm-6 col-xs-12">
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">Bed Room 2 :</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										A/c/Coolers/fan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Double /
										Single Cot / Deewan
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Mattress
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Dresses
										Table
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Almirah
										(Big/Small Size)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Show Case
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Music
										System
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Misc. items </strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Books
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Clothes
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Flower
										Plots / Vas
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Swing
										(jhoola)
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Suitcases
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Water Drum
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Invertor /
										Battery
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Bath Room </strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Geyser
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Washing
										Machine
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Bathtub
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Cloth Box /
										Stand
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Almirah
										(Big/Small Size)
									</label>
								</div>
							</div>
							<div class="col-sm-12 well wellbg2">
								<h4 class="colorblue">
									<strong>Vehicles</strong> :
								</h4>
								<div class="checkbox">
									<label> <input type="checkbox" value="" />
										Scooter/Motor Cycle/Moped
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Car
									</label>
								</div>
								<div class="checkbox">
									<label> <input type="checkbox" value="" /> Cycle
									</label>
								</div>
							</div>
						</div>
					</div>
				</div> -->
				<div class="col-md-12 text-center mrbtm">
					<input type="submit" name="submit" id="button" value="Submit"
						class="btn btn-primary" /> <input type="reset" name="button2"
						id="button2" value="Reset" class="btn btn-danger" />
				</div>
			</div>
		</div>
	</form>
	<%@include file="footer.jsp"%>


</body>
</html>
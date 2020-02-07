<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="author" content="Kodinger">
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>My Login Page</title>
<spring:url value="/resources/css/bootstrap.min.css"
	var="bootstrapMinCss" />

<spring:url value="/resources/css/animate.css" var="animateCss" />

<spring:url value="/resources/css/custom.css" var="customCss" />

<spring:url value="/resources/js/jquery-3.1.1.js" var="jqueryMinJs" />

<spring:url value="/resources/js/bootstrap.min.js" var="bootstrapMinJs" />

<spring:url value="/resources/js/respond.min.js" var="respondMinJs" />

<spring:url value="/resources/js/wow.min.js" var="wowMinJs" />

<spring:url value="/resources/js/custom.js" var="customJs" />

<spring:url value="/resources/js/datatables-demo.js" var="datatablesJS" />
<script src="${datatablesJS}"></script>

<spring:url value="/resources/datatables/dataTables.bootstrap4.css" var="dataTablesCss" />
<link href="${dataTablesCss}" rel="stylesheet">

<%-- <spring:url value="/resources/css/sb-admin.css" var="sbadminCss" />
<link href="${sbadminCss}" rel="stylesheet"> --%>

<%-- <spring:url value="/resources/fontawesome-free/css/all.min.css" var="allminCss" />
<link href="${allminCss}" rel="stylesheet"> --%>


<link href="${bootstrapMinCss}" rel="stylesheet">
<link href="${animateCss}" rel="stylesheet">
<link href="${customCss}" rel="stylesheet">


<script src="${jqueryMinJs}"></script>
<script src="${bootstrapMinJs}"></script>
<script src="${respondMinJs}"></script>
<script src="${wowMinJs}"></script>
<script src="${customJs}"></script>
<script type="text/javascript">
$(function () {
    setNavigation();
});

function setNavigation() {
    var path = window.location.pathname;
    path = path.replace(/\/$/, "");
    path = decodeURIComponent(path);

    $(".nav a").each(function () {
        var href = $(this).attr('href');
        if (path.substring(0, href.length) === href) {
            $(this).closest('li').addClass('active');
        }
    });
}
</script>

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

</head>
<body>
	<div class="container-fluid yellowbg  wow bounce" data-wow-delay="0.4s">
		<div class="container">
			<div class="marquee">
				<div>
					<span>Welcome to Packers and Movers System Packing and
						Moving Services, Loading and Unloading Services, Car
						Transportation Services, House Hold Relocation Services, Corporate
						Relocation Services</span> <span>We Accept All Debit Cards /
						Credit Cards, Beware of Frauds, 100% Satisfaction, 100% Security,
						Customer Care Support :+91- 9827898278, +91- 9827898278</span>
				</div>
			</div>
		</div>
	</div>


	<div class="container whitebg">
		<!-- <div class="row"> -->

		<%-- <div
				class="col-lg-5 col-md-5 col-sm-4 col-xs-12 logo  wow fadeInLeft"
				data-wow-delay="0.4s">
				<a href="http://www.packersmovers.in"><img
					src="${pageContext.request.contextPath}/resources/images/logo.jpg"
					width="" height="" alt="logo" class="img-responsive" /></a>
			</div> --%>
		<%-- <div
				class="col-lg-3 col-md-3 col-sm-4 col-xs-12 pull-right callus  wow fadeInRight"
				data-wow-delay="0.4s">
				<img
					src="${pageContext.request.contextPath}/resources/images/callus.jpg"
					width="" height="" alt="call us" class="img-responsive pull-right" />
			</div> --%>
		<!-- <div class="col-lg-3 col-md-3 col-sm-4 col-xs-12 pull-right  mrtop  wow fadeInRight" data-wow-delay="0.4s"><img src="images/pan-card-no.jpg" width="612" height="76" alt="call us" class="img-responsive pull-right" /></div>-->

		<!-- </div> -->

	</div>
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="row">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#navbar" aria-expanded="false"
						aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
				</div>
				<div id="navbar" class="navbar-collapse collapse">
					<ul  class="nav navbar-nav">
						<li ><a
							href="${pageContext.request.contextPath}/dashboard">Home</a></li>
						<li><a href="${pageContext.request.contextPath}/advanceSearch">Advance search</a></li>
						<li><a href="${pageContext.request.contextPath}/addBranch">Add Branch</a></li>
						<li><a href="${pageContext.request.contextPath}/addAgent">Add Agent</a></li>
						<li><a href="${pageContext.request.contextPath}/addServices">Add Services</a></li>
						<li><a href="${pageContext.request.contextPath}/addItem">Add Item</a></li>
						<li><a href="${pageContext.request.contextPath}/proofOfDeliverySearch">Proof of delivery</a></li> 
						
						<%-- <li><a href="${pageContext.request.contextPath}/balance">Balance</a></li> --%>
						
						<%-- <li><a href="${pageContext.request.contextPath}/misReport">MIS Reports</a></li> --%>
						<%-- <li><a href="${pageContext.request.contextPath}/databaseBackup">Database Backup</a></li> --%>
						<!--<li><a href="network.html">Network</a></li>-->
						<!-- <li><a href="#">Contact Us</a></li> -->
					</ul>
					<!-- target="_blank" -->
					<ul class="nav navbar-nav navbar-right">
						<li><a href="${pageContext.request.contextPath}/logout"
							><span class=" glyphicon glyphicon-log-out"
								aria-hidden="true"></span> Logout<span class="sr-only">(current)</span></a></li>
					</ul>
				</div>
				<!--/.nav-collapse -->
			</div>
	</nav>
</body>
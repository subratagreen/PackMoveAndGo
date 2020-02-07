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

<script type="text/javascript">
  function show1()
  {
	  var cust_name = document.getElementById("cust_name").value;
	  var qty = document.getElementById("qty").value;
	  window.open("http://localhost:7090/PackMoveAndGo/payOnline?cust_name="+cust_name+"&qty="+qty,'_blank');
	  document.getElementById('button0').disabled = true;
	  document.getElementById("button1").disabled = false;
  }
  
  function show2()
  {
	  document.getElementById('button0').disabled = true;
	  document.getElementById("button1").disabled = false;
	  var cust_name = document.getElementById("cust_name").value;
	  var qty = document.getElementById("qty").value;
	  window.open("http://localhost:7090/PackMoveAndGo/paymentRecvd?cust_name="+cust_name+"&qty="+qty,'_blank');
	
  }
  
  $(function() {
      $( "#dialog" ).dialog();
  });
</script>

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



	<form:form action="fastBooking" method="post" id="contactFrm"
		name="contactFrm" modelAttribute="fastBooking">
		<div class="container mrtopbtm">
			<div class="row">
				<div class="col-sm-4 col-md-offset-4">
					<h3 class="colorcoffee">Fast Online Booking Form</h3>
					<hr />
					<h3 class="colorcoffee">${message}</h3>
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
					<div class="form-group">
						<label for="cust_name"> Customer Name :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-user"></span></span> <input type="text"
								name="cust_name" class="form-control" id="cust_name"
								placeholder="Enter Customer Name" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="cust_ph"> Mobile No :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-phone"></span></span> <input type="number"
								name="cust_ph" class="form-control" id="cust_ph"
								placeholder="Enter Mobile No" required="required" />
						</div>
					</div>

					<div class="form-group">
						<label for="cust_address"> Address :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="text"
								name="cust_address" class="form-control" id="cust_address"
								placeholder="Enter Address" required="required" />
						</div>
					</div>
					<input type="hidden" name="cust_type" value="CUSTOMER" /> 
					<input type="hidden" name="approx_expend" value="30" />

					<div class="form-group">
						<label for="facility"> Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="branch_id">
								<option selected>Select any one user</option>
								<c:forEach items="${branchList}" var="branchItem">
									<option value="${branchItem.branch_id}">${branchItem.branch_name}-${branchItem.branch_address}-${branchItem.branch_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					
					<div class="form-group">
							<label for="monthly"> Booking Date :</label>
							<div class="input-group">
								<span class="input-group-addon"><span
									class="glyphicon glyphicon-calendar"></span></span> <input type="date"
									name="booking_date" class="form-control" id="booking_date"
									placeholder="Enter Booking Date" required="required" />
							</div>
						</div>
					
					<div class="form-group">
						<label for="src_branch">Source Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="src_branch">
								<option selected>Select any one user</option>
								<c:forEach items="${branchList}" var="item">
									<option value="${item.branch_id}">${item.branch_name}-${item.branch_address}-${item.branch_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					
					<div class="form-group">
						<label for="facility">Destination Branch :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="dest_branch">
								<option selected>Select any one user</option>
								<c:forEach items="${branchList}" var="item">
									<option value="${item.branch_id}">${item.branch_name}-${item.branch_address}-${item.branch_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					<div class="form-group">
						<label for="facility">Destination Agent Id :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="dest_agent_id">
								<option selected>Select any one user</option>
								<c:forEach items="${agentList}" var="item">
									<option value="${item.agent_id}">${item.agent_id}-${item.agent_name}-${item.agent_ph}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					
					<div class="form-group">
						<label for="facility">Item :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <select
								class="browser-default custom-select form-control"
								required="required" name="item_id">
								<option selected>Select any one user</option>
								<c:forEach items="${itemList}" var="item">
									<option value="${item.item_id}">${item.item_id}-${item.item_name}-${item.item_type}</option>
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
									<option value="${item.service_id}">Service Id ${item.service_id}-Service Name ${item.service_name}-Service Type ${item.service_type}- Item Per KM ${item.charge_per_km}</option>
								</c:forEach>
							</select>

						</div>
					</div>
					
					<div class="form-group">
						<label for="qty"> Quantity :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="number"
								name="qty" class="form-control" id="qty"
								placeholder="Enter Quantity" required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="pack_load_unload">Pack Load/Unload :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span>
								<select
								class="browser-default custom-select form-control"
								required="required" name="pack_load_unload">
								<option selected value="UNKNOWN">Select any one user</option>
								<option selected value="LOAD" >LOAD </option>
								<option selected value="UNLOAD">UNLOAD</option>
							</select>
						</div>
					</div>
					<div class="form-group">
						<label for="pack_mat_desc">Material Desc :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="text"
								name="pack_mat_desc" class="form-control" id="pack_mat_desc"
								placeholder="Enter Pack Material Desc " required="required" />
						</div>
					</div>
					<!-- <div class="form-group">
						<label for="cost_per_unit">Cost Per Unit :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-home"></span></span> <input type="number"
								name="cost_per_unit" class="form-control" id="cost_per_unit"
								placeholder="Enter Pack Material Desc " required="required" />
						</div>
					</div> -->
					
					<!-- <div class="form-group">
						<label for="docket_number"> Docket Number :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="docket_number" class="form-control"
								id="docket_number" placeholder="Enter Docket Number "
								required="required" />
						</div>
					</div>
					<div class="form-group">
						<label for="quotation_id"> Quotation Id :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="quotation_id" class="form-control"
								id="quotation_id" placeholder="Enter Quotation Id"
								required="required" />
						</div>
					</div>

					<div class="form-group">
						<label for="bill_number"> Bill Number :</label>
						<div class="input-group">
							<span class="input-group-addon"><span
								class="glyphicon glyphicon-envelope"></span></span> <input
								type="number" name="bill_number" class="form-control"
								id="bill_number" placeholder="Enter Bill Number"
								required="required" />
						</div>
					</div>
				</div> -->

				<div class="col-md-12 text-center mrbtm">
					<%	if(session.getAttribute("userType") != null && session.getAttribute("userType").equals("CUSTOMER_USER")){ %>
						<input name="pay online" id="button0" value="pay" class="btn btn-primary" onclick="show1()" />
						<input type="submit" name="submit" id="button1" value="Submit" class="btn btn-primary" disabled/> 
						<input type="reset" name="button2" id="button2" value="Reset" class="btn btn-primary" />
					<% } else if(session.getAttribute("userType") != null && session.getAttribute("userType").equals("SYSTEM_USER")){ %>
						<input name="pay online" id="button0" value="payment Recvd" class="btn btn-primary" onclick="show2()" />
						<input type="submit" name="submit" id="button1" value="Submit" class="btn btn-primary" disabled/> 
						<input type="reset" name="button2" id="button2" value="Reset" class="btn btn-primary" />
					<% }  %>
				</div>
			</div>
		</div>
		</div>
	</form:form>
	<%@include file="footer.jsp"%>

	<div id="dialog" title="Radio Dialog">
    <input type='radio' value='A' name='myRadio'>A
    <input type='radio' value='B' name='myRadio'>B
    <input type='radio' value='C' name='myRadio'>C
	</div>

</body>
</html>
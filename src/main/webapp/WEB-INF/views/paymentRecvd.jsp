<html>
<head>
<title>Merchant Check Out Page</title>

</head>
<body>

<h1>Payment Received...</h1>

<% 
	String cust_name=(String)request.getAttribute("cust_name"); 
	out.print("Payment Received from  - "+ cust_name); %>
	<br><br>
<%	String amount=(String)request.getAttribute("amount");
	out.print("Amount Recvd - "+ amount);
	request.setAttribute("amount",amount); 
	request.setAttribute("cust_name",cust_name);
%>
<br><br><br><br>
<p style="text-align: center">
	Close this window...<br />This window will
	close automatically within 15 second(s).
</p>
<script> 
 setTimeout("window.close()",15000) 
</script>

</body>
</html>
	
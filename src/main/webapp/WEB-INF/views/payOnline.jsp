<html>
    <head>
        <title>Merchant Check Out Page</title>
    </head>
    <body>
        <center><h1>Please do not refresh this page...</h1></center>
         <% 
			String cust_name=(String)request.getAttribute("cust_name"); 
			out.print("Welcome to pay Online - "+ cust_name);%>
			<br><br>
			<%	
			String qty=(String)request.getAttribute("qty");
			int amount = Integer.parseInt(qty) * 100;
			out.print("Amount to be paid - "+ amount);
			request.setAttribute("amount",amount); 
			request.setAttribute("cust_name",cust_name);
			String url = "http://localhost:7090/PackMoveAndGo/payOnlineDone?cust_name="+cust_name+"&amount="+amount;
		%> 
        <form method="post" action="https://securegw-stage.paytm.in/theia/processTransaction?ORDER_ID=order1" name="f1">
            <table border="1">
                <tbody>
                	<input type="hidden" name="cust_name" value="${cust_name}">
                	<input type="hidden" name="qty" value="${qty}">
                    <input type="hidden" name="MID" value="rxazcv89315285244163">
                    <input type="hidden" name="WEBSITE" value="WEBSTAGING">
                    <input type="hidden" name="ORDER_ID" value="order1">
                    <input type="hidden" name="CUST_ID" value="cust123">
                    <input type="hidden" name="MOBILE_NO" value="7777777777">
                    <input type="hidden" name="EMAIL" value="username@emailprovider.com">
                    <input type="hidden" name="INDUSTRY_TYPE_ID" value="Retail">
                    <input type="hidden" name="CHANNEL_ID" value="WEB">
                    <input type="hidden" name="TXN_AMOUNT" value="100.12">
                    <input type="hidden" name="CALLBACK_URL" value=<%out.print(url);%> >
                    <input type="hidden" name="CHECKSUMHASH" value="s1ZWdMJOr1yGiFh1nns2U8sDC9VzgUDHVnQpGpVnHyrrPb6bthwro1Z8AREUKdURK46x3XvFs6Xv7EnoSOLZT29qbZJKXXvyEuEWQIJGkwdf">
                </tbody>
            </table>
        <script type="text/javascript">
            document.f1.submit();
        </script>
        </form>
    </body>
</html>
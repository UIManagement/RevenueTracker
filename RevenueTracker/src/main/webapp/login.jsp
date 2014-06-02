<%@  page import="java.io.*,java.util.*" language="java" contentType="text/html;                      
charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean  id="user" class="user.LoginUser" scope="session"></jsp:useBean>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />

<title>login</title>
</head>
<body>
<!-- Header -->
	<div id="header">
		<div class="shell">
			<br> <br> <span class="right"><FONT
				FACE="Times New Roman" size="5" color="SteelBlue"> Web
					Tracker</FONT> </span><span class="right"></span>


			<!-- Logo + Top Nav -->
			<div id="top">

				<table>
					<tr>
						<td><a href="https://ul-dqs.in/" target="_blank"><img
								src="css/images/copy.png"></img> </a> <span class="centre"> </span>
						</td>

					</tr>
				</table>
			</div>
			<br> <br> <br> <br> <br> <br>
			<!-- End Logo + Top Nav -->
		</div>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<!-- End Header -->

<form method="post" action="Check.jsp">
UserName<input type="text" name="username"  size="20" value="<%=((user.getUsername()==null)?"":user.getUsername())  %>" > <br>      <br>
Password<input type="password" name="password" size="20" value=<%=((user.getPassword()==0)?"":user.getPassword())   %> ><br>
<input type="submit"   value="Submit"  >
</form>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br><br>
<br>
<br>
<br><br>
<br>
<br>
	<!-- Footer -->
	<div id="footer">
		<div class="shell">
			<span class="left"><FONT FACE="Times New Roman"
				color="SteelBlue">© 2014 UL DQS. All rights reserved</FONT> </span> <br>

		</div>
	</div>
	<!-- End Footer -->

</body>
</html>
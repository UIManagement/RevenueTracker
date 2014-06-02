<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manday Entry Page</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.3/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<style>
.ui-datepicker-header {
	background: url('../img/dark_leather.png') repeat 0 0 #000;
	color: #e0e0e0;
	font-weight: bold;
	webkit-box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, 2);
	-moz-box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, .2);
	-box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, .2);
	text-shadow: 1px -1px 0px #000;
	filter: dropshadow(color = #000, offx = 1, offy = -1);
	line-height: 30px;
	border-width: 1px 0 0 0;
	border-style: solid;
	border-color: #111;
}


.ui-datepicker {
	width: 216px;
	height: auto;
	margin: 5px auto 0;
	font: 9pt Arial, sans-serif;
	webkit-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
	-moz-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
	-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
}
</style>
<script>
	$(function() {
		$("#insert\\:startdate").datepicker({
			showOn : "button",
			buttonImage : "images/calendar.gif",
			buttonImageOnly : true,
			changeMonth : true,
			changeYear : true,
			dateFormat : 'yy-mm-dd'
		});
	});
	function box() {

		alert("Updated");
	return true;
	}
	$(function() {
		$("#insert\\:enddate").datepicker({
			showOn : "button",
			buttonImage : "images/calendar.gif",
			buttonImageOnly : true,
			changeMonth : true,
			changeYear : true,
			dateFormat : 'yy-mm-dd'
		});
	});
	
	
</script>






</head>
<body>
	<f:view>


		<h:form id="insert">
	<!-- Header -->
	<div id="header">
		<div class="shell">
			<br/> <br/> <span class="right"><font
				face="Times New Roman" size="5" color="SteelBlue"> Revenue
					Tracker</font> 
					</span> 
					
				<span class="right">	<h:commandLink id="next" action="#{customer.NavigCustomer}">
   <h:graphicImage value="css/images/hom.png" 
		  alt="Next" title="Next"/>
</h:commandLink>
	</span>				
					
					
					
					
<!-- 					<a href="Home.jsp"><img -->
<!-- 					src="css/images/hom.png"></img> </a>  -->


	
					
					
					
					
			<!-- End Logo + Top Nav -->
			<div id="top">

				<table>
					<tr>
						<td><a href="https://ul-dqs.in/" target="_blank"><img
								src="css/images/copy.png"></img> </a></td>

					</tr>
				</table>
			</div>
			<br/> <br/> <br/> <br/> <br/> <br/>
		</div>
	</div>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<!-- End Header -->
	<br/>
	<br/>
	<br/>
<body>
	
			<table class=”tbl” cellpadding=”0″ cellspacing=”0″ border=”0″>

				<tr>
					<td><b> <h:outputLabel value="Customer Name::"
								for="customer_Name" />
					</b></td>
					<td><h:message id="customerIDMessage" for="customer_Name" /> <h:inputText
							id="customer_Name" value="#{customer.customer_Name}"
							required="true" />
					</td>
				</tr>


			</table>
  &nbsp;&nbsp;<br/>

			<h:outputLabel value="StartDate" for="startDatePicker" />
			<h:inputText id="startdate" onfocus="calendar()"
				value="#{customer.datea}"></h:inputText>
			<h:outputLabel value="EndDate" for="endDatePicker" />
			<h:inputText id="enddate" value="#{customer.dateb}">
			</h:inputText>
   &nbsp;
  
 <h:commandButton value="Report" action="#{customer.Entrycustomer}"   >

			</h:commandButton>




			<br/>
			<br/>
			<br/>
			<h:dataTable value="#{customer.custInfoAll}" var="custInfo"
				styleClass="order-table" headerClass="order-table-header" border="5"
				rowClasses="order-table-odd-row,order-table-even-row">

				<h:column>
					<f:facet name="header">
						<h:outputText value="Date" />

					</f:facet>
					<h:outputText value="#{custInfo.datec}">
					</h:outputText>

					<h:outputLabel value="Manday::" for="mandayvalue" />
					<h:message id="mandayvalueMessage" for="mandayvalue" />
					<h:inputText id="mandayvalue" value="#{custInfo.mandayvalue}"
						 />

					
				</h:column>
			</h:dataTable>
			<br/>
			<br/>
			<h:commandButton action="#{customer.updateAction}" value="Update Mandays"   rendered="true"  onclick="box()"  >
			
				 <f:setPropertyActionListener target="#{customer.custInfoAll}" value="custInfo" />
				 </h:commandButton>
				 
				 
  &nbsp;&nbsp;
 <h:commandButton value="reset" type="reset" />

		</h:form>
		
		
	</f:view>
<br/>
<br/>
<br/>
<br/>
	<br/>
	<!-- Footer -->
	<div id="footer">
		<div class="shell">
			<span class="left"><font face="Times New Roman"
				color="SteelBlue">© 2014 UL DQS. All rights reserved</font>
			</span> <br/>

		</div>
	</div>
	<!-- End Footer -->

</body>

</html>
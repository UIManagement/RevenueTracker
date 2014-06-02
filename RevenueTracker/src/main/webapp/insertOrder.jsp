<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Edit Page</title>
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
	-webkit-box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, 2);
	-moz-box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, .2);
	box-shadow: inset 0px 1px 1px 0px rgba(250, 250, 250, .2);
	text-shadow: 1px -1px 0px #000;
	filter: dropshadow(color =   #000, offx =   1, offy =   -1);
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
	-webkit-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
	-moz-box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
	box-shadow: 0px 0px 10px 0px rgba(0, 0, 0, .5);
}





</style>






<script>
$(function() {
	$("#insertorderBooking\\:orderBookingdate").datepicker({
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


		<h:form id="insertorderBooking">
	<!-- Header -->
	<div id="header">
		<div class="shell">
			<br/> <br/> <span class="right"><font
				face="Times New Roman" size="5" color="SteelBlue"> Order Booking
					Tracker</font> 
					</span> 
					
				<span class="right">	<h:commandLink id="next" action="#{orderBooking.NavigQuote}">
   <h:graphicImage value="css/images/hom.png" 
		  alt="Next" title="Next"/>
</h:commandLink>
	</span>			
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
	
	<!-- End Header -->
	<br/>
	<br/>
	<br/>
<body>
	
			<table class=”tbl” cellpadding=”0″ cellspacing=”0″ border=”0″         >

				<tr>
					<td><b> <h:outputLabel value="BR::"for="bR" /> </b>
					</td>
					<td><h:message id="bRMessage" for="bR" />
						<h:inputText id="bR1" value="#{orderBooking.bR}"
							 /></td>
				</tr>
				<tr>
					<td><b> <h:outputLabel value="Customer Name::"
								for="customer_Name" /> </b>
					</td>
					<td><h:message id="customerIDMessage" for="customer_Name" />
						<h:inputText id="customer_Name" value="#{orderBooking.customer_Name}"
							 /></td>
				</tr>

				<tr>
					<td><b> <h:outputLabel value="Customer Type::"
								for="customer_Type" /> </b></td>
					<td><h:message id="CustomerTypeMessage" for="customer_Type" />
						<h:inputText id="customer_Type" value="#{orderBooking.customer_Type}"
							 rendered="#{orderBooking.customer_Type == 'seven'}" />
						<h:selectOneMenu value="#{orderBooking.customer_Type}">
							<f:selectItem itemValue="New" itemLabel="New" />
							<f:selectItem itemValue="Existing" itemLabel="Existing" />
							<f:selectItem itemValue="InterCompany" itemLabel="InterCompany" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here "
								itemLabel="please select any one of the values from the drop down here " />
						</h:selectOneMenu>
					</td>
				</tr>

				<tr>
					<td><b> <h:outputLabel value="Region::" for="region" /> </b>
					</td>
					<td><h:message id="CustomerAddressMessage" for="region" /> <h:inputText
							id="region" value="#{orderBooking.region}" 
							rendered="#{orderBooking.region == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.region}">
							<f:selectItem itemValue="Aerospace" itemLabel="Aerospace" />
							<f:selectItem itemValue="C&I(R)" itemLabel="C&I(R)" />
							<f:selectItem itemValue="Gujarat" itemLabel="Gujarat" />
							<f:selectItem itemValue="Maharashtra" itemLabel="Maharashtra" />
							<f:selectItem itemValue="North & East" itemLabel="North & East" />
							<f:selectItem itemValue="South-1" itemLabel="South-1" />
							<f:selectItem itemValue="South-2" itemLabel="South-2" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here "
								itemLabel="please select any one of the values from the drop down here " />
						</h:selectOneMenu>
					</td>
				</tr>



		<tr>
					<td><b> <h:outputLabel value="vertical::" for="vertical" />
					</b></td>
					<td><h:message id="CustomerverticalMessage" for="vertical" />
						<h:inputText id="vertical" value="#{orderBooking.vertical}"
							 rendered="#{orderBooking.vertical == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.vertical}">
							<f:selectItem itemValue="Aerospace" itemLabel="Aerospace" />
							<f:selectItem itemValue="Medical & Healthcare"
								itemLabel="Medical & Healthcare" />
							<f:selectItem itemValue="Energy" itemLabel="Energy" />
							<f:selectItem itemValue="RC 14001" itemLabel="RC 14001" />
							<f:selectItem itemValue="C&I (V)" itemLabel="C&I (V)" />
							<f:selectItem itemValue="Others" itemLabel="Others" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>


				<tr>
					<td><b> <h:outputLabel value="Industry::" for="industry" />
					</b></td>
					<td><h:message id="CustomerindustryMessage" for="industry" />
						<h:inputText id="industry" value="#{orderBooking.industry}"
							 rendered="#{orderBooking.industry == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.industry}">
							<f:selectItem itemValue="Aerospace" itemLabel="Aerospace" />
							<f:selectItem itemValue="Automotive" itemLabel="Automotive" />
							<f:selectItem itemValue="Banking, Financial Services & Insurance"
								itemLabel="Banking, Financial Services & Insurance" />
							<f:selectItem itemValue="Chemical & Fertilizers"
								itemLabel="Chemical & Fertilizers" />
							<f:selectItem itemValue="Consumer Durables & Non-Durables"
								itemLabel="Consumer Durables & Non-Durables" />
							<f:selectItem itemValue="Clinical Research"
								itemLabel="Clinical Researchhers" />
							<f:selectItem itemValue="Defence" itemLabel="Defence" />
							<f:selectItem itemValue="Educational Institutions"
								itemLabel="Educational Institutions" />
							<f:selectItem itemValue="Engineering" itemLabel="Engineering" />
							<f:selectItem itemValue="Food & Water" itemLabel="Food & Water" />
							<f:selectItem itemValue="Healthcare" itemLabel="Healthcare" />
							<f:selectItem itemValue="Hospitality" itemLabel="Hospitality" />
							<f:selectItem itemValue="Infrastructure & Cement"
								itemLabel="Infrastructure & Cement" />
							<f:selectItem itemValue="IT &ITES" itemLabel="IT &ITES" />
							<f:selectItem itemValue="Medical Devices"
								itemLabel="Medical Devices" />
							<f:selectItem itemValue="Oil & Gas" itemLabel="Oil & Gas" />
							<f:selectItem itemValue="Pharmaceutical"
								itemLabel="Pharmaceutical" />
							<f:selectItem itemValue="Power & Energy"
								itemLabel="Power & Energy" />
							<f:selectItem itemValue="Retail" itemLabel="Retail" />
							<f:selectItem itemValue="Railways" itemLabel="Railways" />
							<f:selectItem itemValue="Steel" itemLabel="Steel" />
							<f:selectItem itemValue="Supply Chain & Logistics"
								itemLabel="Supply Chain & Logistics" />
							<f:selectItem itemValue="Textiles" itemLabel="Textiles" />
							<f:selectItem itemValue="Electrical & Electronics"
								itemLabel="Electrical & Electronics" />
							<f:selectItem itemValue="Others" itemLabel="Others" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>


				


				

				


				


				<tr>
					<td><b> <h:outputLabel value="Service::" for="service" />
					</b></td>
					<td><h:message id="CustomerserviceMessage" for="service" /> <h:inputText
							id="service1" value="#{orderBooking.service}" 
							rendered="#{orderBooking.service == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.service}">
							<f:selectItem itemValue="RA" itemLabel="RA" />
							<f:selectItem itemValue="GC Mark" itemLabel="GC Mark" />
							<f:selectItem itemValue="CA" itemLabel="CA" />
							<f:selectItem itemValue="TRA" itemLabel="TRA" />
							<f:selectItem itemValue="KSC Inhouse" itemLabel="KSC Inhouse" />
							<f:selectItem itemValue="KSC Openhouse" itemLabel="KSC Openhouse" />
							<f:selectItem itemValue="KSC Special assessment"
								itemLabel="KSC Special assessment" />
							<f:selectItem itemValue="KSC Solution" itemLabel="KSC Solution" />
							<f:selectItem itemValue="KSC MTS" itemLabel="KSC MTS" />
							<f:selectItem itemValue="PPP" itemLabel="PPP" />
							<f:selectItem itemValue="Safety" itemLabel="Safety" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>




				<tr>
					<td><b> <h:outputLabel value="Product::" for="product" />
					</b></td>
					<td><h:message id="CustomerproductMessage" for="produc" /> <h:inputText
							id="product1" value="#{orderBooking.product}" 
							rendered="#{orderBooking.product == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.product}">
							<f:selectItem itemValue="ANSI/ESD S 20.20"
								itemLabel="ANSI/ESD S 20.20" />
							<f:selectItem itemValue="AS 9100" itemLabel="AS 9100" />
							<f:selectItem
								itemValue="AS 9100 Rev.C Internal Auditor Training Program"
								itemLabel="AS 9100 Rev.C Internal Auditor Training Program" />
							<f:selectItem itemValue="CUSTOMER SPECIFIC REQUIREMENT"
								itemLabel="CUSTOMER SPECIFIC REQUIREMENT" />
							<f:selectItem itemValue="EHS Internal Auditor Program"
								itemLabel="EHS Internal Auditor Program" />
							<f:selectItem itemValue="EHS Legal Requirements"
								itemLabel="EHS Legal Requirements" />
							<f:selectItem itemValue="ENERGY AUDIT" itemLabel="ENERGY AUDIT" />
							<f:selectItem itemValue="GC Mark" itemLabel="GC Mark" />
							<f:selectItem itemValue="IRIS" itemLabel="IRIS" />
							<f:selectItem itemValue="ISO 13485" itemLabel="ISO 13485" />
							<f:selectItem itemValue="ISO 14001" itemLabel="ISO 14001" />
							<f:selectItem itemValue="ISO 14001 & OHSAS 18001"
								itemLabel="ISO 14001 & OHSAS 18001" />
							<f:selectItem itemValue="ISO 20001" itemLabel="ISO 20001" />
							<f:selectItem itemValue="ISO 27000" itemLabel="ISO 27000" />
							<f:selectItem itemValue="ISO 29001" itemLabel="ISO 29001" />
							<f:selectItem itemValue="ISO 50001" itemLabel="ISO 50001" />
							<f:selectItem itemValue="ISO 9000, ISO 14000 & ISO 18000"
								itemLabel="ISO 9000, ISO 14000 & ISO 18000" />
							<f:selectItem itemValue="ISO 9001 / TS 16949"
								itemLabel="ISO 9001 / TS 16949" />
							<f:selectItem itemValue="ISO 9001/ ISO 27001"
								itemLabel="ISO 9001/ ISO 27001" />
							<f:selectItem
								itemValue="ISO/TS 16949 Internal Auditor Training Program"
								itemLabel="ISO/TS 16949 Internal Auditor Training Program" />
							<f:selectItem itemValue="ISO9001 & ISO14001 & OHSAS18001"
								itemLabel="ISO9001 & ISO14001 & OHSAS18001" />
							<f:selectItem itemValue="ISO9001 & ISO14001& OHSAS18001 & RC"
								itemLabel="ISO9001 & ISO14001& OHSAS18001 & RC" />
							<f:selectItem itemValue="OHSAS 18001" itemLabel="OHSAS 18001" />
							<f:selectItem itemValue="RC 14001" itemLabel="RC 14001" />
							<f:selectItem itemValue="Safety Excellence"
								itemLabel="Safety Excellence" />
							<f:selectItem itemValue="Statistical Process Control (SPC)"
								itemLabel="Statistical Process Control (SPC)" />
							<f:selectItem itemValue="Third Party Inspections"
								itemLabel="Third Party Inspections" />
							<f:selectItem itemValue="TL 9000" itemLabel="TL 9000" />
							<f:selectItem itemValue="TS 16949" itemLabel="TS 16949" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>



				

				<tr>
					<td><b> <h:outputLabel value="Designation::"
								for="designation" /> </b></td>
					<td><h:message id="CustomerdesignationMessage"
							for="designation" /> <h:inputText id="designation"
							value="#{orderBooking.designation}" 
							rendered="#{orderBooking.designation == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.designation}">
							<f:selectItem itemValue="Sales Executive - Existing"
								itemLabel="Sales Executive - Existing" />
							<f:selectItem itemValue="CSP" itemLabel="CSP" />
							<f:selectItem itemValue="SRH" itemLabel="SRH" />
							<f:selectItem itemValue="TRA" itemLabel="TRA" />
							<f:selectItem itemValue="Auditor" itemLabel="Auditor" />
							<f:selectItem itemValue="Business Head" itemLabel="Business Head" />
							<f:selectItem itemValue="Vertical Head" itemLabel="Vertical Head" />
							<f:selectItem itemValue="RSH" itemLabel="RSH" />
							<f:selectItem itemValue="SE - T & S" itemLabel="SE - T & S" />
							<f:selectItem itemValue="Sales Executive - New"
								itemLabel="Sales Executive - New" />
							<f:selectItem itemValue="Sales Support" itemLabel="Sales Support" />
							<f:selectItem itemValue="TL-New" itemLabel="TL-New" />
							<f:selectItem itemValue="TL-Existing" itemLabel="TL-Existing" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>



				<tr>
					<td><b> <h:outputLabel value="Quote Booked By::"
								for="orderBooking_Booked_By" /> </b></td>
					<td><h:message id="orderBooking_Booked_ByMessage"
							for="orderBooking_Booked_By" /> <h:inputText id="orderBooking_Booked_By"
							value="#{orderBooking.order_Booked_By}" 
							rendered="#{orderBooking.order_Booked_By == 'seven'}" /> <h:selectOneMenu
							value="#{orderBooking.order_Booked_By}">
							<f:selectItem itemValue="Subhendu" itemLabel="Subhendu" />
							<f:selectItem itemValue="Avijit Choudary"
								itemLabel="Avijit Choudary" />
							<f:selectItem itemValue="Girish" itemLabel="Girish" />
							<f:selectItem itemValue="Hema" itemLabel="RC Hema" />
							<f:selectItem itemValue="Jawahar" itemLabel="Jawahar" />
							<f:selectItem itemValue="Manik" itemLabel="Manik" />
							<f:selectItem itemValue="Rajesh" itemLabel="Rajesh" />
							<f:selectItem itemValue="Ravi" itemLabel="Ravi" />
							<f:selectItem itemValue="Shilpa" itemLabel="Shilpa" />
							<f:selectItem itemValue="Amit Tiwari" itemLabel="Amit Tiwari" />
							<f:selectItem itemValue="Pramod" itemLabel="Pramod" />
							<f:selectItem itemValue="Venkat" itemLabel="Venkat" />
							<f:selectItem itemValue="Sreeja" itemLabel="Sreeja" />
							<f:selectItem itemValue="Ajit" itemLabel="Ajit" />
							<f:selectItem itemValue="Arpit" itemLabel="Arpit" />
							<f:selectItem itemValue="Balram Singla" itemLabel="Balram Singla" />
							<f:selectItem itemValue="Parag" itemLabel="Parag" />
							<f:selectItem itemValue="Rohit" itemLabel="Rohit" />
							<f:selectItem itemValue="Subhash" itemLabel="Subhash" />
							<f:selectItem itemValue="Vinayak" itemLabel="Vinayak" />
							<f:selectItem itemValue="Naveen" itemLabel="Naveen" />
							<f:selectItem itemValue="Rashmi" itemLabel="Rashmi" />
							<f:selectItem itemValue="Amit Jani" itemLabel="Amit Jani" />
							<f:selectItem itemValue="Bharathi" itemLabel="Bharathi" />
							<f:selectItem itemValue="Juhi" itemLabel="Juhi" />
							<f:selectItem itemValue="Madhura Joshi" itemLabel="Madhura Joshi" />
							<f:selectItem itemValue="Vibha" itemLabel="Vibha" />
							<f:selectItem itemValue="Baldau Ji" itemLabel="Baldau Ji" />
							<f:selectItem itemValue="G Ramanathan" itemLabel="G Ramanathan" />
							<f:selectItem itemValue="Sunil Korde" itemLabel="Sunil Korde" />
							<f:selectItem itemValue="Varun Kamble" itemLabel="Varun Kamble" />
							<f:selectItem itemValue="Dhanalakshmi " itemLabel="Dhanalakshmi " />
							<f:selectItem itemValue="Anil" itemLabel="Anil" />
							<f:selectItem itemValue="Dwarakanath" itemLabel="Dwarakanath" />
							<f:selectItem itemValue="Mukesh" itemLabel="Mukesh" />
							<f:selectItem itemValue="Anisha" itemLabel="Anisha" />
							<f:selectItem itemValue="Sumanth Kulkarni"
								itemLabel="Sumanth Kulkarni" />
							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />

						</h:selectOneMenu>
					</td>
				</tr>












				


				
<tr>
					<td><b> <h:outputLabel value="currency::" for="currency" />
					</b></td>
					<td><h:message id="CustomercurrencyMessage" for="currency" />
						<h:inputText id="currency" value="#{orderBooking.currency}"
							 rendered="#{orderBooking.currency == 'seven'}" />
							  <h:selectOneMenu
							value="#{orderBooking.currency}">
							<f:selectItem itemValue="INR" itemLabel="INR" />
							<f:selectItem itemValue="USD" itemLabel="USD" />
							<f:selectItem itemValue="EUR" itemLabel="EUR" />
							<f:selectItem itemValue="GBP" itemLabel="GBP" />
							<f:selectItem itemValue="JBY" itemLabel="JBY" />

							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>

				
				<tr>
					<td><b> <h:outputLabel value="Exchange Rate::"
								for="exchange_Rate" /> </b></td>
					<td><h:message id="exchange_RateMessage" for="exchange_Rate" />
						<h:inputText id="exchange_Rate" value="#{orderBooking.exchange_Rate}"
							 />
					</td>
				</tr>
				<tr>
				
				<tr>
					<td><b> <h:outputLabel value="Starting Month::" for="starting_month" />
					</b></td>
					<td><h:message id="starting_monthMessage" for="starting_month" />
						<h:inputText id="starting_month" value="#{orderBooking.starting_month}"
							 rendered="#{orderBooking.starting_month == 'seven'}" />
							  <h:selectOneMenu
							value="#{orderBooking.starting_month}">
							<f:selectItem itemValue="Jan" itemLabel="Jan" />
							<f:selectItem itemValue="Feb" itemLabel="Feb" />
							<f:selectItem itemValue="Mar" itemLabel="Mar" />
							<f:selectItem itemValue="Apr" itemLabel="Apr" />
							<f:selectItem itemValue="May" itemLabel="May" />
							<f:selectItem itemValue="June" itemLabel="June" />
							<f:selectItem itemValue="July" itemLabel="July" />

							<f:selectItem
								itemValue="please select any one of the values from the drop down here"
								itemLabel="please select any one of the values from the drop down here" />
						</h:selectOneMenu>
					</td>
				</tr>
				<tr>
					<td><b> <h:outputLabel value="work Order Date ::"
								for="work_Order_Date" /> </b></td>
					<td><h:message id="work_Order_DateMessage"
							for="work_Order_Date" /> <h:inputText id="orderBookingdate"
							value="#{orderBooking.work_Order_Date}"  />
					</td>
				</tr>
				<tr>
					<td><b> <h:outputLabel value="order_Mandays::"
								for="order_Mandays" /> </b></td>
					<td><h:message id="order_MandaysMessage"
							for="order_Mandays" /> <h:inputText id="order_Mandays"
							value="#{orderBooking.order_Mandays}"  />
					</td>
				</tr>
				
				
				
				
				
			<tr>
					<td><b> <h:outputLabel value="Order Value ::"
								for="order_Value" /> </b></td>
					<td><h:message id="order_ValueMessage" for="order_Value" /> <h:inputText
 							id="order_Value" value="#{orderBooking.order_Value}"  /> 
					</td>
				</tr>

<tr>
					<td><b> <h:outputLabel value="Updated Order Value::"
								for="updated_Order_Value" /> </b></td>
					<td><h:message id="mandayvalue1Message1" for="updated_Order_Value" /> <h:inputText
							id="updated_Order_Value" value="#{orderBooking.updated_Order_Value}" readonly="true"  />
					</td>
				</tr>
			</table>
			<h:commandButton action="#{orderBooking.addAction}" value="Update" />&nbsp;&nbsp;
			
			
		
  &nbsp;&nbsp;
 <h:commandButton value="reset" type="reset" />


		</h:form>
	</f:view>


	<br/>
	<!-- Footer -->
	<div id="footer">
		<div class="shell">
			<span class="left"><font face="Times New Roman"
				color="SteelBlue">© 2014 UL DQS. All rights reserved</font> </span> <br/>

		</div>
	</div>
	<!-- End Footer -->

</body>

</html>
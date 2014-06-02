<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="css/style.css" type="text/css" media="all" />
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
	filter: dropshadow(color =            
		                                                      
		                 #000, offx =                      
		 
		      
		                    
		                                1, offy =   
		                                
		          
		                                     -1);
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
		$("#order\\:startdate").datepicker({
			showOn : "button",
			buttonImage : "images/calendar.gif",
			buttonImageOnly : true,
			changeMonth : true,
			changeYear : true,
			dateFormat : 'yy-mm-dd'
		});
	});

	$(function() {
		$("#order\\:enddate").datepicker({
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


		<h:form id="order">
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
					
					
					
					
<!-- 					<a href="Home.jsp"><img -->
<!-- 					src="css/images/hom.png"></img> </a>  -->


	
					
					
					
					
					
			<!-- Logo + Top Nav -->
				
	
			<div id="top">

				<table>
					<tr>
						<td><a href="https://ul-dqs.in/" target="_blank"><img
								src="css/images/copy.png"></img> </a></td>

					</tr>
				</table>
			</div>
			<br/> <br/> <br/> <br/> <br/> <br/>
			<!-- End Logo + Top Nav -->
		</div>
	</div>
	<br/>
	<br/>
	
	
	<!-- End Header -->
	
	

 

			<tr>
				<td><b> <h:outputLabel value="Customer Name"
							for="customer_Name" /> </b> <h:message id="customerNameMessage"
						for="customer_Name" /> <h:inputText id="customer_Name"
						value="#{orderBooking.searchName}" /></td>
			</tr>





			<h:commandButton value="Search" action="#{orderBooking.ResultOrder}"
				rendered="true" />
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				
		
			 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<a href="addNewOrder.jsp">Add New Customer</a>
			
			
 <br/><br/>
 
   
  
<tr>
				<td><b> <h:outputLabel value="Customer Type"
							for="customer_Type" /> </b>
				</td>
				<td><h:selectOneMenu value="#{orderBooking.searchName1}" >
						<f:selectItem itemValue="" itemLabel="" />
						<f:selectItem itemValue="All" itemLabel="All" />
						<f:selectItem itemValue="New" itemLabel="New" />

						<f:selectItem itemValue="Existing" itemLabel="Existing" />
						<f:selectItem itemValue="InterCompany" itemLabel="InterCompany" />
					</h:selectOneMenu> <h:message id="ordercustomerTypeMessage" for="customer_Type" /></td>
			</tr>

			<tr>
				<td><b> <h:outputLabel value="Region" for="region" /> </b>
				</td>
				<td><h:selectOneMenu value="#{orderBooking.searchName2}">
						<f:selectItem itemValue="" itemLabel="" />
						<f:selectItem itemValue="Aerospace" itemLabel="Aerospace" />
						<f:selectItem itemValue="C&I (R) " itemLabel="C&I (R) " />
						<f:selectItem itemValue="Gujarat" itemLabel="Gujarat" />
						<f:selectItem itemValue="Maharashtra" itemLabel="Maharashtra" />
						<f:selectItem itemValue="North & East" itemLabel="North & East" />
						<f:selectItem itemValue="South-1" itemLabel="South-1" />
						<f:selectItem itemValue="South-2" itemLabel="South-2" />
					</h:selectOneMenu> <h:message id="orderregionMessage" for="region" /></td>
			</tr>

		
			
			

 <tr>
				<td><b> <h:outputLabel value="Vertical" for="vertical" /> </b>
				</td>
				<td><h:selectOneMenu value="#{orderBooking.searchName3}">
				<f:selectItem itemValue="" itemLabel="" />
						<f:selectItem itemValue="Aerospace" itemLabel="Aerospace" />
							<f:selectItem itemValue="Medical & Healthcare"
								itemLabel="Medical & Healthcare" />
							<f:selectItem itemValue="Energy" itemLabel="Energy" />
							<f:selectItem itemValue="RC 14001" itemLabel="RC 14001" />
							<f:selectItem itemValue="C&I (V)" itemLabel="C&I (V)" />
							<f:selectItem itemValue="Others" itemLabel="Others" />
							</h:selectOneMenu> <h:message id="verticalMessage" for="vertical" /></td>
			</tr>
		<tr>
				<td><b> <h:outputLabel value="Service" for="service" /> </b>
				</td>
				<td><h:selectOneMenu value="#{orderBooking.searchName4}">
				<f:selectItem itemValue="" itemLabel="" />
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
					</h:selectOneMenu> <h:message id="orderCustomerserviceMessage" for="service" /></td>
			</tr>		 
 
  <h:outputLabel value="StartDate" for="startDatePicker" />

			<h:inputText id="startdate" onfocus="calendar()"
				value="#{orderBooking.startDate}"     ></h:inputText>
			<h:outputLabel value="EndDate" for="endDatePicker" />
			<h:inputText id="enddate" value="#{orderBooking.endDate}"    >
			</h:inputText>
			
			<h:commandButton value="Go" action="#{orderBooking.DropDowns}" />
			 

			<br/>
			<br/>
			<br/>
<div style="height:300px;overflow-x:auto;overflow-y:scroll;">

                               
			<h:dataTable value="#{orderBooking.custInfoAll}" var="custInfo"
				styleClass="order-table" headerClass="order-table-header" border="5"
				rowClasses="order-table-odd-row,order-table-even-row"  footerClass="order-table-footer" >

				
				<h:column>
					<f:facet name="header">
						<h:outputText value="BR" />
					</f:facet>
					<h:outputText value="#{custInfo.bR}">
					</h:outputText>
				</h:column>
				
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="customer Name" />
					</f:facet>
					<h:outputText value="#{custInfo.customer_Name}">
					</h:outputText>
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="customer Type" />
					</f:facet>
					<h:outputText value="#{custInfo.customer_Type}">
					</h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Region" />
					</f:facet>
					<h:outputText value="#{custInfo.region}">
					</h:outputText>
				</h:column>
<h:column>
					<f:facet name="header">
						<h:outputText value="Vertical" />
					</f:facet>
					<h:outputText value="#{custInfo.vertical}">
					</h:outputText>
				</h:column>
				<h:column>
					<f:facet name="header">
						<h:outputText value="Industry" />
					</f:facet>
					<h:outputText value="#{custInfo.industry}">
					</h:outputText>
				</h:column>


				

				<h:column>
					<f:facet name="header">
						<h:outputText value="Service" />
					</f:facet>
					<h:outputText value="#{custInfo.service}">

					</h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Product" />
					</f:facet>
					<h:outputText value="#{custInfo.product}">

					</h:outputText>
				</h:column>
				

				<h:column>
					<f:facet name="header">
						<h:outputText value="Designation" />
					</f:facet>
					<h:outputText value="#{custInfo.designation}">

					</h:outputText>

				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Order Booked By" />
					</f:facet>
					<h:outputText value="#{custInfo.order_Booked_By}">

					</h:outputText>

				</h:column>

			

				<h:column>
					<f:facet name="header">
						<h:outputText value="Currency" />
					</f:facet>
					<h:outputText value="#{custInfo.currency}">
					</h:outputText>
				</h:column>

				

				<h:column>
					<f:facet name="header">
						<h:outputText value="Exchange Rate" />
					</f:facet>
					<h:outputText value="#{custInfo.exchange_Rate}">
					</h:outputText>
				</h:column>

				

				
				<h:column>
					<f:facet name="header">
						<h:outputText value="Start Month " />
					</f:facet>
					<h:outputText value="#{custInfo.starting_month}">
					</h:outputText>
				</h:column>

				<h:column>
					<f:facet name="header">
						<h:outputText value="Work Order Date " />
					</f:facet>
					<h:outputText value="#{custInfo.work_Order_Date}">
					</h:outputText>
				</h:column>
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="Order Value " />
					</f:facet>
					<h:outputText value="#{custInfo.order_Value}">
					</h:outputText>
				</h:column>
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="Order Mandays " />
					</f:facet>
					<h:outputText value="#{custInfo.order_Mandays}">
					</h:outputText>
					<f:facet name="footer">
						<h:outputText value="#{orderBooking.sum_om}" />

					</f:facet>
				</h:column>
				
				<h:column>
					<f:facet name="header">
						<h:outputText value="updated OrderValue " />
					</f:facet>
					<h:outputText value="#{custInfo.updated_Order_Value}">
					</h:outputText>
					<f:facet name="footer">
						<h:outputText value="#{orderBooking.sum_up}" />

					</f:facet>
					
				</h:column>
				
				
				<h:column>
			<h:outputText value="#{rowCounter.row}" />
		</h:column>
			
				<h:column>

					<f:facet name="header">

						<h:outputLabel value="Edit" />

					</f:facet>

					<h:commandButton value="edit" action="#{orderBooking.EditCustomer}"
						image="css/images/edit.gif">
						<f:setPropertyActionListener target="#{orderBooking}"
							value="#{custInfo}" />

					</h:commandButton>

				</h:column>

				

  	 	
			</h:dataTable>
			
		
				
			
			 </div>
			 <b> <h:outputLabel value="Count"
							for="row" /> </b> <h:message id="rowMessage"
						for="row" /> <h:outputText id="row"
						value="#{rowCounter.row}" />
		
			<br/>


		</h:form>
		
	</f:view>

	
	<br/>
	<br/>
	
	<!-- Footer -->
	<div id="footer">
		<div class="shell">
			<span class="left"><font face="Times New Roman"
				color="SteelBlue"> © 2014 UL DQS. All rights reserved</font> </span> <br/>

		</div>
	</div>
	<!-- End Footer -->

</body>

</html>
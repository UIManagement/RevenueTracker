package bean;

import java.sql.*;
import java.sql.Date;

import java.util.*;

import javax.faces.context.FacesContext;

public class OrderBooking {
	
	

	
	
	//private String work_Order_Date;order_booking_tracker_id2	
private String customer_Name;
private String order_booking_tracker_id2;

private String customer_Type;
	private String region;
	private String vertical;
	private String industry;
	
	private String service;
	private String product;
	
	private String designation;
	private String order_Booked_By;
	
	private String currency;
	
	private double exchange_Rate=1.00;
	
	private String starting_month;
	private String work_Order_Date;
	private int bR;
	
	private double order_Value;
	private double order_Mandays ;
	private double updated_Order_Value;
	
	private double sum_up;
	private double sum_om;
	private String startDate;
	

	private String endDate;
	
	

	private String searchName;
	private String searchName1;
	private String searchName2;
	private String searchName3;
	private String searchName4;
	
	private List<OrderBooking> custInfoAll = new ArrayList<OrderBooking>();
	
	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public double getsum_om() {
		return sum_om;
	}

	public void setsum_om(double sum_om) {
		this.sum_om = sum_om;
	}
	
	public String getorder_booking_tracker_id2() {
		return order_booking_tracker_id2;
	}

	public void setorder_booking_tracker_id2(String order_booking_tracker_id2) {
		this.order_booking_tracker_id2 = order_booking_tracker_id2;
	}

	
	
	
	public String getwork_Order_Date() {
		return work_Order_Date;
	}

	public void setwork_Order_Date(String work_Order_Date) {
		this.work_Order_Date = work_Order_Date;
	}
	
	public int getbR() {
		return bR;
	}

	public void setbR(int bR) {
		this.bR = bR;
	}
	
	public String getvertical() {
		return vertical;
	}

	public void setvertical(String vertical) {
		this.vertical = vertical;
	}
	
	public String getindustry() {
		return industry;
	}

	public void setindustry(String industry) {
		this.industry = industry;
	}
	
	public double getorder_Mandays() {
		return order_Mandays;
	}

	public void setorder_Mandays(double order_Mandays) {
		this.order_Mandays = order_Mandays;
	}
	public double getupdated_Order_Value() {
		return updated_Order_Value;
	}

	public void setupdated_Order_Value(double updated_Order_Value) {
		this.updated_Order_Value = updated_Order_Value;
	}
	
	
	public double getorder_Value() {
		return order_Value;
	}

	public void setorder_Value(double order_Value) {
		this.order_Value = order_Value;
	}
	

	public String getcustomer_Name() {
		return customer_Name;
	}

	public void setcustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	

	public String getcustomer_Type() {
		return customer_Type;
	}

	public void setcustomer_Type(String customer_Type) {
		this.customer_Type = customer_Type;
	}

	public String getSearchName() {
		return searchName;
	}

	public void setSearchName(String searchName) {
		this.searchName = searchName;
	}

	public String getSearchName1() {
		return searchName1;
	}

	public void setSearchName1(String searchName1) {
		this.searchName1 = searchName1;
	}

	public String getSearchName2() {
		return searchName2;
	}

	public void setSearchName2(String searchName2) {
		this.searchName2 = searchName2;
	}

	public String getSearchName3() {
		return searchName3;
	}

	public void setSearchName3(String searchName3) {
		this.searchName3 = searchName3;
	}
	public String getSearchName4() {
		return searchName4;
	}

	public void setSearchName4(String searchName4) {
		this.searchName4 = searchName4;
	}
	

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	
	public double getsum_up() {
		return sum_up;
	}

	public void setsum_up(double sum_up) {
		this.sum_up = sum_up;
	}

	
	
	public String getservice() {
		return service;
	}

	public void setservice(String service) {
		this.service = service;
	}

	public String getproduct() {
		return product;
	}

	public void setproduct(String product) {
		this.product = product;
	}

	
	public String getdesignation() {
		return designation;
	}

	public void setdesignation(String designation) {
		this.designation = designation;
	}

	public String getorder_Booked_By() {
		return order_Booked_By;
	}

	public void setorder_Booked_By(String order_Booked_By) {
		this.order_Booked_By = order_Booked_By;
	}

	

	public String getcurrency() {
		return currency;
	}

	public void setcurrency(String currency) {
		this.currency = currency;
	}

	
	public double getexchange_Rate() {
		return exchange_Rate;
	}

	public void setexchange_Rate(double exchange_Rate) {
		this.exchange_Rate = exchange_Rate;
	}

	

	public String getstarting_month() {
		return starting_month;
	}

	public void setstarting_month(String starting_month) {
		this.starting_month = starting_month;
	}

	public List<OrderBooking> getCustInfoAll() {
		return custInfoAll;
	}

	public void setCustInfoAll(List<OrderBooking> custInfoAll) {
		this.custInfoAll = custInfoAll;
	}

	Connection MySQLcon = null;
	Statement stmt = null;
	PreparedStatement ps;
	ResultSet rs;
	//addaction
	public String addAction() throws SQLException {
		try {

			Labcon lc = new Labcon();
			MySQLcon = lc.getLocalConnection();
			stmt = MySQLcon.createStatement();
			String dbcustid = this.customer_Name;
			String dbcustqid = this.order_booking_tracker_id2;
			String dbcustname = this.customer_Type;
			String dbcustadd = this.region;
			String dbcustver = this.vertical;
			String dbcustind = this.industry;
			
			String dbcustser = this.service;
			
			String dbcustpro = this.product;
			String dbcustdes = this.designation;
			String dbcustqbookby = this.order_Booked_By;
			
			String dbcustcurr = this.currency;
			String dbcustsm = this.starting_month;

			
			double dbcuster = this.exchange_Rate;
			
			String dbcustsdat = this.work_Order_Date;
			double dbcustqv = this.order_Value;
			double dbcustqm = this.order_Mandays;
			
			int dbcustbr = this.bR;
			
			String c = "INR";
			if (dbcustcurr.equals(c)) {
				String query = "UPDATE revenue.order_booking_tracker SET bR = '" + dbcustbr
						+ "',customer_Name = '" + dbcustid
						+ "',customer_Type = '" + dbcustname + "',region='"+ dbcustadd + "',vertical='"+ dbcustver + "',industry='"+ dbcustind + "',service='"
						+ dbcustser + "',product='" + dbcustpro + "',designation='" + dbcustdes
						+ "',order_Booked_By='" + dbcustqbookby
						+ "',work_Order_Date='" + dbcustsdat + "',currency='"+ dbcustcurr + "',exchange_Rate='" + dbcuster+ "',starting_month='" + dbcustsm+ "',order_Mandays='" + dbcustqm + "',work_Order_Date='"+ dbcustsdat + "',order_Value='" + dbcustqv + "',updated_Order_Value='" + dbcustqv + "' where order_booking_tracker_id2 = '"+ dbcustqid + "' ";
				System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

			else {
				String query = "UPDATE revenue.order_booking_tracker SET bR = '" + dbcustbr
				+ "',customer_Name = '" + dbcustid
				+ "',customer_Type = '" + dbcustname + "',region='"
				+ dbcustadd + "',vertical='"+ dbcustver + "',industry='"+ dbcustind + "',service='"
				+ dbcustser + "',product='" + dbcustpro + "',designation='" + dbcustdes
				+ "',order_Booked_By='" + dbcustqbookby
				+ "',work_Order_Date='" + dbcustsdat + "',currency='"+ dbcustcurr + "',exchange_Rate='" + dbcuster+ "',starting_month='" + dbcustsm+ "',order_Mandays='" + dbcustqm + "',work_Order_Date='"+ dbcustsdat + "',order_Value='" + dbcustqv + "',updated_Order_Value=('" + dbcustqv + "' * '" + dbcuster+ "'  ) where order_booking_tracker_id2 = '"+ dbcustqid + "' ";
		System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "insert";
	}
	
	public List<OrderBooking> getOrderDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		this.sum_up=0;
		
		try {
			stmt = MySQLcon.createStatement();



			String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker where customer_Name like '"+ searchName + "%'   ";
			System.err.println("Search2 query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				OrderBooking cust = new OrderBooking();
				
				System.out.println(rs.getInt("bR") + "br");
				cust.setbR(rs.getInt("bR"));
				System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
				cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
				
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setcustomer_Name(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setcustomer_Type(rs.getString("customer_Type"));
				System.out.println(rs.getString("vertical") + "custname");
				cust.setvertical(rs.getString("vertical"));
				System.out.println(rs.getString("industry") + "custname");
				cust.setindustry(rs.getString("industry"));
				System.out.println(rs.getString("region") + "custname");
				cust.setRegion(rs.getString("region"));
				System.out.println(rs.getString("service") + "custname");
				cust.setservice(rs.getString("service"));
				System.out.println(rs.getString("product") + "custname");
				cust.setproduct(rs.getString("product"));
				
				System.out.println(rs.getString("designation") + "custname");
				cust.setdesignation(rs.getString("designation"));
				System.out
						.println(rs.getString("order_Booked_By") + "custname");
				cust.setorder_Booked_By(rs.getString("order_Booked_By"));
				
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				
				

				
				System.out.println(rs.getDouble("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
				System.out.println(rs.getString("work_Order_Date") + "custname");
				cust.setwork_Order_Date(rs.getString("work_Order_Date"));
				
				System.out.println(rs.getString("starting_month") + "custname");
				cust.setstarting_month(rs.getString("starting_month"));
				
				System.out.println(rs.getDouble("order_Value") + "custname");
				cust.setorder_Value(rs.getDouble("order_Value"));
				System.out.println(rs.getDouble("order_Mandays") + "custname");
				cust.setorder_Mandays(rs.getDouble("order_Mandays"));
				System.out.println(rs.getDouble("updated_Order_Value") + "custname");
				cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getQuoteDetail::"
					+ e.getMessage());
		}

		return this.custInfoAll;
	}

	public List<OrderBooking> getDropDownQuotes(){


		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();

		try {
			
			stmt = MySQLcon.createStatement();
			String All = "All";
			
			//only customertype 
			if (searchName2 == "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where customer_Type in ('New', 'Existing','Inter Company')   ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;
					

					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}
				}
			}
//only region
			else if (searchName1 == "" &&  searchName3 == ""&& searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  region='"+ searchName2 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));

					
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					
				double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					System.out.println("sum_om"+sum_om);

					this.custInfoAll.add(cust);
				}
			}
//only order starts
			
			
			else if (searchName1 == "" &&  searchName2 == ""&& searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  order_Booked_By='"+ searchName3 + "'" ;
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;

					this.custInfoAll.add(cust);
				}
			}

	//order & service		
			else if (searchName1 == "" &&  searchName2 == ""&& searchName3 != "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  order_Booked_By='"+ searchName3 + "' and service='"+ searchName4 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					

					this.custInfoAll.add(cust);

				}
			}

//region and order
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  order_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "'   ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;
				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					

					this.custInfoAll.add(cust);
				}
			}

//region and service
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 == "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  service='"+ searchName4 + "' and region='"+ searchName2 + "' ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					

					this.custInfoAll.add(cust);
				}
			}
		
//region & service & order
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  service='"+ searchName4 + "' and region='"+ searchName2 + "' and order_Booked_By='"+ searchName3 + "' ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;
				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					

					this.custInfoAll.add(cust);
				}
			}
			
//custye & region & order
			if (searchName1 != "" && searchName2 != "" && startDate == "" && endDate == "" && searchName3 != ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company') and  order_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;

					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and order_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}
				}
			}
		
			
			//custype & region & service
			if (searchName1 != "" && searchName2 != "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4 != "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company')and service='"+ searchName4 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;

					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);	
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}
				}
			}
		
			//
//service strts
//
			else if (searchName1 == "" &&  searchName3 == ""&& searchName2 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  service='"+ searchName4 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;

					this.custInfoAll.add(cust);
				}
			}


			
//cyst type and order
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 != ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company') and order_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;

					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and order_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;

						this.custInfoAll.add(cust);

					}
				}
			}

//cust type and service
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4!= "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company') and service='"+ searchName4 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						

						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}
				}
			}
			//custype and region
			
			if (searchName1 != "" && searchName2!= "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4== "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company') and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					
					while (rs.next()) {
						

						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;

						this.custInfoAll.add(cust);
					}
				}
			}
//custype & order_Booked_By & service
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 !=""  && searchName4!= "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company')  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;

					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and order_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);

					}
				}
			}

			//
			else if (searchName1 != "" && searchName2 != "" &&  searchName3 == ""&& searchName4 == "" && startDate == "" && endDate == "") {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where customer_Type in ('New', 'Existing','Inter Company')and  region='"
							+ searchName2 + "'  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"
							+ searchName1
							+ "' and region= '"
							+ searchName2
							+ "'   "   ;
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;

						this.custInfoAll.add(cust);					}
				}

			}
//date starts // method for start and end date for report generation
			else if (searchName1 == "" && searchName2 == "" && startDate != "" && endDate != "" &&  searchName3 == ""&& searchName4 == "" ) {
				
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  work_Order_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;

					this.custInfoAll.add(cust);
				}}

				
			
			
			
			
			
	////date & order_Booked_By
else if (searchName1 == "" && searchName2 == "" && startDate != "" && endDate != "" &&  searchName3 != ""&& searchName4 == "" ) {
				
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where  work_Order_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  and order_Booked_By='"+ searchName3+ "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;

					this.custInfoAll.add(cust);

				}}

		////date & region
else if (searchName1 == "" && searchName2 != "" && startDate != "" && endDate != "" &&  searchName3 == ""&& searchName4 == "" ) {
				
				String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where  work_Order_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  and region='"+ searchName2+ "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_om=0;

				while (rs.next()) {
					OrderBooking cust = new OrderBooking();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));
					System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
					cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
					
					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setvertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("order_Booked_By") + "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("work_Order_Date") + "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("order_Value") + "custname");
					cust.setorder_Value(rs.getDouble("order_Value"));
					System.out.println(rs.getDouble("order_Mandays") + "custname");
					cust.setorder_Mandays(rs.getDouble("order_Mandays"));
					System.out.println(rs.getDouble("updated_Order_Value") + "custname");
					cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
					double c = rs.getDouble(17);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(16);

					this.sum_om = this.sum_om + d;
					

					this.custInfoAll.add(cust);

				}}

		//custype and date

			
else	if (searchName1 != "" && searchName2== "" && startDate != "" && endDate != "" && searchName3 == ""  && searchName4== "" ) {
				if (searchName1.equals(All) && startDate != "" && endDate != "") {
					String strSql = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker   where customer_Type in ('New', 'Existing','Inter Company') and work_Order_Date  BETWEEN '" +startDate + "' AND '" +endDate + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_om=0;
				
					while (rs.next()) {
						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select order_booking_tracker_id2,bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate from revenue.order_booking_tracker  where  customer_Type='"+ searchName1 + "'  and work_Order_Date  BETWEEN '" +startDate + "' AND '" +endDate + "' ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_om=0;
					while (rs.next()) {
						

						OrderBooking cust = new OrderBooking();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("order_booking_tracker_id2") + "order_booking_tracker_id2");
						cust.setorder_booking_tracker_id2(rs.getString("order_booking_tracker_id2"));
						
						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("vertical") + "custname");
						cust.setvertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry") + "custname");
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("order_Booked_By") + "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("work_Order_Date") + "custname");
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("order_Value") + "custname");
						cust.setorder_Value(rs.getDouble("order_Value"));
						System.out.println(rs.getDouble("order_Mandays") + "custname");
						cust.setorder_Mandays(rs.getDouble("order_Mandays"));
						System.out.println(rs.getDouble("updated_Order_Value") + "custname");
						cust.setupdated_Order_Value(rs.getDouble("updated_Order_Value"));
						
						double c = rs.getDouble(17);

						this.sum_up = this.sum_up + c;
						
						
						double d = rs.getDouble(16);

						this.sum_om = this.sum_om + d;
						

						this.custInfoAll.add(cust);
					}
				}
			}
				
			else {
				System.out.println("hey");
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return this.custInfoAll;
		
	}
	
	public void getEditDetail() {
		this.custInfoAll.clear();
		try {

		

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

	}
	


	

	public String ResultOrder() {
		getOrderDetail();
		return "result";
		
	}
	
	
	public String EditCustomer() {
		getEditDetail();
		return "edit";
	}
	
	
	// Method for drop downs of Customer type, region ,month
	public String DropDowns() {
		getDropDownQuotes();
		return "values";
	}
	
	
	public int getRowCount() {
    	return custInfoAll.size();
    }

	public String NavigQuote() {
		this.custInfoAll.clear();
		this.sum_up=0;
		this.sum_om=0;
		startDate="";
		

		endDate="";	
		searchName = "";
		searchName1 = "";
		searchName2 = "";
		searchName3 = "";
		searchName4 = "";
		
		
		try {

			

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
			return "sub";
		}	
	
	
		
}

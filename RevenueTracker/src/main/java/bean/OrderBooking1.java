package bean;

import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

//import com.mysql.jdbc.PreparedStatement;

public class OrderBooking1 {
	private String customer_Name1;
	private String order_tracker_id2;

	private String customer_Type1;
		private String region1;
		private String vertical1;
		private String industry1;
		
		private String service1;
		private String product1;
		
		private String designation1;
		private String order_Booked_By1;
		
		private String currency1;
		
		private double exchange_Rate1=1.00;
		
		private String starting_month1;
		private String work_Order_Date1;
		private int bR1;
		
		private double order_Value1;
		private double order_Mandays1 ;
		private double updated_Order_Value1;
		
		private double sum_up;
		private double sum_om;
		
		private String searchName;
		private String searchName1;
		private String searchName2;
		private String searchName3;
		private String searchName4;
		
		private List<OrderBooking1> custInfoA = new ArrayList<OrderBooking1>();
		
		
		
		public double getsum_om() {
			return sum_om;
		}

		public void setsum_om(double sum_om) {
			this.sum_om = sum_om;
		}
		
		public String getQuote_tracker_id2() {
			return order_tracker_id2;
		}

		public void setQuote_tracker_id2(String order_tracker_id2) {
			this.order_tracker_id2 = order_tracker_id2;
		}

		
		
//		public String getwork_Order_Date1() {
//			return work_Order_Date1;
//		}
	//
//		public void setwork_Order_Date1(String work_Order_Date1) {
//			this.work_Order_Date1 = work_Order_Date1;
//		}	
		public String getwork_Order_Date1() {
			return work_Order_Date1;
		}

		public void setwork_Order_Date1(String work_Order_Date1) {
			this.work_Order_Date1 = work_Order_Date1;
		}
		
		public int getbR1() {
			return bR1;
		}

		public void setbR1(int bR1) {
			this.bR1 = bR1;
		}
		
		
		public double getorder_Mandays1() {
			return order_Mandays1;
		}

		public void setorder_Mandays1(double order_Mandays1) {
			this.order_Mandays1 = order_Mandays1;
		}
		public double getupdated_Order_Value1() {
			return updated_Order_Value1;
		}

		public void setupdated_Order_Value1(double updated_Order_Value1) {
			this.updated_Order_Value1 = updated_Order_Value1;
		}
		
		
		public double getorder_Value1() {
			return order_Value1;
		}

		public void setorder_Value1(double order_Value1) {
			this.order_Value1 = order_Value1;
		}
		

		public String getcustomer_Name1() {
			return customer_Name1;
		}

		public void setcustomer_Name1(String customer_Name1) {
			this.customer_Name1 = customer_Name1;
		}

		

		public String getcustomer_Type1() {
			return customer_Type1;
		}

		public void setcustomer_Type1(String customer_Type1) {
			this.customer_Type1 = customer_Type1;
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
			return region1;
		}

		public void setRegion(String region1) {
			this.region1 = region1;
		}

		
		public double getsum_up() {
			return sum_up;
		}

		public void setsum_up(double sum_up) {
			this.sum_up = sum_up;
		}

		
		
		public String getservice1() {
			return service1;
		}

		public void setservice1(String service1) {
			this.service1 = service1;
		}
		public String getvertical1() {
			return vertical1;
		}

		public void setvertical1(String vertical1) {
			this.vertical1 = vertical1;
		}
		public String getindustry1() {
			return industry1;
		}

		public void setindustry1(String industry1) {
			this.industry1 = industry1;
		}

		public String getproduct1() {
			return product1;
		}

		public void setproduct1(String product1) {
			this.product1 = product1;
		}

		
		public String getdesignation1() {
			return designation1;
		}

		public void setdesignation1(String designation1) {
			this.designation1 = designation1;
		}

		public String getorder_Booked_By1() {
			return order_Booked_By1;
		}

		public void setorder_Booked_By1(String order_Booked_By1) {
			this.order_Booked_By1 = order_Booked_By1;
		}

		

		public String getcurrency1() {
			return currency1;
		}

		public void setcurrency1(String currency1) {
			this.currency1 = currency1;
		}

		
		public double getexchange_Rate1() {
			return exchange_Rate1;
		}

		public void setexchange_Rate1(double exchange_Rate1) {
			this.exchange_Rate1 = exchange_Rate1;
		}

		

		public String getstarting_month1() {
			return starting_month1;
		}

		public void setstarting_month1(String starting_month1) {
			this.starting_month1 = starting_month1;
		}

		public List<OrderBooking1> getCustInfoAll() {
			return custInfoA;
		}

		public void setCustInfoAll(List<OrderBooking1> custInfoA) {
			this.custInfoA = custInfoA;
		}

		Connection MySQLcon = null;
		Statement stmt = null;
		PreparedStatement ps;
		ResultSet rs;
		public String addCustomer() throws SQLException {
			try {
				PreparedStatement pstm = null ;  
		      
				
				//java.sql.Statement stmt = MySQLcon.createStatement();
				
				
				
				this.custInfoA.clear();
				Labcon lc = new Labcon();
				MySQLcon = lc.getLocalConnection();
				stmt = MySQLcon.createStatement();
				String dbcustid = this.customer_Name1;
				String dbcustqid = this.order_tracker_id2;
				String dbcustname = this.customer_Type1;
				String dbcustadd = this.region1;
				
				String dbcustser = this.service1;
				String dbcustver = this.vertical1;
				String dbcustind = this.industry1;
				
				String dbcustpro = this.product1;
				String dbcustdes = this.designation1;
				String dbcustqbookby = this.order_Booked_By1;
				
				String dbcustcurr = this.currency1;
				String dbcustsm = this.starting_month1;

				
				double dbcuster = this.exchange_Rate1;
				
				String dbcustsdat = this.work_Order_Date1;
				double dbcustqv = this.order_Value1;
				double dbcustqm = this.order_Mandays1;
				
				int dbcustbr = this.bR1;
				String cu = "INR";
				String da = "0000-00-00";
				
				if( dbcustsdat=="" ){
				
				if (dbcustcurr.equals(cu)  ) {
				String query = "insert into revenue.order_booking_tracker(bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustqbookby + "','" + dbcustsm + "','" + dbcustcurr + "','" + da + "','" + dbcustqv + "','" + dbcustqm + "','" + dbcustqv + "','" + dbcuster + "')";
				System.out.println("Update Check in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);
				}
				else{

					String query = "insert into revenue.order_booking_tracker(bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustqbookby + "','" + dbcustsm + "','" + dbcustcurr + "','" + da + "','" + dbcustqv + "','" + dbcustqm + "',('" + dbcustqv + "' * '" + dbcuster + "' ),'" + dbcuster + "')";
					System.out.println("Update Check in SearchCustomer Table–" + query);
					stmt.executeUpdate(query);
						
				}
				
				}
				else {

					
					if (dbcustcurr.equals(cu)  ) {
					String query = "insert into revenue.order_booking_tracker(bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustqbookby + "','" + dbcustsm + "','" + dbcustcurr + "','" + dbcustsdat + "','" + dbcustqv + "','" + dbcustqm + "','" + dbcustqv + "','" + dbcuster + "')";
					System.out.println("Update Check in SearchCustomer Table–" + query);
					stmt.executeUpdate(query);
					}
					else{

						String query = "insert into revenue.order_booking_tracker(bR,customer_Name,customer_Type,region,vertical,industry,service,product,designation,order_Booked_By,starting_month,currency,work_Order_Date,order_Value,order_Mandays ,updated_Order_Value,exchange_Rate) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustver + "','" + dbcustind + "''" + dbcustser + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustqbookby + "','" + dbcustsm + "','" + dbcustcurr + "','" + dbcustsdat + "','" + dbcustqv + "','" + dbcustqm + "',('" + dbcustqv + "' * '" + dbcuster + "' ),'" + dbcuster + "')";
						System.out.println("Update Check in SearchCustomer Table–" + query);
						stmt.executeUpdate(query);
							
					}
					
					
					 
	
						
							}} catch (Exception ex) {
						ex.printStackTrace();
						System.out.println("Exception in addAction:-" + ex.getMessage());
					}

					return "add";
				}
}
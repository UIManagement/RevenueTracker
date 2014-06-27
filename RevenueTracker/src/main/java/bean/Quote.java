package bean;

import java.sql.*;
import java.sql.Date;

import java.util.*;

import javax.faces.context.FacesContext;

public class Quote {
	
	

	
	
	//private String quote_Date;quote_tracker_id2	
private String customer_Name;
private String quote_tracker_id2;

private String customer_Type;
	private String region;
	
	private String service;
	private String product;
	
	private String designation;
	private String quote_Booked_By;
	
	private String currency;
	
	private double exchange_Rate=1.00;
	
	private String starting_month;
	private String quote_Date;
	private int bR;
	
	private double quote_Value;
	private double quoted_Mandays ;
	private double updated_Quote_Value;
	
	private double sum_up;
	private double sum_qm;
	private String startDate;
	

	private String endDate;
	
	

	private String searchName;
	private String searchName1;
	private String searchName2;
	private String searchName3;
	private String searchName4;
	
	private List<Quote> quoteInfo = new ArrayList<Quote>();
	
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
	
	public double getsum_qm() {
		return sum_qm;
	}

	public void setsum_qm(double sum_qm) {
		this.sum_qm = sum_qm;
	}
	
	public String getQuote_tracker_id2() {
		return quote_tracker_id2;
	}

	public void setQuote_tracker_id2(String quote_tracker_id2) {
		this.quote_tracker_id2 = quote_tracker_id2;
	}

	
	
//	public String getquote_Date() {
//		return quote_Date;
//	}
//
//	public void setquote_Date(String quote_Date) {
//		this.quote_Date = quote_Date;
//	}	
	public String getquote_Date() {
		return quote_Date;
	}

	public void setquote_Date(String quote_Date) {
		this.quote_Date = quote_Date;
	}
	
	public int getbR() {
		return bR;
	}

	public void setbR(int bR) {
		this.bR = bR;
	}
	//count
	public Integer getQuoteCount() {
		return quoteInfo.size();
	}
	
	public double getquoted_Mandays() {
		return quoted_Mandays;
	}

	public void setquoted_Mandays(double quoted_Mandays) {
		this.quoted_Mandays = quoted_Mandays;
	}
	public double getupdated_Quote_Value() {
		return updated_Quote_Value;
	}

	public void setupdated_Quote_Value(double updated_Quote_Value) {
		this.updated_Quote_Value = updated_Quote_Value;
	}
	
	
	public double getquote_Value() {
		return quote_Value;
	}

	public void setquote_Value(double quote_Value) {
		this.quote_Value = quote_Value;
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

	public String getquote_Booked_By() {
		return quote_Booked_By;
	}

	public void setquote_Booked_By(String quote_Booked_By) {
		this.quote_Booked_By = quote_Booked_By;
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

	public List<Quote> getquoteInfo() {
		return quoteInfo;
	}

	public void setquoteInfo(List<Quote> quoteInfo) {
		this.quoteInfo = quoteInfo;
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
			String dbcustqid = this.quote_tracker_id2;
			String dbcustname = this.customer_Type;
			String dbcustadd = this.region;
			
			String dbcustser = this.service;
			
			String dbcustpro = this.product;
			String dbcustdes = this.designation;
			String dbcustqbookby = this.quote_Booked_By;
			
			String dbcustcurr = this.currency;
			String dbcustsm = this.starting_month;

			
			double dbcuster = this.exchange_Rate;
			
			String dbcustsdat = this.quote_Date;
			double dbcustqv = this.quote_Value;
			double dbcustqm = this.quoted_Mandays;
			
			int dbcustbr = this.bR;
			
			String c = "INR";
			if (dbcustcurr.equals(c)) {
				String query = "UPDATE revenue.quote_tracker SET bR = '" + dbcustbr
						+ "',customer_Name = '" + dbcustid
						+ "',customer_Type = '" + dbcustname + "',region='"
						+ dbcustadd + "',service='"
						+ dbcustser + "',product='" + dbcustpro + "',designation='" + dbcustdes
						+ "',quote_Booked_By='" + dbcustqbookby
						+ "',quote_Date='" + dbcustsdat + "',currency='"+ dbcustcurr + "',exchange_Rate='" + dbcuster+ "',starting_month='" + dbcustsm+ "',quoted_Mandays='" + dbcustqm + "',quote_Date='"+ dbcustsdat + "',quote_Value='" + dbcustqv + "',updated_Quote_Value='" + dbcustqv + "' where quote_tracker_id2 = '"+ dbcustqid + "' ";
				System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

			else {
				String query = "UPDATE revenue.quote_tracker SET bR = '" + dbcustbr
				+ "',customer_Name = '" + dbcustid
				+ "',customer_Type = '" + dbcustname + "',region='"
				+ dbcustadd + "',service='"
				+ dbcustser + "',product='" + dbcustpro + "',designation='" + dbcustdes
				+ "',quote_Booked_By='" + dbcustqbookby
				+ "',quote_Date='" + dbcustsdat + "',currency='"+ dbcustcurr + "',exchange_Rate='" + dbcuster+ "',starting_month='" + dbcustsm+ "',quoted_Mandays='" + dbcustqm + "',quote_Date='"+ dbcustsdat + "',quote_Value='" + dbcustqv + "',updated_Quote_Value=('" + dbcustqv + "' * '" + dbcuster+ "'  ) where quote_tracker_id2 = '"+ dbcustqid + "' ";
		System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "insert";
	}
	
	public List<Quote> getQuoteDetail() {

		this.quoteInfo.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		this.sum_up=0;
		
		try {
			stmt = MySQLcon.createStatement();



			String strSql = "select quote_tracker_id2,bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where customer_Name like '"+ searchName + "%'   ";
			System.err.println("Search2 query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				Quote cust = new Quote();
				
				System.out.println(rs.getInt("bR") + "br");
				cust.setbR(rs.getInt("bR"));
				System.out.println(rs.getString("quote_tracker_id2") + "quote_tracker_id2");
				cust.setQuote_tracker_id2(rs.getString("quote_tracker_id2"));
				
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setcustomer_Name(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setcustomer_Type(rs.getString("customer_Type"));
				System.out.println(rs.getString("region") + "custname");
				cust.setRegion(rs.getString("region"));
				
				System.out.println(rs.getString("service") + "custname");
				cust.setservice(rs.getString("service"));
				System.out.println(rs.getString("product") + "custname");
				cust.setproduct(rs.getString("product"));
				
				System.out.println(rs.getString("designation") + "custname");
				cust.setdesignation(rs.getString("designation"));
				System.out
						.println(rs.getString("quote_Booked_By") + "custname");
				cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
				
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				
				

				
				System.out.println(rs.getDouble("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
				System.out.println(rs.getString("quote_Date") + "custname");
				cust.setquote_Date(rs.getString("quote_Date"));
				
				System.out.println(rs.getString("starting_month") + "custname");
				cust.setstarting_month(rs.getString("starting_month"));
				
				System.out.println(rs.getDouble("quote_Value") + "custname");
				cust.setquote_Value(rs.getDouble("quote_Value"));
				System.out.println(rs.getDouble("quoted_Mandays") + "custname");
				cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
				System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
				cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
				this.quoteInfo.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getQuoteDetail::"
					+ e.getMessage());
		}

		return this.quoteInfo;
	}

	public List<Quote> getDropDownQuotes(){


		this.quoteInfo.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();

		try {
			
			stmt = MySQLcon.createStatement();
			String All = "All";
			
			//only customertype 
			if (searchName2 == "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where customer_Type in ('New', 'Existing','Inter Company')   ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;
					

					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "quoted_Mandays");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						

						this.quoteInfo.add(cust);
					}
				}
			}
//only region
			else if (searchName1 == "" &&  searchName3 == ""&& searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  region='"+ searchName2 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "quoted_Mandays");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					
					
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					System.out.println("sum_qm"+sum_qm);

					this.quoteInfo.add(cust);
				}
			}
//only order starts
			
			
			else if (searchName1 == "" &&  searchName2 == ""&& searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  quote_Booked_By='"+ searchName3 + "'" ;
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}
			}

	//order & service		
			else if (searchName1 == "" &&  searchName2 == ""&& searchName3 != "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  quote_Booked_By='"+ searchName3 + "' and service='"+ searchName4 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);

				}
			}

//region and order
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  quote_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "'   ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;
				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}
			}

//region and service
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 == "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  service='"+ searchName4 + "' and region='"+ searchName2 + "' ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}
			}
		
//region & service & order
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 != ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  service='"+ searchName4 + "' and region='"+ searchName2 + "' and quote_Booked_By='"+ searchName3 + "' ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;
				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);
					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}
			}
			
//custye & region & order
			if (searchName1 != "" && searchName2 != "" && startDate == "" && endDate == "" && searchName3 != ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company') and  quote_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;

					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and quote_Booked_By='"+ searchName3 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}
				}
			}
		
			
			//custype & region & service
			if (searchName1 != "" && searchName2 != "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4 != "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company')and service='"+ searchName4 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;

					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);
						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);	
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and region='"+ searchName2 + "'";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}
				}
			}
		
			//
//service strts
//
			else if (searchName1 == "" &&  searchName3 == ""&& searchName2 == ""&&  startDate == "" && endDate == "") {
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  service='"+ searchName4 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}
			}


			
//cyst type and order
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 != ""  && searchName4 == "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company') and quote_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;

					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and quote_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);

					}
				}
			}

//cust type and service
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4!= "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company') and service='"+ searchName4 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						

						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}
				}
			}
			//custype and region
			
			if (searchName1 != "" && searchName2!= "" && startDate == "" && endDate == "" && searchName3 == ""  && searchName4== "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company') and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and region='"+ searchName2 + "' ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					
					while (rs.next()) {
						

						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);
						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}
				}
			}
//custype & quote_Booked_By & service
			if (searchName1 != "" && searchName2 == "" && startDate == "" && endDate == "" && searchName3 !=""  && searchName4!= "" ) {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company')  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;

					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and quote_Booked_By='"+ searchName3 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);

					}
				}
			}

			//
			else if (searchName1 != "" && searchName2 != "" &&  searchName3 == ""&& searchName4 == "" && startDate == "" && endDate == "") {
				if (searchName1.equals(All) && startDate == "" && endDate == "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where customer_Type in ('New', 'Existing','Inter Company')and  region='"
							+ searchName2 + "'  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"
							+ searchName1
							+ "' and region= '"
							+ searchName2
							+ "'   "   ;
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);					}
				}

			}
//date starts // method for start and end date for report generation
			else if (searchName1 == "" && searchName2 == "" && startDate != "" && endDate != "" &&  searchName3 == ""&& searchName4 == "" ) {
				
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  quote_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);
				}}

				
			
			
			
			
			
	////date & quote_Booked_By
else if (searchName1 == "" && searchName2 == "" && startDate != "" && endDate != "" &&  searchName3 != ""&& searchName4 == "" ) {
				
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where  quote_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  and quote_Booked_By='"+ searchName3+ "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);

				}}

		////date & region
else if (searchName1 == "" && searchName2 != "" && startDate != "" && endDate != "" &&  searchName3 == ""&& searchName4 == "" ) {
				
				String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where  quote_Date  BETWEEN '" +startDate + "' AND '" +endDate + "'  and region='"+ searchName2+ "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_up=0;
				this.sum_qm=0;

				while (rs.next()) {
					Quote cust = new Quote();
					System.out.println(rs.getInt("bR") + "br");
					cust.setbR(rs.getInt("bR"));

					System.out.println(rs.getString("customer_Name") + "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type") + "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					
					System.out.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out
							.println(rs.getString("quote_Booked_By") + "custname");
					cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
					
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					
					

					
					System.out.println(rs.getDouble("exchange_Rate") + "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getString("quote_Date") + "custname");
					cust.setquote_Date(rs.getString("quote_Date"));
					
					System.out.println(rs.getString("starting_month") + "custname");
					cust.setstarting_month(rs.getString("starting_month"));
					
					System.out.println(rs.getDouble("quote_Value") + "custname");
					cust.setquote_Value(rs.getDouble("quote_Value"));
					System.out.println(rs.getDouble("quoted_Mandays") + "custname");
					cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
					System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
					cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
					
					double c = rs.getDouble(14);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(13);

					this.sum_qm = this.sum_qm + d;
					

					this.quoteInfo.add(cust);

				}}

		//custype and date

			
else	if (searchName1 != "" && searchName2== "" && startDate != "" && endDate != "" && searchName3 == ""  && searchName4== "" ) {
				if (searchName1.equals(All) && startDate != "" && endDate != "") {
					String strSql = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker  where customer_Type in ('New', 'Existing','Inter Company') and quote_Date  BETWEEN '" +startDate + "' AND '" +endDate + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_qm=0;
				
					while (rs.next()) {
						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
					}

				} else {
					String strSq = "select bR,customer_Name,customer_Type,region,service,product,designation,quote_Booked_By,starting_month,currency,quote_Date,quote_Value,quoted_Mandays ,updated_Quote_Value,exchange_Rate from revenue.quote_tracker where  customer_Type='"+ searchName1 + "'  and quote_Date  BETWEEN '" +startDate + "' AND '" +endDate + "' ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_qm=0;
					while (rs.next()) {
						

						Quote cust = new Quote();
						System.out.println(rs.getInt("bR") + "br");
						cust.setbR(rs.getInt("bR"));

						System.out.println(rs.getString("customer_Name") + "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type") + "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						
						System.out.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						
						System.out.println(rs.getString("designation") + "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out
								.println(rs.getString("quote_Booked_By") + "custname");
						cust.setquote_Booked_By(rs.getString("quote_Booked_By"));
						
						System.out.println(rs.getString("currency") + "custname");
						cust.setcurrency(rs.getString("currency"));
						
						

						
						System.out.println(rs.getDouble("exchange_Rate") + "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getString("quote_Date") + "custname");
						cust.setquote_Date(rs.getString("quote_Date"));
						
						System.out.println(rs.getString("starting_month") + "custname");
						cust.setstarting_month(rs.getString("starting_month"));
						
						System.out.println(rs.getDouble("quote_Value") + "custname");
						cust.setquote_Value(rs.getDouble("quote_Value"));
						System.out.println(rs.getDouble("quoted_Mandays") + "custname");
						cust.setquoted_Mandays(rs.getDouble("quoted_Mandays"));
						System.out.println(rs.getDouble("updated_Quote_Value") + "custname");
						cust.setupdated_Quote_Value(rs.getDouble("updated_Quote_Value"));
						
						double c = rs.getDouble(14);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(13);

						this.sum_qm = this.sum_qm + d;
						

						this.quoteInfo.add(cust);
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
		return this.quoteInfo;
		
	}
	
	public void getEditDetail() {
		this.quoteInfo.clear();
		try {

		

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

	}
	


	

	public String ResultQuote() {
		getQuoteDetail();
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
    	return quoteInfo.size();
    }

	public String NavigQuote() {
		this.quoteInfo.clear();
		this.sum_up=0;
		this.sum_qm=0;
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

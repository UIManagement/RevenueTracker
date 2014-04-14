package bean;

import java.sql.*;

import java.util.*;

public class Customer {
	private String customer_Name;
	private String customer_Type;
	private String region;
	private String workOrder;
	private String vertical;
	private String industry;
	private String service;
	private String product;
	private String stage;
	private String designation;
	private String order_Booked_By;
	private String work_Order_Date;
	private String currency;
	private String work_Order_Value;
	private String exchange_Rate;
	private String updated_Work_Order;
	private String start_month;
	private String shared_Revenue;
	private String work_Order_Assessment_fee;
	private String work_Order_Logo_fee;
	private String updated_WO_Assessment_fee;
	private String work_Order_Mandays;
	private String delivered_Mandays;
	private String startDate;
	private String endDate;
	private String datec;
	private String dateb;
	private String datea;
	private String invoice;
	private String assessment_Fees;
	private String logo_Fee_Database;
	private long sum_dm;
	private long sum_pm;
	private long sum_Del;
	private String invoice_Date;
	private String t_L;
	private String bR;
	private String mandayvalue;
	private String foreign;
	private String masterid;
	private String period_Mandays;
	private String date_ID;
	private String searchName;
	private String searchName1;
	private String searchName2;
	private String searchName3;

	private List<Customer> custInfoAll = new ArrayList<Customer>();

	public String getNewtableid() {
		return masterid;
	}

	public void setNewtableid(String masterid) {
		this.masterid = masterid;
	}

	public String getwork_Order_Mandays() {
		return work_Order_Mandays;
	}

	public void setwork_Order_Mandays(String work_Order_Mandays) {
		this.work_Order_Mandays = work_Order_Mandays;
	}

	public String getLogo_Fee_Database() {

		return logo_Fee_Database;
	}

	public void setLogo_Fee_Database(String logo_Fee_Database) {
		this.logo_Fee_Database = logo_Fee_Database;

	}

	public String getassessment_Fees() {
		return assessment_Fees;
	}

	public void setassessment_Fees(String assessment_Fees) {
		this.assessment_Fees = assessment_Fees;
	}

	public String gett_L() {
		return t_L;
	}

	public void sett_L(String t_L) {
		this.t_L = t_L;
	}

	public String getdate_ID() {
		return date_ID;
	}

	public void setdate_ID(String date_ID) {
		this.date_ID = date_ID;
	}

	public String getbR() {
		return bR;
	}

	public void setbR(String bR) {
		this.bR = bR;
	}

	public String getperiod_Mandays() {
		return period_Mandays;
	}

	public void setperiod_Mandays(String period_Mandays) {
		this.period_Mandays = period_Mandays;
	}

	public String getdatea() {
		return datea;
	}

	public void setdatea(String datea) {
		this.datea = datea;
	}

	public String getmandayvalue() {
		return mandayvalue;
	}

	public void setmandayvalue(String mandayvalue) {
		this.mandayvalue = mandayvalue;
	}

	public String getdatec() {
		return datec;
	}

	public void setdatec(String datec) {
		this.datec = datec;
	}

	public String getforeign() {
		return foreign;
	}

	public void setforeign(String foreign) {
		this.foreign = foreign;
	}

	public String getInvoice_Date() {
		return invoice_Date;
	}

	public void setinvoice_Date(String invoice_Date) {
		this.invoice_Date = invoice_Date;

	}

	public String getInvoice() {
		return invoice;
	}

	public void setinvoice(String invoice) {
		this.invoice = invoice;
	}

	public String getcustomer_Name() {
		return customer_Name;
	}

	public void setcustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}

	public String getdelivered_Mandays() {
		return delivered_Mandays;
	}

	public void setdelivered_Mandays(String delivered_Mandays) {
		this.delivered_Mandays = delivered_Mandays;
	}

	public String getstartDate() {
		return startDate;
	}

	public void setstartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getendDate() {
		return endDate;
	}

	public void setendDate(String endDate) {
		this.endDate = endDate;
	}

	public String getdateb() {
		return dateb;
	}

	public void setdateb(String dateb) {
		this.dateb = dateb;
	}

	public String getwork_Order_Assessment_fee() {
		return work_Order_Assessment_fee;
	}

	public void setwork_Order_Assessment_fee(String work_Order_Assessment_fee) {
		this.work_Order_Assessment_fee = work_Order_Assessment_fee;
	}

	public String getupdated_WO_Assessment_fee() {
		return updated_WO_Assessment_fee;
	}

	public void setupdated_WO_Assessment_fee(String updated_WO_Assessment_fee) {
		this.updated_WO_Assessment_fee = updated_WO_Assessment_fee;
	}

	public String getwork_Order_Logo_fee() {
		return work_Order_Logo_fee;
	}

	public void setwork_Order_Logo_fee(String work_Order_Logo_fee) {
		this.work_Order_Logo_fee = work_Order_Logo_fee;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(String workOrder) {
		this.workOrder = workOrder;
	}

	public String getVertical() {
		return vertical;
	}

	public void setVertical(String vertical) {
		this.vertical = vertical;
	}

	public long getsum_dm() {
		return sum_dm;
	}

	public void setsum_dm(long sum_dm) {
		this.sum_dm = sum_dm;
	}

	public long getsum_pm() {
		return sum_pm;
	}

	public void setsum_pm(long sum_pm) {
		this.sum_pm = sum_pm;
	}

	public long getsum_Del() {
		return sum_Del;
	}

	public void setsum_Del(long sum_Del) {
		this.sum_Del = sum_Del;
	}

	public String getindustry() {
		return industry;
	}

	public void setindustry(String industry) {
		this.industry = industry;
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

	public String getstage() {
		return stage;
	}

	public void setstage(String stage) {
		this.stage = stage;
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

	public String getwork_Order_Date() {
		return work_Order_Date;
	}

	public void setwork_Order_Date_By(String work_Order_Date) {
		this.work_Order_Date = work_Order_Date;
	}

	public String getcurrency() {
		return currency;
	}

	public void setcurrency(String currency) {
		this.currency = currency;
	}

	public String getshared_Revenue() {
		return shared_Revenue;
	}

	public void setshared_Revenue(String shared_Revenue) {
		this.shared_Revenue = shared_Revenue;
	}

	public String getwork_Order_Value() {
		return work_Order_Value;
	}

	public void setwork_Order_Value(String work_Order_Value) {
		this.work_Order_Value = work_Order_Value;
	}

	public String getexchange_Rate() {
		return exchange_Rate;
	}

	public void setexchange_Rate(String exchange_Rate) {
		this.exchange_Rate = exchange_Rate;
	}

	public String getupdated_Work_Order() {
		return updated_Work_Order;
	}

	public void setupdated_Work_Order(String updated_Work_Order) {
		this.updated_Work_Order = updated_Work_Order;
	}

	public String getstart_month() {
		return start_month;
	}

	public void setstart_month(String start_month) {
		this.start_month = start_month;
	}

	public List<Customer> getCustInfoAll() {
		return custInfoAll;
	}

	public void setCustInfoAll(List<Customer> custInfoAll) {
		this.custInfoAll = custInfoAll;
	}

	Connection MySQLcon = null;
	Statement stmt = null;
	PreparedStatement ps;
	ResultSet rs;

	public String addAction() throws SQLException {
		try {

			Labcon lc = new Labcon();
			MySQLcon = lc.getLocalConnection();
			stmt = MySQLcon.createStatement();
			String dbcustid = this.customer_Name;
			String dbcustname = this.customer_Type;
			String dbcustadd = this.region;
			String dbcustwrk = this.workOrder;
			String dbcustver = this.vertical;
			String dbcustind = this.industry;
			String dbcustser = this.service;
			String dbcuststa = this.stage;
			String dbcustpro = this.product;
			String dbcustdes = this.designation;
			String dbcustoby = this.order_Booked_By;
			String dbcustwod = this.work_Order_Date;
			String dbcustcurr = this.currency;
			String dbcustwo = this.work_Order_Value;
			String dbcuster = this.exchange_Rate;
			String dbcustsm = this.start_month;
			String dbcustsrv = this.shared_Revenue;
			String dbcustwoas = this.work_Order_Assessment_fee;
			String dbcustwls = this.work_Order_Logo_fee;
			String dbcustuws = this.updated_WO_Assessment_fee;
			String dbcustwomd = this.work_Order_Mandays;
			String dbcustdm = this.delivered_Mandays;
			String dbcustsdat = this.startDate;
			String dbcusten = this.endDate;
			String dbcustinv = this.invoice;
			String dbcustivd = this.invoice_Date;
			String dbcustass = this.assessment_Fees;
			String dbcustlog = this.logo_Fee_Database;
			String dbcusttl = this.t_L;
			String dbcustbr = this.bR;
			String dbcustsum_pmr = this.period_Mandays;
			String c = "INR";
			if (dbcustcurr.equals(c)) {
				String query = "UPDATE revenue.master SET bR = '" + dbcustbr
						+ "',customer_Name = '" + dbcustid
						+ "',customer_Type = '" + dbcustname + "',region='"
						+ dbcustadd + "',vertical='" + dbcustver
						+ "',industry='" + dbcustind + "',service='"
						+ dbcustser + "',product='" + dbcustpro + "',stage='"
						+ dbcuststa + "',designation='" + dbcustdes
						+ "',order_Booked_By='" + dbcustoby
						+ "',work_Order_Date='" + dbcustwod + "',currency='"
						+ dbcustcurr + "',work_Order_Assessment_fee='"
						+ dbcustwoas + "',work_Order_Logo_fee='" + dbcustwls
						+ "',shared_Revenue='" + dbcustsrv
						+ "',work_Order_Value='" + dbcustwo
						+ "',exchange_Rate='" + dbcuster
						+ "',updated_Work_Order='" + dbcustwo
						+ "',updated_WO_Assessment_fee='" + dbcustuws
						+ "',work_Order_Mandays='" + dbcustwomd
						+ "',start_month='" + dbcustsm
						+ "',delivered_Mandays='" + dbcustdm + "',startDate='"
						+ dbcustsdat + "',endDate='" + dbcusten + "',invoice='"
						+ dbcustinv + "',invoice_Date='" + dbcustivd
						+ "',assessment_Fees='" + dbcustass
						+ "',logo_Fee_Database='" + dbcustlog + "',t_L='"
						+ dbcusttl + "',period_Mandays='" + dbcustsum_pmr
						+ "',workOrder='" + dbcustwrk + "' where workOrder='"
						+ dbcustwrk + "' ";
				System.out.println("Update in SearchCustomer Table�" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

			else {
				String query = "UPDATE revenue.master SET bR = '" + dbcustbr
						+ "', customer_Name = '" + dbcustid
						+ "',customer_Type = '" + dbcustname + "',region='"
						+ dbcustadd + "',vertical='" + dbcustver
						+ "',industry='" + dbcustind + "',service='"
						+ dbcustser + "',product='" + dbcustpro + "',stage='"
						+ dbcuststa + "',designation='" + dbcustdes
						+ "',order_Booked_By='" + dbcustoby
						+ "',work_Order_Date='" + dbcustwod + "',currency='"
						+ dbcustcurr + ",work_Order_Assessment_fee='"
						+ dbcustwoas + "',work_Order_Logo_fee='" + dbcustwls
						+ "',shared_Revenue='" + dbcustsrv
						+ "',work_Order_Value='" + dbcustwo
						+ "',exchange_Rate='" + dbcuster
						+ "',updated_Work_Order=('" + dbcustwo + "' * '"
						+ dbcuster + "'),updated_WO_Assessment_fee='"
						+ dbcustuws + "',work_Order_Mandays='" + dbcustwomd
						+ "',start_month='" + dbcustsm
						+ "',delivered_Mandays='" + dbcustdm + "',startDate='"
						+ dbcustsdat + "',endDate='" + dbcusten + "'invoice='"
						+ dbcustinv + "', invoice_Date='" + dbcustivd
						+ "',assessment_Fees='" + dbcustass
						+ "' logo_Fee_Database='" + dbcustlog + "',t_L='"
						+ dbcusttl + "',period_Mandays='" + dbcustsum_pmr
						+ "',workOrder='" + dbcustwrk + "' where workOrder='"
						+ dbcustwrk + "' ";
				System.out.println("Update in SearchCustomer Table�" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "insert";
	}

	// adddateaction
	public String updateAction() throws SQLException {
		try {

			Labcon lc = new Labcon();
			MySQLcon = lc.getLocalConnection();
			stmt = MySQLcon.createStatement();

			String dbcustmnd = this.mandayvalue;

			String query = "UPDATE revenue.manday_table SET mandayvalue = '"
					+ dbcustmnd + "' where  datec='" + datec
					+ "'   and master_masterid='" + masterid + "' ";
			System.out.println("Update in SearchCustomer Table�" + query);
			stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "update";
	}

	public List<Customer> getAllCustomer() {

		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master order by customer_Name asc";
			System.err.println("*select all***" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				cust.setNewtableid(rs.getString("masterid"));
				cust.setbR(rs.getString("bR"));
				cust.setcustomer_Name(rs.getString("customer_Name"));
				cust.setcustomer_Type(rs.getString("customer_Type"));
				cust.setRegion(rs.getString("region"));
				cust.setWorkOrder(rs.getString("workOrder"));
				cust.setVertical(rs.getString("vertical"));
				cust.setindustry(rs.getString("industry"));
				cust.setservice(rs.getString("service"));
				cust.setproduct(rs.getString("product"));
				cust.setstage(rs.getString("stage"));
				cust.setdesignation(rs.getString("designation"));
				cust.setorder_Booked_By(rs.getString("order_Booked_By"));
				cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
				cust.setcurrency(rs.getString("currency"));
				cust.setwork_Order_Assessment_fee(rs
						.getString("work_Order_Assessment_fee"));
				cust.setwork_Order_Logo_fee(rs.getString("work_Order_Logo_fee"));
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				cust.setupdated_WO_Assessment_fee(rs
						.getString("updated_WO_Assessment_fee"));
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));
				cust.setstart_month(rs.getString("start_month"));
				cust.setstartDate(rs.getString("startDate"));
				cust.setendDate(rs.getString("endDate"));
				cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
				cust.setinvoice(rs.getString("invoice"));
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				cust.setassessment_Fees(rs.getString("assessment_Fees"));
				cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
				cust.sett_L(rs.getString("t_L"));
				cust.setperiod_Mandays(rs.getString("period_Mandays"));

				this.masterid = rs.getString("masterid");
				this.bR = rs.getString("bR");
				this.customer_Name = rs.getString("customer_Name");
				this.customer_Type = rs.getString("customer_Type");
				this.region = rs.getString("region");
				this.workOrder = rs.getString("workOrder");
				this.vertical = rs.getString("vertical");
				this.industry = rs.getString("industry");
				this.service = rs.getString("service");
				this.product = rs.getString("product");
				this.stage = rs.getString("stage");
				this.designation = rs.getString("designation");
				this.order_Booked_By = rs.getString("order_Booked_By");
				this.work_Order_Date = rs.getString("work_Order_Date");
				this.currency = rs.getString("currency");
				this.work_Order_Assessment_fee = rs
						.getString("work_Order_Assessment_fee");
				this.work_Order_Logo_fee = rs.getString("work_Order_Logo_fee");
				this.shared_Revenue = rs.getString("shared_Revenue");
				this.work_Order_Value = rs.getString("work_Order_Value");
				this.exchange_Rate = rs.getString("exchange_Rate");
				this.updated_Work_Order = rs.getString("updated_Work_Order");
				this.updated_WO_Assessment_fee = rs
						.getString("updated_WO_Assessment_fee");
				this.work_Order_Mandays = rs.getString("work_Order_Mandays");
				this.startDate = rs.getString("startDate");
				this.start_month = rs.getString("start_month");
				this.endDate = rs.getString("endDate");
				this.delivered_Mandays = rs.getString("delivered_Mandays");
				this.invoice = rs.getString("invoice");
				this.invoice_Date = rs.getString("invoice_Date");
				this.assessment_Fees = rs.getString("assessment_Fees");
				this.logo_Fee_Database = rs.getString("logo_Fee_Database");
				this.t_L = rs.getString("t_L");
				this.period_Mandays = rs.getString("period_Mandays");

				// store all data into a List
				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out
					.println("Exception in getAllCustomer::" + e.getMessage());
		}
		return custInfoAll;
	}

	public List<Customer> getCustomerDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String sql1 = "Select masterid from revenue.master where  customer_Name like '"
					+ searchName + "%'   ";
			System.out.println(sql1);
			rs = stmt.executeQuery(sql1);

			ArrayList<String> arrl = new ArrayList<String>();
			while (rs.next()) {
				arrl.add(rs.getString("masterid"));

				Iterator<String> itr = arrl.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			}

			// getting manday summation
			for (int i = 0; i < arrl.size(); i++) {
				String strSql1 = "select  mandayvalue from revenue.manday_table where  master_masterid='"
						+ arrl.get(i) + "'  ";
				System.err.println("Search5 query:-" + strSql1);
				rs = stmt.executeQuery(strSql1);
				System.out.println(strSql1);

				while (rs.next()) {
					ArrayList<String> arr2 = new ArrayList<String>();

					arr2.add(rs.getString("mandayvalue"));

					Iterator<String> itr = arr2.iterator();

					int p = rs.getInt(1);
					this.sum_pm = this.sum_pm + p;

					while (itr.hasNext()) {
						System.out.println(itr.next());

					}

				}

			}

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Name like '"
					+ searchName + "%'";
			System.err.println("Search2 query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("masterid") + "custname");
				cust.setNewtableid(rs.getString("masterid"));
				System.out.println(rs.getString("bR") + "custname");
				cust.setbR(rs.getString("bR"));
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setcustomer_Name(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setcustomer_Type(rs.getString("customer_Type"));
				System.out.println(rs.getString("region") + "custname");
				cust.setRegion(rs.getString("region"));
				System.out.println(rs.getString("workOrder") + "custname");
				cust.setWorkOrder(rs.getString("workOrder"));
				System.out.println(rs.getString("vertical") + "custname");
				cust.setVertical(rs.getString("vertical"));
				System.out.println(rs.getString("industry") + "custname");
				cust.setindustry(rs.getString("industry"));
				System.out.println(rs.getString("service") + "custname");
				cust.setservice(rs.getString("service"));
				System.out.println(rs.getString("product") + "custname");
				cust.setproduct(rs.getString("product"));
				System.out.println(rs.getString("stage") + "custname");
				cust.setstage(rs.getString("stage"));
				System.out.println(rs.getString("designation") + "custname");
				cust.setdesignation(rs.getString("designation"));
				System.out
						.println(rs.getString("order_Booked_By") + "custname");
				cust.setorder_Booked_By(rs.getString("order_Booked_By"));
				System.out
						.println(rs.getString("work_Order_Date") + "custname");
				cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				System.out.println(rs.getString("work_Order_Assessment_fee")
						+ "custname");
				cust.setwork_Order_Assessment_fee(rs
						.getString("work_Order_Assessment_fee"));
				System.out.println(rs.getString("work_Order_Logo_fee")
						+ "custname");
				cust.setwork_Order_Logo_fee(rs.getString("work_Order_Logo_fee"));

				System.out.println(rs.getString("shared_Revenue") + "custname");
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				System.out.println(rs.getString("updated_WO_Assessment_fee")
						+ "custname");
				cust.setupdated_WO_Assessment_fee(rs
						.getString("updated_WO_Assessment_fee"));
				System.out.println(rs.getString("updated_WO_Assessment_fee")
						+ "custname");
				cust.setupdated_WO_Assessment_fee(rs
						.getString("updated_WO_Assessment_fee"));
				System.out.println(rs.getString("work_Order_Mandays")
						+ "custname");
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));
				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));
				System.out.println(rs.getString("startDate") + "custname");
				cust.setstartDate(rs.getString("startDate"));
				System.out.println(rs.getString("endDate") + "custname");
				cust.setendDate(rs.getString("endDate"));
				System.out.println(rs.getString("delivered_Mandays")
						+ "custname");
				cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
				System.out.println(rs.getString("invoice") + "custname");
				cust.setinvoice(rs.getString("invoice"));
				System.out.println(rs.getString("invoice_Date") + "custname");
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				System.out
						.println(rs.getString("assessment_Fees") + "custname");
				cust.setassessment_Fees(rs.getString("assessment_Fees"));
				System.out.println(rs.getString("logo_Fee_Database")
						+ "custname");
				cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
				System.out.println(rs.getString("t_L") + "custname");
				cust.sett_L(rs.getString("t_L"));

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return this.custInfoAll;
	}

	public ArrayList<Customer> getCalendarDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String sql1 = "Select master_masterid from revenue.manday_table where datec  BETWEEN '"
					+ datea
					+ "' AND '"
					+ dateb
					+ "' and mandayvalue IS NOT NULL  ";
			System.out.println(sql1);
			rs = stmt.executeQuery(sql1);

			ArrayList<String> arrl = new ArrayList<String>();
			while (rs.next()) {
				arrl.add(rs.getString("master_masterid"));

				Iterator<String> itr = arrl.iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next());
				}
			}

			for (int i = 0; i < arrl.size(); i++) {
				String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where masterid='"
						+ arrl.get(i) + "'  ";
				System.err.println("Search2 query:-" + strSql);
				rs = stmt.executeQuery(strSql);//

				System.out.println(strSql);
				while (rs.next()) {
					Customer cust = new Customer();
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getString("bR") + "custname");
					cust.setbR(rs.getString("bR"));
					System.out.println(rs.getString("customer_Name")
							+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type")
							+ "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("workOrder") + "custname");
					cust.setWorkOrder(rs.getString("workOrder"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setVertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					System.out.println(rs.getString("stage") + "custname");
					cust.setstage(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getString("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getString("work_Order_Logo_fee"));

					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getString("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getString("work_Order_Value"));
					System.out.println(rs.getString("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getString("exchange_Rate"));
					System.out.println(rs.getString("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getString("updated_Work_Order"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Mandays")
							+ "custname");
					cust.setwork_Order_Mandays(rs
							.getString("work_Order_Mandays"));
					System.out
							.println(rs.getString("start_month") + "custname");
					cust.setstart_month(rs.getString("start_month"));
					System.out.println(rs.getString("startDate") + "custname");
					cust.setstartDate(rs.getString("startDate"));
					System.out.println(rs.getString("endDate") + "custname");
					cust.setendDate(rs.getString("endDate"));
					System.out.println(rs.getString("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getString("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getString("assessment_Fees"));
					System.out.println(rs.getString("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
					System.out.println(rs.getString("t_L") + "custname");
					cust.sett_L(rs.getString("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));

					int c = rs.getInt(20);
					int d = rs.getInt(24);
					this.sum_dm = this.sum_dm + c;
					this.sum_Del = this.sum_Del + d;

					this.custInfoAll.add(cust);
				}
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return (ArrayList<Customer>) this.custInfoAll;
	}

	public List<Customer> getAllDetail() {
		List<Customer> custalll = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Name like '"
					+ searchName + "%'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("masterid") + "custname");
				cust.setNewtableid(rs.getString("masterid"));
				System.out.println(rs.getString("bR") + "custname");
				cust.setbR(rs.getString("bR"));
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setcustomer_Name(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setcustomer_Type(rs.getString("customer_Type"));
				System.out.println(rs.getString("region") + "custname");
				cust.setRegion(rs.getString("region"));
				System.out.println(rs.getString("workOrder") + "custname");
				cust.setWorkOrder(rs.getString("workOrder"));
				System.out.println(rs.getString("vertical") + "custname");
				cust.setVertical(rs.getString("vertical"));
				System.out.println(rs.getString("industry") + "custname");
				cust.setindustry(rs.getString("industry"));
				System.out.println(rs.getString("service") + "custname");
				cust.setservice(rs.getString("service"));
				System.out.println(rs.getString("product") + "custname");
				cust.setproduct(rs.getString("product"));
				System.out.println(rs.getString("stage") + "custname");
				cust.setservice(rs.getString("stage"));
				System.out.println(rs.getString("designation") + "custname");
				cust.setservice(rs.getString("designation"));
				System.out
						.println(rs.getString("order_Booked_By") + "custname");
				cust.setorder_Booked_By(rs.getString("order_Booked_By"));
				System.out
						.println(rs.getString("work_Order_Date") + "custname");
				cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				System.out.println(rs.getString("work_Order_Assessment_fee")
						+ "custname");
				cust.setwork_Order_Assessment_fee(rs
						.getString("work_Order_Assessment_fee"));
				System.out.println(rs.getString("work_Order_Logo_fee")
						+ "custname");
				cust.setwork_Order_Logo_fee(rs.getString("work_Order_Logo_fee"));
				System.out.println(rs.getString("shared_Revenue") + "custname");
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				System.out.println(rs.getString("updated_WO_Assessment_fee")
						+ "custname");
				cust.setupdated_WO_Assessment_fee(rs
						.getString("updated_WO_Assessment_fee"));
				System.out.println(rs.getString("work_Order_Mandays")
						+ "custname");
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));

				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));
				System.out.println(rs.getString("startDate") + "custname");
				cust.setstartDate(rs.getString("startDate"));
				System.out.println(rs.getString("endDate") + "custname");
				cust.setendDate(rs.getString("endDate"));
				System.out.println(rs.getString("delivered_Mandays")
						+ "custname");
				cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));

				System.out.println(rs.getString("invoice") + "custname");
				cust.setinvoice(rs.getString("invoice"));
				System.out.println(rs.getString("invoice_Date") + "custname");
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				System.out
						.println(rs.getString("assessment_Fees") + "custname");
				cust.setassessment_Fees(rs.getString("assessment_Fees"));
				System.out.println(rs.getString("logo_Fee_Database")
						+ "custname");
				cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
				System.out.println(rs.getString("t_L") + "custname");
				cust.sett_L(rs.getString("t_L"));

				System.out.println(rs.getString("period_Mandays") + "custname");
				cust.setperiod_Mandays(rs.getString("period_Mandays"));

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return custalll;
	}

	public List<Customer> getDropDownDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();

		try {
			stmt = MySQLcon.createStatement();
			String All = "All";
			if (searchName2 == "" && searchName3 == "") {
				if (searchName1.equals(All) && searchName3 == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Type in ('New', 'Existing','Inter Company')  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));

						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  customer_Type='"
							+ searchName1 + "'  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));

						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

						this.custInfoAll.add(cust);

					}
				}
			}

			else if (searchName1 == "" && searchName3 == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  region='"
						+ searchName2 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				while (rs.next()) {
					Customer cust = new Customer();
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getString("bR") + "custname");
					cust.setbR(rs.getString("bR"));
					System.out.println(rs.getString("customer_Name")
							+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type")
							+ "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("workOrder") + "custname");
					cust.setWorkOrder(rs.getString("workOrder"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setVertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					System.out.println(rs.getString("stage") + "custname");
					cust.setservice(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "custname");
					cust.setservice(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getString("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getString("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getString("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getString("work_Order_Value"));
					System.out.println(rs.getString("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getString("exchange_Rate"));
					System.out.println(rs.getString("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getString("updated_Work_Order"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Mandays")
							+ "custname");
					cust.setwork_Order_Mandays(rs
							.getString("work_Order_Mandays"));

					System.out
							.println(rs.getString("start_month") + "custname");
					cust.setstart_month(rs.getString("start_month"));
					System.out.println(rs.getString("startDate") + "custname");
					cust.setstartDate(rs.getString("startDate"));
					System.out.println(rs.getString("endDate") + "custname");
					cust.setendDate(rs.getString("endDate"));
					System.out.println(rs.getString("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getString("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getString("assessment_Fees"));
					System.out.println(rs.getString("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
					System.out.println(rs.getString("t_L") + "custname");
					cust.sett_L(rs.getString("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					int c = rs.getInt(20);
					int d = rs.getInt(24);
					this.sum_dm = this.sum_dm + c;
					this.sum_Del = this.sum_Del + d;

					this.custInfoAll.add(cust);

				}
			}

			else if (searchName1 != "" && searchName2 != ""
					&& searchName3 == "") {
				if (searchName1.equals(All) && searchName3 == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Type in ('New', 'Existing','Inter Company')and  region='"
							+ searchName2 + "'  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));
						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));

						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  customer_Type='"
							+ searchName1
							+ "' and region= '"
							+ searchName2
							+ "'";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));
						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

						this.custInfoAll.add(cust);

					}
				}

			}

			else if (searchName1 != "" && searchName2 != ""
					&& searchName3 != "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Type='"
						+ searchName1
						+ "' and region= '"
						+ searchName2
						+ "'and start_month='" + searchName3 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				while (rs.next()) {
					Customer cust = new Customer();
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getString("bR") + "custname");
					cust.setbR(rs.getString("bR"));
					System.out.println(rs.getString("customer_Name")
							+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type")
							+ "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("workOrder") + "custname");
					cust.setWorkOrder(rs.getString("workOrder"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setVertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					System.out.println(rs.getString("stage") + "custname");
					cust.setservice(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "custname");
					cust.setservice(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getString("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getString("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getString("work_Order_Value"));
					System.out.println(rs.getString("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getString("exchange_Rate"));
					System.out.println(rs.getString("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getString("updated_Work_Order"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Mandays")
							+ "custname");
					cust.setwork_Order_Mandays(rs
							.getString("work_Order_Mandays"));

					System.out
							.println(rs.getString("start_month") + "custname");
					cust.setstart_month(rs.getString("start_month"));
					System.out.println(rs.getString("startDate") + "custname");
					cust.setstartDate(rs.getString("startDate"));
					System.out.println(rs.getString("endDate") + "custname");
					cust.setendDate(rs.getString("endDate"));
					System.out.println(rs.getString("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getString("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getString("assessment_Fees"));
					System.out.println(rs.getString("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
					System.out.println(rs.getString("t_L") + "custname");
					cust.sett_L(rs.getString("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));

					int c = rs.getInt(20);
					int d = rs.getInt(24);
					this.sum_dm = this.sum_dm + c;
					this.sum_Del = this.sum_Del + d;

					this.custInfoAll.add(cust);

				}
			}

			else if (searchName1 == "" && searchName2 == ""
					&& searchName3 != "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  start_month='"
						+ searchName3 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				while (rs.next()) {
					Customer cust = new Customer();
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getString("bR") + "custname");
					cust.setbR(rs.getString("bR"));
					System.out.println(rs.getString("customer_Name")
							+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type")
							+ "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("workOrder") + "custname");
					cust.setWorkOrder(rs.getString("workOrder"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setVertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					System.out.println(rs.getString("stage") + "custname");
					cust.setservice(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "custname");
					cust.setservice(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getString("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getString("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getString("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getString("work_Order_Value"));
					System.out.println(rs.getString("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getString("exchange_Rate"));
					System.out.println(rs.getString("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getString("updated_Work_Order"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Mandays")
							+ "custname");
					cust.setwork_Order_Mandays(rs
							.getString("work_Order_Mandays"));
					System.out
							.println(rs.getString("start_month") + "custname");
					cust.setstart_month(rs.getString("start_month"));
					System.out.println(rs.getString("startDate") + "custname");
					cust.setstartDate(rs.getString("startDate"));
					System.out.println(rs.getString("endDate") + "custname");
					cust.setendDate(rs.getString("endDate"));
					System.out.println(rs.getString("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));

					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getString("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getString("assessment_Fees"));
					System.out.println(rs.getString("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
					System.out.println(rs.getString("t_L") + "custname");
					cust.sett_L(rs.getString("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));

					int c = rs.getInt(20);
					int d = rs.getInt(24);
					this.sum_dm = this.sum_dm + c;
					this.sum_Del = this.sum_Del + d;

					this.custInfoAll.add(cust);

				}
			}

			else if (searchName1 == "" && searchName2 != ""
					&& searchName3 != "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  start_month='"
						+ searchName3 + "'and region='" + searchName2 + "'  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				while (rs.next()) {
					Customer cust = new Customer();
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getString("bR") + "custname");
					cust.setbR(rs.getString("bR"));
					System.out.println(rs.getString("customer_Name")
							+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getString("customer_Type")
							+ "custname");
					cust.setcustomer_Type(rs.getString("customer_Type"));
					System.out.println(rs.getString("region") + "custname");
					cust.setRegion(rs.getString("region"));
					System.out.println(rs.getString("workOrder") + "custname");
					cust.setWorkOrder(rs.getString("workOrder"));
					System.out.println(rs.getString("vertical") + "custname");
					cust.setVertical(rs.getString("vertical"));
					System.out.println(rs.getString("industry") + "custname");
					cust.setindustry(rs.getString("industry"));
					System.out.println(rs.getString("service") + "custname");
					cust.setservice(rs.getString("service"));
					System.out.println(rs.getString("product") + "custname");
					cust.setproduct(rs.getString("product"));
					System.out.println(rs.getString("stage") + "custname");
					cust.setservice(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "custname");
					cust.setservice(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date_By(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getString("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getString("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getString("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getString("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getString("work_Order_Value"));
					System.out.println(rs.getString("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getString("exchange_Rate"));
					System.out.println(rs.getString("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getString("updated_Work_Order"));
					System.out.println(rs
							.getString("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getString("updated_WO_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Mandays")
							+ "custname");
					cust.setwork_Order_Mandays(rs
							.getString("work_Order_Mandays"));
					System.out
							.println(rs.getString("start_month") + "custname");
					cust.setstart_month(rs.getString("start_month"));
					System.out.println(rs.getString("startDate") + "custname");
					cust.setstartDate(rs.getString("startDate"));
					System.out.println(rs.getString("endDate") + "custname");
					cust.setendDate(rs.getString("endDate"));
					System.out.println(rs.getString("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getString("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getString("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getString("assessment_Fees"));
					System.out.println(rs.getString("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getString("logo_Fee_Database"));
					System.out.println(rs.getString("t_L") + "custname");
					cust.sett_L(rs.getString("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					int c = rs.getInt(20);
					int d = rs.getInt(24);
					this.sum_dm = this.sum_dm + c;
					this.sum_Del = this.sum_Del + d;

					this.custInfoAll.add(cust);

				}
			}

			// last
			else if (searchName1 != "" && searchName2 == ""
					&& searchName3 != "") {
				if (searchName1.equals(All) && searchName3 != "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where customer_Type in ('New', 'Existing','Inter Company') and  start_month='"
							+ searchName3 + "' ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));

						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));
						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,period_Mandays,workOrder from revenue.master where  customer_Type='"
							+ searchName1
							+ "' and start_month='"
							+ searchName3
							+ "' ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					while (rs.next()) {
						Customer cust = new Customer();
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getString("bR") + "custname");
						cust.setbR(rs.getString("bR"));
						System.out.println(rs.getString("customer_Name")
								+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")
								+ "custname");
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")
								+ "custname");
						cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")
								+ "custname");
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")
								+ "custname");
						cust.setindustry(rs.getString("industry"));
						System.out
								.println(rs.getString("service") + "custname");
						cust.setservice(rs.getString("service"));
						System.out
								.println(rs.getString("product") + "custname");
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setservice(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setservice(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date_By(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getString("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getString("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getString("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getString("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getString("work_Order_Value"));
						System.out.println(rs.getString("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getString("exchange_Rate"));
						System.out.println(rs.getString("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getString("updated_Work_Order"));
						// updated_WO_Assessment_fee
						System.out.println(rs
								.getString("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getString("updated_WO_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Mandays")
								+ "custname");
						cust.setwork_Order_Mandays(rs
								.getString("work_Order_Mandays"));
						System.out.println(rs.getString("start_month")
								+ "custname");
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")
								+ "custname");
						cust.setstartDate(rs.getString("startDate"));
						System.out
								.println(rs.getString("endDate") + "custname");
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getString("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getString("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getString("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getString("assessment_Fees"));
						System.out.println(rs.getString("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getString("logo_Fee_Database"));
						System.out.println(rs.getString("t_L") + "custname");
						cust.sett_L(rs.getString("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						int c = rs.getInt(20);
						int d = rs.getInt(24);
						this.sum_dm = this.sum_dm + c;
						this.sum_Del = this.sum_Del + d;

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

	public List<Customer> getEntryDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String sql1 = "Select masterid from revenue.master where customer_Name ='"
					+ customer_Name + "'   ";
			System.out.println(sql1);
			rs = stmt.executeQuery(sql1);

			while (rs.next()) {
				masterid = rs.getString("masterid");
				System.out.println(masterid);
			}
			
			

			String strSql = "select  date_ID,datec,mandayvalue from revenue.manday_table where datec  BETWEEN '"
					+ datea
					+ "' AND '"
					+ dateb
					+ "' and master_masterid='"
					+ masterid + "'  ";
			System.err.println("Search5 query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				this.mandayvalue = rs.getString("mandayvalue");

				System.out.println(rs.getString("date_ID") + "custname");
				cust.setdate_ID(rs.getString("date_ID"));
				System.out.println(rs.getString("datec") + "custname");
				cust.setdatec(rs.getString("datec"));

				System.out.println(rs.getString("mandayvalue") + "custname");
				cust.setmandayvalue(rs.getString("mandayvalue"));
				int p = rs.getInt(3);

				this.sum_dm = this.sum_dm + p;

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return this.custInfoAll;
	}

	// over

	public void getEditDetail() {

		try {

			System.out.println("customer" + this.workOrder);
			System.out.println("customer" + this.work_Order_Date);

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

	}

	public void getCompanyDetail() {

		try {

			System.out.println("customer" + this.customer_Name);
			System.out.println("customer" + this.workOrder);

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

	}

	public String addCustomer() throws SQLException {
		try {
			System.out.println("in add customer");

		} catch (Exception ex) {
			System.out.println("Exception in addCustomer:-" + ex.getMessage());

		}
		return "add";
	}

	// Search method
	public String ResultCustomer() {
		getCustomerDetail();
		return "result";
	}

	// Edit method for edit button
	public String EditCustomer() {
		getEditDetail();
		return "edit";
	}

	public String ResultAll() {
		getAllDetail();
		return "all";
	}

	// Method for drop downs of Customer type, region ,month
	public String DropDowns() {
		getDropDownDetail();
		return "values";
	}

	// Start and end date method
	public String Calendarcustomer() {
		getCalendarDetail();
		return "calendar";
	}

	// Getting Customer Name instance
	public String MandayEntryCustomer() {
		getCompanyDetail();
		return "company";
	}

	// Method for Report button in mandatEntry.jsp
	public String Entrycustomer() {
		getEntryDetail();
		return "entry";
	}

}

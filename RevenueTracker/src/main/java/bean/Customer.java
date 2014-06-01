package bean;

import java.awt.event.ActionEvent;
import java.sql.*;
import java.sql.Date;

import java.util.*;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

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
	private double work_Order_Value;
	private double exchange_Rate=1.00;
	private double updated_Work_Order;
	private String start_month;
	private String shared_Revenue;
	private double work_Order_Assessment_fee;
	private double work_Order_Logo_fee ;
	private double updated_WO_Assessment_fee;
	private String work_Order_Mandays;
	private double delivered_Mandays;
	private double updated;
	private String startDate;
	private String endDate;
	private String datec;
	private String dateb;
	private String datea;
	private String invoice;
	private double assessment_Fees;
	private double service_Tax;
	private double total_Invoice_Amount;
	private double logo_Fee_Database;
	private double sum_up;
	private double sum_dm;
	private double sum_pm;
	private double sum_pr;
	private int pm;
	private double dm;
	private double dm1;
	private String sm;
	private String sum_Del;
	private String invoice_Date;
	private double t_L;
	private int bR;
	private double period_rev;
	
	private double mandayvalue;
	
	private String foreign;
	private String masterid;
	private String period_Mandays;
	private String date_ID;
	private String searchName;
	private String searchName1;
	private String searchName2;
	private String searchName3;
	private String  searchName4;
	// public String[] data = {"1","2","3"};
	private List<Customer> custInfoAll = new ArrayList<Customer>();
	int set_sum;
	int set_sum1;
//for addNew Customer
	private String customer_Name1;
	private String customer_Type1;
	private String region1;
	private String workOrder1;
	private String vertical1;
	private String industry1;
	private String service1;
	private String product1;
	private String stage1;
	private String designation1;
	private String order_Booked_By1;
	private String work_Order_Date1;
	private String currency1;
	private double work_Order_Value1;
	private double exchange_Rate1=1.00;
	private double updated_Work_Order1;
	private String shared_Revenue1;
	private double work_Order_Assessment_fee1;
	private double work_Order_Logo_fee1 ;
	private double updated_WO_Assessment_fee1;
	private String work_Order_Mandays1;
	private double delivered_Mandays1;
	private String startDate1;
	private String endDate1;
	
	private String invoice1;
	private double assessment_Fees1;
	private double service_Tax1;
	private double total_Invoice_Amount1;
	private double logo_Fee_Database1;
	
	private String invoice_Date1;
	private double t_L1;
	private int bR1;
	
	private int mandayvalue1;
	//over	
	
//addnew getter setter
	public String getwork_Order_Mandays1() {
		return work_Order_Mandays1;
	}

	public void setwork_Order_Mandays1(String work_Order_Mandays1) {
		this.work_Order_Mandays1 = work_Order_Mandays1;
	}

	public double getLogo_Fee_Database1() {

		return logo_Fee_Database1;
	}

	public void setLogo_Fee_Database1(double logo_Fee_Database1) {
		this.logo_Fee_Database1 = logo_Fee_Database1;

	}
	
	public double gettotal_Invoice_Amount1() {

		return total_Invoice_Amount1;
	}

	public void settotal_Invoice_Amount1(double total_Invoice_Amount1) {
		this.total_Invoice_Amount1 = total_Invoice_Amount1;

	}
	
	
	
	
	
	public double getservice_Tax1() {

		return service_Tax1;
	}

	public void setservice_Tax1(double service_Tax1) {
		this.service_Tax1 = service_Tax1;

	}
	public double getdm1() {

		return dm1;
	}

	public void setdm1(double dm1) {
		this.dm1 = dm1;

	}
	public double setupdated() {

		return updated;
	}

	public void setupdated(double updated) {
		this.updated = updated;

	}
	

	public double getassessment_Fees1() {
		return assessment_Fees1;
	}

	public void setassessment_Fees1(double assessment_Fees1) {
		this.assessment_Fees1 = assessment_Fees1;
	}

	public double gett_L1() {
		return t_L1;
	}

	public void sett_L1(double t_L1) {
		this.t_L1 = t_L1;
	}

	
	
	

	public String getInvoice_Date1() {
		return invoice_Date1;
	}

	public void setinvoice_Date1(String invoice_Date1) {
		this.invoice_Date1 = invoice_Date1;

	}
	public double getsum_dm() {
		return sum_dm;
	}

	public void setsum_dm(double sum_dm) {
		this.sum_dm = sum_dm;

	}
	public String getInvoice1() {
		return invoice1;
	}

	public void setinvoice1(String invoice1) {
		this.invoice1 = invoice1;
	}

	public String getcustomer_Name1() {
		return customer_Name1;
	}

	public void setcustomer_Name1(String customer_Name1) {
		this.customer_Name1 = customer_Name1;
	}

	public double getdelivered_Mandays1() {
		return delivered_Mandays1;
	}

	public void setdelivered_Mandays1(double delivered_Mandays1) {
		this.delivered_Mandays1 = delivered_Mandays1;
	}

	public String getstartDate1() {
		return startDate1;
	}

	public void setstartDate1(String startDate1) {
		this.startDate1 = startDate1;
	}

	public String getendDate1() {
		return endDate1;
	}

	public void setendDate1(String endDate1) {
		this.endDate1 = endDate1;
	}

	
	public double getwork_Order_Assessment_fee1() {
		return work_Order_Assessment_fee1;
	}

	public void setwork_Order_Assessment_fee1(double work_Order_Assessment_fee1) {
		this.work_Order_Assessment_fee1 = work_Order_Assessment_fee1;
	}

	public double getupdated_WO_Assessment_fee1() {
		return updated_WO_Assessment_fee1;
	}

	public void setupdated_WO_Assessment_fee1(double updated_WO_Assessment_fee1) {
		this.updated_WO_Assessment_fee1 = updated_WO_Assessment_fee1;
	}

	public double getwork_Order_Logo_fee1() {
		return work_Order_Logo_fee1;
	}

	public void setwork_Order_Logo_fee1(double work_Order_Logo_fee1) {
		this.work_Order_Logo_fee1 = work_Order_Logo_fee1;
	}

	public String getcustomer_Type1() {
		return customer_Type1;
	}

	public void setcustomer_Type1(String customer_Type1) {
		this.customer_Type1 = customer_Type1;
	}

	

	public String getRegion1() {
		return region1;
	}

	public void setRegion1(String region1) {
		this.region1 = region1;
	}

	public String getWorkOrder1() {
		return workOrder1;
	}

	public void setWorkOrder1(String workOrder1) {
		this.workOrder1 = workOrder1;
	}

	public String getVertical1() {
		return vertical1;
	}

	public void setVertical1(String vertical1) {
		this.vertical1 = vertical1;
	}

		public String getindustry1() {
		return industry1;
	}

	public void setindustry1(String industry1) {
		this.industry1 = industry1;
	}

	public String getservice1() {
		return service1;
	}

	public void setservice1(String service1) {
		this.service1 = service1;
	}

	public String getproduct1() {
		return product1;
	}

	public void setproduct1(String product1) {
		this.product1 = product1;
	}

	public String getstage1() {
		return stage1;
	}

	public void setstage1(String stage1) {
		this.stage1 = stage1;
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

	public String getwork_Order_Date1() {
		return work_Order_Date1;
	}

	public void setwork_Order_Date1(String work_Order_Date1) {
		this.work_Order_Date1 = work_Order_Date1;
	}

	public String getcurrency1() {
		return currency1;
	}

	public void setcurrency1(String currency1) {
		this.currency1 = currency1;
	}

	public String getshared_Revenue1() {
		return shared_Revenue1;
	}

	public void setshared_Revenue1(String shared_Revenue1) {
		this.shared_Revenue1 = shared_Revenue1;
	}

	public double getwork_Order_Value1() {
		return work_Order_Value1;
	}

	public void setwork_Order_Value1(double work_Order_Value1) {
		this.work_Order_Value1 = work_Order_Value1;
	}

	public double getexchange_Rate1() {
		return exchange_Rate1;
	}

	public void setexchange_Rate1(double exchange_Rate1) {
		this.exchange_Rate1 = exchange_Rate1;
	}

	public double getupdated_Work_Order1() {
		return updated_Work_Order1;
	}

	public void setupdated_Work_Order1(double updated_Work_Order1) {
		this.updated_Work_Order1 = updated_Work_Order1;
	}
	
	//over getter setter
	public String getNewtableid() {
		return masterid;
	}

	public void setNewtableid(String masterid) {
		this.masterid = masterid;
	}
	
	

	public double getperiod_rev() {
		return period_rev;
	}

	public void setperiod_rev(double period_rev) {
		this.period_rev = period_rev;
	}

	public String getwork_Order_Mandays() {
		return work_Order_Mandays;
	}

	public void setwork_Order_Mandays(String work_Order_Mandays) {
		this.work_Order_Mandays = work_Order_Mandays;
	}

	public double getLogo_Fee_Database() {

		return logo_Fee_Database;
	}

	public void setLogo_Fee_Database(double logo_Fee_Database) {
		this.logo_Fee_Database = logo_Fee_Database;

	}
	
	public double gettotal_Invoice_Amount() {

		return total_Invoice_Amount;
	}

	public void settotal_Invoice_Amount(double total_Invoice_Amount) {
		this.total_Invoice_Amount = total_Invoice_Amount;

	}
	
	
	
	
	
	public int getbR1() {

		return bR1;
	}

	public void setbR1(int bR1) {
		this.bR1 = bR1;

	}
	
	
	public double getservice_Tax() {

		return service_Tax;
	}

	public void setservice_Tax(double service_Tax) {
		this.service_Tax = service_Tax;

	}
	
	

	public double getassessment_Fees() {
		return assessment_Fees;
	}

	public void setassessment_Fees(double assessment_Fees) {
		this.assessment_Fees = assessment_Fees;
	}

	public double gett_L() {
		return t_L;
	}

	public void sett_L(double t_L) {
		this.t_L = t_L;
	}

	public String getdate_ID() {
		return date_ID;
	}

	public void setdate_ID(String date_ID) {
		this.date_ID = date_ID;
	}

	public int getbR() {
		return bR;
	}

	public void setbR(int bR) {
		this.bR = bR;
	}

	public double getdm() {
		return dm;
	}

	public void setdm(double dm) {
		this.dm = dm;
	}

	public String getsm() {
		return sm;
	}

	public void setsm(String sm) {
		this.sm = sm;
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

	public double getmandayvalue() {
		return mandayvalue;
	}

	public void setmandayvalue(double mandayvalue) {
		this.mandayvalue = mandayvalue;
	}

	public int getmandayvalue1() {
		return mandayvalue1;
	}

	public void setmandayvalue1(int mandayvalue1) {
		this.mandayvalue1 = mandayvalue1;
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

	public double getdelivered_Mandays() {
		return delivered_Mandays;
	}

	public void setdelivered_Mandays(double delivered_Mandays) {
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

	public double getwork_Order_Assessment_fee() {
		return work_Order_Assessment_fee;
	}

	public void setwork_Order_Assessment_fee(double work_Order_Assessment_fee) {
		this.work_Order_Assessment_fee = work_Order_Assessment_fee;
	}

	public double getupdated_WO_Assessment_fee() {
		return updated_WO_Assessment_fee;
	}

	public void setupdated_WO_Assessment_fee(double updated_WO_Assessment_fee) {
		this.updated_WO_Assessment_fee = updated_WO_Assessment_fee;
	}

	public double getwork_Order_Logo_fee() {
		return work_Order_Logo_fee;
	}

	public void setwork_Order_Logo_fee(double work_Order_Logo_fee) {
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

	public double getsum_up() {
		return sum_up;
	}

	public void setsum_up(double sum_up) {
		this.sum_up = sum_up;
	}

	public double getsum_pm() {
		return sum_pm;
	}

	public void setsum_pm(double sum_pm) {
		this.sum_pm = sum_pm;
	}
	public double getsum_pr() {
		return sum_pr;
	}

	public void setsum_pr(double sum_pr) {
		this.sum_pr = sum_pr;
	}
	public int getpm() {
		return pm;
	}

	public void setpm(int pm) {
		this.pm = pm;
	}

	public String getsum_Del() {
		return sum_Del;
	}

	public void setsum_Del(String sum_Del) {
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

	public void setwork_Order_Date(String work_Order_Date) {
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

	public double getwork_Order_Value() {
		return work_Order_Value;
	}

	public void setwork_Order_Value(double work_Order_Value) {
		this.work_Order_Value = work_Order_Value;
	}

	public double getexchange_Rate() {
		return exchange_Rate;
	}

	public void setexchange_Rate(double exchange_Rate) {
		this.exchange_Rate = exchange_Rate;
	}

	public double getupdated_Work_Order() {
		return updated_Work_Order;
	}

	public void setupdated_Work_Order(double updated_Work_Order) {
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
			double dbcustwo = this.work_Order_Value;
			double dbcuster = this.exchange_Rate;
			String dbcustsm = this.start_month;
			String dbcustsrv = this.shared_Revenue;
			double dbcustwoas = this.work_Order_Assessment_fee;
			double dbcustwls = this.work_Order_Logo_fee;
			double dbcustuws = this.updated_WO_Assessment_fee;
			String dbcustwomd = this.work_Order_Mandays;
			double dbcustdm = this.dm;
			String dbcustsdat = this.startDate;
			String dbcusten = this.endDate;
			String dbcustinv = this.invoice;
			String dbcustivd = this.invoice_Date;
			double dbcustass = this.assessment_Fees;
			double dbcustlog = this.logo_Fee_Database;
			double dbcusttl = this.t_L;
			int dbcustbr = this.bR;
			//double dbcustpmr = this.mandayvalue;
			double dbcuststax = this.service_Tax;
			String dbcustmid = this.masterid;
			double dbcustupwo = this.updated_Work_Order;
			double dbcusttia = this.total_Invoice_Amount;
			double dbcustprev = this.period_rev;
			double dbcustmand = this.mandayvalue;
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
						+ "',work_Order_Date='" + dbcustwod + "',currency='"+ dbcustcurr + "',work_Order_Assessment_fee='"+ dbcustwoas + "',work_Order_Logo_fee='" + dbcustwls+ "',shared_Revenue='" + dbcustsrv+ "',work_Order_Value=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),exchange_Rate='" + dbcuster+ "',updated_Work_Order=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),updated_WO_Assessment_fee='" + dbcustwoas+ "',work_Order_Mandays='" + dbcustwomd+ "',start_month='" + dbcustsm+ "',delivered_Mandays='" + dbcustdm + "',startDate='"+ dbcustsdat + "',endDate='" + dbcusten + "',invoice='"+ dbcustinv + "',invoice_Date='" + dbcustivd+ "',assessment_Fees='" + dbcustass+ "',logo_Fee_Database='" + dbcustlog + "',t_L='"+ dbcusttl + "',period_Mandays='" + dbcustmand+ "',workOrder='" + dbcustwrk + "',service_Tax='" + dbcuststax + "',total_Invoice_Amount=('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),Period_Revenue= ((('" + dbcustwoas+ "' + '" + dbcustwls+ "' )/'" + dbcustdm + "')* '" + dbcustmand+ "') where masterid = '"+ dbcustmid + "' ";
				System.out.println("Update in SearchCustomer Table–" + query);
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
						+ "',work_Order_Value=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),exchange_Rate='" + dbcuster
						+ "',updated_Work_Order=('" + dbcuster+ "' * ('" + dbcustwoas+ "' + '" + dbcustwls+ "' ) ),updated_WO_Assessment_fee=('" + dbcustwoas + "' * '"+ dbcuster + "'),work_Order_Mandays='" + dbcustwomd
						+ "',start_month='" + dbcustsm
						+ "',delivered_Mandays='" + dbcustdm + "',startDate='"
						+ dbcustsdat + "',endDate='" + dbcusten + "'invoice='"
						+ dbcustinv + "', invoice_Date='" + dbcustivd
						+ "',assessment_Fees='" + dbcustass
						+ "' logo_Fee_Database='" + dbcustlog + "',t_L='"
						+ dbcusttl + "',period_Mandays='" + dbcustmand
						+ "',workOrder='" + dbcustwrk + "'  service_Tax='" + dbcuststax + "',total_Invoice_Amount=('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),Period_Revenue= ((('" + dbcustwoas+ "' + '" + dbcustwls+ "' )/'" + dbcustdm + "')* '" + dbcustmand+ "')  where masterid = '"+ dbcustmid + "' ";
				System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "insert";
	}
//addcustomer
//	public String addCustomer() throws SQLException {
//		try {
//			this.custInfoAll.clear();
//			Labcon lc = new Labcon();
//			MySQLcon = lc.getLocalConnection();
//			stmt = MySQLcon.createStatement();
//			String dbcustid = this.customer_Name1;
//			String dbcustname = this.customer_Type1;
//			String dbcustadd = this.region1;
//			String dbcustwrk = this.workOrder1;
//			String dbcustver = this.vertical1;
//			String dbcustind = this.industry1;
//			String dbcustser = this.service1;
//			String dbcuststa = this.stage1;
//			String dbcustpro = this.product1;
//			String dbcustdes = this.designation1;
//			String dbcustoby = this.order_Booked_By1;
//			String dbcustwod = this.work_Order_Date1;
//			String dbcustcurr = this.currency1;
//			double dbcustwo = this.work_Order_Value1;
//			double dbcuster = this.exchange_Rate1;
//			
//			String dbcustsrv = this.shared_Revenue1;
//			double dbcustwoas = this.work_Order_Assessment_fee1;
//			double dbcustwls = this.work_Order_Logo_fee1;
//			double dbcustupwo = this.updated_Work_Order1;
//			double dbcustuws = this.updated_WO_Assessment_fee1;
//			String dbcustwomd = this.work_Order_Mandays1;
//			double dbcustdm = this.dm1;//period_Mandays
//			String dbcustsdat = this.startDate1;
//			String dbcusten = this.endDate1;
//			String dbcustinv = this.invoice1;
//			String dbcustivd = this.invoice_Date1;
//			double dbcustass = this.assessment_Fees1;
//			double dbcustlog = this.logo_Fee_Database1;
//			double dbcusttl = this.t_L1;
//			int dbcustbr = this.bR1;
//			int dbcustmand = this.mandayvalue1;
//			
//			double dbcuststax = this.service_Tax1;
//			double dbcusttia = this.total_Invoice_Amount1;
//			String c = "INR";
//			if (dbcustcurr.equals(c)) {
//			String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical,industry,service,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + dbcustwod + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcustwoas + "','" + dbcustwomd + "','" + dbcustdm + "','" + dbcustsdat + "','" + dbcusten + "','" + dbcustinv + "','" + dbcustivd + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
//			System.out.println("Update in SearchCustomer Table–" + query);
//			stmt.executeUpdate(query);
//			}
//			else{
//
//				String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical1,industry,service1,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Manday,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + dbcustwod + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcuster+ "' * ('" + dbcustwoas+ "' + '" + dbcustwls+ "' ) ),('" + dbcustwoas + "' * '"+ dbcuster + "'),'" + dbcustwomd + "','" + dbcustdm + "','" + dbcustsdat + "','" + dbcusten + "','" + dbcustinv + "','" + dbcustivd + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
//				System.out.println("Update in SearchCustomer Table–" + query);
//				stmt.executeUpdate(query);
//					
//			}
//			
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			System.out.println("Exception in addAction:-" + ex.getMessage());
//		}
//
//		return "add";
//	}
	// adddateaction

	public String updateAction() throws SQLException {
		try {

			Labcon lc = new Labcon();
			MySQLcon = lc.getLocalConnection();
			stmt = MySQLcon.createStatement();
			
			String dbcustmid = this.masterid;
			;
			//String dbcustda = this.datea;
			//String dbcustdb = this.dateb;

			for (int i = 0; i < custInfoAll.size(); i++) {

				mandayvalue = custInfoAll.get(i).getmandayvalue();
				datec = custInfoAll.get(i).getdatec();

				// this.mandayvalue = rs.getString("mandayvalue");
				System.out.println(mandayvalue);
				System.out.println(datec);

				String query = "UPDATE revenue.table SET mandayvalue = '"
						+ mandayvalue + "' where  datec='" + datec
						+ "'    and  master_masterid ='" + dbcustmid + "' ";
				System.out.println("Update in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);

			}
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

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder from revenue.master order by customer_Name asc";
			System.err.println("*select all***" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				cust.setNewtableid(rs.getString("masterid"));
				cust.setbR(rs.getInt("bR"));
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
				cust.setwork_Order_Date(rs.getString("work_Order_Date"));
				cust.setcurrency(rs.getString("currency"));
				cust.setwork_Order_Assessment_fee(rs
						.getDouble("work_Order_Assessment_fee"));
				cust.setwork_Order_Logo_fee(rs.getDouble("work_Order_Logo_fee"));
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
				cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
				cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));
				cust.setupdated_WO_Assessment_fee(rs
						.getDouble("updated_WO_Assessment_fee"));
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));
				cust.setstart_month(rs.getString("start_month"));
				cust.setstartDate(rs.getString("startDate"));
				cust.setendDate(rs.getString("endDate"));
				cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
				cust.setinvoice(rs.getString("invoice"));
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
				cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
				cust.sett_L(rs.getDouble("t_L"));
				cust.setperiod_Mandays(rs.getString("period_Mandays"));
				cust.setservice_Tax (rs.getDouble("service_Tax"));
				cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount,"));
				cust.setupdated(rs.getDouble("updated"));
				cust.setperiod_rev(rs.getDouble("period_rev"));

				this.masterid = rs.getString("masterid");
				this.bR = rs.getInt("bR");
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
						.getDouble("work_Order_Assessment_fee");
				this.work_Order_Logo_fee = rs.getDouble("work_Order_Logo_fee");
				this.shared_Revenue = rs.getString("shared_Revenue");
				this.work_Order_Value = rs.getDouble("work_Order_Value");
				this.exchange_Rate = rs.getDouble("exchange_Rate");
				this.updated_Work_Order = rs.getDouble("updated_Work_Order");
				this.updated_WO_Assessment_fee = rs
						.getDouble("updated_WO_Assessment_fee");
				this.work_Order_Mandays = rs.getString("work_Order_Mandays");
				this.startDate = rs.getString("startDate");
				this.start_month = rs.getString("start_month");
				this.endDate = rs.getString("endDate");
				this.delivered_Mandays = rs.getDouble("delivered_Mandays");
				this.invoice = rs.getString("invoice");
				this.invoice_Date = rs.getString("invoice_Date");
				this.assessment_Fees = rs.getDouble("assessment_Fees");
				this.logo_Fee_Database = rs.getDouble("logo_Fee_Database");
				this.t_L = rs.getDouble("t_L");
				this.service_Tax  = rs.getDouble("service_Tax");
				this.total_Invoice_Amount = rs.getDouble("total_Invoice_Amount");
				this.period_Mandays = rs.getString("period_Mandays");
				this.updated = rs.getDouble("updated");
				this.period_rev = rs.getDouble("period_rev");

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
		this.sum_up=0;
		this.sum_dm=0;
		this.sum_pm=0;
		try {
			stmt = MySQLcon.createStatement();



			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database, t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master left join  revenue.table on (master.masterid=table.master_masterid) where customer_Name like '"+ searchName + "%'  group by master.masterid ";
			System.err.println("Search2 query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
				cust.setmandayvalue(rs.getDouble("SUM(table.mandayvalue)"));
			
				
				System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
				cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
				
				System.out.println(rs.getString("masterid") + "custname");
				cust.setNewtableid(rs.getString("masterid"));
				System.out.println(rs.getInt("bR") + "custname");
				cust.setbR(rs.getInt("bR"));
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
				cust.setwork_Order_Date(rs.getString("work_Order_Date"));
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				System.out.println(rs.getString("work_Order_Assessment_fee")
						+ "custname");
				cust.setwork_Order_Assessment_fee(rs
						.getDouble("work_Order_Assessment_fee"));
				System.out.println(rs.getDouble("work_Order_Logo_fee")
						+ "custname");
				cust.setwork_Order_Logo_fee(rs.getDouble("work_Order_Logo_fee"));

				System.out.println(rs.getString("shared_Revenue") + "custname");
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				System.out.println(rs.getDouble("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
				System.out.println(rs.getDouble("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));
				System.out.println(rs.getString("updated_WO_Assessment_fee")+ "custname");
				cust.setupdated_WO_Assessment_fee(rs.getDouble("updated_WO_Assessment_fee"));

				System.out.println(rs.getString("work_Order_Mandays")+ "custname");
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));
				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));
				System.out.println(rs.getString("startDate") + "custname");
				cust.setstartDate(rs.getString("startDate"));
				System.out.println(rs.getString("endDate") + "custname");
				cust.setendDate(rs.getString("endDate"));
//				System.out.println(rs.getDouble("delivered_Mandays")+ "custname");
//				cust.setdm(rs.getDouble("delivered_Mandays"));
				System.out.println(rs.getString("invoice") + "custname");
				cust.setinvoice(rs.getString("invoice"));
				System.out.println(rs.getString("invoice_Date") + "custname");
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				System.out
						.println(rs.getDouble("assessment_Fees") + "custname");
				cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
				System.out.println(rs.getDouble("logo_Fee_Database")
						+ "custname");
				cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
				System.out.println(rs.getDouble("t_L") + "custname");
				cust.sett_L(rs.getDouble("t_L"));
				System.out.println(rs.getDouble("service_Tax") + "custname");
				cust.setservice_Tax(rs.getDouble("service_Tax"));
				System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
				cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
				
				
				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return this.custInfoAll;
	}

//reportcustomer
	

	


	public List<Customer> getAllDetail() {
		List<Customer> custalll = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder from revenue.master where customer_Name like '"
					+ searchName + "%'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("masterid") + "custname");
				cust.setNewtableid(rs.getString("masterid"));
				System.out.println(rs.getInt("bR") + "custname");
				cust.setbR(rs.getInt("bR"));
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
				cust.setwork_Order_Date(rs.getString("work_Order_Date"));
				System.out.println(rs.getString("currency") + "custname");
				cust.setcurrency(rs.getString("currency"));
				System.out.println(rs.getDouble("work_Order_Assessment_fee")
						+ "custname");
				cust.setwork_Order_Assessment_fee(rs
						.getDouble("work_Order_Assessment_fee"));
				System.out.println(rs.getString("work_Order_Logo_fee")
						+ "custname");
				cust.setwork_Order_Logo_fee(rs.getDouble("work_Order_Logo_fee"));
				System.out.println(rs.getString("shared_Revenue") + "custname");
				cust.setshared_Revenue(rs.getString("shared_Revenue"));
				System.out.println(rs.getDouble("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
				System.out.println(rs.getDouble("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));
				System.out.println(rs.getDouble("updated_WO_Assessment_fee")+ "custname");
				cust.setupdated_WO_Assessment_fee(rs.getDouble("updated_WO_Assessment_fee"));
				System.out.println(rs.getDouble("work_Order_Mandays")+ "custname");
				cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));

				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));
				System.out.println(rs.getString("startDate") + "custname");
				cust.setstartDate(rs.getString("startDate"));
				System.out.println(rs.getString("endDate") + "custname");
				cust.setendDate(rs.getString("endDate"));
				System.out.println(rs.getDouble("delivered_Mandays")
						+ "custname");
				cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));

				System.out.println(rs.getString("invoice") + "custname");
				cust.setinvoice(rs.getString("invoice"));
				System.out.println(rs.getString("invoice_Date") + "custname");
				cust.setinvoice_Date(rs.getString("invoice_Date"));
				System.out
						.println(rs.getDouble("assessment_Fees") + "custname");
				cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
				System.out.println(rs.getDouble("logo_Fee_Database")
						+ "custname");
				cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
				System.out.println(rs.getDouble("t_L") + "custname");
				cust.sett_L(rs.getDouble("t_L"));

				System.out.println(rs.getString("period_Mandays") + "custname");
				cust.setperiod_Mandays(rs.getString("period_Mandays"));
				
				
				System.out.println(rs.getDouble("service_Tax ") + "custname");
				cust.setservice_Tax (rs.getDouble("service_Tax "));
				System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
				cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
				
				

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return custalll;
	}
//drop
	public List<Customer> getDropDownDetail() {

		this.custInfoAll.clear();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();

		try {
			
			stmt = MySQLcon.createStatement();
			String s="";
			String All = "All";
			if (searchName2 == "" && datea == "" && dateb == "" && searchName3 == ""  && searchName4== "" ) {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")+ "custname");		
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
						System.out.println(rs.getString("customer_Name")+ "custname");		
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getString("customer_Type")+ "custname");		
						cust.setcustomer_Type(rs.getString("customer_Type"));
						System.out.println(rs.getString("region") + "custname");
						cust.setRegion(rs.getString("region"));
						System.out.println(rs.getString("workOrder")+ "custname");
					    cust.setWorkOrder(rs.getString("workOrder"));
						System.out.println(rs.getString("vertical")+ "custname");		
						cust.setVertical(rs.getString("vertical"));
						System.out.println(rs.getString("industry")+ "custname");		
						cust.setindustry(rs.getString("industry"));
						System.out.println(rs.getString("service") + "custname");		
						cust.setservice(rs.getString("service"));
						System.out.println(rs.getString("product") + "custname");		
						cust.setproduct(rs.getString("product"));
						System.out.println(rs.getString("stage") + "custname");
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")+ "custname");		
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")+ "custname");		
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")+ "custname");		
						cust.setwork_Order_Date(rs.getString("work_Order_Date"));		
						System.out.println(rs.getString("currency")	+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs.getDouble("work_Order_Assessment_fee")+ "custname");
					    cust.setwork_Order_Assessment_fee(rs.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")+ "custname");
								cust.setwork_Order_Logo_fee(rs.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")+ "custname");						
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")+ "custname");		
						cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));		
						System.out.println(rs.getDouble("exchange_Rate")+ "custname");		
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")+ "custname");		
						cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));			
						System.out.println(rs.getDouble("updated_WO_Assessment_fee")	+ "custname");		
							cust.setupdated_WO_Assessment_fee(rs.getDouble("updated_WO_Assessment_fee"));
							System.out.println(rs.getString("work_Order_Mandays")+ "custname");
									cust.setwork_Order_Mandays(rs.getString("work_Order_Mandays"));
									System.out.println(rs.getString("start_month")+ "custname");		
						cust.setstart_month(rs.getString("start_month"));
						System.out.println(rs.getString("startDate")	+ "custname");	
						cust.setstartDate(rs.getString("startDate"));
						System.out.println(rs.getString("endDate") + "custname");		
						cust.setendDate(rs.getString("endDate"));
						System.out.println(rs.getDouble("delivered_Mandays")+ "custname");
                        cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));		
						System.out.println(rs.getString("invoice") + "custname");		
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")	+ "custname");	
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")+ "custname");		
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")+ "custname");		
						cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));		
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")+ "custname");		
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}

			else if (searchName1 == "" &&  searchName3 == ""&& searchName4== "" &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  region='"
						+ searchName2 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}
//vertical starts
			
			
			else if (searchName1 == "" &&  searchName2 == ""&& searchName4== ""&&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

	//vertical & service		
			else if (searchName1 == "" &&  searchName2 == ""&& searchName3 != "" && searchName4 != null &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' and service='"+ searchName4 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					System.out.println(rs.getString("stage") + "stage");
					cust.setstage(rs.getString("stage"));
					System.out
							.println(rs.getString("designation") + "designation");
					cust.setdesignation(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

//region and vertical
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4== "" &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' and region='"+ searchName2 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

//region and service
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 == "" && searchName4 != null  &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' and region='"+ searchName2 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}
		
//region & service & vertcal
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 != null  &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' and region='"+ searchName2 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
				System.err.println("Search query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}
			
//custye & region & vertical
			if (searchName1 != "" && searchName2 != "" && datea == "" && dateb == "" && searchName3 != ""  && searchName4== "" ) {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and vertical='"+ searchName3 + "' and region='"+ searchName2 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}
		
			
			//custype & region & service
			if (searchName1 != "" && searchName2 != "" && datea == "" && dateb == "" && searchName3 == ""  && searchName4 != null  ) {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and region='"+ searchName2 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}
		
			//
//service strts
//
			else if (searchName1 == "" &&  searchName3 == ""&& searchName2 == ""&& searchName4 != null && datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' group by master.masterid  ";
				System.err.println("Search service query:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				this.sum_up=0;
				this.sum_dm=0;

				while (rs.next()) {
					Customer cust = new Customer();

					System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
					cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
					System.out.println(rs.getString("masterid") + "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setwork_Order_Date(rs.getString("work_Order_Date"));
					System.out.println(rs.getString("currency") + "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
					System.out.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}


			
//cyst type and vertical
			if (searchName1 != "" && searchName2 == "" && datea == "" && dateb == "" && searchName3 != ""  && searchName4== "") {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}

//cust type and service
			if (searchName1 != "" && searchName2 == "" && datea == "" && dateb == "" && searchName3 == ""  && searchName4!= ""  ) {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}
//custype & vertical & service
			if (searchName1 != "" && searchName2 == "" && datea == "" && dateb == "" && searchName3 !=""  && searchName4!= ""  ) {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}

			//
			else if (searchName1 != "" && searchName2 != "" &&  searchName3 == ""&& searchName4== "" && datea == "" && dateb == "") {
				if (searchName1.equals(All) && datea == "" && dateb == "") {
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company')and  region='"
							+ searchName2 + "' group by master.masterid  ";
					System.err.println("Search query:-" + strSql);
					rs = stmt.executeQuery(strSql);
					System.out.println(strSql);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));

						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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

						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));
						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"
							+ searchName1
							+ "' and region= '"
							+ searchName2
							+ "'  group by master.masterid  "   ;
					System.err.println("Search query:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					this.sum_up=0;
					this.sum_dm=0;

					while (rs.next()) {
						Customer cust = new Customer();

						System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
						cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
//						System.out.println(rs.getDouble("delivered_Mandays")+ "custname");
//								
//						cust.setdelivered_Mandays(rs.getDouble("delivered_Mandays"));
						System.out.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}

			}
//date starts // method for start and end date for report generation
			else if (searchName1 != "" && searchName2 != "" && datea != "" && dateb != "" &&  searchName3 == ""&& searchName4== "" ) {
				
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and customer_Type='"+ searchName1+ "' and region= '"+ searchName2+ "' ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_pm=0;
				this.sum_pr=0;


				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getDouble("mandayvalue") + "manday");
					cust.setmandayvalue(rs.getDouble("mandayvalue"));
					
					System.out.println(rs.getDouble(37) + "manday");
					cust.setdm(rs.getDouble(37));
					
					System.out.println(rs.getString("masterid")
							+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setstage(rs.getString("stage"));
					System.out.println(rs.getString("designation")
							+ "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date(rs
							.getString("work_Order_Date"));
					System.out.println(rs.getString("currency")
							+ "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs
							.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs
							.getDouble("delivered_Mandays"));

					System.out
							.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs
							.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					System.out.println(rs.getDouble(38) + "periodrev");
					cust.setperiod_rev(rs.getDouble(38));
					
					double d = rs.getDouble(36);

					this.sum_pm = this.sum_pm + d;

					this.custInfoAll.add(cust);

				}

				
				String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)   where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL   and customer_Type='"+ searchName1+ "' and region= '"+ searchName2+ "' group by masterid ";   

				System.err.println("Search query for start date:-" + strSq11);
				rs = stmt.executeQuery(strSq11);
				
				this.sum_up=0;
				this.sum_dm=0;
				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getString("masterid")+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					
					System.out.println(rs.getString("customer_Name")+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getDouble("updated_Work_Order")+ "custname");
							
					cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));
							
					
					System.out.println(rs.getDouble(4) + "manday");
					cust.setdm(rs.getDouble(4));
					System.out.println(rs.getDouble(5) + "periodrev");
					cust.setperiod_rev(rs.getDouble(5));
					
					double c = rs.getDouble(3);

					this.sum_up = this.sum_up + c;
					
					double e = rs.getDouble(4);

					this.sum_dm = this.sum_dm + e;
					
				}
			
			
	
				

				
			}

			else if (searchName1 == "" && searchName2 == ""  &&  searchName3 == "" && searchName4== "" && datea != "" && dateb != "")

			{	{

					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))  from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL  ";   

					System.err.println("Search query for start date:-" + strSq);
					rs = stmt.executeQuery(strSq);
					
					this.sum_pm=0;
					this.sum_pr=0;
					while (rs.next()) {
						Customer cust = new Customer();
						
						System.out.println(rs.getDouble("mandayvalue") + "manday");
						cust.setmandayvalue(rs.getDouble("mandayvalue"));
						
						System.out.println(rs.getDouble(37) + "manday");
						cust.setdm(rs.getDouble(37));
						
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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


						System.out.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));

						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));

						System.out.println(rs.getDouble(38) + "periodrev");
						cust.setperiod_rev(rs.getDouble(38));
						
						double d = rs.getDouble(36);

						this.sum_pm = this.sum_pm + d;
						System.out.println(sum_pm);
						
						int p = rs.getInt(38);
						this.sum_pr = this.sum_pr + p;
						System.out.println(sum_pr);
						this.custInfoAll.add(cust);
						

					}}
					{
						String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL group by masterid ";   

						System.err.println("Search query for start date:-" + strSq11);
						rs = stmt.executeQuery(strSq11);
						
						this.sum_up=0;
						this.sum_dm=0;
						while (rs.next()) {
							Customer cust = new Customer();
							
							System.out.println(rs.getString("masterid")+ "custname");
							cust.setNewtableid(rs.getString("masterid"));
							
							System.out.println(rs.getString("customer_Name")+ "custname");
							cust.setcustomer_Name(rs.getString("customer_Name"));
							
							System.out.println(rs.getDouble("updated_Work_Order")	+ "custname");
								
							cust.setupdated_Work_Order(rs.getDouble("updated_Work_Order"));
								
							System.out.println(rs.getDouble(4) + "dm");
							cust.setdm(rs.getDouble(4));
							
							System.out.println(rs.getDouble(5) + "periodrevenue1");
							cust.setperiod_rev(rs.getDouble(5));
							
								double c = rs.getDouble(3);

							this.sum_up = this.sum_up + c;
							
							double e = rs.getDouble(4);

							this.sum_dm = this.sum_dm + e;
							
						}}
					
				
		}

			else if (searchName1 == "" && searchName2 != ""  &&  searchName3 == ""&& searchName4== "" && datea != "" && dateb != "") {

				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and  region= '"+ searchName2+ "' ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_pm=0;
				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getDouble("mandayvalue") + "manday");
					cust.setmandayvalue(rs.getDouble("mandayvalue"));
					
					System.out.println(rs.getDouble(37) + "manday");
					cust.setdm(rs.getDouble(37));
					
					System.out.println(rs.getString("masterid")
							+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setstage(rs.getString("stage"));
					System.out.println(rs.getString("designation")
							+ "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date(rs
							.getString("work_Order_Date"));
					System.out.println(rs.getString("currency")
							+ "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs
							.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs
							.getDouble("delivered_Mandays"));

					System.out
							.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs
							.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					System.out.println(rs.getDouble(38) + "periodrev");
					cust.setperiod_rev(rs.getDouble(38));
					
					double d = rs.getDouble(36);

					this.sum_pm = this.sum_pm + d;

					this.custInfoAll.add(cust);

				}

				String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and   region= '"+ searchName2+ "'  group by masterid ";   

				System.err.println("Search query for start date:-" + strSq11);
				rs = stmt.executeQuery(strSq11);
				
				this.sum_up=0;
				this.sum_dm=0;
				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getString("masterid")+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					
					System.out.println(rs.getString("customer_Name")+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs.getDouble(4) + "manday");
					cust.setdm(rs.getDouble(4));
					System.out.println(rs.getDouble(5) + "manday");
					cust.setperiod_rev(rs.getDouble(5));
					
					
					
						double c = rs.getDouble(3);

					this.sum_up = this.sum_up + c;
					
					int d = rs.getInt(4);

					this.sum_dm = this.sum_dm + d;
				}
				
				
				
			}

			// last
			else if (searchName1 != "" && searchName2 == ""  &&  searchName3 == ""&& searchName4== "" && datea != "" && dateb != "") {
				if (searchName1.equals(All) && datea != "" && dateb != "") {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and  customer_Type in ('New', 'Existing','Inter Company') ";   

					System.err.println("Search5 query for start date:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					
					this.sum_pm=0;
					
					while (rs.next()) {
						Customer cust = new Customer();
						
						System.out.println(rs.getDouble("mandayvalue") + "manday");
						cust.setmandayvalue(rs.getDouble("mandayvalue"));
						
						System.out.println(rs.getDouble(37) + "manday");
						cust.setdm(rs.getDouble(37));
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));

						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						System.out.println(rs.getDouble(38) + "periodrev");
						cust.setperiod_rev(rs.getDouble(38));
						
						double d = rs.getDouble(36);

						this.sum_pm = this.sum_pm + d;

						this.custInfoAll.add(cust);

					}

					String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL   and  customer_Type in ('New', 'Existing','Inter Company') group by masterid ";   

					System.err.println("Search query for start date:-" + strSq11);
					rs = stmt.executeQuery(strSq11);
					this.sum_up=0;
					this.sum_dm=0;
					
					while (rs.next()) {
						Customer cust = new Customer();
						
						System.out.println(rs.getString("masterid")+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						
						System.out.println(rs.getString("customer_Name")+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs.getDouble(4) + "manday");
						cust.setdm(rs.getDouble(4));
						System.out.println(rs.getDouble(5) + "manday");
						cust.setperiod_rev(rs.getDouble(5));
						
						
							double c = rs.getDouble(3);

						this.sum_up = this.sum_up + c;
						
						double e = rs.getDouble(4);

						this.sum_dm = this.sum_dm + e;
					}	
					
					
					
				}
				else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and customer_Type='"+ searchName1+ "' ";   

					System.err.println("Search query for start date:-" + strSq);
					rs = stmt.executeQuery(strSq);
					System.out.println(strSq);
					
					this.sum_pm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						
						System.out.println(rs.getDouble("mandayvalue") + "manday");
						cust.setmandayvalue(rs.getDouble("mandayvalue"));
						
						System.out.println(rs.getDouble(37) + "manday");
						cust.setdm(rs.getDouble(37));
						
						System.out.println(rs.getString("masterid")
								+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						System.out.println(rs.getInt("bR") + "custname");
						cust.setbR(rs.getInt("bR"));
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
						cust.setstage(rs.getString("stage"));
						System.out.println(rs.getString("designation")
								+ "custname");
						cust.setdesignation(rs.getString("designation"));
						System.out.println(rs.getString("order_Booked_By")
								+ "custname");
						cust.setorder_Booked_By(rs.getString("order_Booked_By"));
						System.out.println(rs.getString("work_Order_Date")
								+ "custname");
						cust.setwork_Order_Date(rs
								.getString("work_Order_Date"));
						System.out.println(rs.getString("currency")
								+ "custname");
						cust.setcurrency(rs.getString("currency"));
						System.out.println(rs
								.getDouble("work_Order_Assessment_fee")
								+ "custname");
						cust.setwork_Order_Assessment_fee(rs
								.getDouble("work_Order_Assessment_fee"));
						System.out.println(rs.getString("work_Order_Logo_fee")
								+ "custname");
						cust.setwork_Order_Logo_fee(rs
								.getDouble("work_Order_Logo_fee"));
						System.out.println(rs.getString("shared_Revenue")
								+ "custname");
						cust.setshared_Revenue(rs.getString("shared_Revenue"));
						System.out.println(rs.getDouble("work_Order_Value")
								+ "custname");
						cust.setwork_Order_Value(rs
								.getDouble("work_Order_Value"));
						System.out.println(rs.getDouble("exchange_Rate")
								+ "custname");
						cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs
								.getDouble("updated_WO_Assessment_fee")
								+ "custname");
						cust.setupdated_WO_Assessment_fee(rs
								.getDouble("updated_WO_Assessment_fee"));
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
						System.out.println(rs.getDouble("delivered_Mandays")
								+ "custname");
						cust.setdelivered_Mandays(rs
								.getDouble("delivered_Mandays"));

						System.out
								.println(rs.getString("invoice") + "custname");
						cust.setinvoice(rs.getString("invoice"));
						System.out.println(rs.getString("invoice_Date")
								+ "custname");
						cust.setinvoice_Date(rs.getString("invoice_Date"));
						System.out.println(rs.getDouble("assessment_Fees")
								+ "custname");
						cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
						System.out.println(rs.getDouble("logo_Fee_Database")
								+ "custname");
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						
						System.out.println(rs.getDouble("service_Tax") + "custname");
						cust.setservice_Tax(rs.getDouble("service_Tax"));
						System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
						System.out.println(rs.getDouble(38) + "periodrev");
						cust.setperiod_rev(rs.getDouble(38));
						
						double d = rs.getDouble(36);

						this.sum_pm = this.sum_pm + d;

						this.custInfoAll.add(cust);

					

			}
					
					String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL   and customer_Type='"+ searchName1+ "' group by masterid ";   

					System.err.println("Search query for start date:-" + strSq11);
					rs = stmt.executeQuery(strSq11);
					
					this.sum_up=0;
					this.sum_dm=0;
					while (rs.next()) {
						Customer cust = new Customer();
						
						System.out.println(rs.getString("masterid")+ "custname");
						cust.setNewtableid(rs.getString("masterid"));
						
						System.out.println(rs.getString("customer_Name")+ "custname");
						cust.setcustomer_Name(rs.getString("customer_Name"));
						System.out.println(rs.getDouble("updated_Work_Order")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("updated_Work_Order"));
						System.out.println(rs.getDouble(4) + "manday");
						cust.setdm(rs.getDouble(4));
						System.out.println(rs.getDouble(5) + "manday");
						cust.setperiod_rev(rs.getDouble(5));
						
							double c = rs.getDouble(3);

						this.sum_up = this.sum_up + c;
						
						double e = rs.getDouble(4);

						this.sum_dm = this.sum_dm + e;
					}
				
				
				}
				
			
			
			
			
			}
	////date & vertical
else if (searchName1 == "" && searchName2 == "" && datea != "" && dateb != "" &&  searchName3 != ""&& searchName4== "" ) {
				
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue))   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and vertical='"+ searchName3+ "'  ";   

				System.err.println("Search query for start date:-" + strSq);
				rs = stmt.executeQuery(strSq);
				System.out.println(strSq);
				
				this.sum_pm=0;


				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getDouble("mandayvalue") + "manday");
					cust.setmandayvalue(rs.getDouble("mandayvalue"));
					
					System.out.println(rs.getDouble(37) + "manday");
					cust.setdm(rs.getDouble(37));
					
					System.out.println(rs.getString("masterid")
							+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					System.out.println(rs.getInt("bR") + "custname");
					cust.setbR(rs.getInt("bR"));
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
					cust.setstage(rs.getString("stage"));
					System.out.println(rs.getString("designation")
							+ "custname");
					cust.setdesignation(rs.getString("designation"));
					System.out.println(rs.getString("order_Booked_By")
							+ "custname");
					cust.setorder_Booked_By(rs.getString("order_Booked_By"));
					System.out.println(rs.getString("work_Order_Date")
							+ "custname");
					cust.setwork_Order_Date(rs
							.getString("work_Order_Date"));
					System.out.println(rs.getString("currency")
							+ "custname");
					cust.setcurrency(rs.getString("currency"));
					System.out.println(rs
							.getDouble("work_Order_Assessment_fee")
							+ "custname");
					cust.setwork_Order_Assessment_fee(rs
							.getDouble("work_Order_Assessment_fee"));
					System.out.println(rs.getString("work_Order_Logo_fee")
							+ "custname");
					cust.setwork_Order_Logo_fee(rs
							.getDouble("work_Order_Logo_fee"));
					System.out.println(rs.getString("shared_Revenue")
							+ "custname");
					cust.setshared_Revenue(rs.getString("shared_Revenue"));
					System.out.println(rs.getDouble("work_Order_Value")
							+ "custname");
					cust.setwork_Order_Value(rs
							.getDouble("work_Order_Value"));
					System.out.println(rs.getDouble("exchange_Rate")
							+ "custname");
					cust.setexchange_Rate(rs.getDouble("exchange_Rate"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					System.out.println(rs
							.getDouble("updated_WO_Assessment_fee")
							+ "custname");
					cust.setupdated_WO_Assessment_fee(rs
							.getDouble("updated_WO_Assessment_fee"));
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
					System.out.println(rs.getDouble("delivered_Mandays")
							+ "custname");
					cust.setdelivered_Mandays(rs
							.getDouble("delivered_Mandays"));

					System.out
							.println(rs.getString("invoice") + "custname");
					cust.setinvoice(rs.getString("invoice"));
					System.out.println(rs.getString("invoice_Date")
							+ "custname");
					cust.setinvoice_Date(rs.getString("invoice_Date"));
					System.out.println(rs.getDouble("assessment_Fees")
							+ "custname");
					cust.setassessment_Fees(rs.getDouble("assessment_Fees"));
					System.out.println(rs.getDouble("logo_Fee_Database")
							+ "custname");
					cust.setLogo_Fee_Database(rs
							.getDouble("logo_Fee_Database"));
					System.out.println(rs.getDouble("t_L") + "custname");
					cust.sett_L(rs.getDouble("t_L"));
					System.out.println(rs.getString("period_Mandays")
							+ "custname");
					cust.setperiod_Mandays(rs.getString("period_Mandays"));
					
					System.out.println(rs.getDouble("service_Tax") + "custname");
					cust.setservice_Tax(rs.getDouble("service_Tax"));
					System.out.println(rs.getDouble("total_Invoice_Amount") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("total_Invoice_Amount"));
					System.out.println(rs.getDouble(38) + "periodrev");
					cust.setperiod_rev(rs.getDouble(38));
					
					double d = rs.getDouble(36);

					this.sum_pm = this.sum_pm + d;

					this.custInfoAll.add(cust);

				}

				
				String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),(updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL   and  vertical= '"+ searchName3+ "' group by masterid ";   

				System.err.println("Search query for start date:-" + strSq11);
				rs = stmt.executeQuery(strSq11);
				
				this.sum_up=0;
				this.sum_dm=0;
				while (rs.next()) {
					Customer cust = new Customer();
					
					System.out.println(rs.getString("masterid")+ "custname");
					cust.setNewtableid(rs.getString("masterid"));
					
					System.out.println(rs.getString("customer_Name")+ "custname");
					cust.setcustomer_Name(rs.getString("customer_Name"));
					System.out.println(rs.getDouble("updated_Work_Order")
							+ "custname");
					cust.setupdated_Work_Order(rs
							.getDouble("updated_Work_Order"));
					
					System.out.println(rs.getDouble(4) + "manday");
					cust.setdm(rs.getDouble(4));
					System.out.println(rs.getDouble(5) + "manday");
					cust.setperiod_rev(rs.getDouble(5));
					
						double c = rs.getDouble(3);

					this.sum_up = this.sum_up + c;
					
					double e = rs.getDouble(4);

					this.sum_dm = this.sum_dm + e;
				
				}
			
			
	
				

				
			}
			//date & service

	

			
		//	
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

			String strSql = "select  date_ID,datec,mandayvalue from revenue.table where datec  BETWEEN '"
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
				// this.mandayvalue = rs.getString("mandayvalue");

				System.out.println(rs.getString("date_ID") + "custname");
				cust.setdate_ID(rs.getString("date_ID"));
				System.out.println(rs.getString("datec") + "custname");
				cust.setdatec(rs.getString("datec"));

				System.out.println(rs.getDouble("mandayvalue") + "custname");
				cust.setmandayvalue(rs.getDouble("mandayvalue"));
				int p = rs.getInt(3);

				this.sum_up = this.sum_up + p;

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
		this.custInfoAll.clear();
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
	
	
	public String NavigCustomer() {
	this.custInfoAll.clear();
	this.sum_up=0;
	this.sum_dm=0;
	this.sum_pm=0;
	searchName = "";
	searchName1 = "";
	searchName2 = "";
	searchName3 = "";
	//searchName4 ="";
	datea = "";
	dateb = "";
	
	try {

		

	} catch (Exception e) {
		System.out.println("Exception in getCustomerDetail::"
				+ e.getMessage());
	}
		return "sub";
	}
	
	 public void displayMessage(ActionEvent actionEvent)  
	    {  
	         
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("it worked! "));  
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

package bean;

import bean.Managedbean;
import java.awt.event.ActionEvent;
import java.sql.*;
import java.util.*;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;

public class Customer extends  Managedbean{
	
	private List<Customer> custInfoAll = new ArrayList<Customer>();
	
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

//	public String addAction() throws SQLException {
//		try {
//
//			Labcon lc = new Labcon();
//			MySQLcon = lc.getLocalConnection();
//			stmt = MySQLcon.createStatement();
//			String dbcustid = this.customer_Name;
//			String dbcustname = this.customer_Type;
//			String dbcustadd = this.region;
//			String dbcustwrk = this.workOrder;
//			String dbcustver = this.vertical;
//			String dbcustind = this.industry;
//			String dbcustser = this.service;
//			String dbcuststa = this.stage;
//			String dbcustpro = this.product;
//			String dbcustdes = this.designation;
//			String dbcustoby = this.order_Booked_By;
//			String dbcustwod = this.work_Order_Date;
//			String dbcustcurr = this.currency;
//			double dbcustwo = this.work_Order_Value;
//			double dbcuster = this.exchange_Rate;
//			String dbcustsm = this.start_month;
//			String dbcustsrv = this.shared_Revenue;
//			double dbcustwoas = this.work_Order_Assessment_fee;
//			double dbcustwls = this.work_Order_Logo_fee;
//			double dbcustuws = this.updated_WO_Assessment_fee;
//			String dbcustwomd = this.work_Order_Mandays;
//			double dbcustdm = this.dm;
//			String dbcustsdat = this.startDate;
//			String dbcusten = this.endDate;
//			String dbcustinv = this.invoice;
//			String dbcustivd = this.invoice_Date;
//			double dbcustass = this.assessment_Fees;
//			double dbcustlog = this.logo_Fee_Database;
//			double dbcusttl = this.t_L;
//			int dbcustbr = this.bR;
//			//double dbcustpmr = this.mandayvalue;
//			double dbcuststax = this.service_Tax;
//			String dbcustmid = this.masterid;
//			double dbcustupwo = this.updated_Work_Order;
//			double dbcusttia = this.total_Invoice_Amount;
//			double dbcustprev = this.period_rev;
//			double dbcustmand = this.mandayvalue;
//			String c = "INR";
//			if (dbcustcurr.equals(c)) {
//				String query = "UPDATE revenue.master SET bR = '" + dbcustbr
//						+ "',customer_Name = '" + dbcustid
//						+ "',customer_Type = '" + dbcustname + "',region='"
//						+ dbcustadd + "',vertical='" + dbcustver
//						+ "',industry='" + dbcustind + "',service='"
//						+ dbcustser + "',product='" + dbcustpro + "',stage='"
//						+ dbcuststa + "',designation='" + dbcustdes
//						+ "',order_Booked_By='" + dbcustoby
//						+ "',work_Order_Date='" + dbcustwod + "',currency='"+ dbcustcurr + "',work_Order_Assessment_fee='"+ dbcustwoas + "',work_Order_Logo_fee='" + dbcustwls+ "',shared_Revenue='" + dbcustsrv+ "',work_Order_Value=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),exchange_Rate='" + dbcuster+ "',updated_Work_Order=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),updated_WO_Assessment_fee='" + dbcustwoas+ "',work_Order_Mandays='" + dbcustwomd+ "',start_month='" + dbcustsm+ "',delivered_Mandays='" + dbcustdm + "',startDate='"+ dbcustsdat + "',endDate='" + dbcusten + "',invoice='"+ dbcustinv + "',invoice_Date='" + dbcustivd+ "',assessment_Fees='" + dbcustass+ "',logo_Fee_Database='" + dbcustlog + "',t_L='"+ dbcusttl + "',period_Mandays='" + dbcustmand+ "',workOrder='" + dbcustwrk + "',service_Tax='" + dbcuststax + "',total_Invoice_Amount=('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),Period_Revenue= ((('" + dbcustwoas+ "' + '" + dbcustwls+ "' )/'" + dbcustdm + "')* '" + dbcustmand+ "') where masterid = '"+ dbcustmid + "' ";
//				System.out.println("update in SearchCustomer Table–" +query);
//				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
//			}
//
//			else {
//				String query = "UPDATE revenue.master SET bR = '" + dbcustbr
//						+ "', customer_Name = '" + dbcustid
//						+ "',customer_Type = '" + dbcustname + "',region='"
//						+ dbcustadd + "',vertical='" + dbcustver
//						+ "',industry='" + dbcustind + "',service='"
//						+ dbcustser + "',product='" + dbcustpro + "',stage='"
//						+ dbcuststa + "',designation='" + dbcustdes
//						+ "',order_Booked_By='" + dbcustoby
//						+ "',work_Order_Date='" + dbcustwod + "',currency='"
//						+ dbcustcurr + ",work_Order_Assessment_fee='"
//						+ dbcustwoas + "',work_Order_Logo_fee='" + dbcustwls
//						+ "',shared_Revenue='" + dbcustsrv
//						+ "',work_Order_Value=('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),exchange_Rate='" + dbcuster
//						+ "',updated_Work_Order=('" + dbcuster+ "' * ('" + dbcustwoas+ "' + '" + dbcustwls+ "' ) ),updated_WO_Assessment_fee=('" + dbcustwoas + "' * '"+ dbcuster + "'),work_Order_Mandays='" + dbcustwomd
//						+ "',start_month='" + dbcustsm
//						+ "',delivered_Mandays='" + dbcustdm + "',startDate='"
//						+ dbcustsdat + "',endDate='" + dbcusten + "'invoice='"
//						+ dbcustinv + "', invoice_Date='" + dbcustivd
//						+ "',assessment_Fees='" + dbcustass
//						+ "' logo_Fee_Database='" + dbcustlog + "',t_L='"
//						+ dbcusttl + "',period_Mandays='" + dbcustmand
//						+ "',workOrder='" + dbcustwrk + "'  service_Tax='" + dbcuststax + "',total_Invoice_Amount=('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),Period_Revenue= ((('" + dbcustwoas+ "' + '" + dbcustwls+ "' )/'" + dbcustdm + "')* '" + dbcustmand+ "')  where masterid = '"+ dbcustmid + "' ";
//				System.out.println("Update in SearchCustomer Table–" + query);
//				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
//			}
//
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			System.out.println("Exception in addAction:-" + ex.getMessage());
//		}
//
//		return "insert";
//	}
//
//	// adddateaction
//
//
//	public String updateAction() throws SQLException {
//		try {
//
//			Labcon lc = new Labcon();
//			MySQLcon = lc.getLocalConnection();
//			stmt = MySQLcon.createStatement();
//			
//			String dbcustmid = this.masterid;
//			;
//			//String dbcustda = this.datea;
//			//String dbcustdb = this.dateb;
//
//			for (int i = 0; i < custInfoAll.size(); i++) {
//
//				mandayvalue = custInfoAll.get(i).getmandayvalue();
//				datec = custInfoAll.get(i).getdatec();
//
//				// this.mandayvalue = rs.getString("mandayvalue");
//				System.out.println(mandayvalue);
//				System.out.println(datec);
//
//				String query = "UPDATE revenue.table SET mandayvalue = '"
//						+ mandayvalue + "' where  datec='" + datec
//						+ "'    and  master_masterid ='" + dbcustmid + "' ";
//				System.out.println("Update in SearchCustomer Table–" + query);
//				stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
//
//			}
//		} catch (Exception ex) {
//			ex.printStackTrace();
//			System.out.println("Exception in addAction:-" + ex.getMessage());
//		}
//
//		return "update";
//	}

	
	public List<Customer> getAllCustomer() {

		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder from revenue.master order by customer_Name asc";
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
				cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
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
				this.updated_Work_Order = rs.getDouble("ROUND(updated_Work_Order,2)");
				this.updated_WO_Assessment_fee = rs.getDouble("updated_WO_Assessment_fee");
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
				this.total_Invoice_Amount = rs.getDouble("ROUND(total_Invoice_Amount,2)");
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

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database, t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master left join  revenue.table on (master.masterid=table.master_masterid) where customer_Name like '"+ searchName + "%' or br like '"+ searchName + "%' group by master.masterid ";
			System.err.println("Searche query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();//ROUND(service_Tax,2)
				System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
				cust.setmandayvalue(rs.getDouble("SUM(table.mandayvalue)"));
				
				
			
				
				System.out.println(rs.getDouble("SUM(table.mandayvalue)") + "manday");
				cust.setdm(rs.getDouble("SUM(table.mandayvalue)"));
				
				System.out.println(rs.getString("masterid") + "custname");
				cust.setNewtableid(rs.getString("masterid"));
				System.out.println(rs.getInt("bR") + "br");
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
				
				System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
				cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
				
				System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
				cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));

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
//				System.out.println(rs.getDouble("service_Tax") + "custname");
//				cust.setservice_Tax(rs.getDouble("service_Tax"));
				
				System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
				cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
				
				System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
				cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
				
				
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

			String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder from revenue.master where customer_Name like '"
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
				
				System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
				cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
				
				System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
				cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
				
				
				System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
				cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
				
				System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
				cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
				
				

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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);

					}
				}
			}

			else if (searchName1 == "" &&  searchName3 == ""&& searchName4== "" &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  region='"
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}
//vertical starts
			
			
			else if (searchName1 == "" &&  searchName2 == ""&& searchName4== ""&&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

	//vertical & service		
			else if (searchName1 == "" &&  searchName2 == ""&& searchName3 != "" && searchName4 != null &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' and service='"+ searchName4 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

//region and vertical
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4== "" &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  vertical='"+ searchName3 + "' and region='"+ searchName2 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}

//region and service
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 == "" && searchName4 != null  &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' and region='"+ searchName2 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					double c = rs.getDouble(20);

					this.sum_up = this.sum_up + c;
					double d = rs.getDouble(36);

					this.sum_dm = this.sum_dm + d;


					this.custInfoAll.add(cust);

				}
			}
		
//region & service & vertcal
			else if (searchName1 == "" &&  searchName2 != ""&& searchName3 != "" && searchName4 != null  &&  datea == "" && dateb == "") {
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' and region='"+ searchName2 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));

					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and vertical='"+ searchName3 + "' and region='"+ searchName2 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and region='"+ searchName2 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs
								.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
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
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  service='"+ searchName4 + "' group by master.masterid  ";
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder, SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company') group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;

						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"+ searchName1 + "' and service='"+ searchName4 + "' and vertical='"+ searchName3 + "' group by master.masterid  ";
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("delivered_Mandays")+ "custname");
								
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
						cust.setLogo_Fee_Database(rs
								.getDouble("logo_Fee_Database"));
						System.out.println(rs.getDouble("t_L") + "custname");
						cust.sett_L(rs.getDouble("t_L"));
						System.out.println(rs.getString("period_Mandays")
								+ "custname");
						cust.setperiod_Mandays(rs.getString("period_Mandays"));
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
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
					String strSql = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue)   from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where customer_Type in ('New', 'Existing','Inter Company')and  region='"
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						double c = rs.getDouble(20);

						this.sum_up = this.sum_up + c;
						double d = rs.getDouble(36);

						this.sum_dm = this.sum_dm + d;


						this.custInfoAll.add(cust);
					}

				} else {
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,SUM(table.mandayvalue) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid) where  customer_Type='"
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
						
						
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
				
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and customer_Type='"+ searchName1+ "' and region= '"+ searchName2+ "' ";   

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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
					
					System.out.println(rs.getDouble(38) + "periodrev");
					cust.setperiod_rev(rs.getDouble(38));
					
					double d = rs.getDouble(36);

					this.sum_pm = this.sum_pm + d;

					this.custInfoAll.add(cust);

				}

				
				String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)   where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL   and customer_Type='"+ searchName1+ "' and region= '"+ searchName2+ "' group by masterid ";   

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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")+ "custname");
							
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
							
					
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

					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL  ";   

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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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

						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));

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
						String strSq11 = "select masterid,customer_Name,updated_Work_Order,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2)  from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL group by masterid ";   

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
							
							System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")	+ "custname");
								
							cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
								
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

				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and  region= '"+ searchName2+ "' ";   

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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
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
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and  customer_Type in ('New', 'Existing','Inter Company') ";   

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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
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
					String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and customer_Type='"+ searchName1+ "' ";   

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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
						System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
						cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
						
						System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
						cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
						
						System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
						cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
						System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
								+ "custname");
						cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
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
				
				String strSq = "select masterid,bR,customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Assessment_fee,work_Order_Logo_fee,shared_Revenue,work_Order_Value,exchange_Rate,ROUND(updated_Work_Order,2),ROUND(updated_WO_Assessment_fee,2),work_Order_Mandays,start_month,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,ROUND(service_Tax,2),ROUND(total_Invoice_Amount,2),period_Mandays,workOrder,table.mandayvalue,( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ),ROUND((updated_Work_Order/( select sum(table.mandayvalue) from revenue.table where master.masterid=table.master_masterid  group by master.masterid ) *(table.mandayvalue)),2 ) from revenue.master  left join  revenue.table on (master.masterid=table.master_masterid)    where  datec  BETWEEN '" +datea + "' AND '" +dateb + "' and mandayvalue IS NOT NULL and vertical='"+ searchName3+ "'  ";   

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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
					System.out.println(rs.getString("ROUND(updated_WO_Assessment_fee,2)")+ "custname");
					cust.setupdated_WO_Assessment_fee(rs.getDouble("ROUND(updated_WO_Assessment_fee,2)"));
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
					
					System.out.println(rs.getDouble("ROUND(service_Tax,2)") + "Roundevalue");
					cust.setservice_Tax(rs.getDouble("ROUND(service_Tax,2)"));
					
					System.out.println(rs.getDouble("ROUND(total_Invoice_Amount,2)") + "custname");
					cust.settotal_Invoice_Amount(rs.getDouble("ROUND(total_Invoice_Amount,2)"));
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
					System.out.println(rs.getDouble("ROUND(updated_Work_Order,2)")
							+ "custname");
					cust.setupdated_Work_Order(rs.getDouble("ROUND(updated_Work_Order,2)"));
					
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

				System.out.println(rs.getString("date_ID") + "date_ID");
				cust.setdate_ID(rs.getString("date_ID"));
				System.out.println(rs.getString("datec") + "datec");
				cust.setdatec(rs.getString("datec"));

				System.out.println(rs.getDouble("mandayvalue") + "mandayvalue");
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

	public void getCompanyDetail1() {

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
	 public List<Customer> getAuditDetail() {

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

				String strSql = "select  sample_ID,sampletable.master_masterid,sampletable.mandayvalue,sampletable.auditor_Name,table.datec,table.date_ID from  revenue.table left join  revenue.sampletable on (table.master_masterid=sampletable.master_masterid)  where datec  BETWEEN '"+ datea+ "' AND '"+ dateb+ "' and auditor_Name='"+ searchName1+ "' and sampletable.master_masterid='"+ masterid + "'  ";
				System.err.println("Search5 query:-" + strSql);
				rs = stmt.executeQuery(strSql);

				System.out.println(strSql);
				while (rs.next()) {
					Customer cust = new Customer();
					// this.mandayvalue = rs.getString("mandayvalue");

					System.out.println(rs.getDouble("sample_ID") + "sample_ID");
					cust.setsample_ID(rs.getDouble("sample_ID"));
					System.out.println(rs.getString("datec") + "datec");
					cust.setdatec(rs.getString("datec"));

					System.out.println(rs.getDouble("mandayvalue") + "mandayvalue");
					cust.setmandayvalue(rs.getDouble("mandayvalue"));
					
					System.out.println(rs.getString("auditor_Name") + "auditor_Name");
					cust.setauditor_Name(rs.getString("auditor_Name"));
					
					System.out.println(rs.getString("date_ID") + "date_ID");
					cust.setdate_ID(rs.getString("date_ID"));
					
					

					this.custInfoAll.add(cust);
				}
			} catch (SQLException e) {
				System.out.println("Exception in getCustomerDetail::"
						+ e.getMessage());
			}

			return this.custInfoAll;
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
	
	public String Auditcustomer() {
		getAuditDetail();
		return "entry";
	}
	
	public void postProcessXLS(Object document) {
        HSSFWorkbook wb = (HSSFWorkbook) document;
        HSSFSheet sheet = wb.getSheetAt(0);
        CellStyle style = wb.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.AQUA.getIndex());

        for (Row row : sheet) {
            for (Cell cell : row) {
                cell.setCellValue(cell.getStringCellValue().toUpperCase());
                cell.setCellStyle(style);
            }
        }
    }
	
	
	
	
	
	
	
	
}

package bean;

import java.sql.*;

import java.util.*;
import java.util.List;


public class Customer1 {
	private String customerName;
	private String customerType;
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
	private long so;

	private List<Customer> custInfoAll = new ArrayList<Customer>();

	private String searchName;
	private String searchName1;
	private String searchName2;
	// private String data;

	private List<Customer> selectedItems;

	public List<Customer> getSelectedItems() {

		return selectedItems;

	}

	public void setSelectedItems(List<Customer> selectedItems) {

		this.selectedItems = selectedItems;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
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

	public long getso() {
		return so;
	}

	public void setso(long so) {
		this.so = so;
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
			String dbcustid = this.customerName;
			String dbcustname = this.customerType;
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
			String dbcustupr = this.updated_Work_Order;
			String dbcustsm = this.start_month;

			String query = "UPDATE revenue.chek SET Customer_Name = '"
					+ dbcustid + "',Customer_Type = '" + dbcustname
					+ "',region='" + dbcustadd + "',vertical='" + dbcustver
					+ "',industry='" + dbcustind + "',service='" + dbcustser
					+ "',product='" + dbcustpro + "',stage='" + dbcuststa
					+ "',designation='" + dbcustdes + "',order_Booked_By='"
					+ dbcustoby + "',work_Order_Date='" + dbcustwod
					+ "',currency='" + dbcustcurr + "',work_Order_Value='"
					+ dbcustwo + "',exchange_Rate='" + dbcuster
					+ "',updated_Work_Order='" + dbcustupr + "',start_month='"
					+ dbcustsm + "',workOrder='" + dbcustwrk
					+ "' where workOrder='" + dbcustwrk + "' ";
			System.out.println("Update in SearchCustomer Table?" + query);
			stmt.executeUpdate(query);// rs=stmt.executeQuery(strSql);
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("Exception in addAction:-" + ex.getMessage());
		}

		return "insert";
	}

	public List<Customer> getAllCustomer() {

		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek order by customer_Name asc";
			System.err.println("*select all***" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				cust.setCustomerName(rs.getString("customer_Name"));
				cust.setCustomerType(rs.getString("customer_Type"));
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
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				cust.setstart_month(rs.getString("start_month"));

				this.customerName = rs.getString("customer_Name");
				this.customerType = rs.getString("customer_Type");
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
				this.work_Order_Value = rs.getString("work_Order_Value");
				this.exchange_Rate = rs.getString("exchange_Rate");
				this.updated_Work_Order = rs.getString("updated_Work_Order");
				this.start_month = rs.getString("start_month");

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
		List<Customer> custInfo = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();
			// String customer_Name ="";
			// String BR="20006691";
			// if(customer_Name!=null && workOrder==null ){
			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek where customer_Name like '"
					+ searchName + "%'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			// preparedStatement = connection.prepareStatement(strSql);
			// preparedStatement.setString(1, "%" + customerName + "%");
			// rs = preparedStatement.executeQuery();
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setCustomerName(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setCustomerType(rs.getString("customer_Type"));
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
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return custInfo;
	}

	public List<Customer> getmonth() {
		List<Customer> custmon = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();
			// String customer_Name ="";
			// String BR="20006691";
			// if(customer_Name!=null && workOrder==null ){
			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek where start_month='"
					+ selectedItems + "'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			// preparedStatement = connection.prepareStatement(strSql);
			// preparedStatement.setString(1, "%" + customerName + "%");
			// rs = preparedStatement.executeQuery();
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setCustomerName(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setCustomerType(rs.getString("customer_Type"));
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
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return custmon;
	}

	public List<Customer> getSum() {
		List<Customer> sum1 = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		int so = 0;
		try {
			stmt = MySQLcon.createStatement();
			// String customer_Name ="";public List<Object[]>
			// getFirstClassPrices() {
			// String BR="20006691";
			// if(customer_Name!=null && workOrder==null ){
			String strSql = "select updated_Work_Order from revenue.chek where start_month='"
					+ selectedItems + "'";
			// SUM(IF(start_month = 'data'))
			//
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			// List<Customer[]> lista = strSql.getResultList();
			// return lista;
			// preparedStatement = connection.prepareStatement(strSql);
			// preparedStatement.setString(1, "%" + customerName + "%");
			// rs = preparedStatement.executeQuery();
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();

				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));
				int c = rs.getInt(1);
				this.so = this.so + c;

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

		return sum1;
	}

	public List<Customer> getAllDetail() {
		List<Customer> custalll = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();
			// String customer_Name ="";
			// String BR="20006691";
			// if(customer_Name!=null && workOrder==null ){
			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek where customer_Name like '"
					+ searchName + "%'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			// preparedStatement = connection.prepareStatement(strSql);
			// preparedStatement.setString(1, "%" + customerName + "%");
			// rs = preparedStatement.executeQuery();
			System.out.println(strSql);
			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setCustomerName(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setCustomerType(rs.getString("customer_Type"));
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
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setexchange_Rate(rs.getString("updated_Work_Order"));

				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));

				this.custInfoAll.add(cust);
			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return custalll;
	}

	public List<Customer> getTwoDetail() {
		List<Customer> drop = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();

		try {
			stmt = MySQLcon.createStatement();
			// String strSql=null;
			// if(searchName1!=null ){
			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek where customer_Type='"
					+ searchName1
					+ "' and region='"
					+ searchName2
					+ "' and start_month='" + selectedItems + "' ";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);
			System.out.println(strSql);

			System.out.println("List : " + this.selectedItems);

			while (rs.next()) {
				Customer cust = new Customer();
				System.out.println(rs.getString("customer_Name") + "custname");
				cust.setCustomerName(rs.getString("customer_Name"));
				System.out.println(rs.getString("customer_Type") + "custname");
				cust.setCustomerType(rs.getString("customer_Type"));
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
				System.out.println(rs.getString("work_Order_Value")
						+ "custname");
				cust.setwork_Order_Value(rs.getString("work_Order_Value"));
				System.out.println(rs.getString("exchange_Rate") + "custname");
				cust.setexchange_Rate(rs.getString("exchange_Rate"));
				System.out.println(rs.getString("updated_Work_Order")
						+ "custname");
				cust.setupdated_Work_Order(rs.getString("updated_Work_Order"));

				System.out.println(rs.getString("start_month") + "custname");
				cust.setstart_month(rs.getString("start_month"));

				int c = rs.getInt(15);
				this.so = this.so + c;

				this.custInfoAll.add(cust);
			}

		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return drop;
	}

	// store all data into a List

	/*
	 * else if(workOrder!=null ) {String strSql=
	 * "select customer_Name,customer_Type,region,workOrder from revenue.master2 where workOrder like '"
	 * +searchName+"%'"; System.err.println("Search query:-"+strSql);
	 * rs=stmt.executeQuery(strSql); System.out.println(strSql);
	 * while(rs.next()){ Customer cust = new Customer();
	 * System.out.println(rs.getString("customer_Name")+"custname");
	 * cust.setCustomerName(rs.getString("customer_Name"));
	 * System.out.println(rs.getString("customer_Type")+"custname");
	 * cust.setCustomerType(rs.getString("customer_Type"));
	 * System.out.println(rs.getString("region")+"custname");
	 * cust.setRegion(rs.getString("region"));
	 * System.out.println(rs.getString("workOrder")+"custname");
	 * cust.setWorkOrder(rs.getString("workOrder")); this.custInfoAll.add(cust);
	 * return custInfo; }}}
	 * 
	 * 
	 * 
	 * catch(SQLException se){
	 * 
	 * se.printStackTrace(); }catch(Exception e){
	 * 
	 * e.printStackTrace(); }
	 * 
	 * 
	 * finally{{
	 * 
	 * try{ if(stmt!=null) MySQLcon.close(); }catch(SQLException se){ } try{
	 * if(rs!=null) rs.close(); }catch(Exception se){ } try{ if(MySQLcon!=null)
	 * MySQLcon.close(); }catch(SQLException se){ se.printStackTrace(); } }}
	 * return custInfo;
	 * 
	 * }
	 */

	public void getEditDetail() {
		// Customer edit = new Customer();
		try {
			// String customer = (String)
			// FacesContext.getCurrentInstance().getExternalContext().getRequestMap().get("workOrder");

			System.out.println("customer" + this.workOrder);
			/*
			 * this.customerName = customer.customerName; this.customerType =
			 * customer.customerType; this.region = customer.region;
			 * this.vertical = customer.vertical; this.industry =
			 * customer.industry; this.service = customer.service; this.product
			 * = customer.product; this.stage = customer.stage; this.designation
			 * = customer.designation; this.order_Booked_By =
			 * customer.order_Booked_By; this.work_Order_Date =
			 * customer.work_Order_Date; this.currency = customer.currency;
			 * this.work_Order_Value = customer.work_Order_Value;
			 * this.exchange_Rate = customer.exchange_Rate;
			 * this.updated_Work_Order = customer.updated_Work_Order;
			 * this.start_month = customer.start_month; this.workOrder =
			 * customer.workOrder;
			 */// store all data into a List
				// return edit;

		} catch (Exception e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}

	}

	public List<Customer> getEditDetail2() {
		List<Customer> editInfo1 = new ArrayList<Customer>();
		Labcon lc = new Labcon();
		MySQLcon = lc.getLocalConnection();
		try {
			stmt = MySQLcon.createStatement();

			// String
			// strSql="insert into revenue.master2(customer_Name,customer_Type,region,workOrder) values ('"+dbcustid+"','"+dbcustname+"','"+dbcustadd+"','"+dbcustwrk+"')";
			String strSql = "select customer_Name,customer_Type,region,vertical,industry,service,product,stage,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,updated_Work_Order,start_month,workOrder from revenue.chek where customer_Type='"
					+ searchName1 + "' and region='" + searchName2 + "'";
			System.err.println("Search query:-" + strSql);
			rs = stmt.executeQuery(strSql);

			System.out.println(strSql);
			while (rs.next()) {
				this.customerName = rs.getString("customer_Name");
				this.customerType = rs.getString("customer_Type");
				this.region = rs.getString("region");
				this.vertical = rs.getString("vertical");
				this.industry = rs.getString("industry");
				this.service = rs.getString("service");
				this.product = rs.getString("product");
				this.stage = rs.getString("stage");
				this.designation = rs.getString("designation");
				this.order_Booked_By = rs.getString("order_Booked_By");
				this.work_Order_Date = rs.getString("work_Order_Date");
				this.currency = rs.getString("currency");
				this.work_Order_Value = rs.getString("work_Order_Value");
				this.exchange_Rate = rs.getString("exchange_Rate");
				this.updated_Work_Order = rs.getString("updated_Work_Order");
				this.start_month = rs.getString("start_month");
				this.workOrder = rs.getString("workOrder");
				// store all data into a List

			}
		} catch (SQLException e) {
			System.out.println("Exception in getCustomerDetail::"
					+ e.getMessage());
		}
		return editInfo1;
	}

	public String ResultCustomer() {
		getCustomerDetail();
		return "result";
	}

	public String addCustomer() throws SQLException {
		try {
			System.out.println("in add customer");

		} catch (Exception ex) {
			System.out.println("Exception in addCustomer:-" + ex.getMessage());

		}
		return "add";
	}

	public String EditCustomer() {
		getEditDetail();
		return "result1";
	}

	public String ResultAll() {
		getAllDetail();
		return "all";
	}

	public String Twocustomer() {
		getTwoDetail();
		return "two";
	}

	public String Dropcustomer() {
		getEditDetail2();
		return "three";
	}

	public String Month() {
		getmonth();
		return "mon";
	}

	public String Summation() {
		getSum();
		return "sum";
	}
}

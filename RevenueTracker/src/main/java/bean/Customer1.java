package bean;

import java.sql.*;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.*;

//import com.mysql.jdbc.PreparedStatement;

public class Customer1 {
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
	private String datec1;
	private String dateb1;
	private String datea1;
	private String invoice1;
	private double assessment_Fees1;
	private double service_Tax1;
	private double total_Invoice_Amount1;
	private double logo_Fee_Database1;
	private long sum_up1;
	private long sum_pm1;
	private int pm1;
	private double dm1;
	private String sm1;
	private String sum_Del1;
	private String invoice_Date1;
	private double t_L1;
	private int bR1;
	private int bR;
	private String mandayvalue;
	private int mandayvalue1;
	private String foreign;
	private String masterid1;
	private String period_Mandays1;
	private String date_ID1;
	private String searchName;
	private String searchName1;
	private String searchName2;
	private String searchName3;
	private List<Customer1> custInfoA = new ArrayList<Customer1>();
	int set_sum;
	int set_sum1;

	public String getNewtableid() {
		return masterid1;
	}

	public void setNewtableid(String masterid1) {
		this.masterid1 = masterid1;
	}

	public String getwork_Order_Mandays() {
		return work_Order_Mandays1;
	}

	public void setwork_Order_Mandays(String work_Order_Mandays1) {
		this.work_Order_Mandays1 = work_Order_Mandays1;
	}

	public double getLogo_Fee_Database() {

		return logo_Fee_Database1;
	}

	public void setLogo_Fee_Database(double logo_Fee_Database1) {
		this.logo_Fee_Database1 = logo_Fee_Database1;

	}
	
	public double gettotal_Invoice_Amount() {

		return total_Invoice_Amount1;
	}

	public void settotal_Invoice_Amount(double total_Invoice_Amount1) {
		this.total_Invoice_Amount1 = total_Invoice_Amount1;

	}
	
	
	public int getbR1() {

		return bR1;
	}

	public void setbR1(int bR1) {
		this.bR1 = bR1;

	}
	
	
	public double getservice_Tax() {

		return service_Tax1;
	}

	public void setservice_Tax(double service_Tax1) {
		this.service_Tax1 = service_Tax1;

	}
	
	

	public double getassessment_Fees() {
		return assessment_Fees1;
	}

	public void setassessment_Fees(double assessment_Fees1) {
		this.assessment_Fees1 = assessment_Fees1;
	}

	public double gett_L() {
		return t_L1;
	}

	public void sett_L(double t_L1) {
		this.t_L1 = t_L1;
	}

	public String getdate_ID() {
		return date_ID1;
	}

	public void setdate_ID(String date_ID1) {
		this.date_ID1 = date_ID1;
	}

	public int getbR() {
		return bR;
	}

	public void setbR(int bR) {
		this.bR = bR;
	}

	public double getdm() {
		return dm1;
	}

	public void setdm(double dm1) {
		this.dm1 = dm1;
	}

	public String getsm() {
		return sm1;
	}

	public void setsm(String sm1) {
		this.sm1 = sm1;
	}

	public String getperiod_Mandays() {
		return period_Mandays1;
	}

	public void setperiod_Mandays(String period_Mandays1) {
		this.period_Mandays1 = period_Mandays1;
	}

	public String getdatea() {
		return datea1;
	}

	public void setdatea(String datea1) {
		this.datea1 = datea1;
	}

	public String getmandayvalue() {
		return mandayvalue;
	}

	public void setmandayvalue(String mandayvalue) {
		this.mandayvalue = mandayvalue;
	}

	public int getmandayvalue1() {
		return mandayvalue1;
	}

	public void setmandayvalue1(int mandayvalue1) {
		this.mandayvalue1 = mandayvalue1;
	}

	public String getdatec() {
		return datec1;
	}

	public void setdatec(String datec1) {
		this.datec1 = datec1;
	}

	public String getforeign() {
		return foreign;
	}

	public void setforeign(String foreign) {
		this.foreign = foreign;
	}

	public String getInvoice_Date() {
		return invoice_Date1;
	}

	public void setinvoice_Date(String invoice_Date1) {
		this.invoice_Date1 = invoice_Date1;

	}

	public String getInvoice() {
		return invoice1;
	}

	public void setinvoice(String invoice1) {
		this.invoice1 = invoice1;
	}

	public String getcustomer_Name() {
		return customer_Name1;
	}

	public void setcustomer_Name(String customer_Name1) {
		this.customer_Name1 = customer_Name1;
	}

	public double getdelivered_Mandays() {
		return delivered_Mandays1;
	}

	public void setdelivered_Mandays(double delivered_Mandays1) {
		this.delivered_Mandays1 = delivered_Mandays1;
	}

	public String getstartDate() {
		return startDate1;
	}

	public void setstartDate(String startDate1) {
		this.startDate1 = startDate1;
	}

	public String getendDate() {
		return endDate1;
	}

	public void setendDate(String endDate1) {
		this.endDate1 = endDate1;
	}

	public String getdateb() {
		return dateb1;
	}

	public void setdateb(String dateb1) {
		this.dateb1 = dateb1;
	}

	public double getwork_Order_Assessment_fee() {
		return work_Order_Assessment_fee1;
	}

	public void setwork_Order_Assessment_fee(double work_Order_Assessment_fee1) {
		this.work_Order_Assessment_fee1 = work_Order_Assessment_fee1;
	}

	public double getupdated_WO_Assessment_fee() {
		return updated_WO_Assessment_fee1;
	}

	public void setupdated_WO_Assessment_fee(double updated_WO_Assessment_fee1) {
		this.updated_WO_Assessment_fee1 = updated_WO_Assessment_fee1;
	}

	public double getwork_Order_Logo_fee() {
		return work_Order_Logo_fee1;
	}

	public void setwork_Order_Logo_fee(double work_Order_Logo_fee1) {
		this.work_Order_Logo_fee1 = work_Order_Logo_fee1;
	}

	public String getcustomer_Type() {
		return customer_Type1;
	}

	public void setcustomer_Type(String customer_Type1) {
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

	public String getRegion() {
		return region1;
	}

	public void setRegion(String region1) {
		this.region1 = region1;
	}

	public String getWorkOrder() {
		return workOrder1;
	}

	public void setWorkOrder(String workOrder1) {
		this.workOrder1 = workOrder1;
	}

	public String getVertical() {
		return vertical1;
	}

	public void setVertical(String vertical1) {
		this.vertical1 = vertical1;
	}

	public long getsum_up() {
		return sum_up1;
	}

	public void setsum_up(long sum_up1) {
		this.sum_up1 = sum_up1;
	}

	public long getsum_pm() {
		return sum_pm1;
	}

	public void setsum_pm(long sum_pm1) {
		this.sum_pm1 = sum_pm1;
	}

	public int getpm() {
		return pm1;
	}

	public void setpm(int pm1) {
		this.pm1 = pm1;
	}

	public String getsum_Del() {
		return sum_Del1;
	}

	public void setsum_Del(String sum_Del1) {
		this.sum_Del1 = sum_Del1;
	}

	public String getindustry() {
		return industry1;
	}

	public void setindustry(String industry1) {
		this.industry1 = industry1;
	}

	public String getservice() {
		return service1;
	}

	public void setservice(String service1) {
		this.service1 = service1;
	}

	public String getproduct() {
		return product1;
	}

	public void setproduct(String product1) {
		this.product1 = product1;
	}

	public String getstage() {
		return stage1;
	}

	public void setstage(String stage1) {
		this.stage1 = stage1;
	}

	public String getdesignation() {
		return designation1;
	}

	public void setdesignation(String designation1) {
		this.designation1 = designation1;
	}

	public String getorder_Booked_By() {
		return order_Booked_By1;
	}

	public void setorder_Booked_By(String order_Booked_By1) {
		this.order_Booked_By1 = order_Booked_By1;
	}

	public String getwork_Order_Date() {
		return work_Order_Date1;
	}

	public void setwork_Order_Date(String work_Order_Date1) {
		this.work_Order_Date1 = work_Order_Date1;
	}

	public String getcurrency() {
		return currency1;
	}

	public void setcurrency(String currency1) {
		this.currency1 = currency1;
	}

	public String getshared_Revenue() {
		return shared_Revenue1;
	}

	public void setshared_Revenue(String shared_Revenue1) {
		this.shared_Revenue1 = shared_Revenue1;
	}

	public double getwork_Order_Value() {
		return work_Order_Value1;
	}

	public void setwork_Order_Value(double work_Order_Value1) {
		this.work_Order_Value1 = work_Order_Value1;
	}

	public double getexchange_Rate() {
		return exchange_Rate1;
	}

	public void setexchange_Rate(double exchange_Rate1) {
		this.exchange_Rate1 = exchange_Rate1;
	}

	public double getupdated_Work_Order() {
		return updated_Work_Order1;
	}

	public void setupdated_Work_Order(double updated_Work_Order1) {
		this.updated_Work_Order1 = updated_Work_Order1;
	}

	

	public List<Customer1> getCustInfoAll() {
		return custInfoA;
	}

	public void setCustInfoAll(List<Customer1> custInfoA) {
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
		String dbcustname = this.customer_Type1;
		String dbcustadd = this.region1;
		String dbcustwrk = this.workOrder1;
		String dbcustver = this.vertical1;
		String dbcustind = this.industry1;
		String dbcustser = this.service1;
		String dbcuststa = this.stage1;
		String dbcustpro = this.product1;
		String dbcustdes = this.designation1;
		String dbcustoby = this.order_Booked_By1;
		String dbcustwod = this.work_Order_Date1;
		String dbcustcurr = this.currency1;
		double dbcustwo = this.work_Order_Value1;
		double dbcuster = this.exchange_Rate1;
		
		String dbcustsrv = this.shared_Revenue1;
		double dbcustwoas = this.work_Order_Assessment_fee1;
		double dbcustwls = this.work_Order_Logo_fee1;
		double dbcustupwo = this.updated_Work_Order1;
		double dbcustuws = this.updated_WO_Assessment_fee1;
		String dbcustwomd = this.work_Order_Mandays1;
		double dbcustdm = this.dm1;//period_Mandays
		String dbcustsdat = this.startDate1;
		String dbcusten = this.endDate1;
		String dbcustinv = this.invoice1;
		String dbcustivd = this.invoice_Date1;
		double dbcustass = this.assessment_Fees1;
		double dbcustlog = this.logo_Fee_Database1;
		double dbcusttl = this.t_L1;
		int dbcustbr = this.bR1;
		int dbcustmand = this.mandayvalue1;
		int masterid;
		int master_masterid;
		double dbcuststax = this.service_Tax1;
		double dbcusttia = this.total_Invoice_Amount1;
		String cu = "INR";
		String da = "0000-00-00";
		
		if(dbcustwod=="" && dbcustsdat=="" && dbcusten=="" && dbcustivd==""){
		
		if (dbcustcurr.equals(cu)  ) {
		String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical,industry,service,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + da + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcustwoas + "','" + dbcustwomd + "','" + dbcustdm + "','" + da + "','" + da + "','" + dbcustinv + "','" + da + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
		System.out.println("Update Check in SearchCustomer Table–" + query);
		stmt.executeUpdate(query);
		}
		else{

			String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical1,industry,service1,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Manday,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + da + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcuster+ "' * ('" + dbcustwoas+ "' + '" + dbcustwls+ "' ) ),('" + dbcustwoas + "' * '"+ dbcuster + "'),'" + dbcustwomd + "','" + dbcustdm + "','" + da + "','" + da + "','" + dbcustinv + "','" + da + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
			System.out.println("Update Check in SearchCustomer Table–" + query);
			stmt.executeUpdate(query);
				
		}
		
		}
		else {

			
			if (dbcustcurr.equals(cu)  ) {
			String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical,industry,service,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Mandays,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + dbcustwod + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcustwoas + "','" + dbcustwomd + "','" + dbcustdm + "','" + dbcustsdat + "','" + dbcusten + "','" + dbcustinv + "','" + dbcustivd + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
			System.out.println("Update Check in SearchCustomer Table–" + query);
			stmt.executeUpdate(query);
			}
			else{

				String query = "insert into revenue.master(bR,customer_Name,customer_Type,region,workOrder,vertical1,industry,service1,stage,product,designation,order_Booked_By,work_Order_Date,currency,work_Order_Value,exchange_Rate,shared_Revenue,work_Order_Assessment_fee,work_Order_Logo_fee,updated_Work_Order,updated_WO_Assessment_fee,work_Order_Manday,delivered_Mandays,startDate,endDate,invoice,invoice_Date,assessment_Fees,logo_Fee_Database,t_L,service_Tax,total_Invoice_Amount,period_Mandays) values('" + dbcustbr + "','" + dbcustid + "','" + dbcustname + "','" + dbcustadd + "','" + dbcustwrk + "','" + dbcustver + "','" + dbcustind + "','" + dbcustser + "','" + dbcuststa + "','" + dbcustpro + "','" + dbcustdes + "','" + dbcustoby + "','" + dbcustwod + "','" + dbcustcurr + "',('" + dbcustwoas+ "' + '" + dbcustwls+ "' ),'" + dbcuster + "','" + dbcustsrv + "','" + dbcustwoas + "','" + dbcustwls+ "' ,('" + dbcuster+ "' * ('" + dbcustwoas+ "' + '" + dbcustwls+ "' ) ),('" + dbcustwoas + "' * '"+ dbcuster + "'),'" + dbcustwomd + "','" + dbcustdm + "','" + dbcustsdat + "','" + dbcusten + "','" + dbcustinv + "','" + dbcustivd + "','" + dbcustass + "','" + dbcustlog + "','" + dbcusttl + "','" + dbcuststax + "',('" + dbcustass + "' + '"+ dbcustlog + "'+'"+ dbcusttl + "'+'"+ dbcuststax + "'),'"+ dbcustmand + "' )";
				System.out.println("Update Check in SearchCustomer Table–" + query);
				stmt.executeUpdate(query);
					
			}
			
			
		}
		
		 
        String sql = "SELECT masterid from revenue.master where customer_Name= '" + dbcustid + "'";
        System.err.println("Search5 query:-" + sql);
      
		ResultSet rs = stmt.executeQuery(sql); 
		ArrayList<String> arrl = new ArrayList<String>();
		while (rs.next()) {
			arrl.add(rs.getString("masterid"));
			
			Iterator<String> itr = arrl.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			
		}
       
//date to srore in db
		String date="2014-01-00";
		String incDate;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(date));
		for(int co=0; co<365; co++){
		    c.add(Calendar.DATE, 1); 
		    incDate = sdf.format(c.getTime());
		    System.out.println(incDate);
		    
		    
		     
		 // String mandayvalue = "";
		  for (int i = 0; i < arrl.size(); i++) {
		 String sql1 = "INSERT  INTO revenue.table(master_masterid,datec) VALUES('"+ arrl.get(i) +"','"+incDate+"')";
		 System.out.println(sql);
      
      pstm = (PreparedStatement) MySQLcon.prepareStatement(sql1);

      pstm.execute();
		  }
    	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}} catch (Exception ex) {
		ex.printStackTrace();
		System.out.println("Exception in addAction:-" + ex.getMessage());
	}

	return "add";
}

//public static void main(String[] args) throws ParseException {
//    // TODO Auto-generated method stub
//
//    try{
//        Class.forName("com.mysql.jdbc.Driver");  
//
//        PreparedStatement pstm = null ;  
//        Labcon lc = new Labcon();
//		Connection MySQLcon = lc.getLocalConnection();
//		java.sql.Statement stmt = MySQLcon.createStatement();
//    	 
//    
//       
//           
//        	
//          
//           
//           String sql = "SELECT masterid from revenue.master ";
//           System.err.println("Search5 query:-" + sql);
//         
//		ResultSet rs = stmt.executeQuery(sql); 
//		ArrayList<String> arrl = new ArrayList<String>();
//		while (rs.next()) {
//			arrl.add(rs.getString("masterid"));
//			
//			Iterator<String> itr = arrl.iterator();
//			while (itr.hasNext()) {
//				System.out.println(itr.next());
//			}
//		}
//           
////date to srore in db
//		String date="2014-01-00";
//		String incDate;
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		Calendar c = Calendar.getInstance();
//		c.setTime(sdf.parse(date));
//		for(int co=0; co<1; co++){
//		    c.add(Calendar.DATE, 1); 
//		    incDate = sdf.format(c.getTime());
//		    System.out.println(incDate);
//		    
//		    
//		     
//		 // String mandayvalue = "";
//		  for (int i = 0; i < arrl.size(); i++) {
//		 String sql1 = "INSERT  INTO revenue.table(master_masterid,datec) VALUES('"+ arrl.get(i) +"','"+incDate+"')";
//		 System.out.println(sql);
//         
//         pstm = (PreparedStatement) MySQLcon.prepareStatement(sql1);
//  
//         pstm.execute();
//		  }
//       
//    }
//		
//    
//    }
//		catch(ClassNotFoundException e){
//        System.out.println(e);
//    }catch(SQLException ex){
//        System.out.println(ex);
//    }
//   
//}




}
	
	
	
	
	

	
	
	
	

	
	
	


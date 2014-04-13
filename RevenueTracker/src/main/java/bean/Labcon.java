package bean;
 import java.sql.Connection;
 import java.sql.DriverManager;
import java.sql.SQLException;

public class Labcon {
 Connection conn = null;
 public Connection getLocalConnection()

{
 try
 {
	 
	 //Connection conn = null;
	 //String url = "jdbc:mysql://localhost:3306/";
	 //String strConstr = "jdbc:mysql://localhost:3306/";
	//String db = "revenue";   
	 //String driver = "com.mysql.jdbc.Driver"; String strPassword = "Bsnlinv@";
		//String userName ="root";
	 //String password="Bsnlinv@";

	//Class.forName("com.mysql.jdbc.Driver");
	//con = DriverManager.getConnection(strConstr+db,userName,password);
	 //conn = DriverManager.getConnection(strConstr+db,userName,password);
	 String strConstr = "jdbc:mysql://localhost:3306/revenue";
	   String strUsername = "root";                                                                          
	   String strPassword = "Bsnlinv@";
	   Class.forName("com.mysql.jdbc.Driver");
	   //Connection conn=null;
    System.out.println("Connecting to a selected database...");
    conn = DriverManager.getConnection(strConstr,strUsername,strPassword);
    System.out.println("Connected database successfully...");
	 
			 

}
catch (ClassNotFoundException e)
 {
 System.err.println("ClassNotFoundException"+ e.getMessage());

}
 catch (SQLException e)
 {
 System.err.println("SQLException in getConnection" + e.getMessage());
 }

return conn;
 }
 public void setConnectionClose() throws SQLException
 {
 conn.close();
 }

}


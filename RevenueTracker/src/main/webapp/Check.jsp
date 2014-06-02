<%@  page import="java.io.*,java.util.*"  language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"     "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean  id="user" class="user.LoginUser" scope="session"></jsp:useBean>
<jsp:setProperty name="user" property="*"/> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login checking</title>
</head>
<body>
<%

 String USER=user.getUsername();
 int PASSWORD=user.getPassword();
 if(USER.equals("Aiswarya"))
 {
 if(PASSWORD==12345)
 {
     pageContext.forward("Home.jsp");
 }
 
 
 else
 {
     out.println("Wrong password");
     pageContext.include("login.jsp");
 }
 
 }

 else if(USER.equals("abc"))
 {
	 if(PASSWORD==12345)
	 {
	     pageContext.forward("Home.jsp");
	 }
	 
	 
	 
	 
	 else
	 {
	     out.println("Wrong password");
	     pageContext.include("login.jsp");
	 }
	 

	 }
 
 else if(USER.equals("xyz"))
 {
	 if(PASSWORD==12345)
	 {
	     pageContext.forward("Home.jsp");
	 }
	 
	 
	 
	 
	 else
	 {
	     out.println("Wrong password");
	     pageContext.include("login.jsp");
	 }
	 

	 }

 
 
 
 else{
	 out.println("Wrong entry");
 }

%>

</body>
</html>
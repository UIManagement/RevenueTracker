package bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class testClass {

	public static void main(String [] args) throws Exception
	{
		String fromDate="01/01/2014";
		String toDate="05/01/2014";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(fromDate));
		
		Calendar start = Calendar.getInstance();
		start.setTime(sdf.parse(fromDate));
		Calendar end = Calendar.getInstance();
		end.setTime(sdf.parse(toDate));

		for (Date date = start.getTime(); !start.after(end); start.add(Calendar.DATE, 1), date = start.getTime()) {
		    System.out.println("insert into mandays " + date);
		}
		
	}
}

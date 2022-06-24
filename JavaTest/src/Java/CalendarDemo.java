package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cl =Calendar.getInstance();
		SimpleDateFormat sdf =new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(cl.getTime()));
		
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	}

}

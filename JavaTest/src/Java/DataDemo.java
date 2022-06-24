package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dt =new Date();
		System.out.println(dt.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		
		System.out.println(sdf.format(dt));
		
		
SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sd.format(dt));
	}

}

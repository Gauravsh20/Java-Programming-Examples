package task_21_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormate {

		  public static void main(String[] args) throws InterruptedException {
		    SimpleDateFormat DateFormat = new SimpleDateFormat("MM/dd/yyyy");
		    SimpleDateFormat DateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
		    
		    Calendar c = Calendar.getInstance();


		    System.out.println("The original Date: " + c.getTime());

		  
		    String curr_date = DateFormat.format(c.getTime());
		    System.out.println("Formatted Date\"MM/dd/yyyy\": " + curr_date);
		    String curr_date2 = DateFormat2.format(c.getTime());
		    System.out.println("Formatted Date\"dd/MM/yyyy\": " + curr_date2);


	}

}

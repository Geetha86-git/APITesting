import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Finddate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
	
		
		  String givenDate = "28-Jun-2020"; 
		  int numberOfDays = 5;
		  
		  
		  SimpleDateFormat sf = new SimpleDateFormat("MM-YYYY-d");
		  
		  Date d = new Date(givenDate); 
		  
		  System.out.println(d); System.out.println(sf.format(d));
		 
		
		/*
		 * String pattern = "yyyy-MM-dd"; SimpleDateFormat simpleDateFormat = new
		 * SimpleDateFormat(pattern); System.out.println(new Date()); String date =
		 * simpleDateFormat.format(new Date()); System.out.println(date);
		 */
		
		/*
		 * String givenDate = "28-Jun-2020"; SimpleDateFormat formatter2=new
		 * SimpleDateFormat("yyyy-mm-dd"); Date date2=formatter2.parse(givenDate);
		 */
		
		//LocalDate date = LocalDate.parse(givenDate);
		//System.out.println(date.plusDays(numberOfDays));
		
		 /*String date1 ="08-06-2020";
		 
		  DateTimeFormatter df = DateTimeFormatter.ofPattern("d-MM-uuuu");
		  LocalDate  d1 = LocalDate.parse(date1, df);
		  
		  System.out.println(d1);
		  System.out.println(d1.plusDays(5));*/
	}

}

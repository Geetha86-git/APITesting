import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class identifyMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "25.07.2007";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern( "MM.dd.yyyy" );
		LocalDate localDate = LocalDate.parse( input , formatter );
		
		System.out.println(localDate.getMonthValue());
	}

}

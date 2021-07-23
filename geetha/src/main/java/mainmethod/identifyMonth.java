package mainmethod;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class identifyMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "25.07.2007";
		SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
		LocalDate localDate = LocalDate.of(2007, 07, 25);
		
		System.out.println(localDate.getMonth());
	}

}

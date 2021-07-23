import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class convertNumberToCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double d = sc.nextDouble();
		convertNumberToCurrency c = new convertNumberToCurrency();
		 Locale indiaLocale = new Locale("en", "IN");
		c.getCurrency(d,Locale.CHINA);
		c.getCurrency(d,Locale.US);
		c.getCurrency(d,Locale.FRANCE);
		c.getCurrency(d,indiaLocale);

	}
	
	
	public void getCurrency(double number,Locale locale)
	{
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String s = formatter.format(number);
		System.out.println(locale +": "+s);
	}

}

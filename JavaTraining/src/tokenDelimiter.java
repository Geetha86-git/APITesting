import java.util.Scanner;
import java.util.StringTokenizer;

public class tokenDelimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String regex = "[!._,'@? ]";
		
		StringTokenizer strToken = new StringTokenizer(str,regex);
		System.out.println(strToken.countTokens());
		
		while(strToken.hasMoreTokens())
		{
			System.out.println(strToken.nextElement());
		}
		
	}

}

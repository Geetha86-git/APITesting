import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patternIdentifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		String regex =  "([A-Z]*)$";
	
		while(testCases>0)
		{
			String pattern = in.nextLine();
			
			Pattern p = Pattern.compile(regex);
			
			Matcher m = p.matcher(pattern);
			
			System.out.println(m.matches());
			}
			
			
			
		}
        

	}


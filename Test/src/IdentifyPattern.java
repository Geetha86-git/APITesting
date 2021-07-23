import java.util.Scanner;

public class IdentifyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter String");
		String s = sc.nextLine();*/
		String p = "abcd";
		String s = "abcabcdacd";
		int count = 0;
		
		if(s.las)
		
		for(int i =0;i<s.length();i++)
		{
			for(int j =0;j<p.length();j++)
			{
				if(p.charAt(j)==s.charAt(j))
				{
					count++;
				}
				else
				{
					count = 0;
				}
			}
			if(count==p.length())
			{
				System.out.println("Pattern FOund");
				break;
			}
		}
		if(count!=p.length())
		{
			System.out.println("Pattern not found");
		}
	}

}

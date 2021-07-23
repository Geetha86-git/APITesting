import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String s1 = sc.nextLine();
		
		System.out.println("Enter second Strung");
		String s2 = sc.nextLine();
		
		int len =0,len2=0;
		
		if(s1.toLowerCase().length()==s2.toLowerCase().length())
		{
			for(int i =0;i<s1.length();i++)
			{
				len = (int)s1.charAt(i)+len;
				len2 = (int)s2.charAt(i)+len2;
			}
			if(len==len2)
			{
				System.out.println("Anagram");
			}
			else
				System.out.println("Not Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
			
	}

}

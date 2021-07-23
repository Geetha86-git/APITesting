import java.util.Scanner;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        int totalChars = A.length()+B.length();
        System.out.println(totalChars);
        int compare = A.compareTo(B);
        if(compare>0)
        {
        	System.out.println("Yes");
        }
        
        else
        {
        	System.out.println("No");
        }
        
        String output = A.substring(0, 1).toUpperCase() + A.substring(1);
        String output1 = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(output + " "+ output1);
     }

}


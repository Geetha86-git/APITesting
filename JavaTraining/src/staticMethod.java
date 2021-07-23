import java.util.Scanner;

public class staticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(staticMethod.verifyNumbers(a, b))
		{
			System.out.println(a*b);
		}
		
	}

	
	public static boolean verifyNumbers(int a, int b)
	{
		if((a>0)&&(b>0))
		{
			return true;
		}
		else
		{
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			return false;
		}
	}
}

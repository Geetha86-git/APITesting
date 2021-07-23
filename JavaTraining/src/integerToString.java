import java.util.Scanner;

public class integerToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
		if(i>=-100&&i<=100)
		{
			String s = Integer.toString(i);
			if(i==Integer.parseInt(s))
			{
				System.out.println("Good Job");
			}
			else
			{
				System.out.println("Wrong Answer");
			}
		}
		
	}

}

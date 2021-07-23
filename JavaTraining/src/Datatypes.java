import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of charcters");
		int num = sc.nextInt();
		
		for(int i = 0;i<num;i++)
		{
			long l = sc.nextLong();
			if((l>-128)&&(l<128))
			{
				System.out.println(l +" is fitted into byte");
			}
			
			if((l>-32768)&&(l<32768))
			{
				System.out.println(l + " is fitted into short");
			}
			
			if((l>Math.pow(-2, 31))&&(l<Math.pow(2, 31)))
			{
				System.out.println(l + " is fiited into int");
			}
		}

	}

}

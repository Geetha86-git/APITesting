import java.util.Scanner;

public class Fibanocciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println(identifyFibanocci(number));
	}
	
	public static int identifyFibanocci(int number)
	{
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber = 0;
		
		for(int i = 0;i<number-1;i++)
		{
			thirdNumber = secondNumber+firstNumber;
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		return thirdNumber;
	}

}

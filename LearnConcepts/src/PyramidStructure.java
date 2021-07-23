import java.util.Scanner;

public class PyramidStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in pyramid");
		
		int num = sc.nextInt();
		
		pyramidOne(num);
		
	}
	
	public static void pyramidOne(int num)
	{
		for(int i =1;i<=num;i++)
		{
			int whiteSpaces = (num-i)*2;
			printSpace(" ",whiteSpaces);
			//printSpace(i+" ",i);
			printNumbers(i,i);
			System.out.println(" ");
		}
	}
	
	public static void printSpace(String s,int totalSpace)
	{
		for(int i =0;i<totalSpace;i++)
		{
			System.out.print(s);
		}
	}

	public static void printNumbers(int j,int totalSpace)
	{
		for(int i =1;i<=totalSpace;i++)
		{
			System.out.print(i+" ");
		}
		for(int i=totalSpace-1;i>=1;i--)
		{
			System.out.print(i+" ");
		}
	}
}

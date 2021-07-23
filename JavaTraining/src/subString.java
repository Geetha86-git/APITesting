import java.util.Scanner;

public class subString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		System.out.println("Enter the start and End Index");
		String index = sc.next();
		
		
		String[] reqIndex = index.split("_");
		
		int fIndex = Integer.parseInt(reqIndex[0]);
		int lIndex = Integer.parseInt(reqIndex[1]);
		System.out.println(lIndex);
		 
		System.out.println(str.substring(fIndex, lIndex));
		
	}

}

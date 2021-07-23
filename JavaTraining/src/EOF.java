import java.util.Scanner;

public class EOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			sc.skip("(\r\n)?");
			String s=  "";
			
			int count = 1;
			while(sc.hasNext())
			{
				s = sc.nextLine();
				System.out.println(count +" "+ s);
				count++;
			}
			
			
			
	}

}

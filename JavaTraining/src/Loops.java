import java.util.*;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int N = sc.nextInt();
		 for(int i = 1;i<=10;i++)
		 {
			 System.out.printf("%d * %d = %d\n",N,i,(N*i));
		 }
	}

}

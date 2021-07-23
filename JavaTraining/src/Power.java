import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc  = new Scanner(System.in);
		 System.out.println("Enter the Number");
		 int N = sc.nextInt();
		 
		 for(int i = 0; i< N; i++)
		 {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 int c = sc.nextInt();
			 
			 double val = 0;
			 for(int j = 0; j<c;j++)
			 {
				 if(j==0)
				 {
					 val = a+Math.pow(2, j)*b; 
				 }
				 
				 else
				 {
					 val = val+Math.pow(2, j)*b;
				 }
				int n = (int)val;
				System.out.printf("%d ",n);
			 }
			 System.out.println(" ");
		 }
	}

}

import java.util.ArrayList;

public class ReverseSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		int k = 4,n=0;
		
		int len = arr.length/k;
		int mod = arr.length%k;
		
		n=0;
		int temp = k;
		if(k<=arr.length)
		{
			if(mod!=0)
			{
				for(int i=0;i<len;i++)
				{
					reverse(arr,n,k);
					n=k;
					k=n+temp;
				}
				for(int i=n;i<arr.length;i++)
				{
					System.out.println(arr[i]);
				}
			}
			else
			{
				for(int i=0;i<len;i++)
				{
					reverse(arr,n,k);
					n=k;
					k=n+temp;
				}				
			}
		}
		else
			System.out.println("Subset greater than original");
}
	public static void reverse(int[] arr,int n,int k)
	{
		for(int i =k-1;i>=n;i--)
		{
			System.out.println(arr[i]);
		}
	}
		
}

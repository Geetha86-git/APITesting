import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int key = 9;
		
		int[] arr = {1,6,7,3,9,5};
		
		Arrays.sort(arr);
		int low = arr[0];
		int high = arr[arr.length-1];
		
		int mid = (low+high)/2;
		
		while(low<=high)
		{
			if(arr[mid]<key)
			{
				low=mid+1;
			}
			else if(arr[mid]>key)
			{
				high=mid-1;
			}
			mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println("element found");
				break;
			}
		}
		if(low>high)
		{
			System.out.println("NO element found");
		}
	}

}

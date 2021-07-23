
public class TriangleStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5,count=1;
		
		for(int j = 0;j<i;j++)
		{
			for(int k=i;k>j;k--)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println(" ");
		}
	}

}

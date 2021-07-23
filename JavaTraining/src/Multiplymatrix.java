
public class Multiplymatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][] = {{1,2,3},{3,4,5},{5,6,7}};
		int second[][] = {{1,2,3},{3,4,5},{5,6,7}};
		int sum[][] = null;
		
		for(int i = 0;i<first.length-1;i++)
		{
			for(int j = 0;j<first.length-1;j++)
			{
				sum[i][j] = first[i][j]+second[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("");
		}
		
	}

}

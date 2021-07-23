
public class Sumofmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][] = {{1,2,3},{3,4,5},{5,6,7}};
		int second[][] = {{1,2,3},{3,4,5},{5,6,7}};
		int sum[][] = new int[first.length][first.length];
		
		for(int i = 0;i<first.length;i++)
		{
			for(int j = 0;j<first.length;j++)
			{
				//System.out.println(first[i][j]);
				sum[i][j] = first[i][j]*second[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}


/*1 2 3  1 2 3
3 4 5  3 4 5
5 6 7  5 6 7*/
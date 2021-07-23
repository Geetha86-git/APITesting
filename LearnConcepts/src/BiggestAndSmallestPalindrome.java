
public class BiggestAndSmallestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "racecar wow wwordroww driving";
		
		String[] str = s.split(" ");
	
		String smallPalin="",largePalin="";
		String temp="";
		for(int i=0;i<str.length;i++)
		{
			if(isPalindrome(str[i]))
			{
				temp+=str[i]+" ";
			}
		}
		
		String[] reqString=temp.split(" ");
		for(int i = 0;i<reqString.length;i++) {
			
			if(i==0)
			{
				smallPalin=largePalin=reqString[i];
			}
			else if(smallPalin.length()>reqString[i].length())
			{
				smallPalin = reqString[i];
			}
			else if(largePalin.length()<reqString[i].length())
			{
				largePalin = reqString[i];
			}
		}
		
			System.out.println("Smallest Palindrome "+smallPalin);
			System.out.println("Largest Palindrome "+largePalin);
	}
	
	public static boolean isPalindrome(String s)
	{
		boolean flag = true;
		int i = 0, j = s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				flag = false;
			}
			i++;
			j--;
		}
		return flag;
	}
	

}

/*
    E
   ID
  LHC
 NKGB
OMJFA
*/

class P90
{
	public static void main(String args[])
	{
		int n=5;
		
	  	int count=n;
		for(int i=n; i>=1;i--)
		{
			int c=count;
			for(int j=i; j>1; j--)
			{
				System.out.print(" ");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print((char)(c+64));
				c-=j+1;
			}
			System.out.println();
			count+=i-1;
		}
	}
}
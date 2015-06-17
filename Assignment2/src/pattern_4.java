

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int n=10;
		for(i=0;i<n;i++)
		{
			//System.out.print("");
			//System.out.print("*");

			for(j=0;j<n;j++)
				
			{
				if(i==0 || i==n-1) 
				{
				System.out.print("*");
				}
				else if (j==0 || j==n-1)
				{
				 System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				 
			}
			System.out.println();
		}
	}

}

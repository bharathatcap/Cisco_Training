

public class PatternStar
{
	public static void main(String[] args) {
		int n=9;
		int star = n*2-1;
		int space=1;
		for(int i=0;i<n;i++)
		{
			for(int k=0;k<space;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<star;j++)
			{
				if(j%2==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
		}
			space++;
			star=star-2;
			System.out.println();
		}
	}

}

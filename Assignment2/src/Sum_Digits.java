

public class Sum_Digits {
	public static void main(String[] args) {
		int number=7890;
		int rem;
		int sum=0;
		while(number!=0)
		{
		rem=number%10;
		sum+=rem;
		number=number/10;
		
		}
		System.out.println("sum"+sum);

	}
}

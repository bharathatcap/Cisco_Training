

public class ReverseNumber {
	public static void main(String[] args) {
		int number=5678;
		int rev=0;
		
		while(number!=0)
		{
			rev=rev*10;
			rev=rev+(number%10);
			number=number/10;
		}
		System.out.println("reverse of 123 is:"+rev);

	}
}

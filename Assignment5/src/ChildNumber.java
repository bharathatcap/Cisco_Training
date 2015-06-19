
public class ChildNumber extends Number {                              //Child Class 
	 public ChildNumber (int... n){                                     //VAriable Arguments Passed to the constructor
	
				for (int i=0;i<n.length;i++){
				if (n[i]<100 || n[i]>9999){                             //Checks if its a 3 digit or 4 digit no
					System.out.println("Invalid Input");
					System.exit(0);
					break;
					
				}
				else {
					
					System.out.println("Valid input .You can proceed");
					
				}}
	 }
	 

	


	
	public void sumofn(int []n){                     //Method to check sum of digits 
		int sum=0;
		int r=0;
		
		for (int i=0;i<n.length;i++){
			
			r=n[i]%10;
			n[i]=n[i]/10;
			sum=sum+r;
			
		
		System.out.println("The Sum of digits of the number " +n[i] +":" +sum);
		}}
		public void reverse(int []n){                //Methodto check Reverse of a no
			
			int r=0;
			int rr=0;
			
			for (int i=0;i<n.length;i++){
				
				r=n[i]%10;
				
				n[i]=n[i]/10;
				rr=rr*10+r;
				
			
			System.out.println("The Reverse of the number " +n[i] +":" +rr);
			
			}}
		
			public void factorial(int []n){         //Method to find factorial of a no
				int fact=1;
				
				
				for (int i=0;i<n.length;i++){
					
					while(n[i]>0){
						
						fact=fact*i;
						n[i]--;
					}
					
						
					
				
				System.out.println("The Factorial of the number " +n[i] +":" +fact);
				}
				
			}
			
			public void average(int []n){              //Method to find factorial of a no
				int average=0;
				int r=0;
				int c=n.length;
				
				
				for (int i=0;i<n.length;i++){
					
					r=r+n[i];
					average=r/c;
					
					
				
				System.out.println("The Average of  numbers: " +average);
				}}
			public void star(int []n){         //Star Method 
				
		int r=0;
		
				
				for (int i=0;i<n.length;i++){
					
					r=n[i]%10;
					if (r<3){                           //If last digit<3 multiply by 2 
						int m=r*2;
						for (int z=0;z<m;z++){
						for (int j=0;j==z;j++){   
					System.out.print("*");              //Print no of stars as last digit 
						System.out.println();
							}}}
							else{
								for (int l=0;l<r;l++){
									for (int j=0;l==j;j++){
										System.out.print("*");
										System.out.println();
							}}}
								
							}
						}
					
					
				
						
		
	

	public static void main(String[] args) {
		
		
		Number obj=new ChildNumber(100,200);
		int[] testArray = {51,7};
		
		obj.sumofn(testArray);
		obj.reverse(testArray);
		obj.factorial(testArray);
		obj.average(testArray);
		obj.star(testArray);
		
		
	

		
	}

}

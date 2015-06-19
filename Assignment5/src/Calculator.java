
public class Calculator implements Inter {                  //Child class implementing Parent Class 
	int a,b;
	double x,y;
	public Calculator (double m,double n){                  //Constructor 
		this.x=m;
		this.y=n;
		
	}
	public void add (double m,double n){                         //ADD FUNCTION
		System.out.println("The addition value is :"+(m+n));
		
	}
	public void subtraction (double m,double n){                  //SUBTRACT FUNCTION
		System.out.println("The subtraction value is :"+(m-n));
		
	}
	public void multiply (double m,double n){                    //MULTIPLY FUNCTION 
		System.out.println("The addition value is :"+(m*n));
		
	}
	public void divide (double m,double n){                       //DIVIDE FUNCTION 
		System.out.println("The addition value is :"+(m/n));
		
	}
	public void average (double m,double n){                     //AVERAGE FUNCTION
		double d=(m+n)/2;
		
		System.out.println("The average value is :"+d);
		
	}
	public void gcdnlcm (double m,double n){                    //hcF,LCM FUNCTION
		while(m!=n){
			if (m>n){
				m=m-n;                                         //iF ONE no is greater than other subtract each other and set it as the higher no
				
			}
			else{
				n=n-m;
				
			}}
		System.out.println("Hcf is "+m);
		
		}
	public void log(int a){                                    //log function
		double l=Math.log(a);
		
		System.out.println("log value is "+l);
		
		
	}
	public void square(int a){                                 //square function 
		double l=a*a;
		
		System.out.println("Squared  value is "+l);
		
		
	}
	public void sqrt(int a){                                   //squareroot function
		double l=Math.sqrt(a);
		
		System.out.println("Square root  value is "+l);
		
		
	}
	
	
		

	public static void main(String[] args) {
//		String s1=System.out.println("Enter the 1st value ");
		
		double number1=20;
		
		double number2=25;
		int number3=30;
		
		
		Calculator c=new Calculator(20,20);                      //Parameterised Constructor being called
		c.add(number1,number2);
		c.subtraction(number1,number2);
		c.multiply(number1,number2);
		c.divide(number1,number2);
		c.average(number1,number2);
		c.gcdnlcm(number1,number2);
		c.log(number3);
		c.square(number3);
		c.sqrt(number3);
		
		
		
		
		
		
		

	}

}

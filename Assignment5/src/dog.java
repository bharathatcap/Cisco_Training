
public class dog extends Mammal{                            //Child Class 
	
		static String name="Dog";
		static String sound="bark";
		static int count=0;                                  //Counter for Counting no of instances 
		private int age;
		
		dog(){                                              //Default constructor 
			
			System.out.println("This is an mammal");           
			
		}
		dog(int a){                                         //Parameterised Constructor 
			age=a;
			
			System.out.println("age of the dog is :"+age);
		}
		{ System.out.println("this is an iib block in dog");
		count++;                                              //Counter 
		}
		static {                                             //Static Block
		System.out.println("This is a static block in dog");
		}
	public void sayHello(){
		System.out.println("Say Hello");
	}
	public static void main(String []args){ 
		Animal a1=new Animal();                             //Animal Object 
		Animal a2=new Animal(20);
		
		
		a1.SayHello();
		Mammal m1=new dog();                               //Mammal object created 
	    m1.SayHello();                                          //Calls the abstract class in Mammal class 
	    dog d1=new dog();
	    System.out.println(dog.count);                     //Checks the no of times dog object  has been instanced
	
	}
}

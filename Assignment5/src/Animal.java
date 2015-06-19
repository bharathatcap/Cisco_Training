
public class Animal {          //Parent Class 
	private String type;            //Instance variable 
	static String sound="unknown";    //Static Variable 
	
	private int age;                 
	public Animal(){         //Default Constructor
		System.out.println("This is an animal which proudces sound : "+sound);

		type="animal";
	}
	public Animal(int e){       //Parameterised Constructor
		age=e;
		System.out.println("This is an animal of age : "+age);

		
	}
	static {                       //SIB BLOCK
		System.out.println("This is a static block in animal class ");
	}
	{System.out.println("This is an iib block in animal class ");}  //IIB Block
	
	public void SayHello(){                 //Method 
		System.out.println("Say Hello");
	}
				
	}



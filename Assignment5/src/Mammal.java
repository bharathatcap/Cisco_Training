abstract  class Mammal extends Animal {     //Child Class
	static String name="mammal";
	static String produce="milk";           //Static Variables 
	private int age;
	
	Mammal(){                                //Default Constructor
		System.out.println("This is an mammal");
		
	}
	{ System.out.println("this is an iib block in mammal"); //IIB BLOCK
	
	}
	static {                                   //Static Block 
	System.out.println("This is a static block in mammal");
	}
abstract void sayHello();




}

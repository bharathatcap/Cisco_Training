
public class InnerClass2 {
	private static int i=5;
	public void sayHello(){
		System.out.println("hi");
	}
public class Inner {                //local inenr class 
	
	
	public void sayHello (){
		System.out.println(i);    // local inner class can access data members of outer class 
		Inner id=new Inner ();
		id.sayHello();
		
	}
}
	public static void main(String[] args) {
		InnerClass2 ic=new InnerClass2 ();  //Creating outer class object 
		ic.sayHello();                     //Calling outer class method
		 
		
		
		
		// TODO Auto-generated method stub

	}

}

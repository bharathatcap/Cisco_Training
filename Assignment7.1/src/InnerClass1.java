
public class InnerClass1 {
	private int i=5;
	private String s="Hello";
	public class Inner {                      //Inner class 
		public void Print(){
			System.out.println("hi :)");
		}
		
	}
	public static void main(String []args){  //main method 
		InnerClass1 ic=new InnerClass1();    //Outer Class object 
		InnerClass1.Inner i=ic.new Inner();   //Inner Class object 
		System.out.println(ic.s);
		i.Print();
		
	}

}

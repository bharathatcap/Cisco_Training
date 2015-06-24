
public class InnerClass3 {
	static  int i=5; 
	static class inner {        //Static inner class
		void display(){
			System.out.println("the value of i is :"+i);  //Static inner class can acces only static variables of outer class
			
		}
	}

	public static void main(String[] args) {
		
		InnerClass3.inner ib=new inner();  //Creating object of inner class 
		ib.display();

	}
}

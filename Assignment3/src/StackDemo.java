import java.util.*;

public class StackDemo {

	
		 static void pushh(Stack s,int a ){
			
			s.push(new Integer(a));
			System.out.println("pushed value is "+ a);
			System.out.println("Stack is "+s);
			
			
			
		}
		 static void  popp(Stack s){
			int b=(Integer)s.pop();
			
			
			System.out.println("integer pulled out is "+b);
			System.out.println("Stack is : "+s);
		
			
			
		}
		 
		 
		public static void main(String[] args) {
			Stack s=new Stack();
			System.out.println("stack is "+s);
			pushh(s,30);
			pushh(s,45);
			pushh(s,70);
			popp(s);
			popp(s);
			popp(s);
			System.out.println("Stack is :"+s);
			
			
			
		

	}

}

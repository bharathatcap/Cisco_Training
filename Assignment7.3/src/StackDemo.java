
public class StackDemo {                    //Stack Class 
	 private int capacity =40;       //Initial capacity is set as 4 
	 Object arr[] = new Object[capacity];  
	 int top = -1;  
	  private int length=0;
	  StackDemo(){
		  this.capacity= 4;
	  }
	public  StackDemo(int capacity){
		  this.capacity =capacity;
	  }
	 public void push(Object push) {    //Method to push object to stack 
	  if (top < capacity - 1) {          //checks if space is there in stack 
	   top++;  
	   arr[top] = push; 
	   this.length ++;
	 //  System.out.println("Element " + push  
	   //  + " is pushed to Stack ");  
	  // printElements();  
	  } else {  
	   System.out.println("Stack Overflow !");  
	  }  
	 }  
	  
	 public Object pop() {  //Method to pull top most element of the stack
		 Object ret=null;
		
	  if (top >= 0) {  
	  // top--;  
	   //System.out.println("Pop operation is over ");  
	   ret = arr[top--];
	  } /*else {  
	   System.out.println("Stack Underflow ");  
	  }*/
	return ret;  
	 }  
	   
	 public void printElements() {    //Method to print all the elements 
	  if (top >= 0) {  
	   System.out.println("Elements in stack :");  
	   for (int i = 0; i <= top; i++) {  
	    System.out.println(arr[i]);  
	   }  
	  }  }
	   
	 public void printElementsInPopOrder(){
	 Object []array = new Object[this.length];   //new array object 
		 for(int stackCount=0;stackCount<this.getLength();stackCount++){ 
			 
	           array[stackCount] = this.pop();    //Elements being popped are stored in array 
			
	 }
		 for(Object element:array){
			 if(element!=null)
			 System.out.print(element);       //They are printed.
		 }
	 }
	 public static void main(String[] args) {   //Main method 
	  StackDemo stackDemo = new StackDemo();    //Object is created 
	  
	  stackDemo.pop();  
	  stackDemo.push('c');  
	  stackDemo.push("a");  
	  stackDemo.push(73);  
	  stackDemo.push(21);  
	  stackDemo.pop();  
	  stackDemo.pop();  
	    
	  stackDemo.printElements();

}

	public int getLength() {
		// TODO Auto-generated method stub
		return this.length;
	}
}
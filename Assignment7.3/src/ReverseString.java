
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemo stack = new StackDemo(10); //Stack Demo is created
		String input [] ={"hi","bharath"};    //Input is being passed
		for(String in:input){
			stack.push(in);
		}
		System.out.println("input:");
		stack.printElements();
		 System.out.println("Elements popped out:");
		//stack.printElementsInPopOrder();
		StackDemo stackrev = new StackDemo(20); //Another Stack Object for passing the input
		for(String element:input){      
			
			char[] carr = element.toCharArray();  //Converts String to character
			for(char celement:carr){  
			stackrev.push(celement);             //Push characters to stack
			}
			
			stackrev.printElementsInPopOrder();
            System.out.print("\t");
		}
				
	}
       
}

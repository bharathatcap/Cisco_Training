import java.util.ArrayList; //Import statement for arraylist
import java.util.Collections;

public class StackDemoArrayList {
	private ArrayList<String> arraylist = new ArrayList<String>(); // Setting
																	// arraylist
																	// as a
																	// instance
																	// variable,Accepting
																	// only
																	// Strings

	public void push(String elements) { // Push Method in stack
		arraylist.add(elements); // Adding elements using.add() method

	}
	public void display() { // For Displaying contents of the stack

		ArrayList<String> arraylist2 = new ArrayList<String>(arraylist);// Creating
																		// another
																		// arraylist
																		// and
																		// assigning
																		// it to
																		// arraylist

		Collections.reverse(arraylist2); // Reversing the arraylist for
											// displaying stack
		System.out.println(arraylist2);

	}
	public void pop() { // For removing last element
		int lastmember = arraylist.size(); // Returns integer

		arraylist.remove(lastmember - 1); // Removes the element .remove()
											// function

	}
	public void peek() { // To display last element of the stack
		int lastmember = arraylist.size();
		// get(index) retreives element at the position of the index and
		// displays it
		System.out.println("The last member in ur stack is : "
				+ arraylist.get(lastmember - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemoArrayList stackDemo = new StackDemoArrayList(); // Object is
																	// created
		// ListIterator listiterating=arraylist.listIteator();

		stackDemo.push("5");
		stackDemo.push("6");
		stackDemo.push("7");
		stackDemo.push("8");

		stackDemo.display();
		System.out.println();
		stackDemo.pop();
		System.out
				.println("Contents of the stack after popping are shown below :");
		stackDemo.display();
		stackDemo.peek();
	}

}

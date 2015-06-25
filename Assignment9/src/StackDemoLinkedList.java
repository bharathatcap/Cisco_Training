import java.util.Collections;
import java.util.LinkedList; //Import statement for arraylist

public class StackDemoLinkedList {
	private LinkedList<String> linkedlist; // Setting arraylist as a instance
											// variable,Accepting only Strings

	public StackDemoLinkedList() { // Parameterised constructor to set the
									// capacity of the arraylist
		linkedlist = new LinkedList<String>();

	}
	public void push(String elements) { // Push Method in stack
		linkedlist.add(elements); // Adding elements using.add() method

	}
	public void display() { // For Displaying contents of the stack
		// Creating another linkedlist and assigning it to other linkedlist

		LinkedList<String> linkedlist2 = new LinkedList<String>(linkedlist);//

		Collections.reverse(linkedlist2); // Reversing the arraylist for
											// displaying stack
		System.out.println(linkedlist2);

	}
	public void pop() { // For removing last element
		int lastmember = linkedlist.size(); // Returns integer

		linkedlist.remove(lastmember - 1); // Removes the element .remove()
											// function

	}
	public void peek() { // To display last element of the stack
		int lastmember = linkedlist.size();
		// get(index) retreives element at the position of the index and
		// displays it
		System.out.println("The last member in ur stack is : "
				+ linkedlist.get(lastmember - 1));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackDemoLinkedList stackDemo = new StackDemoLinkedList(); // Object is
																	// created

		stackDemo.push("5"); // Calling functions
		stackDemo.push("6");
		stackDemo.push("7");
		stackDemo.push("8");

		stackDemo.display();
		System.out.println();

		stackDemo.pop();
		System.out
				.println("Contents of the stack after popping is shown below :");
		stackDemo.display();
		System.out.println();
		stackDemo.peek();
	}
}
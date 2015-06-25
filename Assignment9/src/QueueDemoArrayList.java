import java.util.ArrayList; //Import statement for arraylist

public class QueueDemoArrayList {
	private ArrayList<String> arraylist; // Setting arraylist as a instance
											// variable,Accepting only Strings
	private int popindex = 0;

	public QueueDemoArrayList(int capacity) { // Parameterised constructor to
												// set the capacity of the
												// arraylist
		arraylist = new ArrayList<String>(capacity);

	}
	public void add(String elements) { // Push Method in stack
		arraylist.add(elements); // Adding elements using.add() method

	}
	public void display() { // For Displaying contents of the queue
		System.out.println("Contents of the queue are ");
		for (String display : arraylist) {
			System.out.print(display + "\t");
		}

	}
	public void pop() { // For removing last element
		// Returns integer

		arraylist.remove(popindex); // Removes the element .remove() function

	}
	public void peek() { // To display last element of the stack

		// get(index) retreives element at the position of the index and
		// displays it
		System.out.println("The last member in ur queue is : "
				+ arraylist.get(0));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueDemoArrayList queueDemo = new QueueDemoArrayList(5); // Object is
																	// created

		queueDemo.add("5"); // Calling functions
		queueDemo.add("6");
		queueDemo.add("7");
		queueDemo.add("8");

		queueDemo.display();
		System.out.println(); // Sysouts to improve readability
		queueDemo.pop();
		queueDemo.pop();

		System.out
				.println("Contents of the queue after popping are shown below :");

		queueDemo.display();
		System.out.println();

		queueDemo.peek();
	}

}

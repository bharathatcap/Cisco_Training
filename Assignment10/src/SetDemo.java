import java.util.Comparator;
import java.util.Set;                              //Imports for TreeSet
import java.util.TreeSet;



public class SetDemo {
	//Main method
	public static void main(String[] args){

		//Creating a Treeset which accepts objects of type Players
		System.out.println("This tree set prints everything in alphabetical order");
		Set<Players>myset=new TreeSet<Players>();

		//Passing myset to the two methods

		addString(myset);
		displayString(myset);

		//Creating new Tree Set for displaying contents in reverse order
		System.out.println();
		System.out.println("This treeset prints everything in reverse of alphabetical order");
		Set<Players>myset2=new TreeSet<Players>(new Comparator() {

			//OverRiding compare method 
			public int compare(Object object1, Object object2) {
				// - Sign indicates to print in reverse of alphabetical order
				return -object1.toString().compareTo(object2.toString());
			}
		});

		addString(myset2);
		displayString(myset2);

		//LinkedSet to print based on namelength and alphabetical order

		System.out.println();
		System.out.println("This treeset prints everything based on number length and  alphabetical order");
		Set<Players>myset3=new TreeSet<Players>(new Comparator() {

			//OverRiding compare method 
			public int compare(Object object1, Object object2) {
				// - Sign indicates to print based on String length  alphabetical order
				int length1=object1.toString().length();
				int length2=object2.toString().length();
				if (length1>length2){
					return +1;
				}
				if (length1<length2){
					return -1;
				}
				//If Number Length is equal it compares the two objects 
				else{
					return object1.toString().compareTo(object2.toString());
				}

			}
		});


		addString(myset3);
		displayString(myset3);
	}


	/*Method that adds objects of type Players to the 
	 * Treeset
	 */
	public  static void addString(Set<Players> myset){
		myset.add(new Players("cole"));
		myset.add(new Players("drogba"));
		myset.add(new Players("terry"));
		myset.add(new Players("cech"));
		myset.add(new Players("lampard"));
	}
	//Method that displays contents of Treeset
	public  static void displayString(Set<Players> myset){
		System.out.println("contents of the TreeSet are shown below :");
		System.out.println();
		for(Players display:myset) {
			System.out.println(display);
		}



	}


}





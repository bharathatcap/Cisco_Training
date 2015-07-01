//Imports Used
import java.util.Collection; 
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;



public class MapDemo {


	//Main Method
	public static void main(String[] args) {



		/*Creating a TreeMap for unique names and roll nos .
		Roll no's will be in increasing order coz we are using tree map*/
		Map<Integer,String> treemap=new TreeMap<Integer,String>();

		addData(treemap);
		displayData(treemap);

		//Creating a Treemap for sorting roll no's in reverse alphabetical order 

		System.out.println();
		//Sorting is done by overriding compare ()
		Set<Map.Entry<Integer, String>> sortedEntries = new TreeSet<Map.Entry<Integer, String>>(
				new Comparator<Map.Entry<Integer, String>>() {

					//The 2 values of the Maps are compared using compareTo () and sorted out
					public int compare(Map.Entry<Integer, String> e1,Map.Entry<Integer, String> e2) {
						// sorting values is reverse order
						return -e1.getValue().compareTo(e2.getValue());
					}
				});

		sortedEntries.addAll(treemap.entrySet());
		System.out.println(sortedEntries);

	}



	//AddData is used to put data into the tree map using put () function
	public static void addData (Map<Integer,String> addingdata){
		addingdata.put(1,"Rohit");
		addingdata.put(2,"Rahul");
		addingdata.put(9,"Ananya");
		addingdata.put(4,"Bala");
		addingdata.put(10,"Shruthi");
	}


	//DisplayData is used to display contents of treemap using for each loop
	public static void displayData(Map<Integer,String> displaydata){
		System.out.println("Keys :");
		System.out.println();

		//iterating over keys only
		for (Integer key : displaydata.keySet()) {
			System.out.println( key);
		}

		//iterating over values only
		System.out.println();
		System.out.println("Values :");
		System.out.println();

		for (String value : displaydata.values()) {

			System.out.println( value);
		}
	}
}


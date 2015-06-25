import java.util.ArrayList; //Import required for array list 

public class KeyValue {

	ArrayList<String> keys; // Keys ArrayList

	ArrayList<String> values; // Values ArrayList

	int arraysize = 5; // Storing size of arrays as 3

	public KeyValue(int arraysize) { // Parameterised Constructor

		this.arraysize = arraysize;//

		this.keys = new ArrayList<String>(arraysize);

		this.values = new ArrayList<String>(arraysize);

	}

	public KeyValue() { // Default constructor
		this.keys = new ArrayList<String>(arraysize);

		this.values = new ArrayList<String>(arraysize);

	}

	/*
	 * This method inputs two strings and adds them to put function using
	 * ArrayList.add() MEthod If ListSize exceeds predefined value .. Message
	 * saying slots full is printed
	 */
	public void put(String string1, String string2) { // Method to add values to
														// Arraylist

		// To check if the key exists or not

		if (keys.size() < arraysize) {

			keys.add(string1);
			values.add(string2);

		} else {

			System.out.println("Spaces are full");

		}

	}

	/*
	 * This method gets an input String and compares it with the values in the
	 * Key ArrayList.If the values match the corresponding value in the Values
	 * ArrayList is printed.
	 */
	public String get(String key) {

		int index = keys.indexOf(key);
		return values.get(index);

	}

	public String get(int index) { // Passing index

		if (index < arraysize) { // if Passed no is less than the array size

			System.out.println("keys matched..The corresponding value is :"
					+ values.get(index));

		} else {

			System.out.println("type a lower value for index");

		}

		return null;

	}

	public void remove(String key) { // Method to remove key and value if

		// parameter is matched to a value in

		// the key array

		for (int iterator = 0; iterator < arraysize; iterator++) {// For loop

			if (keys.get(iterator).equals(key)) { // if the keys match

				keys.remove(iterator);

				values.remove(iterator); // Key and value set to null or
											// deleted.

			}

		}

	}

	public void showAll() { // Displaying both the arrays

		for (String display1 : keys) {

			System.out.println(display1 + "---->" + get(display1));

		}

	}

	public Boolean isEmpty() { // Checks if arraylist is empty

		return keys.isEmpty();

	}

	public int showSpaceAvailable() { // calculating slots available

		int keysize = keys.size(); // storing available slots in a integer

		int slotavailable1 = arraysize - keysize; // subtracting available slots
													// from total size

		System.out.println("Remaining slots in the Keys array is :"
				+ slotavailable1);

		int valuesize = values.size();

		int slotavailable2 = arraysize - valuesize;

		return slotavailable2;

	}

	public static void main(String[] args) { // Main Method

		// System.out.println("helloo");

		KeyValue keyvalue = new KeyValue(4); // Object of KeyValue Class

		keyvalue.put("k1", "v1"); // CAlling Methods

		keyvalue.put("k2", "v2");

		keyvalue.put("k3", "v3");

		keyvalue.put("k4", "v4");

		keyvalue.put("k5", "v5");

		keyvalue.get("k1");

		keyvalue.get(3);

		keyvalue.remove("k5");

		keyvalue.showAll();

		keyvalue.isEmpty();

		keyvalue.showSpaceAvailable();

	}
}

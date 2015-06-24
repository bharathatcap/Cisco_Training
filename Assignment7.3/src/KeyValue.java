
public class KeyValue {                      //KeyValue Class 
	int m = 0;

	int n = 0;

	Object[] keys;

	Object[] values;

	int s; // Storing size of arrays as 3

	public KeyValue (int a) {

	s=a;// Default Constructor

	keys = new Object[s];           //Initialising keys and values as objects instead of strings 

	values = new Object[s];

	}

	public void put(Object k, Object v) {

	// To check if the key exists or not

	if (m < keys.length && n < values.length) {

	keys[m++] = k;

	values[n++] = v;

	m++;

	n++;

	} else {

	System.out.println("Spaces are full");

	}

	}

	public Object get(Object key) {

	// checking if key passed belongs to the keys array

	boolean flag = false;

	int l = 0;

	for (int i = 0; i < s; i++) {

	if (keys[i].equals(key)) { // if keys match

	l = i;

	flag = true;

	break;

	}

	}

	if (flag == true) {

	System.out.println("Entries Match.The value is :" + values[l]);

	return values[l];

	} else {

	System.out.println("no such entry in the keys array");

	return null;

	}

	}

	public Object get(int index) { // Passing index

	if (index < s) { // if Passed no is less than the array size

	System.out.println("keys matched..The corresponding value is :"

	+ values[index]);

	} else {

	System.out.println("type a lower value for index");

	}

	return null;

	}

	public void remove(Object key) { // Method to remove key and value if

	// parameter is matched to a value in

	// the key array

	for (int i = 0; i < s; i++) {

	if (keys[i] == key) { // if the keys match

	keys[i] = null;

	values[i] = null; // Key and value set to null or deleted.

	}

	}

	}

	

	public void showAll() { // Displaying both the arrays

	System.out.println("The Keys List is shown below :");

	for (int i = 0; i < s; i++) {

	System.out.print(keys[i] + "\n");

	}

	System.out.println();

	System.out.println("The values List is shown below :");

	for (int i = 0; i < s; i++) {

	System.out.print(values[i] + "\n");

	}

	System.out.println();

	}

	public Boolean isEmpty() {

	// checks if the given array is empty

	int temp = 0;

	for (int i = 0; i < s; i++) {

	if ((keys[i] == null && values[i] == null)) { // Checks if entries

	// are there in both

	// the arrays

	temp++;

	}

	}

	if (temp == s) { // if count equals size array is empty

	System.out.println("oohoo its empty");

	} else {

	System.out.println(" arrayss..It aint empty yet ");

	}

	System.out.println();

	return null;

	}

	public void showSpaceAvailable() { // calculating slots available

	int v = keys.length; // storing available slots in a integer

	int dd = s - v; // subtracting available slots from total size

	System.out.println("Remaining slots in the Keys array is :" + dd);

	int o = values.length;

	int ddd = s - o;

	System.out.println("Remaining slots in the Keys array is :" + ddd);

	}

	public Object[] getKeySet(){

	Object keyset[]=new Object[keys.length];

	for (int i=0;i<keys.length;i++){

	keyset[i]=keys[i];

	}

	return keyset;

	}

	public static void main(String[] args) {

	System.out.println("helloo");

	KeyValue kl = new KeyValue(5);

	kl.put(1,2);

	kl.put('a', "v2");

	kl.put(4, "v3");

	kl.put(5, 10);

	kl.put(15, 20);

	kl.get(15);

	kl.get(0);

	kl.remove("k5");

	// kl.sort(true,true);

	kl.showAll();

	kl.isEmpty();

	kl.showSpaceAvailable();

	kl.getKeySet();

	}

}

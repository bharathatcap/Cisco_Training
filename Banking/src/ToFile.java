import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ToFile {

	// Creating file object and referring it to customer.txt
	File file = new File("Customer.txt");

	/*
	 * Write Operations using ObjectOutputStream It writes an arraylist of
	 * customer objects
	 */
	public void addRecords(ArrayList<Customer> customers) {
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(customers);

			oos.flush();
			oos.close();

		} catch (IOException e) {
			System.out.println("Exception while writing to " + file.getName());
			e.printStackTrace();
		}

	}

	/*
	 * Reading data from files and storing it in a array list of type customer
	 */
	public ArrayList<Customer> read() {
		ArrayList<Customer> readerlist = new ArrayList<Customer>();
		try {

			FileInputStream fileinputstream = new FileInputStream(file);
			ObjectInputStream outputinputstream = new ObjectInputStream(
					fileinputstream);
			readerlist = (ArrayList<Customer>) outputinputstream.readObject();

		} catch (FileNotFoundException e) {
			System.out.println("Exception while reading " + file.getName());
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Exception while reading " + file.getName());
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return readerlist;

	}
}

//Import Statements
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Merging {

	public static void main(String[] args) {
		// Creating three file objects
		File file = new File("test.txt");
		File file2 = new File("test2.txt");
		File file3 = new File("alternate.txt");
		// ArrayList to store the strings
		ArrayList<String> arraylist = new ArrayList<String>();
		String temporary = "";

		/*
		 * This block initializes a buffer reader and reads the contents of each
		 * file .It is stored in a string and added to the array list.
		 */
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(
					file));
			String line;
			// While there is a next line to read
			// Add it to the arraylist
			while ((line = bufferreader.readLine()) != null) {
				System.out.println(line);
				arraylist.add(line);
			}

			BufferedReader bufferreader2 = new BufferedReader(new FileReader(
					file2));
			String line2;

			while ((line2 = bufferreader2.readLine()) != null) {
				System.out.println(line2);
				arraylist.add(line2);
			}
			/*
			 * Contents of the array are stored in a temporary string and it is
			 * written to a file using the bufferwriter
			 */
			BufferedWriter bufferwriter = new BufferedWriter(new FileWriter(
					file3));
			for (int iterator = 0; iterator < arraylist.size(); iterator++) {
				temporary = arraylist.get(iterator);

				bufferwriter.write(temporary);
				bufferwriter.write("\n");
				System.out.println(temporary);

			}
			// flush and close operations
			bufferwriter.flush();
			bufferwriter.close();

		}// Catch block to catch exceptions
		catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}

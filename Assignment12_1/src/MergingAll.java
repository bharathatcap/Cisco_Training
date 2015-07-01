import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MergingAll {

	public static void main(String[] args) {
		// Creating four file objects
		File file = new File("test.txt");
		File file2 = new File("test2.txt");
		File file3 = new File("test4.txt");
		File file4 = new File("mergeall.txt");
		// ArrayList to store strings in each text file
		ArrayList<String> arraylist = new ArrayList<String>(20);
		String temporary = "";
		/*
		 * This block initializes a buffer reader and reads the contents of each
		 * file .It is stored in a string and added to the array list.
		 */

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			/*
			 * While there is a next line to read Add it to the arraylist
			 */
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				arraylist.add(line);
			}

			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			String line2;

			while ((line2 = br2.readLine()) != null) {
				System.out.println(line2);
				arraylist.add(line2);
			}
			BufferedReader br3 = new BufferedReader(new FileReader(file3));
			String line3;

			while ((line3 = br3.readLine()) != null) {
				System.out.println(line3);
				arraylist.add(line3);
			}
			/*
			 * Contents of the array are stored in a temporary string and it is
			 * written to a file using the bufferwriter
			 */
			BufferedWriter bw = new BufferedWriter(new FileWriter(file4));
			for (int iterator = 0; iterator < arraylist.size(); iterator++) {
				temporary = arraylist.get(iterator);

				bw.write(temporary);
				bw.write("\n");
				System.out.println(temporary);

			}
			bw.flush();
			bw.close();

		}
		// Catching exceptions
		catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}

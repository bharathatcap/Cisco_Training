//Import Statements
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class MergingAlt {

	public static void main(String[] args) {
		// Three file objects are created
		File file = new File("test.txt");
		File file2 = new File("test2.txt");
		File file3 = new File("alternate.txt");
		// Array Lists are used to store the strings
		ArrayList<String> arraylist1 = new ArrayList<String>();
		ArrayList<String> arraylist2 = new ArrayList<String>();
		String temporary = "";
		int temporary1 = 0;
		int temporary2 = 0;
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
				arraylist1.add(line);
			}

			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			String line2;

			while ((line2 = br2.readLine()) != null) {
				System.out.println(line2);
				arraylist2.add(line2);
			}
			/*
			 * Contents of the array are stored in a temporary string and it is
			 * written to a file using the bufferwriter
			 */
			BufferedWriter bw = new BufferedWriter(new FileWriter(file3));
			/*
			 * this loop checks if input is from the first listor the second If
			 * it is from first it retreives first line of the string from the
			 * 1st arraylist and retreives the next line from the second array
			 * list and the loop continues
			 */
			for (int iterator = 0; iterator < (arraylist1.size() + arraylist2
					.size()); iterator++) {
				if (iterator % 2 == 0) {
					temporary = arraylist1.get(temporary1);
					temporary1++;
				} else {
					temporary = arraylist2.get(temporary2);
					temporary2++;
				}
				bw.write(temporary);
				bw.write("\n");
				// System.out.println(temporary);

			}
			bw.flush();
			bw.close();
			// Catch block to catch exceptions

		}
		// Catching any exceptions
		catch (FileNotFoundException e) {
			System.out.println("Can't find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}

	}

}
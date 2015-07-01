//Import Statements 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// Three file objects are created
		File file = new File("sample1.txt");
		File file2 = new File("sample2.txt");
		File file3 = new File("duplicate.txt");
		// Linked HashSet is used to avoid duplicate
		// Values being stored in the final text file
		Set<String> set = new LinkedHashSet<String>();

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
				set.add(line);
			}

			BufferedReader br2 = new BufferedReader(new FileReader(file2));
			String line2;

			while ((line2 = br2.readLine()) != null) {
				System.out.println(line2);
				set.add(line2);
			}
			/*
			 * Contents of the array are stored in a temporary string and it is
			 * written to a file using the Printwriter
			 */
			PrintWriter bw = new PrintWriter(new FileWriter(file3));
			for (String display : set) {

				bw.println(display);
				bw.write("\n");
				// System.out.println(temporary);

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
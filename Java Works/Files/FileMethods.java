package files;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) throws IOException {
		// Creating a File object to represent a file named "demo.txt" on the F: drive
		File file = new File("F:/demo.txt");

		// Checking if the file exists
		if (file.exists()) {
			// Printing various information about the file if it exists
			System.out.println("Specified File Path :" + file.getAbsoluteFile());
			System.out.println("File can Read :" + file.canRead());
			System.out.println("File can Write " + file.canWrite());
			System.out.println("File name " + file.getName());
			System.out.println("File Size in Bytes :" + file.length());

			// Creating a File object to represent a directory named "java Course" on the F:
			// drive
			File filedirobject = new File("F:/java Course");

			// Getting a list of files available in the directory
			String filelist[] = filedirobject.list();

			// Printing the list of files available in the directory
			System.out.println("List Of Files Available in the Directory");
			for (int i = 0; i < filelist.length; i++) {
				System.out.print("\n" + filelist[i]);
			}
			System.out.print("\n");

		} else {
			// If the file does not exist, print a message indicating the same
			System.out.println("File does not exist");
		}

	}

}

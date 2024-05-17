package files;

import java.io.File;
import java.io.IOException;

public class FilesEx {

    public static void main(String[] args) throws IOException {
        // Creating an instance of File class to represent a file
        File file = new File("F:demo.txt");

        // Attempting to create a new file using the createNewFile() method
        // If the file does not exist, it will be created. If it already exists, this method returns false.
        if (file.createNewFile()) {
            // If the file is successfully created, print a message indicating that the file is created
            System.out.println("File Created.");
        } else {
            // If the file already exists, print a message indicating that the file is not created
            System.out.println("File Not Created");
        }
    }
}

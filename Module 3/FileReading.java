// 23. File Reading
// Objective: Read data from a file.
// Task: Read and display the contents of output.txt.
// Instructions:
// o Open output.txt for reading.
// o Read each line and display it on the console.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReading {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
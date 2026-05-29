// 22. File Writing
// Objective: Write data to a file.
// Task: Write user input to a text file.
// Instructions:
// o Prompt the user for a string.
// o Write the string to a file named output.txt.
// o Confirm that the data has been written.

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class FileWriting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write(text);
            writer.close();
            System.out.println("Data has been written to output.txt");
        } 
        catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
        sc.close();
    }
}
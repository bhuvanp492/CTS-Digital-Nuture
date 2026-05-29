// 21. Custom Exception
// Objective: Create and use custom exceptions.
// Task: Define a custom exception InvalidAgeException.
// Instructions:
// o Throw InvalidAgeException if the user's age is less than 18.
// o Catch the exception and display a message.

import java.util.Scanner;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
public class CustomException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or above.");
            }
            System.out.println("Access granted.");
        } 
        catch (InvalidAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        sc.close();
    }
}
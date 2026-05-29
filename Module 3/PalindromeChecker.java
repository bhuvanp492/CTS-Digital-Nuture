// 16. Palindrome Checker

// Objective: Combine string manipulation and conditional logic.

// Task: Check if a string is a palindrome.

// Instructions:
// o Prompt the user for a string.
// o Remove any non-alphanumeric characters and convert to lowercase.
// o Check if the string reads the same forwards and backwards.
// o Display the result.

import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close();
    }
}
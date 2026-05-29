// 10. Number Guessing Game 
// • Objective: Implement loops and conditional logic. 
// • Task: Create a game where the user guesses a randomly generated number. 
// • Instructions: 
// o Generate a random number between 1 and 100. 
// o Prompt the user to guess the number. 
// o Provide feedback if the guess is too high or too low. 
// o Continue until the user guesses correctly.

import java.util.Random;
import java.util.Scanner;
public class GuessGame {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int number = r.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high");
            }
            else if (guess < number) {
                System.out.println("Too low");
            }
            else {
                System.out.println("Correct guess");
            }
        } while (guess != number);
    }
}
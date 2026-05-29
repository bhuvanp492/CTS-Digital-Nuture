// 2. Simple Calculator 
// • Objective: Practice arithmetic operations and user input. 
// • Task: Develop a calculator that performs addition, subtraction, multiplication, and division. 
// • Instructions: 
// o Prompt the user to enter two numbers. 
// o Ask the user to choose an operation. 
// o Display the result of the operation.

import java.util.*;
public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter your choice:");
        System.out.println("1.Addition\n2.Subraction\n3.Multiplication\n4.Division");
        int input = sc.nextInt();
        switch (input) {
            case 1 -> System.out.println(a+b);
            case 2 -> System.out.println(a-b);
            case 3 -> System.out.println(a*b);
            case 4 -> System.out.println(a/b);
            default -> System.out.println("Invalid option");
        }
    }
}
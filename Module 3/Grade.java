// 9. Grade Calculator 
// • Objective: Use conditional statements to determine grades. 
// • Task: Assign grades based on marks entered by the user. 
// • Instructions: 
// o Prompt the user for marks out of 100. 
// o Use if-else statements to assign grades: 
// ▪ 90-100: A 
// ▪ 80-89: B 
// ▪ 70-79: C 
// ▪ 60-69: D 
// ▪ Below 60: F 
// o Display the assigned grade.

import java.util.Scanner;
public class Grade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark = sc.nextInt();
        if(mark >=90 && mark <= 100){
            System.out.println("A");
        }
        else if (mark >=80 && mark <= 89 ){
            System.out.println("B");
        }
        else if(mark >=79 && mark <= 70){
            System.out.println("C");
        }
        else if(mark >=60 && mark <= 69){
            System.out.println("D");
        }
        else if(mark <60){
            System.out.println("F");
        }
        else{
            System.out.println("Invalid mark");
        }
    }
}
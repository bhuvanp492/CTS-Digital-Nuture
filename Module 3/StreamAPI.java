// 28. Stream API
// Objective: Process collections using streams.
// Task: Filter and display even numbers from a list.
// Instructions:
// o Create a List of integers.
// o Use the Stream API to filter even numbers.
// o Collect and display the result.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);
        numbers.add(35);
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Even Numbers: " + evenNumbers);
        List<Integer> oddNumbers = numbers.stream()
                                           .filter(num -> num % 2 != 0)
                                           .collect(Collectors.toList());
        System.out.println("Odd Numbers: " + oddddNumbers);                                   
    }
}
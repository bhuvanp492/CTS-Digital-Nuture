// 29. Records
// Objective: Use the record keyword for immutable data structures (Java 16+).
// Task: Create a record to represent a Person with name and age.
// Instructions:
// o Define a record named Person.
// o Create instances and print them.
// o Use records in a List and filter based on age using Streams.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
record Person(String name, int age) {}
public class RecordsExample {
    public static void main(String[] args) {
        Person p1 = new Person("Bhuvan", 20);
        Person p2 = new Person("Arun", 17);
        Person p3 = new Person("Karthik", 22);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        List<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        List<Person> filteredPeople = people.stream()
                                            .filter(person -> person.age() >= 18)
                                            .collect(Collectors.toList());

        System.out.println("People age 18 and above:");
        for (Person person : filteredPeople) {
            System.out.println(person);
        }
    }
}
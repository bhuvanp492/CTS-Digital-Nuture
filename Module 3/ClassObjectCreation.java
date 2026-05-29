// 17. Class and Object Creation
// Objective: Understand classes and objects.
// Task: Create a Car class with attributes and methods.
// Instructions:
// o Define attributes: make, model, year.
// o Implement a method displayDetails() to print car information.
// o Create objects of the Car class and call the method.

class Car {
    String make;
    String model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println();
    }
}
public class ClassObjectCreation {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2022);
        Car car2 = new Car("Honda", "Civic", 2021);
        car1.displayDetails();
        car2.displayDetails();
    }
}
// 39. Reflection in Java
// Objective: Use Java Reflection API.
// Task: Load a class and invoke methods dynamically.
// Instructions:
// o Use Class.forName(), getDeclaredMethods(), and invoke() to call a method without directly referencing it in code.
// o Print the method names and parameters.

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
class Sample {
    public void display() {
        System.out.println("Hello from Reflection!");
    }
}
public class ReflectionExample {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("Sample");
            Object obj = cls.getDeclaredConstructor().newInstance();
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Methods in class:");
            for (Method method : methods) {
                System.out.println("Method Name: " + method.getName());
                Parameter[] params = method.getParameters();
                System.out.println("Number of Parameters: " + params.length);
                if (method.getName().equals("display")) {
                    method.invoke(obj);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
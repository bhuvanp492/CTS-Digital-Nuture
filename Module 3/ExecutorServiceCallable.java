// 41. Executor Service and Callable
// Objective: Use concurrency utilities.
// Task: Execute multiple Callable tasks that return results.
// Instructions:
// o Use Executors.newFixedThreadPool() and submit() to execute callables.
// o Collect results using Future.get().

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class ExecutorServiceCallable {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        try {
            Callable<Integer> task1 = () -> 10 + 20;
            Callable<Integer> task2 = () -> 30 + 40;
            Callable<Integer> task3 = () -> 50 + 60;
            Future<Integer> result1 = executor.submit(task1);
            Future<Integer> result2 = executor.submit(task2);
            Future<Integer> result3 = executor.submit(task3);
            System.out.println("Result 1: " + result1.get());
            System.out.println("Result 2: " + result2.get());
            System.out.println("Result 3: " + result3.get());
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        executor.shutdown();
    }
}
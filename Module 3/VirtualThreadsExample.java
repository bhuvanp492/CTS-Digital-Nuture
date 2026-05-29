// 40. Virtual Threads (Java 21)

// Objective: Use lightweight threads for scalable concurrency.

// Task: Launch 100,000 virtual threads that each print a message.

// Instructions:
// o Use Thread.startVirtualThread(() -> { ... }).
// o Measure performance versus traditional threads.

public class VirtualThreadsExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {

            int threadNumber = i;

            // Use Thread.startVirtualThread(() -> { ... })
            Thread.startVirtualThread(() -> {
                System.out.println("Virtual Thread " + threadNumber);
            });
        }

        long endTime = System.currentTimeMillis();

        // Measure performance
        System.out.println("Time Taken: " + (endTime - startTime) + " ms");
    }
}
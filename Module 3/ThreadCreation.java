// 26. Thread Creation
// Objective: Implement multithreading.
// Task: Create and run two threads that print messages.
// Instructions:
// o Define a class that extends Thread or implements Runnable.
// o In the run() method, print a message multiple times.
// o Start both threads and observe the output.

class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
public class ThreadCreation {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.setName("Thread 1");
        thread2.setName("Thread 2");
        thread1.start();
        thread2.start();
    }
}
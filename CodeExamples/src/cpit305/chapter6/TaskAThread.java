
package cpit305.chapter6;

public class TaskAThread extends Thread {
    public void run() {
        // Task 1
        String thName = Thread.currentThread().getName();
        System.out.println(thName + " started");
        for (int i = 0; i < 10000; i++) {
            System.out.print("A");
        }
        System.out.println(thName + " finished");
    }
}

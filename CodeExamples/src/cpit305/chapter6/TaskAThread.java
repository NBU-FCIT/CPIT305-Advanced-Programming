
package cpit305.chapter6;

public class TaskAThread extends Thread {
    public void run() {
        // Task 1
        for (int i = 0; i < 10000; i++) {
            System.out.print("A");
        }
    }
}

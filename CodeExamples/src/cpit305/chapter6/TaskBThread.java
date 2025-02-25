
package cpit305.chapter6;

public class TaskBThread extends Thread {
    public void run() {
        // Task 2
        for (int i = 0; i < 10000; i++) {
            System.out.print("B");
        }
    }
}

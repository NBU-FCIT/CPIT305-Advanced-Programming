
package cpit305.chapter6;

public class MultiThreadingTest {
    public static void main(String[] args) {
        TaskAThread t1 = new TaskAThread();
        
        TaskBThread t2 = new TaskBThread();
        t2.start();
        t1.start();
    }
}

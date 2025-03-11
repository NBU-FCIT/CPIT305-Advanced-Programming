
package cpit305.chapter6;

public class TaskBThread extends Thread {
    public void run() {
        // Task 2
        String thName = Thread.currentThread().getName();
        System.out.println(thName + " started");
        for (int i = 0; i < 10000; i++) {
            System.out.print("B");
            if(i == 5000){
                System.out.println(thName + " paused");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
                System.out.println(thName + " continue");
            }
        }
        System.out.println(thName + " finished");
    }
}


package cpit305.chapter6;

public class TwoTasksWithoutThread {
    public static void main(String[] args) {
        //The program contains two tasks
        
        // Task 1
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        // Task 2
        for (int i = 0; i < 10; i++) {
            System.out.print("a ");
        }
        System.out.println();
    }
}

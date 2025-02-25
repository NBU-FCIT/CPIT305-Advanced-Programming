
package cpit305.chapter6;

public class OneTaskWithoutThread {
    public static void main(String[] args) {
        //The program contains only one task
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

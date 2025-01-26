package cpit305.chapter1;

import java.util.Scanner;

public class Example02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int x = s.nextInt();
        if (x % 2 == 0) {
            System.out.println(x + " is even number.");
        } else {
            System.out.println(x + " is odd number.");
        }
    }
}

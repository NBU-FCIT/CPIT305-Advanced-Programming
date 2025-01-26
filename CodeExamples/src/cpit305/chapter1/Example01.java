package cpit305.chapter1;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter 2 integers");

        int x = s1.nextInt();
        int y = s1.nextInt();
        int sum = x + y;

        System.out.println("The sum of x and y is " + sum);

    }
}

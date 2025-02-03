
package cpit305.chapter4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter two integers:");
        try {
            int x = s.nextInt();
            int y = s.nextInt();
            System.out.println("The quotient: " + x / y);
        } catch (InputMismatchException e) {
            System.out.println("Please check your input.");
        } catch (ArithmeticException e) {
            System.out.println("Please check the second number which cannot be ZERO.");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Somewhere in the bottom of the main method");
    }
}

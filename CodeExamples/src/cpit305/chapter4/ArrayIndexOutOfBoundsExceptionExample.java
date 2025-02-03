
package cpit305.chapter4;

public class ArrayIndexOutOfBoundsExceptionExample{ 
    public static void main(String[] args) {
        int[] array = {4, 8, 3, 7, 9};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please check the array index");
        }
    }
}

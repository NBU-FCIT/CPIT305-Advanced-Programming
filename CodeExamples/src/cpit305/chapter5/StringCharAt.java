package cpit305.chapter5;

public class StringCharAt {

    public static void main(String[] args) {
        try {
            String str = "Welcome to Java";
            System.out.println(str.charAt(0));
            System.out.println(str.charAt(5));
            System.out.println(str.charAt(11));
            System.out.println(str.charAt(15)); // Problem: index 15 doesn't exist
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Please check the index!");
        }
        
        
    }
}

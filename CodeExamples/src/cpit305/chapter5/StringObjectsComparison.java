
package cpit305.chapter5;

public class StringObjectsComparison {
    public static void main(String[] args) {
        
        //Object comparison
        String s1  = "Welcome to Java";
        String s2  = new String("Welcome to Java");
        String s3  = "Welcome to Java";
        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println("s2 == s3? " + (s2 == s3));
    }
}

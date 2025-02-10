
package cpit305.chapter5;

public class StringContentComparison {
    public static void main(String[] args) {
        String s1  = new String("Welcome to Java");
        String s2  = new String("Welcome to java");
        String s3  = new String("Welcome to Java");
        System.out.println("s1 and s2 have same content? " + s1.equalsIgnoreCase(s2));
        System.out.println("s1 and s3 have same content? " + s1.equals(s3));
        System.out.println("s2 and s3 have same content? " + s2.equals(s3));
    }
}

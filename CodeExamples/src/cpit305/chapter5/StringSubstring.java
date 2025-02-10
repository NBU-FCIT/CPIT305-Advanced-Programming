
package cpit305.chapter5;

public class StringSubstring {
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        
        String s2 = s1.substring(0, 7); // "Welcome"
        System.out.println("s2 = " + s2);
        
        s2 = s1.substring(11); // "Java"  // s1.substring(11, 15);
        System.out.println("s2 = " + s2);
        
        s2 = s1.substring(8, 10); // "to"
        System.out.println("s2 = " + s2);
    }
}

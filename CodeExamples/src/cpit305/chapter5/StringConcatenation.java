
package cpit305.chapter5;

public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Hello \"";
        String s2 = "World\"";
        String s3 = s1.concat(s2); //s1 + s2;
        System.out.println("s3 = " + s3);
    }
}
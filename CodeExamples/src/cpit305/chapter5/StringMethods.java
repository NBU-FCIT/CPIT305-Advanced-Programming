
package cpit305.chapter5;

public class StringMethods {
    public static void main(String[] args) {
        String str = "    Welcome   to    Java   ";
        
        //toLowerCase
        System.out.println(str.toLowerCase());
        
        //toUpperCase
        System.out.println(str.toUpperCase());
        
        //trim
        System.out.println(str.trim());
        
        //replace a char by another char
        System.out.println(str.replace('a', 'A'));
        System.out.println(str.replace("a", "A"));
        
        //replace a char sequence (string) by another char sequence
        System.out.println(str.replace("Java", "C++"));
        
        //replace the first occurence of "a"
        System.out.println(str.replaceFirst("a", "A"));
        
        
    }
}

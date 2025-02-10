
package cpit305.chapter5;

public class StringSplit {
    public static void main(String[] args) {
        String progLanguages = "Java#HTML#Perl#C++#Python#VB.NET#C";
        //String[] array = progLanguages.split("#");
        String[] array = progLanguages.split("#", 0);
        System.out.println(array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);            
        }
    }
}

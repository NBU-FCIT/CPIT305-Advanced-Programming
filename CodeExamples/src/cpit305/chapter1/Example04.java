package cpit305.chapter1;

// Methods and method call

public class Example04 {

    public static void main(String[] args) {
        //method call: استدعاء
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        //sum method call: استدعاء للدالة sum
        int s = sum(a, b);
        System.out.println(a + " + " + b + " = " + s);
    }

    //Declaration or definition تعريف الدالة
    public static int sum(int x, int y) {
        return x + y;
    }
}

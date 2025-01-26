package cpit305.chapter1;

//Arrays

public class Example05 {

    public static void main(String[] args) {
        //Declaration تعريف
        int[] myList;
        //Creation انشاء
        myList = new int[5];
        //Initialization تهيئة
        myList[0] = 17;
        myList[1] = 6;
        myList[2] = 13;
        myList[3] = 5;
        myList[4] = 10;
        printArray(myList);
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1] + "]");
    }
}

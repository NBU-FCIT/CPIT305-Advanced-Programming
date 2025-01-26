package cpit305.chapter1;

//Test Classes and Object
//Student class

public class Example06 {

    public static void main(String[] args) {
        Student s1 = new Student(123, "Mohamed", 4.56);
        Student s2 = new Student(456, "Ahmed", 4.25);
        Student s3 = new Student();

        s1.print();
        System.out.println("--------------------");
        s3.print();
    }
}

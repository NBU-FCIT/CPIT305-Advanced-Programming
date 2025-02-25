
package cpit305.chapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) {
        try{
            File f = new File("file1.txt");
            PrintWriter pw = new PrintWriter(f);            
            pw.println("Student1 1001");
            pw.println("Student2 1002");
            pw.println("Student3 1003");
            pw.println("Student4 1004");
            
            pw.close();
            
        } catch(FileNotFoundException e){
            System.out.println("File Not Found!");
        }
    }
}

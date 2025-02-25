package cpit305.chapter5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {
        try {
            File f = new File("file1.txt");
            Scanner s = new Scanner(f);
            
            while(s.hasNextLine()){
                String name = s.next();
                String id = s.next();
                System.out.println("ID: " + id + " NAME: " + name);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        }

    }
}

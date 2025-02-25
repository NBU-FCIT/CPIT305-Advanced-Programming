
package cpit305.chapter5;

import java.io.File;
import java.util.Date;

public class FileMethods {
    public static void main(String[] args) {
        File f = new File("file1.txt");
        System.out.println("Exists? " + f.exists());
        System.out.println(f.getName());
        System.out.println("Size: " + f.length() + " bytes");
        System.out.println("Read?: " + f.canRead());
        System.out.println("Write?: " + f.canWrite());
        System.out.println("Is Hidden?: " + f.isHidden());
        System.out.println("Is file?: " + f.isFile());
        System.out.println("Is Directory (Folder)?: " + f.isDirectory());
        System.out.println("Relative path: " + f.getPath());
        System.out.println("Absolute path: " + f.getAbsolutePath());
        System.out.println("Last Modified: " + new Date(f.lastModified()));
        //f.delete();
    }
}

package cpit305.chapter8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        System.out.println("-------------------CLIENT--------------------");
        try {
            Socket s = new Socket("localhost", 8000);
            
            Scanner in = new Scanner(s.getInputStream());
            PrintWriter out = new PrintWriter(s.getOutputStream());
            
            int num = 58;
            System.out.println("We will send the following number: " + num);
            
            out.println(num);
            out.flush();
            
            int newNum = in.nextInt();
            System.out.println("We received the following number from the server: " + newNum);   
            
            in.close();
            out.close();
            s.close();
            
        } catch (UnknownHostException ex) {
            System.out.println("Error: " + ex);
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}

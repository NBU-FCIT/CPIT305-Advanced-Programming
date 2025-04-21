
package cpit305.chapter8;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        System.out.println("-------------------SERVER--------------------");
        try {
            ServerSocket server = new ServerSocket(8000);
            while(true){
                Socket client = server.accept();            
                Scanner in = new Scanner(client.getInputStream());
                PrintWriter out = new PrintWriter(client.getOutputStream());            

                int n = in.nextInt();
                System.out.println("We received the following number from the client: " + n);   

                int twiceNum = n * 2;

                System.out.println("We will send back the following number to the client: " + twiceNum);   
                out.println(twiceNum);
                out.flush();

                in.close();
                out.close();
                client.close();
            }            
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
}

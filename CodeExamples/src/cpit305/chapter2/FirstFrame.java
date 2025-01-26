package cpit305.chapter2;

//First JFrame
import javax.swing.JFrame;

public class FirstFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame("This is our first window");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200, 100, 800, 600);
        f.setVisible(true);
    }
}

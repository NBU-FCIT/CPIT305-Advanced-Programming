package cpit305.chapter2;


import javax.swing.JFrame;

public class MyFrame extends JFrame{

    public MyFrame(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 800, 600);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame("This our second window");
    }
    
}

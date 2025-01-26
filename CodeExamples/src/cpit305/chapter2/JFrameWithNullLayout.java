package cpit305.chapter2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameWithNullLayout extends JFrame {

    public JFrameWithNullLayout(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 800, 600);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        setLayout(null);

        b1.setBounds(100, 100, 150, 50);
        add(b1);
        b2.setBounds(100, 170, 150, 50);
        add(b2);
        b3.setBounds(100, 240, 150, 50);
        add(b3);
        b4.setBounds(100, 310, 150, 50);
        add(b4);
        b5.setBounds(100, 380, 150, 50);
        add(b5);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameWithNullLayout("Test NullLayout");
    }
}

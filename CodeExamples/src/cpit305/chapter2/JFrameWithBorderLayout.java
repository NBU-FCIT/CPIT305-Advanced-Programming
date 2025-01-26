package cpit305.chapter2;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameWithBorderLayout extends JFrame {

    public JFrameWithBorderLayout(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 800, 600);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        setLayout(new BorderLayout());

        add(b1, "North");
        add(b2, "South");
        add(b3, "East");
        add(b4, "West");
        add(b5, "Center");

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameWithBorderLayout("Test BorderLayout");
    }
}

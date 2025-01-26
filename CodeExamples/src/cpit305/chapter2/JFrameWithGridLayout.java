package cpit305.chapter2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameWithGridLayout extends JFrame {

    public JFrameWithGridLayout(String title) {
        setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 800, 600);

        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        JButton b4 = new JButton("Button 4");
        JButton b5 = new JButton("Button 5");

        setLayout(new GridLayout(2, 3));

        add(b1);
        add(b5);
        add(b2);
        add(b3);
        add(b4);

        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameWithGridLayout("Test GridLayout");
    }
}

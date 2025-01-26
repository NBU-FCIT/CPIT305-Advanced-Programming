package cpit305.chapter2;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MultipleLayoutManagersExample extends JFrame {

    public MultipleLayoutManagersExample() {
        setTitle("Test Frame Example 12");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200, 100, 800, 600);
        
        setLayout(new GridLayout(2, 1));
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel(new GridLayout(1, 3));
        p1.setBackground(Color.red);
        p2.setBackground(Color.green);
        
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        
        add(p1);
        add(p2);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MultipleLayoutManagersExample();
    }    
}
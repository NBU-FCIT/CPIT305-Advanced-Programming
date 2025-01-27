
package cpit305.chapter2;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame {
    
    //Constructor
    public Calculator(){
        setTitle("Calculator"); // or user super("title") instead
        setBounds(500, 100, 400, 700);
        setResizable(false);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(11, 1));
        JPanel p1 = new JPanel(new GridLayout(1, 1));
        JTextField tf = new JTextField(30);
        p1.add(tf);
        
        add(p1);
        
        JPanel p2 = new JPanel(new GridLayout(1, 6));
        JLabel degLabel = new JLabel("DEG");
        JLabel feLabel = new JLabel("F-E");
        p2.add(degLabel);
        p2.add(feLabel);
        p2.add(new JLabel(""));
        p2.add(new JLabel(""));
        p2.add(new JLabel(""));
        p2.add(new JLabel(""));
        add(p2);
        
        JPanel p3 = new JPanel();
        add(p3);
        
        JPanel p4 = new JPanel();
        add(p4);
        
        JPanel p5 = new JPanel();
        add(p5);
        
        JPanel p6 = new JPanel();
        add(p6);
        
        JPanel p7 = new JPanel();
        add(p7);
        
        JPanel p8 = new JPanel();
        add(p8);
        
        JPanel p9 = new JPanel();
        add(p9);
        
        JPanel p10 = new JPanel();
        add(p10);
        
        JPanel p11 = new JPanel(new GridLayout(1, 5));
        JButton btnLn = new JButton("ln");
        JButton btnPM = new JButton("+/-");
        JButton btnZero = new JButton("0");
        JButton btnPoint = new JButton(".");
        JButton btnEqual = new JButton("=");
        btnEqual.setBackground(Color.CYAN);
        p11.add(btnLn);
        p11.add(btnPM);
        p11.add(btnZero);
        p11.add(btnPoint);
        p11.add(btnEqual);
        add(p11);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Calculator();
    }
}

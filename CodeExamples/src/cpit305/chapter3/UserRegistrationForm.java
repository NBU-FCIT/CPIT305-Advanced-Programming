package cpit305.chapter3;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserRegistrationForm extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

    private JButton btnRegister;
    private JButton btnCancel;
    
    private JTextField fntf;
    private JTextField lntf;
    
    // Constructor
    public UserRegistrationForm() {
        setTitle("User Registration Form"); // for setting the frame title
        setBounds(100, 100, 1000, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new GridLayout(4, 1));
        
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        
        p1.addMouseListener(this);
        p2.addMouseListener(this);
        p3.addMouseListener(this);
        p4.addMouseListener(this);
        p4.addMouseMotionListener(this);
        
        JLabel fnLabel = new JLabel("First Name:");
        fntf = new JTextField(20);
        p1.add(fnLabel);
        p1.add(fntf);
        
        add(p1);
        
        JLabel lnLabel = new JLabel("Last Name:");
        lntf = new JTextField(20);
        p2.add(lnLabel);
        p2.add(lntf);
        
        add(p2);
        
        JLabel genderLabel = new JLabel("Gender:");
        String[] items = {"Male", "Female"};
        JComboBox cbGender = new JComboBox(items);
        p3.add(genderLabel);
        p3.add(cbGender);
        
        add(p3);
        
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(this);
        
        btnRegister = new JButton("Register");
        btnRegister.addActionListener(this);
        
        p4.add(btnCancel);
        p4.add(btnRegister);
        add(p4);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == btnRegister){
            
            JOptionPane.showMessageDialog(this, "User Information Stored Successfully", "Registration", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnCancel) {
            fntf.setText("");
            lntf.setText("");
        }
        
    }
    
    public static void main(String[] args) {
        new UserRegistrationForm();
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent e) {
        
    }

    public void mouseReleased(MouseEvent e) {
        
    }

    public void mouseEntered(MouseEvent e) {
        ((JPanel) e.getSource()).setBackground(Color.red);
    }

    public void mouseExited(MouseEvent e) {
        ((JPanel) e.getSource()).setBackground(Color.GRAY);
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("The mouse is dragged");
    }

    public void mouseMoved(MouseEvent e) {
        
    }
    
}

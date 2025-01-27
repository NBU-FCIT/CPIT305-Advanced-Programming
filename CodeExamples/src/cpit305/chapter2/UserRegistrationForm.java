package cpit305.chapter2;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UserRegistrationForm extends JFrame {

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
        
        JLabel fnLabel = new JLabel("First Name:");
        JTextField fntf = new JTextField(20);
        p1.add(fnLabel);
        p1.add(fntf);
        
        add(p1);
        
        JLabel lnLabel = new JLabel("Last Name:");
        JTextField lntf = new JTextField(20);
        p2.add(lnLabel);
        p2.add(lntf);
        
        add(p2);
        
        JLabel genderLabel = new JLabel("Gender:");
        String[] items = {"Male", "Female"};
        JComboBox cbGender = new JComboBox(items);
        p3.add(genderLabel);
        p3.add(cbGender);
        
        add(p3);
        
        JButton btnCancel = new JButton("Cancel");
        JButton btnRegister = new JButton("Register");
        p4.add(btnCancel);
        p4.add(btnRegister);
        add(p4);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new UserRegistrationForm();
    }
    
}

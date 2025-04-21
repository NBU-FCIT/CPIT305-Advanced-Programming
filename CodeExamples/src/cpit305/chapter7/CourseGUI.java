package cpit305.chapter7;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CourseGUI extends JFrame implements ActionListener {

    JTextField tfCode;
    JTextField tfName;
    JTextField tfCredits;

    JButton btnAddCourse;
    JButton btnCancel;

    public CourseGUI() {
        setTitle("Course Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 300);

        setLayout(new GridLayout(4, 1));

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelCode = new JLabel("Code: ");
        tfCode = new JTextField(15);
        p1.add(labelCode);
        p1.add(tfCode);        
        add(p1);
        
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelName = new JLabel("Name: ");
        tfName = new JTextField(30);
        p2.add(labelName);
        p2.add(tfName);        
        add(p2);
        
        JPanel p3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel labelCredits = new JLabel("Credits: ");
        tfCredits = new JTextField(10);
        p3.add(labelCredits);
        p3.add(tfCredits);        
        add(p3);
        
        JPanel p4 = new JPanel();
        btnAddCourse = new JButton("Register Course");
        btnAddCourse.addActionListener(this);
        btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(this);
        p4.add(btnAddCourse);
        p4.add(btnCancel);
        add(p4);
        
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddCourse) {
            String code = tfCode.getText();
            String name = tfName.getText();
            String credits = tfCredits.getText();
            try {
                //Registration or loading for of the driver
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fcit", "root", "jK~1|Zoh7zg3");
                Statement stmt = con.createStatement();
                String query = "INSERT INTO course VALUES('" + code + "', '" + name + "', " + credits + ");";
                int num = stmt.executeUpdate(query);
                if(num == 1){
                    JOptionPane.showMessageDialog(this, "Course added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
                stmt.close();
                con.close();
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Please check the driver used to connect to the database", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnCancel) {
            tfCode.setText("");
            tfName.setText("");
            tfCredits.setText("");
        }
    }
    
    
    public static void main(String[] args) {
        new CourseGUI();
    }
}

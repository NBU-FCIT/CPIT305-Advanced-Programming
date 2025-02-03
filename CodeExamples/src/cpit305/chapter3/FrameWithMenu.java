
package cpit305.chapter3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class FrameWithMenu extends JFrame implements ActionListener {
    public FrameWithMenu(){
        super("Frame with Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        
        // Menu creation
        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenuItem miNewProject = new JMenuItem("New Project");
        JMenuItem miNewFile = new JMenuItem("New File");
        JMenuItem miOpenFile = new JMenuItem("Open File");
        miOpenFile.addActionListener(this);
        JMenuItem miSaveFile = new JMenuItem("Save File");
        miSaveFile.addActionListener(this);
        
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(this);
        mFile.add(miNewProject);
        mFile.add(miNewFile);
        mFile.addSeparator();   
        mFile.add(miOpenFile);
        mFile.addSeparator();   
        mFile.add(miSaveFile);
        mFile.addSeparator();
        mFile.add(miExit);
        
        JMenu mEdit = new JMenu("Edit");
        JMenuItem miColor = new JMenuItem("Choose Color");
        miColor.addActionListener(this);
        mEdit.add(miColor);
        mb.add(mFile);
        mb.add(mEdit);
        
        setJMenuBar(mb);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FrameWithMenu();
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Exit")){
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure that you want to exit?", "Exit confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(choice == 0){
                System.exit(0);
            }    
        } else if(e.getActionCommand().equals("Choose Color")){
            Color col = JColorChooser.showDialog(this, "Please choose a backgraound color", Color.lightGray);
            getContentPane().setBackground(col);
        } else if(e.getActionCommand().equals("Open File")){
            JFileChooser fc = new JFileChooser();
            int choice = fc.showOpenDialog(this);
            if(choice == 0) {
                System.out.println(fc.getSelectedFile());
            }
        } else if(e.getActionCommand().equals("Save File")){
            JFileChooser fc = new JFileChooser();
            int choice = fc.showSaveDialog(this);
            if(choice == 0){
                System.out.println(fc.getSelectedFile());
            }           
        }
    }
}

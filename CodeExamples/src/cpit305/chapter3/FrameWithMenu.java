
package cpit305.chapter3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class FrameWithMenu extends JFrame implements ActionListener {
    public FrameWithMenu(){
        super("Frame with Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);
        
        // Menue creation
        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenuItem miNewProject = new JMenuItem("New Project");
        JMenuItem miNewFile = new JMenuItem("New File");
        JMenuItem miOpenProject = new JMenuItem("Open Project");
        JMenuItem miExit = new JMenuItem("Exit");
        miExit.addActionListener(this);
        mFile.add(miNewProject);
        mFile.add(miNewFile);
        mFile.addSeparator();        
        mFile.add(miOpenProject);
        mFile.addSeparator();
        mFile.add(miExit);
        
        JMenu mEdit = new JMenu("Edit");
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
            System.exit(0);
        }
    }
}

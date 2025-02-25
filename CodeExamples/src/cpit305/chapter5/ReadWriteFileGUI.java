package cpit305.chapter5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ReadWriteFileGUI extends JFrame implements ActionListener {

    JMenuItem miOpenFile;
    JMenuItem miSaveFile;
    JMenuItem miExit;
    JTextArea text;

    public ReadWriteFileGUI() {
        setTitle("CPIT305 Notepad");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 600);

        JMenuBar mb = new JMenuBar();
        JMenu mFile = new JMenu("File");

        miOpenFile = new JMenuItem("Open File");
        miOpenFile.addActionListener(this);
        miSaveFile = new JMenuItem("Save File");
        miSaveFile.addActionListener(this);
        miExit = new JMenuItem("Exit");
        miExit.addActionListener(this);

        mFile.add(miOpenFile);
        mFile.add(miSaveFile);
        mFile.addSeparator();
        mFile.add(miExit);

        mb.add(mFile);

        text = new JTextArea();
        text.setLineWrap(true);
        text.setFont(new Font("Courier New", 0, 24));
        add(text);

        setJMenuBar(mb);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miExit) {
            int choice = JOptionPane.showConfirmDialog(this, "Are you sure that you want to exit?", "Exit confirmation", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == 0) {
                System.exit(0);
            }
        } else if (e.getSource() == miOpenFile) {
            JFileChooser fc = new JFileChooser();
            int choice = fc.showOpenDialog(this);
            if (choice == 0) {
                try {
                    File f = fc.getSelectedFile();
                    Scanner s = new Scanner(f);
                    String str = "", line;
                    while (s.hasNextLine()) {
                        line = s.nextLine();
                        System.out.println(line);
                        if (line.isEmpty()) {
                            line = "\n\n";
                        }
                        str += line;
                    }
                    text.setText(str);
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if (e.getSource() == miSaveFile) {
            JFileChooser fc = new JFileChooser();
            int choice = fc.showSaveDialog(this);
            if (choice == 0) {
                try {
                    File f = fc.getSelectedFile();
                    PrintWriter pw = new PrintWriter(f);
                    pw.write(text.getText());
                    pw.flush();
                    pw.close();
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    public static void main(String[] args) {
        new ReadWriteFileGUI();
    }
}

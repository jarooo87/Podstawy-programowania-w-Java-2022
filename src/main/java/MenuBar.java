import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class MenuBar extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu file;
    JMenu edit;
    JMenu view;
    JMenuItem newItem;
    JMenuItem openItem;
    JMenuItem settingsItem;
    ImageIcon newIcon;


    MenuBar(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(600,600);
        newIcon = new ImageIcon("icon.png");
        menuBar = new JMenuBar();
        file = new JMenu("file");
        edit = new JMenu("edit");
        view = new JMenu("view");
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(view);
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        settingsItem = new JMenuItem("Settings");
        file.add(newItem);
        file.add(openItem);
        file.add(settingsItem);
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        settingsItem.addActionListener(this);
        newItem.setMnemonic(KeyEvent.VK_N);
        newItem.setIcon(newIcon);
        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == newItem){
            System.out.println("New file opened");
        }
        if (e.getSource() == openItem){
            JFileChooser fileChooser = new JFileChooser();
            int a = fileChooser.showOpenDialog(null);
            if(a == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }

    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonClass extends JFrame implements ActionListener {
    JRadioButton windows;
    JRadioButton linux;
    JRadioButton android;
    ImageIcon linuxIcon;
    RadioButtonClass(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        linuxIcon = new ImageIcon("icon.png");
        windows = new JRadioButton("windows");
        linux = new JRadioButton("linux");
        android = new JRadioButton("android");
        ButtonGroup myGroup = new ButtonGroup();
        myGroup.add(windows);
        myGroup.add(linux);
        myGroup.add(android);
        windows.addActionListener(this);
        linux.addActionListener(this);
        android.addActionListener(this);
        linux.setIcon(linuxIcon);
        this.add(windows);
        this.add(linux);
        this.add(android);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == linux){
            System.out.println("Linux for pc");
            this.setVisible(false);
        }
        else if (e.getSource() == android){
            System.out.println("Android for mobile");
        }
        else if(e .getSource() == windows){
            System.out.println("Are you sure??");
        }
    }
}

import javax.swing.*;
import java.awt.*;

public class myJPanelClass {
    public static void main(String[] args) {
         ImageIcon icon = new ImageIcon("icon.png");
         JLabel label = new JLabel();
         label.setText("Hello");
         label.setIcon(icon);
         JFrame myFrame = new JFrame();
         myFrame.setVisible(true);
         myFrame.setLayout(null);
         myFrame.setSize(600,600);
         myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JPanel bluePanel = new JPanel();
         bluePanel.setBackground(Color.BLUE);
         bluePanel.setBounds(0,0,150,150);
         myFrame.add(bluePanel);
         JPanel redPanel = new JPanel();
         redPanel.setBackground(Color.RED);
         redPanel.setBounds(0,150,15,150);
         myFrame.add(redPanel);
         JPanel greenPanel = new JPanel();
         greenPanel.setBackground(Color.GREEN);
         greenPanel.setBounds(0,300,300,300);
         myFrame.add(greenPanel);
         greenPanel.add(label);
         label.setVerticalAlignment(JLabel.BOTTOM);
         label.setHorizontalAlignment(JLabel.LEFT);



    }
}

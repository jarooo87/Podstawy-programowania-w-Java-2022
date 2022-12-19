import javax.swing.*;
import java.awt.*;

public class myJFrameLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setTitle("mojaRamka");
        frame.setSize(800,800);
       // frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().setBackground(Color.BLUE);
        frame.getContentPane().setBackground(new Color(0xB5B287C2, true));
        JLabel label = new JLabel();
        label.setText("Hello world");
        frame.add(label);
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        ImageIcon image2 = new ImageIcon("logo.png");
        label.setIcon(image2);
        label.setHorizontalTextPosition(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(Color.BLUE);
        label.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        label.setIconTextGap(100);
        label.setBackground(Color.GREEN);
        label.setOpaque(true);


    }

}

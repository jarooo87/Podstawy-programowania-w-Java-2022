import javax.swing.*;
import java.awt.*;

public class myLayeredPane {
    public static void main(String[] args) {
        JLabel label1 = new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.GREEN);
        label1.setBounds(30,30,250,250);
        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.BLUE);
        label2.setBounds(60,60,250,250);
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.RED);
        label3.setBounds(90,90,250,250);

        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setBounds(0,0,600,600);
        layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label2, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label3, JLayeredPane.DRAG_LAYER);

        JFrame frame = new JFrame();
        frame.add(layeredPane);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

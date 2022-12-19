import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener extends JFrame implements MouseListener {
    JLabel label;
    MyMouseListener(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);

        label = new JLabel();
        label.setBounds(0,0,150,150);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse button clicked on label");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse button pressed on label");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse button released on label");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse button entered on label");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse button exited on label");
    }
}

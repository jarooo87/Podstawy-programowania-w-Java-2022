import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyListenerClass extends JFrame implements KeyListener {
    JLabel label;

    KeyListenerClass() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setLayout(null);
        this.addKeyListener(this);
        label = new JLabel();
        label.setBounds(0, 0, 50, 50);
        label.setBackground(Color.blue);
        label.setOpaque(true);
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    switch(e.getKeyChar()){
        case 'a':
            label.setLocation(label.getX()-10, label.getY());
            break;
        case 'w':
            label.setLocation(label.getX(), label.getY()-10);
            break;
        case 's':
            label.setLocation(label.getX(), label.getY()+10);
            break;
        case 'd':
            label.setLocation(label.getX()+10, label.getY());

            break;
    }
    }

    @Override
    public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()) {
                case 37:
                    label.setLocation(label.getX() - 10, label.getY());
                    break;
                case 38:
                    label.setLocation(label.getX(), label.getY() - 10);
                    break;
                case 39:
                    label.setLocation(label.getX() + 10, label.getY());
                    break;
                case 40:
                    label.setLocation(label.getX(), label.getY() + 10);


            }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Char of key " + e.getKeyChar());
        System.out.println("Code of key " + e.getKeyCode());
    }
}



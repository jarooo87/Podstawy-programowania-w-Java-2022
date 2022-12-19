import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AllAxisClass extends JFrame {

    boolean left = false;
    boolean up = false;
    boolean down = false;
    boolean right = false;
    JLabel lbl = new JLabel();

    AllAxisClass(){
        this.setSize(500,500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        lbl.setBounds(0,0,20,20);
        lbl.setBackground(Color.blue);
        lbl.setOpaque(true);
        this.add(lbl);
        this.setVisible(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) left = true;
                if(e.getKeyCode() == KeyEvent.VK_RIGHT) right = true;
                if(e.getKeyCode() == KeyEvent.VK_UP) up = true;
                if(e.getKeyCode() == KeyEvent.VK_DOWN) down = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT) left = false;
                if(e.getKeyCode() == KeyEvent.VK_RIGHT) right = false;
                if(e.getKeyCode() == KeyEvent.VK_UP) up = false;
                if(e.getKeyCode() == KeyEvent.VK_DOWN) down = false;
            }

        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        if (left && up) {
                            lbl.setBounds(lbl.getX() - 3, lbl.getY() - 3, 20, 20);
                        } else if (left && down) {
                            lbl.setBounds(lbl.getX() - 3, lbl.getY() + 3, 20, 20);
                        } else if (right && up) {
                            lbl.setBounds(lbl.getX() + 3, lbl.getY() - 3, 20, 20);
                        } else if (right && down) {
                            lbl.setBounds(lbl.getX() + 3, lbl.getY() + 3, 20, 20);
                        } else if (left) {
                            lbl.setBounds(lbl.getX() - 3, lbl.getY(), 20, 20);
                        } else if (up) {
                            lbl.setBounds(lbl.getX(), lbl.getY() - 3, 20, 20);
                        } else if (right) {
                            lbl.setBounds(lbl.getX() + 3, lbl.getY(), 20, 20);
                        } else if (down) {
                            lbl.setBounds(lbl.getX(), lbl.getY() + 3, 20, 20);
                        }

                        Thread.sleep(30);
                    }
                }catch (Exception e) {
                        e.printStackTrace();
                        System.exit(0);
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        AllAxisClass aac = new AllAxisClass();
    }
}

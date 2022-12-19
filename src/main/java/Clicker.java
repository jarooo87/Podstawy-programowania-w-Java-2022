import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clicker implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JButton button;
    int count = 0;

    Clicker(){
        frame = new JFrame();
        panel = new JPanel();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.setLayout(null);
        frame.add(panel);

        button = new JButton("Click");
        button.setBounds(50,50,100,200);
        button.addActionListener(this);
        panel.add(button);

        label = new JLabel();
        label.setBounds(200,50,300,200);
        panel.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Clicker();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Counts : " + count);
    }
}

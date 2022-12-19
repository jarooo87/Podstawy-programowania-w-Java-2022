import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myButton extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    boolean lol = false;
    myButton(){
        label = new JLabel();
        ImageIcon icon2 = new ImageIcon("icon2.png");
        label.setIcon(icon2);
        label.setBounds(100,100,200,200);
        label.setVisible(false);
        button = new JButton();
        button.setBounds(100,100,200,200);
        button.setText("KLIK ON ME");
        button.addActionListener(this);
        ImageIcon icon = new ImageIcon("icon.png");
        button.setIcon(icon);
        button.setFocusable(false);
        button.setHorizontalTextPosition(JButton.LEFT);
        button.setVerticalTextPosition(JButton.TOP);
        button.setFont(new Font("Times New Roman", Font.BOLD, 20));
        button.setBackground(Color.BLUE);
        button.setForeground(Color.RED);
        label = new JLabel();
        ImageIcon icon3 = new ImageIcon("icon2.png");
        label.setIcon(icon3);
        label.setBounds(50,50,50,50);
        label.setVisible(false);



        this.setSize(600,600);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            //System.out.println("KLIKNIETO");
            //button.setEnabled(false);
            lol = !lol;
            label.setVisible(lol) ;
        }
    }
}

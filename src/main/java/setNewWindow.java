import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class setNewWindow implements ActionListener {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("NAPIS");
    JButton button2 = new JButton("Nowa ramka");

    setNewWindow(){
        label.setBounds(100,100,300,100);
        label.setFont(new Font("Comic Sans",Font.BOLD, 15));
        button2.setBounds(100,100,300,100);
        button2.addActionListener(this);
        frame.add(label);
        frame.add(button2);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button2){
            frame.dispose();
            CreateNewFrameClass cnfc2 = new CreateNewFrameClass();
        }
    }
}

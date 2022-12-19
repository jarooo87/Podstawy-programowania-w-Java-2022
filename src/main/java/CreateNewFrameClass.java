import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateNewFrameClass implements ActionListener {

    JFrame frame  = new JFrame();
    JButton button = new JButton("Click to create");

    CreateNewFrameClass(){
        button.setBounds(100,100,300,100);
        button.addActionListener(this);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            frame.dispose();
            setNewWindow sNW = new setNewWindow();
        }
    }
}

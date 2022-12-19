import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTextField extends JFrame implements ActionListener {
    JButton button;
    JCheckBox checkBox;
    JTextField textField;

    MyTextField(){
        checkBox = new JCheckBox();
        checkBox.setText("my answer");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font( "Times New Roman", Font.PLAIN, 20));

        button = new JButton("enter");
        button.addActionListener(this);

        textField = new JTextField();
        textField.setPreferredSize(new Dimension(200,50));
        textField.setFont(new Font("Comic Sans", Font.BOLD, 20));
        textField.setText("password");



        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(checkBox);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){

            System.out.println(textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
            System.out.println(checkBox.isSelected());
        }

    }
}

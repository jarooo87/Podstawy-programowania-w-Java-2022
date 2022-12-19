import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxClass extends JFrame implements ActionListener {
    JComboBox comboBox;

    ComboBoxClass(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        String [] cars = {"Audi","Citroen", "BMW","Toyota"};
        comboBox = new JComboBox(cars);
        this.add(comboBox);
        comboBox.addActionListener(this);
        comboBox.addItem("Skoda");
        comboBox.insertItemAt("KIA",0);
        comboBox.removeItem("BMW");
        comboBox.removeAllItems();
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comboBox){
            //System.out.println(comboBox.getSelectedIndex());
            System.out.println(comboBox.getSelectedItem());
        }

    }
}

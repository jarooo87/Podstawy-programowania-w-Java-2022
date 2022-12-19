import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JPanel panel;
    JButton[] operationButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton, clrButton,
            delButton, eqButton, decButton;
    JButton[] numButtons = new JButton[10];
    double someNum1 =0, someNum2 = 0, sum =0;
    char mathChar;

    MyCalculator(){
        frame = new JFrame("myCalculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400,500);
        textField = new JTextField();
        textField.setBounds(50,30,280,60);
        textField.setEditable(false);
        textField.setFont(new Font("Comic Sans MS",Font.BOLD,25));
        textField.setHorizontalAlignment(JTextField.RIGHT);
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        clrButton = new JButton("Clear");
        delButton = new JButton("Delete");
        eqButton = new JButton("=");
        decButton = new JButton(".");
        operationButtons[0] = addButton;
        operationButtons[1] = subButton;
        operationButtons[2] = mulButton;
        operationButtons[3] = divButton;
        operationButtons[4] = clrButton;
        operationButtons[5] = delButton;
        operationButtons[6] = eqButton;
        operationButtons[7] = decButton;
        for(int i =0;i<8;i++){
            operationButtons[i].addActionListener(this);
            operationButtons[i].setFont(new Font("Comic Sans MS",Font.BOLD,25));
            operationButtons[i].setFocusable(false);
        }
        for(int i =0;i<10;i++){
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener(this);
            numButtons[i].setFont(new Font("Comic Sans MS",Font.BOLD,25));
            numButtons[i].setFocusable(false);
        }

        delButton.setBounds(50,120,130,40);
        clrButton.setBounds(200,120,130,40);
        panel = new JPanel();
        panel.setBounds(30,180,330,270);
        //panel.setBackground(Color.blue);
        panel.setLayout(new GridLayout(4,4,4,4));
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(numButtons[0]);
        panel.add(decButton);
        panel.add(eqButton);

        frame.add(panel);
        frame.add(clrButton);
        frame.add(delButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0;i<10;i++){
            if(e.getSource() == numButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == addButton){
            someNum1 = Double.parseDouble(textField.getText());
            mathChar = '+';
            textField.setText("");
        }
        if(e.getSource() == subButton){
            someNum1 = Double.parseDouble(textField.getText());
            mathChar = '-';
            textField.setText("");
        }
        if (e.getSource() == mulButton){
            someNum1 = Double.parseDouble(textField.getText());
            mathChar = '*';
            textField.setText("");
        }
        if (e.getSource() == divButton){
            someNum1 = Double.parseDouble((textField.getText()));
            mathChar = '/';
            textField.setText("");
        }
        if (e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));

        }
        if (e.getSource() == delButton){
            String delStr =  textField.getText();
            textField.setText("");
            for(int i=0;i< delStr.length()-1;i++){
                textField.setText(textField.getText()+delStr.charAt(i));
            }

            }
            if ( e.getSource() == clrButton){
                textField.setText(textField.getText());
                textField.setText("");
        }
            if(e.getSource() == eqButton) {
                someNum2 = Double.parseDouble(textField.getText());
                switch (mathChar) {
                    case '+':
                        sum = someNum1 + someNum2;

                        break;

                    case '-':
                        sum = someNum1 - someNum2;
                        break;
                    case '*':
                        sum = someNum1 * someNum2;
                        break;
                    case '/':
                        sum  = someNum1 / someNum2;
                        break;
                }
                textField.setText(String.valueOf(sum));
                someNum1 = sum;
            }
    }
}

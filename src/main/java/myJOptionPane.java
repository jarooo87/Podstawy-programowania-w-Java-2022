import javax.swing.*;

public class myJOptionPane {
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Linux rulezzz","myTitle",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Linux rulezzz", "myTitle", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Linux rulezzz", "myTitle", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Linux rulezzz", "myTitle", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Linux rulezzz", "myTitle", JOptionPane.WARNING_MESSAGE);

         // JOptionPane.showConfirmDialog(null,"Linux rulezz","myTitle",JOptionPane.YES_NO_CANCEL_OPTION);
          //JOptionPane.showConfirmDialog(null,"Linux rulezz", "myTitle", JOptionPane.YES_NO_CANCEL_OPTION);
          //String variable = JOptionPane.showInputDialog("Linux rulezz");
          //System.out.println(variable);
          String[] option = {"TAK","NIE","USUN"};
          ImageIcon icon = new ImageIcon("icon.png");
          JOptionPane.showOptionDialog(null,
                  "linux rulezz",
                  "myTitle",
                  JOptionPane.YES_NO_CANCEL_OPTION,
                  JOptionPane.PLAIN_MESSAGE,
                  icon,option,0);

    }
}

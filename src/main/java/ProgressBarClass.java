import javax.swing.*;
import java.awt.*;

public class ProgressBarClass extends JFrame {
    JProgressBar progressBar;
    int counter;
  ProgressBarClass(){
      progressBar = new JProgressBar();
      progressBar.setValue(0);
      progressBar.setBounds(0,0,600,50);
      progressBar.setStringPainted(true);
      progressBar.setFont(new Font("Comic Sans", Font.BOLD,25));
      progressBar.setBackground(Color.BLUE);
      progressBar.setForeground(Color.GREEN);


      this.add(progressBar);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.setSize(600,600);
      this.setLayout(null);
      this.setVisible(true);
      while(counter<= 100){
          progressBar.setValue(counter);
          try {
              Thread.sleep(100);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
          counter = counter +1;
      }
      progressBar.setString("Installation complete");


  }
}

import javax.swing.*;

public class FFrame extends JFrame {
    FPanel panel;
    FFrame(){
        panel = new FPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
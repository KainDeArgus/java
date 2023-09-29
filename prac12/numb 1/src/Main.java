import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ImageIcon icon1 = new ImageIcon("C:/Users/makho/IdeaProjects/untitled3/prac12/numb 1/src/fire0.png");
        JFrame frame = new JFrame("Anime");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel();
        jLabel.setIcon(icon1);
        frame.add(jLabel);
        frame.pack();
        frame.setVisible(true);
        int c = 1;
        while (true) {
            jLabel.setIcon(new ImageIcon("C:/Users/makho/IdeaProjects/untitled3/prac12/numb 1/src/fire" + (c % 15) + ".png"));
            c++;
            TimeUnit.MICROSECONDS.sleep(60000);
        }
    }
}
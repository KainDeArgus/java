import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon(args[0]);
        JLabel label = new JLabel();
        label.setIcon(image);
        JFrame frame = new JFrame("Pic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.add(label);
        frame.setVisible(true);
    }
}
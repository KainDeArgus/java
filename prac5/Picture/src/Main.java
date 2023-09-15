import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon(args[0]);
        JLabel label = new JLabel();
        label.setText("Я сделяль");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(-50);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Courier", Font.BOLD, 20));

        label.setIcon(image);
        JFrame frame = new JFrame("Pic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(560, 580);
        frame.add(label);
        frame.setVisible(true);
    }
}
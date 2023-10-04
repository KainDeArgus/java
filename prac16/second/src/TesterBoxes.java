import javax.swing.*;
import java.awt.*;

public class TesterBoxes {
    static JFrame frame = new JFrame("TestJTextArea");
    static String[] fonts = new String[]{"Times New Roman", "MS Sans Serif", "Courier New"};
    static String[] colors = new String[]{"Blue", "Red", "Black"};
    static JTextArea textArea = new JTextArea();
    static JComboBox<String> fonts_box = new JComboBox<String>(fonts);
    static JComboBox<String> colors_box = new JComboBox<String>(colors);

    TesterBoxes() {
        fonts_box.addActionListener(event -> {
            String selectedBook = (String) fonts_box.getSelectedItem();
            switch (selectedBook) {
                case "Times New Roman":
                    textArea.setFont(new Font("Times New Roman", Font.PLAIN, 40));
                    break;
                case "MS Sans Serif":
                    textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 40));
                    break;
                case "Courier New":
                    textArea.setFont(new Font("Courier New", Font.PLAIN, 40));
                    break;
                default:
                    break;
            }
        });

        colors_box.addActionListener(event -> {
            String selectedBook = (String) colors_box.getSelectedItem();
            switch (selectedBook) {
                case "Blue":
                    textArea.setForeground(Color.BLUE);
                    break;
                case "Red":
                    textArea.setForeground(Color.RED);
                    break;
                case "Black":
                    textArea.setForeground(Color.BLACK);
                    break;
                default:
                    break;
            }
        });

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);

        fonts_box.setSelectedIndex(0);
        colors_box.setSelectedIndex(0);

        JPanel main = new JPanel();
        main.setLayout(new GridLayout(2, 1));
        JPanel boxes = new JPanel();
        boxes.setLayout(new GridLayout(1, 2));
        JPanel text = new JPanel();

        text.add(textArea);
        boxes.add(fonts_box);
        boxes.add(colors_box);
        main.add(text);
        main.add(boxes);

        frame.add(main);
        frame.setVisible(true);

    }
}

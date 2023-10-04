import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJComboBox{
    public static void test(){
        JFrame frame = new JFrame("TestJComboBox");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);

        String[] countries = {
                "Australia",
                "China",
                "England",
                "Russia"
        };

        JPanel info = new JPanel();
        JLabel info_label = new JLabel();
        GridLayout layoutMain = new GridLayout(2, 1);
        info.add(info_label);
        JComboBox<String> jComboBox = new JComboBox<String>(countries);
        jComboBox.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                JComboBox<String> combo = (JComboBox<String>) event.getSource();
                String selectedBook = (String) combo.getSelectedItem();

                if (selectedBook.equals("Australia")) {
                    info_label.setText("The capital of Australia is Canberra");
                } else if (selectedBook.equals("China")) {
                    info_label.setText("The capital of China is Beijing!");
                } else if (selectedBook.equals("England")) {
                    info_label.setText("The capital of England is London");
                } else if (selectedBook.equals("Russia")) {
                    info_label.setText("The capital of Russia is Moscow");
                }

            }
        });

        JPanel main = new JPanel();
        main.add(jComboBox);
        main.add(info);
        main.setLayout(layoutMain);
        frame.add(main);
        frame.setSize(300, 100);
        frame.setVisible(true);

    }
}

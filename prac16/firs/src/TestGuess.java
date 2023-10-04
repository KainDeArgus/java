import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TestGuess{
    static int hearts = 3;
    static int ans;
    static JFrame frame = new JFrame("TestGuess");
    static JLabel result = new JLabel("You have 3 hearts", SwingConstants.CENTER);
    static JLabel info = new JLabel("You need to guess number from 0 to 20");
    static JButton jButton = new JButton("Guess");;
    static JTextField input = new JTextField();

    public static void test(){
        ans = new Random().nextInt(21);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!input.getText().equals(Integer.toString(ans))){
                    if (--hearts == 0){
                        result.setText("You lose");
                        input.setEnabled(false);
                        jButton.setEnabled(false);
                    }
                    else {
                        if (Integer.parseInt(input.getText()) < ans)
                            result.setText("Your value is less than correct answer, try again. Нou have " + hearts + " left");
                        else result.setText("Your value is more than correct answer, try again. Нou have " + hearts + " left");
                    }
                }
                else{
                    result.setText("You win! Congratulations!");
                    input.setEnabled(false);
                    jButton.setEnabled(false);
                }
                input.setText("");
            }
        });
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLocationRelativeTo(null);

        JPanel main = new JPanel();
        JPanel container = new JPanel();

        GridLayout container_layout = new GridLayout(4, 1);
        container.setLayout(container_layout);
        container.add(info);
        container.add(input);
        container.add(jButton);
        container.add(result);

        main.add(container);
        frame.add(main);
        frame.setVisible(true);
    }

}

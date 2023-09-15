import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
    static String winner = "DRAW";
    static String LastScorer = "N/A";
    static int countR = 0;
    static int countM = 0;
    static JLabel label = new JLabel("Result: " + countR + "X" + countM, JLabel.CENTER);
    static JLabel label2 = new JLabel("Last Scorer: " + LastScorer, JLabel.CENTER);
    static Label label3 = new Label("Winner: " + winner, JLabel.CENTER);

    public static void main(String args[]) {
        JFrame frame = new JFrame("My Second second GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//создали панель
        JPanel panel = new JPanel();
//задали свойство панели – цвет фона
        panel.setBackground(Color.GRAY);
// задали свойство панели размеры
        panel.setPreferredSize(new Dimension(150, 150));


        JButton button1 = new JButton("AC Milan");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countM++;
                LastScorer = "AC Milan";
                update();
            }
        });
        JButton button2 = new JButton("Real Madrid");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                countR++;
                LastScorer = "Real Madrid";
                update();
            }
        });
        panel.add(label);
        panel.add(label2);
        panel.add(label3);
        panel.add(button1);
        panel.add(button2);
//добавили панель к фрейму
        frame.getContentPane().add(panel);
//упакуем во фрейм
        frame.pack();
        frame.setVisible(true);
    }
    public static void update(){
        label.setText("Result: " + countR + "X" + countM);
        label2.setText("Last Scorer: " + LastScorer);
        if (countR > countM)
            winner = "Real Madrid";
        else if (countM > countR)
            winner = "AC Milan";
        else winner = "DRAW";
        label3.setText("Winner: " + winner);
    }
}
import javax.swing.*;
import java.awt.*;

public class CalculatorUI extends JFrame {
    private JTextArea input = new JTextArea();
    private JTextArea history = new JTextArea(100,15);

    public void setText(String in) {
        input.setText(in);
    }

    public String getText() {
        return input.getText();
    }

    public CalculatorUI(JButton[] numberButtons, JButton equalsButton, JButton addButton, JButton subButton, JButton divButton, JButton mulButton, JButton pointButton, JButton backSpaceButton, JButton clearButton) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);

        Font font = input.getFont();
        float size = 30.0f;
        input.setFont( font.deriveFont(size));
        input.setLineWrap(true);
        input.setWrapStyleWord(false);
        input.setEditable(false);

        font = history.getFont();
        size = 15.0f;
        history.setFont( font.deriveFont(size));
        history.setLineWrap(true);
        history.setWrapStyleWord(false);
        history.setEditable(false);

        GridLayout main = new GridLayout(1, 2);
        JPanel mainPanel = new JPanel(main);

        GridLayout UI = new GridLayout(2, 1);
        JPanel UIPanel = new JPanel(UI);

        GridLayout buttons = new GridLayout(6, 3);
        JPanel buttonsPanel = new JPanel(buttons);
        buttonsPanel.add(clearButton);
        buttonsPanel.add(backSpaceButton);
        buttonsPanel.add(mulButton);
        buttonsPanel.add(divButton);
        buttonsPanel.add(subButton);
        buttonsPanel.add(addButton);
        for (int i = numberButtons.length - 1; i >= 0; i--) {
            buttonsPanel.add(numberButtons[i]);
        }
        buttonsPanel.add(pointButton);
        buttonsPanel.add(equalsButton);

        UIPanel.add(new JScrollPane(input));
        UIPanel.add(buttonsPanel);

        JPanel historyPanel = new JPanel();
        historyPanel.add(new JScrollPane(history));

        mainPanel.add(UIPanel);
        mainPanel.add(historyPanel);

        this.add(mainPanel);
        this.setVisible(true);
    }

    public void updateUI(String expression, double result) {
        input.setText(String.valueOf(result));
        history.setText(history.getText() + "\n" + expression + "\n");
    }
}

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class CalculatorController {
    private final CalculatorUI calculatorUI;
    private final Expression expression;

    public CalculatorController(Expression expression) {

        JButton[] numberButtons = new JButton[10];
        JButton equalsButton = new JButton("=");
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton divButton = new JButton("/");
        JButton mulButton = new JButton("*");
        JButton pointButton = new JButton("|");
        JButton backSpaceButton = new JButton("<--");
        JButton clearButton = new JButton("C");

        for (int i = 0; i < 10; i++)
            numberButtons[i] = new JButton(String.valueOf(i));

        calculatorUI = new CalculatorUI(numberButtons, equalsButton, addButton, subButton, divButton, mulButton, pointButton, backSpaceButton, clearButton);
        this.expression = expression;

        for (int i = 0; i < 10; i++) {
            int finalI = i;
            numberButtons[i].addActionListener(e -> {
                calculatorUI.setText(calculatorUI.getText() + finalI);
            });
        }

        equalsButton.addActionListener(e -> {
            String in = calculatorUI.getText();
            if (!Objects.equals(in, "")) {
                try {
                    expression.calculation(in);
                } catch (NotSolvingException ex) {
                    JOptionPane.showMessageDialog(calculatorUI,
                            ex.getMessage());
                    expression.clearResult();
                }
                calculatorUI.updateUI(expression.getExpression(), expression.getResult());
            }
        });


        addButton.addActionListener(e -> {
            calculatorUI.setText(calculatorUI.getText() + "+");
        });

        subButton.addActionListener(e -> {
            calculatorUI.setText(calculatorUI.getText() + "-");
        });

        mulButton.addActionListener(e -> {
            calculatorUI.setText(calculatorUI.getText() + "*");
        });

        divButton.addActionListener(e -> {
            calculatorUI.setText(calculatorUI.getText() + "/");
        });

        pointButton.addActionListener(e -> {
            calculatorUI.setText(calculatorUI.getText() + "|");
        });

        backSpaceButton.addActionListener(e -> {
            StringBuilder in = new StringBuilder(calculatorUI.getText());
            in.deleteCharAt(in.length()-1);
            calculatorUI.setText(String.valueOf(in));
        });

        clearButton.addActionListener(e -> {
            calculatorUI.setText("");
        });
    }
}

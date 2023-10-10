import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class LabExample extends JFrame {
    JTextField jta1 = new JTextField(10);
    JTextField jta2 = new JTextField(10);
    JButton button_addition = new JButton("+");
    JButton button_substraction = new JButton("-");
    JButton button_division = new JButton("/");
    JButton button_multyplication = new JButton("*");
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    //начало конструктора класса LabExample
    LabExample() {
        super("Example");
        setLayout(new FlowLayout());
        setSize(200, 150);
// создаем надпись 1
        add(new JLabel("1st Number"));
// добавляем текстовое поле jta1
        add(jta1);
// создаем надпись 2
        add(new JLabel("2nd Number"));
// добавляем текстовое поле jta2
        add(jta2);
// добавляем кнопку
        add(button_addition);
        // добавляем реализацию actionPerformed
        button_addition.addActionListener(e -> {
            try {
//переменная для хранения ввода в текстовое поле 1
                double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                JOptionPane.showMessageDialog(null, "Result = " + (x1 + x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
//создаем всплывающее окно ERROR_MESSAGE
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });// конец button.addActionListener()

        add(button_substraction);
        // добавляем реализацию actionPerformed
        button_substraction.addActionListener(e -> {
            try {
//переменная для хранения ввода в текстовое поле 1
                double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                JOptionPane.showMessageDialog(null, "Result = " + (x1 - x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
//создаем всплывающее окно ERROR_MESSAGE
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });// конец button.addActionListener()
        add(button_division);
        // добавляем реализацию actionPerformed
        button_division.addActionListener(e -> {
            try {
//переменная для хранения ввода в текстовое поле 1
                double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                double x2 = Double.parseDouble(jta2.getText().trim());

//создаем всплывающее окно INFORMATION_MESSAGE
                JOptionPane.showMessageDialog(null, "Result = " + (x1 / x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
//создаем всплывающее окно ERROR_MESSAGE
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });// конец button.addActionListener()
        add(button_multyplication);
        // добавляем реализацию actionPerformed
        button_multyplication.addActionListener(e -> {
            try {
//переменная для хранения ввода в текстовое поле 1
                double x1 = Double.parseDouble(jta1.getText().trim());
//переменная для хранения ввода в текстовое поле 2
                double x2 = Double.parseDouble(jta2.getText().trim());
//создаем всплывающее окно INFORMATION_MESSAGE
                JOptionPane.showMessageDialog(null, "Result = " + (x1 * x2), "Alert", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception error) {
//создаем всплывающее окно ERROR_MESSAGE
                JOptionPane.showMessageDialog(null, "Error in Numbers !", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });// конец button.addActionListener()
        setVisible(true);
    } // конец конструктора
}

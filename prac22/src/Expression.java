import java.util.Objects;
import java.util.Stack;

public class Expression {
    public void clearResult() {
        result = 0;
    }

    private double result;
    private String exp;

    public double getResult() {
        return result;
    }

    public String getExpression() {
        return exp;
    }

    public void calculation(String exp) throws NotSolvingException {
        this.exp = exp;
        result = 0;
        Stack<Double> expression = new Stack<>();
        String number = "";
        for (int i = 0; i < exp.length(); i++) {
            char symbol = exp.charAt(i);
            if (symbol != '|' && symbol != '*' && symbol != '/' && symbol != '+' && symbol != '-')
                number += symbol;
            else {
                try {
                    Double num = Double.parseDouble(number);
                    expression.push(num);
                    number = "";

                    if (symbol != '|') {
                        if (expression.size() >= 2) {
                            double a = expression.pop();
                            double b = expression.pop();
                            switch (symbol) {
                                case '+' -> result = a + b;
                                case '-' -> result = a - b;
                                case '*' -> result = a * b;
                                case '/' -> result = a / b;
                            }
                            expression.push(result);
                        } else throw new NotSolvingException();
                    }
                } catch (Exception e) {
                    throw new NotSolvingException();
                }
            }
        }
        result = expression.pop();
    }
}

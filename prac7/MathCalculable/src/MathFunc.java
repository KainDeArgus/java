import static java.lang.Math.sqrt;

public class MathFunc implements MathCalculable{

    @Override
    public double Pow(double num, int n) {
        for (int i = 1; i < n; i++){
            num *= num;
        }
        return num;
    }

    @Override
    public double abs(double re, double im) {
        return sqrt(re * re + im * im);
    }
    double calcLen(double rad){
        return 2 * PI * rad;
    }
}
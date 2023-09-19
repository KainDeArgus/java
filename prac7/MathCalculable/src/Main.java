public class Main {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();
        double re, im;
        re = 5;
        im = 2;
        System.out.println(mathFunc.abs(re, im));
        System.out.println(mathFunc.Pow(re, 2));
        System.out.println(mathFunc.calcLen(5));
    }
}
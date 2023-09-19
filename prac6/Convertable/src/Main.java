public class Main {
    public static void main(String[] args) {
        Temperature temperature = new Temperature();
        double temp = 100;
        System.out.println("C :" + temp);
        System.out.println("K :" + temperature.convertToK(temp));
        System.out.println("F :" + temperature.convertToF(temp));
    }
}
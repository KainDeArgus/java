public class Temperature implements Convertable{
    @Override
    public double convertToF(double temp) {
        return temp * 9 / 5 + 32;
    }

    @Override
    public double convertToK(double temp) {
        return temp - 273;
    }
}

public class Number {
    public Number(StringBuilder number) {
        if (number.charAt(0) == '8') {
            this.number = new StringBuilder("+7" + number.substring(1, 4));
            this.number.append("-").append(number.substring(4, 7)).append("-").append(number.substring(7));
        } else {
            this.number = new StringBuilder("+" + number.substring(1, 5) + "-" + number.substring(5, 8) + "-" + number.substring(8));
        }
    }

    public StringBuilder getNumber() {
        return number;
    }

    private final StringBuilder number;

}

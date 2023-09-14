public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        String string = "";
        if (filled)
            string += "Filled ";

        else
            string += "Not filled ";
        string += "square " + "side: " + getSide() + " perimeter: " + getPerimeter() + " area: " + getArea() + " color: " + getColor();
        return string;
    }
}
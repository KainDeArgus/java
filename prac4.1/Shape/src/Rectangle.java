public class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
    }

    Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return width * length;
    }

    @Override
    public double getArea() {
        return 2 * width + 2 * length;
    }

    @Override
    public String toString() {
        String string = "";
        if (filled)
            string += "Filled ";

        else
            string += "Not filled ";
        string += "rectangle " + "width: " + getWidth() + " length: " + getLength() + " perimeter: " + getPerimeter() + " area: " + getArea() + " color: " + getColor();
        return string;
    }
}
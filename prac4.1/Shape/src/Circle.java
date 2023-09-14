public class Circle extends Shape {
    protected double radius;

    public Circle(int radius) {
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        String string = "";
        if (filled)
            string += "Filled ";

        else
            string += "Not filled ";
        string += "circle " + "radius: " + getRadius() + " perimeter: " + getPerimeter() + " area: " + getArea() + " color: " + getColor();
        return string;
    }
}
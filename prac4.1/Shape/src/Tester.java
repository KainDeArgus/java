public class Tester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5, "red", true);
        Circle circle = new Circle(15, "orange", false);
        Square square = new Square(23, "blue", false);
        Shape[] shape = {rectangle, circle, square};
        for(Shape sh : shape)
            System.out.println(sh);
        System.out.println(((Shape) rectangle).getArea());
    }
}
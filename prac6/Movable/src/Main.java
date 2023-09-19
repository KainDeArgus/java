public class Main {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(1, 2, 3, 4);
        MovableCircle movableCircle = new MovableCircle(0, 0, 1, 1, 10);
        System.out.println(movableCircle);
        System.out.println(movablePoint);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        movablePoint.moveUp();
        movablePoint.moveRight();
        System.out.println(movableCircle);
        System.out.println(movablePoint);
        MovableRectangle movableRectangle = new MovableRectangle(0, 5, 5, 0, 10, 10);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        movableRectangle.moveRight();
        System.out.println(movableRectangle);
    }
}
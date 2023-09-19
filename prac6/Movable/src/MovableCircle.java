public class MovableCircle implements Movable{
    private final int radius;
    private final MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" + "center: " +
                "x=" + center.x +
                ", y=" +  center.y +
                ", xSpeed=" +  center.xSpeed +
                ", ySpeed=" +  center.ySpeed +
                ";   radius: " + radius +
                '}';
    }

    @Override
    public void moveUp() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;
    }
}
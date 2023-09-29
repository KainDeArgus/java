import java.awt.*;

public class Circle extends Shape {
    int rad;
    public Circle(int x, int y, int r, Color color){
        this.posy = y;
        this.posx = x;
        this.color = color;
        this.rad = r;
    }
    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillOval(posx, posy, rad*2, rad*2);
    }
}
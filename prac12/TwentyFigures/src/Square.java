import java.awt.*;

public class Square extends Shape {
    int side;
    public Square(int x, int y, int a, Color color){
        this.posy = y;
        this.posx = x;
        this.color = color;
        this.side = a;
    }
    public void draw(Graphics2D g){
        g.setColor(color);
        g.fillRect(posx, posy, side, side);
    }
}
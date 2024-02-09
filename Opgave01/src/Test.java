import model.Circle;
import model.Ellipse;
import model.Square;
import model.Rectangle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(20, 20, 4);
        Ellipse ellipse = new Ellipse(60, 60, 7, 14);
        Rectangle rectangle = new Rectangle(100, 100, 20, 20);
        Square square = new Square(200, 200, 35);
    }

}
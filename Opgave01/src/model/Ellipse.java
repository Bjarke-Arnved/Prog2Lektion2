package model;

public class Ellipse extends Shape {
    private int radius01;
    private int radius02;
    public Ellipse(int x, int y, int radius01, int radius02) {
        super(x, y);
        this.radius01 = radius01;
        this.radius02 = radius02;
    }
    public int getArea() {
        double r;
        int radius;
        r = Math.PI * radius01 * radius02;
        radius = (int)r;
        return radius;
    }
}

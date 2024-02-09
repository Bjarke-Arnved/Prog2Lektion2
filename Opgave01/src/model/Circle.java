package model;

public final class Circle extends Shape implements IResizable {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public int getArea() {
        double area;
        int a;
        area = radius * radius * Math.PI;
        a = (int)Math.round(area);
        return a;
    }
    public void doubleUp() {
        radius *= 2;
    }
    public void halve() {
        radius /= 2;
    }
}
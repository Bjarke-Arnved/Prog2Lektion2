package model;

public final class Circle extends Shape {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    public int getArea() {
        double area = 0;
        int a = 0;
        area = radius * radius * Math.PI;
        a = (int)Math.round(area);
        return a;
    }
}
package model;

public class Rectangle extends Shape {
    private int sideA;
    private int sideB;
    public Rectangle(int x, int y, int sideA, int sideB) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }
    public int getArea() {
        int area;
        area = sideA * sideB;
        return area;
    }
}
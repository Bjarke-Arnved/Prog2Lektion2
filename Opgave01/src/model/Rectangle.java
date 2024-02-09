package model;

public class Rectangle extends Shape implements IResizable {
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
    public void doubleUp() {
        sideA *= 2;
        sideB *= 2;
    }
    public void halve() {
        sideA /= 2;
        sideB /= 2;
    }

}
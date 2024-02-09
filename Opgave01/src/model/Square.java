package model;

public final class Square extends Shape implements IResizable {
    private int sideLength;
    public Square(int x, int y, int sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }
    public int getArea() {
        int area;
        area = sideLength * sideLength;
        return area;
    }
    public void doubleUp() {
        sideLength *= 2;
    }
    public void halve() {
        sideLength /= 2;
    }
}
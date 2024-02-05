public class Square extends Shape {
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
}
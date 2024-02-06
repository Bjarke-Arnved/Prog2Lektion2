package storage;


import model.Circle;
import model.Ellipse;
import model.Rectangle;
import model.Square;

import java.util.ArrayList;

public class Storage {
    private static ArrayList<Circle> circles = new ArrayList<Circle>();
    private static ArrayList<Ellipse> ellipses = new ArrayList<Ellipse>();
    private static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
    private static ArrayList<Square> squares = new ArrayList<Square>();



    public static ArrayList<Circle> getCircles() {
        return new ArrayList<Circle>(circles);
    }
    public static ArrayList<Ellipse> getEllipses() {
        return new ArrayList<Ellipse>(ellipses);
    }
    public static ArrayList<Rectangle> getRectangle() {
        return new ArrayList<Rectangle>(rectangles);
    }
    public static ArrayList<Square> getSquares() {
        return new ArrayList<Square>(squares);
    }
    public static void addCircle(Circle circle) {
        circles.add(circle);
    }
    public static void removeCircle(Circle circle) {
        circles.remove(circle);
    }
    public static void addEllipse(Ellipse ellipse) {
        ellipses.add(ellipse);
    }
    public static void removeEllipse(Ellipse ellipse) {
        ellipses.remove(ellipse);
    }
    public static void addRectangle(Rectangle rectangle) {
        rectangles.add(rectangle);
    }
    public static void removeRectangle(Rectangle rectangle) {
        rectangles.remove(rectangle);
    }
    public static void addSquare(Square square) {
        squares.add(square);
    }
    public static void removeSquare(Square square) {
        squares.remove(square);
    }


}
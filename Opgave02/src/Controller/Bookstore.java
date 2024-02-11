package Controller;

import Model.*;

public class Bookstore {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addItem(new Book(600, "Introduction to Java Programming and Data Structures"));
        basket.addItem(new Book(350, "Head First Design Patterns"));
        basket.addDiscount(new ProcentDiscount(10, "10% rabat på alt"));
        basket.addDiscount(new FixedDiscount(25, 500, "25 kr rabat på beløb over 500 kr."));
        basket.addDiscount(new FixedDiscount(50, 1000, "50 kr rabat på beløb over 1000 kr."));
        basket.printTotal();

    }
}

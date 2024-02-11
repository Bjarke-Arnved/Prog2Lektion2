package Model;

public class ProcentDiscount extends Discount {
    private final int procent;
    public ProcentDiscount(int procent, String description) {
        super(description);
        this.procent = procent;
    }
    public double applyDiscount(Basket basket) {
        double discount;
        discount = basket.getTotal() * procent / 100;
        return discount;
    }
}
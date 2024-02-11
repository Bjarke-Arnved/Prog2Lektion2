package Model;
public class FixedDiscount extends Discount {

    private final int discount;
    private final int minimumAmount;

    public FixedDiscount(int discount, int minimumAmount, String description) {
        super(description);
        this.discount = discount;
        this.minimumAmount = minimumAmount;
    }
    public double applyDiscount(Basket basket) {
        double dis = 0;
        if(basket.getTotal() > minimumAmount) {
            dis = discount;
        }
        return dis;
    }
}
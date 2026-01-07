package WEEK10WORKSHOP;


/**
 * Write a description of class PremiumOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrder extends Order {

    PremiumOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + 20;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount() - discountAmount;
    }
}
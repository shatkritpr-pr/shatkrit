package WEEK10WORKSHOP;


/**
 * Write a description of class NormalOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrder extends Order {

    NormalOrder(int orderId, String customerName, double amount) {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() {
        return super.calculateFinalAmount() + 50;
    }

    public double calculateFinalAmount(double discountAmount) {
        return calculateFinalAmount() - discountAmount;
    }
}
package WEEK10WORKSHOP;


/**
 * Write a description of class BikeDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDelivery extends DeliveryPerson {
    private double fuelAllowance;

    BikeDelivery(int id, String name, double basePayment, double fuelAllowance) {
        super(id, name, basePayment);
        this.fuelAllowance = fuelAllowance;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + fuelAllowance;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 100);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + " Vehicle: Bike" +"\n"+ "Payment: " + calculatePayment();
    }
}
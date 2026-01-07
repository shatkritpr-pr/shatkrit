package WEEK10WORKSHOP;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends DeliveryPerson {
    private double maintenanceAllowance;

    CarDelivery(int id, String name, double basePayment, double maintenanceAllowance) {
        super(id, name, basePayment);
        this.maintenanceAllowance = maintenanceAllowance;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + maintenanceAllowance;
    }

    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 200);
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+" Vehicle: Car"+"\n" +"Payment: " + calculatePayment();
    }
}
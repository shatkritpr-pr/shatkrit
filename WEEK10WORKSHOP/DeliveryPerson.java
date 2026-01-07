package WEEK10WORKSHOP;


/**
 * Write a description of class DeliveryPerson here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPerson
{
     private int id;
    private String name;
    private double basePayment;

    DeliveryPerson(int id, String name, double basePayment) {
        this.id = id;
        this.name = name;
        this.basePayment = basePayment;
    }

    public double calculatePayment() {
        return basePayment;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +" Name: " + name;
    }
}
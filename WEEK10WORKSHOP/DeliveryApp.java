package WEEK10WORKSHOP;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp {
    public static void main(String[] args) {
        BikeDelivery bike = new BikeDelivery(1, "Alex", 8000, 1500);
        CarDelivery car = new CarDelivery(2, "Brian", 10000, 3000);

        System.out.println(bike);
        System.out.println("Bike Payment with Extra Orders: " + bike.calculatePayment(5));

        System.out.println(car);
        System.out.println("Car Payment with Extra Orders: " + car.calculatePayment(3));
    }
}
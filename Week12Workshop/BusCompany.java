package Week12Workshop;


/**
 * Write a description of class BusCompany here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BusCompany
{
    String numberPlate;
    String color;
    String route;
    String customerName;
    boolean availableStatus;
    int rate;
    
    public BusCompany(String numberPlate, String color, String route, String customerName, boolean availableStatus, int rate)
    {
        this.numberPlate= numberPlate;
        this.color= color;
        this.route= route;
        this.customerName= customerName;
        this.availableStatus= availableStatus;
        this.rate= rate;
    }
    
    public void display()
    {
        System.out.println("Number Plate: "+ numberPlate);
        System.out.println("Color: "+ color);
        System.out.println("Route: "+ route);
        System.out.println("Customer Name: "+ customerName);
        System.out.println("Available Status: "+ availableStatus);
        System.out.println("Rate: "+ rate);

}
}
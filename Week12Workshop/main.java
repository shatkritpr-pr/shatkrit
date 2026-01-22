package Week12Workshop;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
     public static void main(String[] args)
    {
        Bus company= new Bus();
        
        BusCompany b1= new BusCompany("Pa11", "Red", "KTM-PKR", "Shatkrit ", true, 1000);
        BusCompany b2= new BusCompany("pa12", "Green", "KTM-BKR", "Ram", true, 100);
        BusCompany b3= new BusCompany("pa13", "Blue", "BKR-LTR", "Shyam", false, 400);
        
        company.addBusCompany(b1);
        company.addBusCompany(b2);
        company.addBusCompany(b3);
        
        System.out.println("All buses:");
        company.displayAllBuses();
        
        System.out.println("Rate: ");
        company.displayBusRate();
        
        System.out.println("Color:");
        company.displayColor();
        
        company.removeBusCompany(1);
    }
}
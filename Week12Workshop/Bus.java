package Week12Workshop;
import java.util.ArrayList;


/**
 * Write a description of class Bus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bus
{
     ArrayList<BusCompany> Bus= new ArrayList<>();
    
    public void addBusCompany(BusCompany bus)
    {
        Bus.add(bus);
    }
    
    public void removeBusCompany(int index)
    {
        if(index >= 0 || index < Bus.size())
        {
            Bus.remove(index);
            System.out.println("Bus removed");
        }
        else
        {
            System.out.println("ERROR!!!");
        }
    }
    
    public void displayAllBuses()
    {
        for(BusCompany bus: Bus)
        {
            bus.display();
        }
    }
    
    public void displayBusRate()
    {
        for(BusCompany bus: Bus)
        {
            if(bus.rate > 500)
            {
                bus.display();
            }
        }
    }
    
    public void displayColor()
    {
        for(BusCompany bus: Bus)
        {
            if(bus.color.equalsIgnoreCase("red") || bus.color.equalsIgnoreCase("blue"))
            {
                bus.display();
            }
        }
    }
    
}
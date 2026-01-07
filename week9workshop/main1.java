package week9workshop;


/**
 * Write a description of class main1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main1
{
    public static void main()
    {
    car c1= new car(101,"Mercedes",1000000,2,"petrol");
    bike b1= new bike(102,"Royal enfield",800000,1000);
    
    
    System.out.println("for car");
    c1.displayvehicleInfo();
    System.out.println("Tax= "+c1.calculateTax());
    System.out.println("Final Price = "+c1.calculateFinalPrice());
    
    
    System.out.println("for bike");
    b1.displayvehicleInfo();
    System.out.println("Tax= "+b1.calculateTax());
    System.out.println("Final Price = "+b1.calculateFinalPrice());
    
    
    }
}
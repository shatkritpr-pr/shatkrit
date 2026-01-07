package week9workshop;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleid;
    protected String brand;
    protected double BasePrice;
    public vehicle (int vehicleid,String brandname,double price){
    this.vehicleid=vehicleid;
    this.brand=brandname;
    this.BasePrice=price;
    }
    public void displayvehicleInfo()
    {
        System.out.println("ID=  " +this.vehicleid);
        System.out.println("Brand=  " +this.brand);
        System.out.println("base price=  " +this.BasePrice);
    
    }
    
    public double calculateTax()
    {
    return this.BasePrice*0.1;
    }
}
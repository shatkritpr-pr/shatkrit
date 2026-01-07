package week9workshop;


/**
 * Write a description of class car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class car extends vehicle
{
    private int numberofdoors;
    private String Fueltype;
    
    public car(int ID,String brandname,double price, int doors,String type)
    {
        super(ID,brandname,price);
        this.numberofdoors=doors;
        this.Fueltype=type;
    
    }
    public void cardetails(){
    super.displayvehicleInfo();
    }
    public double calculateFinalPrice(){
    return super.calculateTax()+super.BasePrice+super.BasePrice*0.05;
    }
}
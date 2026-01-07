package week9workshop;


/**
 * Write a description of class bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bike extends vehicle
{
    private int engineCapacity;
    public bike(int ID,String brandname,double price,int cc)
    {
    super(ID,brandname,price);
    this.engineCapacity=cc;
    }
    public double calculateFinalPrice()
    {
    return super.calculateTax()+super.BasePrice;
    
    }
}
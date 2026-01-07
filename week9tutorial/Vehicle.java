package week9tutorial;

public class Vehicle
{
    protected String brandName;
    protected int maxSpeed;
    
    public Vehicle(String brandName,int maxSpeed)
    {
        this.brandName= brandName;
        this.maxSpeed= maxSpeed;
        
    System.out.println("this is our default vehicle constructor");
    }
}
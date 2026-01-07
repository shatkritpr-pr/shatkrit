package week9tutorial;

public class Car extends Vehicle
{
    private int door;
    public Car(String brandName, int maxSpeed,int Doors){
        super(brandName,maxSpeed);//super= parent class
        this.door=door;
     System.out.println("this is our default Car constructor");
    }
     
    public void displayCarDetails()
    {
    System.out.println("Brand name of the car is  "+ super.brandName);
    System.out.println("the speed of the car is  "+ super.maxSpeed);
    System.out.println("Number of doors in this Car:  "+ this.door);
    }
}
package Weeksevenworkshop;

public class Laptops
{
    String brand;
    int ram;
    double price;
    Laptops(String brand,int ram,double price){
    this.brand=brand;
    this.ram=ram;
    this.price=price;
    }
    void display(){
    System.out.println("Brand="+this.brand+"RAM="+this.ram+"Price="+this.price);
    }
}
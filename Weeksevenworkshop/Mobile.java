package Weeksevenworkshop;
public class Mobile
{
    String brand;
    double price;
    Mobile(String brand, double price){
    this.brand=brand;
    this.price=price;
    }
    void show(){
    System.out.println("Brand="+this.brand+"Price="+this.price);
    }
    
    void isAffordable(){
    if(price<20000){
    System.out.println(this.brand+"is affordable");
    }else{System.out.println(this.brand+"  is not affordable");
    }
    }
}
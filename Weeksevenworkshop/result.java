package Weeksevenworkshop;


/**
 * Write a description of class result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class result
{
    double Math,Phys,Comp;
    result(double m1,double p2,double c3){
    this.Math=m1;
    this.Phys=p2;
    this.Comp=c3;
    }
    void solve(){
    System.out.println("total marks="+(double)(this.Math+this.Phys+this.Comp)+"Total Percentage="+(this.Math+this.Phys+this.Comp)/3+"%");
    }
    void display(){
    System.out.println("Math="+this.Math+"Physics="+this.Phys+"Comp="+this.Comp);
    }
    }
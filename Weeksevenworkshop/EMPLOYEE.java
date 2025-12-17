package Weeksevenworkshop;

public class EMPLOYEE
{
    int ID;
    String name;
    double salary;
    EMPLOYEE(int ID,String name,double salary){
    this.ID=ID;
    this.name=name;
    this.salary=salary;
    }
    void high(){
    System.out.println("ID=" +this.ID+"Name="+this.name+"Salary="+this.salary);
    }
    
}
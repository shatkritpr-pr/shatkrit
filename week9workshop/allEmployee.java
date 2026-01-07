package week9workshop;


/**
 * Write a description of class allEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class allEmployee
{
    protected int employeeId;
    protected String name;
    protected double basicSalary;
    public allEmployee(int id,String name,double Salary){
    this.employeeId=id;
    this.name=name;
    this.basicSalary=Salary;
    }
    public double calculateBonus(){
    return 0.1*(this.basicSalary);
    }
    public void displayallEmployee(){
    System.out.println("ID= "+this.employeeId);
    System.out.println("name=  "+this.name);
    System.out.println("Salary=  "+this.basicSalary);
    }
}
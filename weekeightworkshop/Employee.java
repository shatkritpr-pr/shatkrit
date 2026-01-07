package weekeightworkshop;
public class Employee
{
    private double basicSalary;
    
    Employee(double salary){
    this.basicSalary=salary;
    }
    
    public double getsalary()
    {
    return this.basicSalary;
    }
    
    public double calculateGrossSalary()
    {
    double gross = this.basicSalary + this.basicSalary * 0.20 ;
    return gross;
    }
    
    
}
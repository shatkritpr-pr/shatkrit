package week9workshop;


public class Permanentemployee extends allEmployee
{
    private double HouseRentAllowance;
    private double DearnessAllowance;
    
    public Permanentemployee(int id,String name,double salary,double HRA,double DA){
    super(id,name,salary);
    this.HouseRentAllowance=HRA;
    this.DearnessAllowance=DA;
    }
    public double calculateTotalSalary(){
    return super.basicSalary+this.HouseRentAllowance+this.DearnessAllowance+super.calculateBonus();
    }
    
}
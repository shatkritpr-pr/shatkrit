package week9workshop;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main(){
    //ind id,string name,double salary,double HA,double DA
    Permanentemployee pe= new Permanentemployee(1,"ram",15000,5000,3000);
    Contractemployee ce= new Contractemployee(2,"hari",15000,6);
    
    System.out.println("for PermanentEmployee");
    pe.displayallEmployee();
    System.out.println("total Salary=  "+pe.calculateTotalSalary());
    
    System.out.println("for contract employee");
    ce.displayallEmployee();
    System.out.println("total Salary= "+ce.calculateTotalSalary());
    
    
    
    }
}
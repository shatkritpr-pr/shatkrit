package weekeightworkshop;

public class question2main
{
    
    public static void main(String [] args)
    {
        Employee e1= new Employee(10000.99);
         System.out.println(" Basic Salary: " +e1.getsalary());
          System.out.println(" Gross Salary: " +e1.calculateGrossSalary());
         
    }
}
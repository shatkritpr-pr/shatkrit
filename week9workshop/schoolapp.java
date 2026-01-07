package week9workshop;
import java.util.Stack;


/**
 * Write a description of class schoolapp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class schoolapp
{
    public static void main(String[] args) {
        T
        Teacher t1 = new Teacher(1, "Harry", 5000, "Java", 2000);
        Staff s1 = new Staff(101, "Bob", 3000, 160, 25);
        
        
        System.out.println("College: " + Person.collegename); 
        System.out.println("Teacher Details ");
        System.out.println("Name: "+t1.name);
        System.out.println("Annual Salary: $" +t1.salaryannual());
        System.out.println("Staff Details");
        System.out.println("Name: " +s1.name);
        System.out.println("Monthly Salary: $"+s1.salary());
    }
}
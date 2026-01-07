package week9workshop;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
     protected int id;
    protected String name;
    protected double basicsalary;
    public static String collegename="ING";
    
    public Person(int id,String name,double basicsalary){
        this.id=id;
        this.name=name;
        this.basicsalary=basicsalary;
    }
    public double salaryannual(){
        return basicsalary*12;
    }
}
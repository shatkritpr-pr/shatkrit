package week9workshop;


/**
 * Write a description of class Contractemployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Contractemployee extends allEmployee
{
    private int workingDays;
    public Contractemployee(int id,String name, double salary,int WD){
    super(id,name,salary);
    this.workingDays=WD;
    }
    public double calculateTotalSalary(){
    return super.basicSalary*this.workingDays;
    }
}
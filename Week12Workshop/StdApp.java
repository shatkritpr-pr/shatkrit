package Week12Workshop;
import java.util.ArrayList;


/**
 * Write a description of class StdApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StdApp
{
     public static void main(String[] args)
    {
        ArrayList<Std> students= new ArrayList<>();
        students.add(new Std(101, "Dikshant", 90));
        students.add(new Std(102, "Ramit", 9));
        students.add(new Std(103, "Bilip", 10));
        
        System.out.println(students.get(1));
        
        for(Std student: students)
        {
            System.out.println(student);
        }
    }
    
}
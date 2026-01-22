package Week12Tutorial;
import java.util.ArrayList;

public class StudentApp
{
    public static void main (String[] args)
    {
    ArrayList<Student> students= new ArrayList<>();
    students.add(new Student(101,"Shatkrit",75));
        students.add(new Student(102,"Ram",80));
            students.add(new Student(103,"Shyam",60));
            
            System.out.println(students.get(0));
            
            
            for(Student std: students)
            {
            System.out.println(std);
            }
    }
}
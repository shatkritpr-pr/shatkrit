package Week12Workshop;


/**
 * Write a description of class Students here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Students
{
    public static void main(String[] args)
    {
        ArrayList<Student> Studentss= new ArrayList<>();
        
        Studentss.add(new Student("Ayush", 9876543210l, "L1N1"));
        Studentss.add(new Student("Rahul", 9876543211l, "L1M1"));
        Studentss.add(new Student("Gaurav", 9876543212l, "L1N2"));
        
        for(Student Stud: Studentss)
        {
            System.out.println(Stud);
        }
        
        for(int i=0; i<Studentss.size(); i++)
        {
            if(Studentss.get(i).getName().equals("Gaurav"))
            {
                Studentss.remove(i);
                break;
            }
        }
        
        for(int i=0; i<Studentss.size(); i++)
        {
            if(Studentss.get(i).getName().equals("Ayush"))
            {
                Studentss.add(i, new Student("Aavaya", 9876543213l, "L1C1"));
                break;
            }
        }
        
        for(int i=0;i<Studentss.size();i++)
        {
            if(Studentss.get(i).getName().equals("Ayush"))
            {
                Studentss.get(i).setName("Aaysh");
            }
        } 
        
         for(Student Stud:Studentss)
        {
            System.out.println(Stud);
        }
    }
    
}
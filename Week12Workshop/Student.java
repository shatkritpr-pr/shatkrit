package Week12Workshop;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{

  private String name;
    private long phone;
    private String group;
    
    public Student(String name, long phone, String grp)
    {
        this.name= name;
        this.phone= phone;
        this.group= grp;
    }
    
    public String getName()
    {
       return name;
    }
    
    public void setName(String name)
    {
        this.name= name;
    }
    
    public long getPhone()
    {
        return phone;
    }
    
    public void setPhone(long phone)
    {
        this.phone= phone;
    } 
    
    public String getGroup()
    {
        return group;
    }
    
    public void setGroup(String grp)
    {
        this.group= grp;
    }
    
    @Override
    public String toString()
    {
        return "Student details--> Name: "+ this.name + ", Phone Number: "+ this.phone + ", Group: "+ this.group;
    }
}
package Week07;


/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{ 
    public static void main(String[] args){
    
    house h1= new house();//objects
    h1.color ="red";
    h1.doors = 4;
    h1.floors = 5;
    h1.openDoor();
    
    System.out.println(h1.color);
    System.out.println(h1.doors);
    System.out.println(h1.floors);
    
    
    house h2= new house();
    h2.color="blue";
    h2.doors=2;
    h2.floors=4;
    
     
    
    Student S1= new Student();//objects
    S1.StudentID =1;
    S1.age=18;
    S1.Course ="Computing";
    S1.Learning();

    
    System.out.println(S1.StudentID);
    System.out.println(S1.age);
    System.out.println(S1.Course);
    
    
    Student S2= new Student();
    S2.StudentID =2;
    S2.age=19;
    S2.Course ="Computing";
    
}
}
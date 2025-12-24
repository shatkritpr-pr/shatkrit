package weekeighttutorial;

public class Student
{
   String name;
   int id;
   //<access modifier><classname>(){}
   /*
   public Student()
   {
    System.out.println("this is our default constructor.");
    }
*/
    public Student(String name){
    this.name= name;
    }
    public Student(int id){
    this.id=id ;
    }
    
    public Student(String nme,int id){//constructor overloading
    this.name=nme;
    this.id= id;
    }
}
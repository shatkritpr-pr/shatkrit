package weekeightworkshop;

public class Student
{
   
   private String name;
    private int id;
     //getters and setters method
     //set
     //constructors
     public Student(String name, int id)
     {
        this.name= name;
        this.id= id;
        }
     public void setName(String name){
        this.name=name;
        }
        
        //get
        public String setName(){
        return this.name;
        }
        
       //getters and setters method for ID
    
       public void setid(int id){
        this.id= id;
        }
        
        public int getid(){
        return this.id;
        }
        
        public void displayInfo(){
        System.out.println("Name of the student is " + this.name);
        System.out.println("ID of the student is " + this.id);
        }
    
}
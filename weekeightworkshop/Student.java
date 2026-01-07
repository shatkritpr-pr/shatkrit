package weekeightworkshop;

public class Student
{
   
   private String name;
    private int id;
    private String address;
    private long number;
    private static String collegeName;
    
    
    
     //getters and setters method
     //set
     //constructors
     public Student(String name, int id, String address,long phone,String clg)
     {
        this.name= name;
        this.id= id;
        this.address=address;
        this.number=phone;
        this.collegeName=clg;
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
        
        public void setaddress(String address){
        this.address=address;
        }
        
         public String getaddress(){
        return this.address;
        }
        
        
        
        public void displayInfo(){
        System.out.println("Name of the student is " + this.name);
        System.out.println("ID of the student is " + this.id);
        System.out.println("Address of the student is " + this.address);
        System.out.println("phone number of the student is " + this.number);
        System.out.println("College name of the student is " + this.collegeName);
        

        
        
        }
    
}
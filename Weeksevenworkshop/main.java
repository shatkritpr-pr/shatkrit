package Weeksevenworkshop;

public class main
{
    //question number 1
    public static void main (String args[]){
    book book1=new book();
    book book2=new book();
    book1.title="Something";
    book1.author="Ram";
    book1.price=1000;
     book2.title="Hangover";
    book2.author="Shyam bahadur";
    book2.price=2000;
    book1.res();
    book2.res();
    
    //question number 2
    System.out.println("\n QUESTION 2");
    Rectangle rec1= new Rectangle(12,8);
     Rectangle rec2= new Rectangle(8,4);
     System.out.println("Area of rec1="+rec1.area);
     System.out.println("Area of rec2="+rec2.area);
     
     //question number 3
     System.out.println("\n QUESTION 3");
     EMPLOYEE emp1= new EMPLOYEE(1,"Tom",15000);
     EMPLOYEE emp2= new EMPLOYEE(2,"Jerry",25000);
     EMPLOYEE emp3= new EMPLOYEE(3,"Jack",35000);
     
    emp1.high();
   emp2.high();
   emp3.high();
    if(emp1.salary>emp2.salary && emp1.salary>emp3.salary){
     System.out.println("Highest Salary Employee details:"); 
     emp1.high();
    }else if (emp2.salary>emp1.salary && emp2.salary>emp3.salary){
        System.out.println("Highest Salary Employee details:"); 
     emp2.high();
    }else{
    System.out.println("Highest Salary Employee details:"); 
     emp3.high();
    }
    
    //question number 4 
    System.out.println("question 4");
    Laptops Laptops1=new Laptops("DELL",8,100000);
    Laptops Laptops2=new Laptops("HP",32,150000);
    Laptops Laptops3=new Laptops("ACER",16,120000);
    if(Laptops1.ram > 8){
        Laptops1.display();
        }else if(Laptops2.ram >8){
            Laptops2.display();
        }else if(Laptops3.ram >8){
            Laptops3.display();}else{System.out.println("no Laptop has RAM greater than 8GB");
    }
    
    //question number 5
    System.out.println("QUESTION 5");
    Mobile Mobile1= new Mobile("iphone",115000);
    Mobile Mobile2= new Mobile("samsung",80000);
    Mobile Mobile3= new Mobile("Redmi",14000);
    
    Mobile1.isAffordable();
    Mobile2.isAffordable();
    Mobile3.isAffordable();
    
    //question number 6
    System.out.println("\nQUESTION 6");
    result Student1= new result(70,80.5,87.9);
    result Student2= new result(90,91.5,95.5);
    //calculating marks
    Student1.solve();
    Student2.solve();
    //displaying
    Student1.display();
    Student2.display();
    
    
    //Scenario
    System.out.println("\n Scenario");
    BankAccount acc1= new BankAccount(123456,"RAM SHRESTHA",1000000);
    BankAccount acc2= new BankAccount(123456,"SHYAM SHRESTHA",500000);
    
    
    
    }
}
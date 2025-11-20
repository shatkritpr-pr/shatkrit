
/**
 * Write a description of class TutorialC2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorialC2
{
    public static void main (String[]args){
        
    int age=18; //declare variable
    System.out.println(age);
    int qty=8;
    //implicit Typecasting --> Widening Casting
    
    int h=10;
    double k=h;
    System.out.println(k);
     
    double a=10.5;
    int b = (int)a;
    
System.out.println(b);    
    //Explicit typecasting -->Narrow Casting
    
    // Exceptions in airthmetic operations 
    short st=10;
    short sr=9;
    short sum = (short)(st +sr);
    System.out.println(sum);  
    byte m=10;
    byte n=11;
    byte num=(byte)(n+m);
    System.out.println(num);  
    
    
    //Let's check mac,min and size of the values
    // for byte
    
    System.out.println(Byte.MAX_VALUE);

    System.out.println(Byte.MIN_VALUE);
    System.out.println(Byte.SIZE);
    System.out.println(Byte.BYTES);
    
    
    // Escape Sequence
    System.out.println("Hello\nWorld");
    System.out.println("Hamro\tNepal");
    System.out.println("He said \"hi\" ");
    System.out.println("\u2764");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
    }

}

/**
 * Write a description of class workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4
{
    public static void main(String[] args)
    {
    int age;
    age=17; 
    System.out.println("Welcome to the mart");
    if(age>=18)
    {
        System.out.println(age);
    }else
    {
        System.out.println("Thank you!Happy customer");
    }
    
    
    //two way decision making
    int num=10;
    if(num > 0){
        System.out.println("This number is postive");
        
    }else{
        System.out.println("this number is negative");
    }
    
    //
    int num1=10;
    if(num1 > 0){
        System.out.println("This number is postive");
        
    }else{
        System.out.println("this number is negative");
    }
    //divisible by 3 and divisible by 5
    int num2=15; 
    if (num2 % 3 == 0){
        if(num2 % 5 == 0)
        { 
            System.out.println("Divisible by both 3 and 5");
        }
        else{
            System.out.println("Divisible by 3 but not by 5");
            
        }
    
    }
    else {
        System.out.println("Not Divisible by both 3 and 5");
    }
    
    
    }
    
    
}
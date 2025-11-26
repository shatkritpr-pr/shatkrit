import java.util.Scanner;

/**
 * Write a description of class QUES5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUES5
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
    System.out.print("ENTER A NUMBER");
    int NUM4=scan.nextInt();
        if (NUM4 % 3 == 0){
            if(NUM4 % 5 == 0)
                { 
                    System.out.println("Divisible by both 3 and 5");
                }
            else{
                System.out.println("Divisible by 3 but not by 5");
            }
    }
    else if(NUM4 % 5 == 0){
                System.out.println("Divisible by 5 but not by 3");

    }
    else{
        System.out.println("Not Divisible by both 3 and 5");
    }
    
    } 
}
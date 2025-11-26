import java.util.Scanner;

/**
 * Write a description of class QUES1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUES1
{
    public static void main(String[] args)
    {
         Scanner scan=new Scanner(System.in);
    System.out.print("ENTER YOUR MARKS");
    int marks=scan.nextInt();
    
    if(marks >=40){
        System.out.print("Passed");}
        else{
            System.out.print("Failed");}
        }
    
}
import java.util.Scanner;

/**
 * Write a description of class QUES2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUES2
{ 
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("ENTER A NUMBER");
    int NUM1=scan.nextInt();
    
    if(NUM1 % 2 ==0){
        System.out.print("THE NUMBER IS EVEN");}
        else{
            System.out.print("THE NUMBER IS ODD");}
        }
}

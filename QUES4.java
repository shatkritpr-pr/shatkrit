import java.util.Scanner;

/**
 * Write a description of class QUES4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUES4
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
    System.out.print("ENTER A NUMBER");
    int NUM3=scan.nextInt();
    
    if(NUM3 % 3 == 0 && NUM3 % 5 == 0 ){
        System.out.print("THE NUMBER IS DIVISIBLE BY 3 AND 5");}
    else if(NUM3 % 5 == 0){
            System.out.print("THE NUMBER IS DIVISIBLE BY 5");}
            else if(NUM3 % 3 == 0){
                System.out.print("THE NUMBER IS DIVISIBLE BY 3");}
   else{
       System.out.print("THE NUMBER IS NOT DIVISIBLE BY 3 AND 5");
    
    }
    }
}
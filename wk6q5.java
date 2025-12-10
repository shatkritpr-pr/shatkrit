import java.util.Scanner;

/**
 * Write a description of class wk6q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wk6q5
{
    public static void main(String [] args){
    Scanner input= new Scanner(System.in);
    String[] district={"Morang","kathmandu","kaski","Sindhuli"};
    for(int i=0;i<district.length;i++){
    System.out.println((i+1)+","+district[i]);
    }
    System.out.println("enter the number");
    int n=input.nextInt();
    for(int i=0;i<n;i++){
    System.out.println((i+1)+ "."+ district[i]);
    }
    
    }
}
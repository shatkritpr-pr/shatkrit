import java.util.Scanner;

/**
 * Write a description of class QUES6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QUES6
{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.print("ENTER MP");
    float MP=scan.nextFloat();
    System.out.print("ENTER a CATEGORY");
    char Cat=scan.next().charAt(0); 
    float discount=0;
    float SP=0;
    
     if(Cat=='A' || Cat =='a'){
         SP= MP-(MP*0.60F);
         System.out.print("SELLING PRICE=" +SP);
     }else if(Cat=='B' || Cat =='b'){
         SP= MP-(MP*0.40F);
         System.out.print("SELLING PRICE=" +SP);
     }else if(Cat=='C' || Cat =='c'){
         SP= MP-(MP*0.20F);
         System.out.print("SELLING PRICE=" +SP);
     }else if(Cat=='D'|| Cat =='d'){
         SP= MP-(MP*0.10F);
         System.out.print("SELLING PRICE=" +SP);
         
     }
     else{
         System.out.println("INVALID CATEGORY");
         System.out.println("SELLING PRICE="+ MP);
        }
         
         
    
    }
    }

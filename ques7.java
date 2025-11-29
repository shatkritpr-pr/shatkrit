import java.util.Scanner;

/**
 * Write a description of class ques7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques7
{
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    float MP,Discount=0;
        float SP=0;
        char cat;
        
        System.out.print("Enter the marpket price:");
        MP = sc.nextFloat();
        System.out.print("Enter the category of give data:");
        cat = sc.next().charAt(0);
        
        switch(cat) {
case'A':
System.out.println("The SP with D=60% is::"+(MP-0.6*MP));
 break;
case 'B':
System.out.println("The SP with D=40% is ::"+ (MP-0.4*MP)); 
break; 
case'C':
System.out.println("The SP with D=20% is ::"+ (MP-0.2*MP));
 break; 
case'D':
System.out.println("The Sp with D=10% is ::"+(MP-0.1*MP));
 break; 
 default:
System.out.println ("category is not A and D");
        
}
}
}
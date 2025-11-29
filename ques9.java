import java.util.Scanner;

/**
 * Write a description of class ques9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques9
{
public static void main (String[] args) {
Scanner sc =new Scanner (System. in);
System.out.println("Enter the GPA"); 
float GPA= sc.nextFloat();
System.out.println("Enter the attendence in %");
float a = sc.nextFloat();
System.out.println("Enter the attitude between 1 to 10") ; 
int att = sc.nextInt();
if (GPA>=3.2){
    if(a >= 80){
        if(att >= 5){
            System.out.print("Student is eligible for scholorship");
        }
        else{
            System.out.println("Not eligible: att score is low");
        }
    }
    else{
        System.out.println("Not eligible: a is below 80%");
    }   
}
else{
    System.out.println("Not eligible: GPA is below 3.2");
}
}
}
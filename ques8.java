import java.util.Scanner;

/**
 * Write a description of class ques8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques8
{
     public static void main(String[] args){
        Scanner scan = new Scanner (System. in); 
        double gpa = scan.nextDouble();
if(gpa < 0 || gpa > 4) {
System.out.println("Invalid GPA");
}else if(gpa >=3.7){
System.out.println("Grade:A");
}else if(gpa >=3.0){
System.out.println("Grade:B");
}else if (gpa >=2.0){
System.out.println("Grade: C");
}else if(gpa >=1.0){
System.out.println ("Grade:D") ;
}else{
System.out.println ("Grade:F") ;
    }
}
}
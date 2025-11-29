import java.util.Scanner;

/**
 * Write a description of class ques10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ques10
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the paper size from A0 to A5");
        String size = s.next();
        
        switch(size) {
            case "1":
                System.out.println("A0: 841 * 1189 mm (33.1 * 46.8 inches)");
                break;
            case "2":
                 System.out.println("A1: 594 * 841 mm (23.4 * 33.1 inches)");
                break;
            case "3":
                  System.out.println("A2: 420 * 594 mm (16.5 * 23.4 inches)");
                break;
            case "4":
                   System.out.println("A3: 297 * 420 mm (11.7 * 16.5 inches)");
                break;
            case "5":
                    System.out.println("A4: 210 * 297 mm (8.3 * 11.7 inches)");
                break;
            case "6":
                     System.out.println("A5: 148 * 210 mm (5.8 * 8.3 inches)");
                break;
            default:
                System.out.println("ERROR");
                
        }
        
}
}
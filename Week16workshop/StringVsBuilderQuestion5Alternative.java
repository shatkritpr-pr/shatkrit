package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class Question5Alternative here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */


public class StringVsBuilderQuestion5Alternative
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Using String (Inefficient for multiple appends) ===");
        System.out.print("Enter initial string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String second = scanner.nextLine();
        str = str + second; // String concatenation creates new object
        
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.nextLine();
        str = str + num; // Another new String object
        
        System.out.print("Enter a special character: ");
        String special = scanner.nextLine();
        str = str + special; // Yet another new String object
        
        System.out.println("Final String: " + str);
        
        System.out.println("\n=== Using StringBuilder (Efficient) ===");
        System.out.print("Enter initial string: ");
        String initial = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(initial);
        
        System.out.print("Enter second string: ");
        second = scanner.nextLine();
        sb.append(second); // Modifies existing object
        
        System.out.print("Enter an integer: ");
        num = scanner.nextInt();
        scanner.nextLine();
        sb.append(num); // Modifies existing object
        
        System.out.print("Enter a special character: ");
        special = scanner.nextLine();
        sb.append(special); // Modifies existing object
        
        System.out.println("Final StringBuilder: " + sb.toString());
        
        scanner.close();
    }
}
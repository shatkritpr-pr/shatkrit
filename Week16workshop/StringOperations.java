package Week16workshop;


/**
 * Write a description of class StringOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner; // Import the Scanner class to read user input

/**
 * Write a description of class StringOperations here.
 * This program takes two strings, concatenates them, and compares
 * the result with a third string.
 *
 * @author (Your Name)
 * @version (Date)
 * question 1
 */
public class StringOperations
{
    public static void main(String[] args)
    {
        // 1. Creating a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 2. Taking the first input string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        // 3. Taking the second input string
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        // 4. Then Concatenate the first and second strings using the concat() method
        String combinedString = firstString.concat(secondString);
        System.out.println("Concatenated result: \"" + combinedString + "\"");

        // 5. Taking the third input string for comparison
        System.out.print("Enter the third string to compare with: ");
        String thirdString = scanner.nextLine();

        // 6. Comparing the combined string with the third string using the equals() method
        boolean areEqual = combinedString.equals(thirdString);

        // 7. Display the result of the comparison
        System.out.println("Comparison result: " + areEqual);

        // Optional: Print a user-friendly message
        if (areEqual) {
            System.out.println("The concatenated string matches the third string exactly.");
        } else {
            System.out.println("The concatenated string does NOT match the third string.");
        }

        // Close the scanner
        scanner.close();
    }
}
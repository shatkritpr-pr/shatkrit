package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class StringManipulator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * question 2
 */
public class StringManipulator
{
    public static void main(String[] args)
    {
        // 1. Creating a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 2. Taking input string from the user
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        System.out.println("\n--- Original String ---");
        System.out.println("Original: \"" + originalString + "\"");

        // 3. Operation 1: Removing leading and trailing whitespace using trim()
        String trimmedString = originalString.trim();
        System.out.println("\n--- After trim() ---");
        System.out.println("Trimmed: \"" + trimmedString + "\"");

        // 4. Operation 2: Extracting substring containing only the first 10 characters using substring()
        //    First, check if the string length is at least 10 characters
        String firstTenChars;
        if (trimmedString.length() >= 10) {
            firstTenChars = trimmedString.substring(0, 10); 
            // characters from index 0 to 9 (10 characters total)
        } else {
            firstTenChars = trimmedString; 
            // if string is shorter than 10, take the whole string
        }
        System.out.println("\n--- After substring(0, 10) ---");
        System.out.println("First 10 characters: \"" + firstTenChars + "\"");

        // 5. Operation 3: Spliting the string into a list of words and print them individually using split()
        System.out.println("\n--- After split() ---");
        // The regular expression "\\s+" splits on one or more whitespace characters (spaces, tabs, etc.)
        String[] words = trimmedString.split("\\s+");
        
        // Checks if there are any words (if the string was empty or only whitespace)
        if (words.length > 0 && !words[0].isEmpty()) {
            System.out.println("The string contains " + words.length + " word(s):");
            for (int i = 0; i < words.length; i++) {
                System.out.println("Word " + (i + 1) + ": \"" + words[i] + "\"");
            }
        } else {
            System.out.println("The string does not contain any words.");
        }

        // Close the scanner
        scanner.close();
    }
}
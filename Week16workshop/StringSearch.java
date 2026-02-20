package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class StringSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Question 3
 * 
 */
public class StringSearch
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 2. Take the main input string from the user
        System.out.print("Enter a main string: ");
        String mainString = scanner.nextLine();
        
        System.out.println("\n--- Main String ---");
        System.out.println("\"" + mainString + "\"");
        System.out.println("Length: " + mainString.length() + " characters");
        System.out.println("Index positions go from 0 to " + (mainString.length() - 1));

        // 3. Operation 1: Retrieve a character at a specific index using charAt()
        System.out.println("\n--- Operation 1: charAt() ---");
        System.out.print("Enter an index number to retrieve the character: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int index = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left after nextInt()
            
            // Check if the index is within valid range
            if (index >= 0 && index < mainString.length()) {
                char characterAtIndex = mainString.charAt(index);
                System.out.println("Character at index " + index + ": '" + characterAtIndex + "'");
            } else {
                System.out.println("Error: Index out of range. Please enter a number between 0 and " + (mainString.length() - 1));
            }
        } else {
            System.out.println("Error: Please enter a valid integer.");
            scanner.nextLine(); // Clear the invalid input
        }

        // 4. Operation 2: Find the first occurrence of a user-specified character using indexOf()
        System.out.println("\n--- Operation 2: indexOf() for a character ---");
        System.out.print("Enter a character to find its first occurrence: ");
        String charInput = scanner.nextLine();
        
        if (charInput.length() > 0) {
            char searchChar = charInput.charAt(0); // Take only the first character if user types more
            int firstIndex = mainString.indexOf(searchChar);
            
            if (firstIndex != -1) {
                System.out.println("First occurrence of '" + searchChar + "' is at index: " + firstIndex);
            } else {
                System.out.println("Character '" + searchChar + "' not found in the string.");
            }
        } else {
            System.out.println("No character entered.");
        }

        // 5. Operation 3: Check if the string contains a given word and print its index position
        System.out.println("\n--- Operation 3: contains() and indexOf() for a word ---");
        System.out.print("Enter a word to search for: ");
        String searchWord = scanner.nextLine();
        
        // Check if the string contains the word using contains()
        boolean containsWord = mainString.contains(searchWord);
        
        if (containsWord) {
            // Find the index position using indexOf()
            int wordIndex = mainString.indexOf(searchWord);
            System.out.println("The string DOES contain \"" + searchWord + "\"");
            System.out.println("First occurrence starts at index: " + wordIndex);
        } else {
            System.out.println("The string does NOT contain \"" + searchWord + "\"");
        }

        // Close the scanner
        scanner.close();
    }
}
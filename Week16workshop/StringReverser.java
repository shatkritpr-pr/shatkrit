package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class StringReverser here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//Part A ques 6

public class StringReverser
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== STRING REVERSER (Without Built-in Methods) ==========");

        // 2. Take input string from the user
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();
        
        System.out.println("\nOriginal String: \"" + originalString + "\"");
        System.out.println("Length: " + originalString.length() + " characters");

        // 3. Reverse the string manually using a loop and charAt()
        String reversedString = reverseString(originalString);
        
        // 4. Display the reversed string
        System.out.println("\n--- Reversed String ---");
        System.out.println("Reversed: \"" + reversedString + "\"");
        
        // 5. Show step-by-step process (for learning)
        System.out.println("\n--- Step-by-Step Reversal Process ---");
        demonstrateReversal(originalString);

        // Close the scanner
        scanner.close();
    }
    
    /**
     * Reverses a string manually without using built-in reverse methods.
     * Uses a loop from the end to the beginning and charAt() to access characters.
     * 
     * @param str The string to reverse
     * @return The reversed string
     */
    public static String reverseString(String str)
    {
        // Handle null or empty string
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        // Create a StringBuilder to build the reversed string efficiently
        // (We're using StringBuilder for efficiency, but we're manually adding characters)
        StringBuilder reversed = new StringBuilder();
        
        // Loop from the last character index to the first (0)
        for (int i = str.length() - 1; i >= 0; i--) {
            // Get character at current position using charAt()
            char currentChar = str.charAt(i);
            // Append it to our result
            reversed.append(currentChar);
        }
        
        // Convert StringBuilder to String and return
        return reversed.toString();
    }
    
    /**
     * Demonstrates the reversal process step by step for learning purposes.
     * 
     * @param str The string to demonstrate reversal on
     */
    public static void demonstrateReversal(String str)
    {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty, nothing to reverse.");
            return;
        }
        
        System.out.println("Starting with: \"" + str + "\"");
        System.out.println("Index positions: 0 to " + (str.length() - 1));
        System.out.println();
        
        // Show the reversal process
        StringBuilder process = new StringBuilder();
        
        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);
            process.append(currentChar);
            System.out.println("Step " + (str.length() - i) + ": Take char at index " + 
                               i + " ('" + currentChar + "') → Building: \"" + process + "\"");
        }
        
        System.out.println("\nFinal reversed string: \"" + process + "\"");
    }
}
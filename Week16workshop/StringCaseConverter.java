package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class StringCaseConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * Question 4
 */
public class StringCaseConverter
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // 2. Take input string from the user
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();
        
        System.out.println("\n========== STRING CASE MANIPULATION ==========");
        System.out.println("Original String: \"" + originalString + "\"");

        // 3. Operation 1: Convert to UPPERCASE using toUpperCase()
        String upperCaseString = originalString.toUpperCase();
        System.out.println("\n--- 1. UPPERCASE (toUpperCase()) ---");
        System.out.println("Result: \"" + upperCaseString + "\"");

        // 4. Operation 2: Convert to lowercase using toLowerCase()
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("\n--- 2. lowercase (toLowerCase()) ---");
        System.out.println("Result: \"" + lowerCaseString + "\"");

        // 5. Operation 3: Convert to Title Case (first character of each word to uppercase)
        String titleCaseString = convertToTitleCase(originalString);
        System.out.println("\n--- 3. Title Case (First letter of each word capitalized) ---");
        System.out.println("Result: \"" + titleCaseString + "\"");
        
        System.out.println("\n================================================");

        // Close the scanner
        scanner.close();
    }
    
    /**
     * Converts a string to Title Case.
     * First character of each word becomes uppercase, remaining characters become lowercase.
     * 
     * @param input The string to convert
     * @return The title-cased string
     */
    
    public static String convertToTitleCase(String input)
    {
        // Handle empty or null input
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        // Trim the string to remove leading/trailing spaces
        String trimmed = input.trim();
        
        // Split the string into words using whitespace as delimiter
        // The regex "\\s+" splits on one or more whitespace characters
        String[] words = trimmed.split("\\s+");
        
        // StringBuilder is more efficient than string concatenation in loops
        StringBuilder titleCase = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() > 0) {
                // Get the first character and convert to uppercase
                char firstChar = Character.toUpperCase(word.charAt(0));
                
                // Get the rest of the word (if any) and convert to lowercase
                String restOfWord = "";
                if (word.length() > 1) {
                    restOfWord = word.substring(1).toLowerCase();
                }
                
                // Build the title-cased word
                String titleWord = firstChar + restOfWord;
                titleCase.append(titleWord);
                
                // Add a space after each word except the last one
                if (i < words.length - 1) {
                    titleCase.append(" ");
                }
            }
        }
        
        return titleCase.toString();
    }
    
    /**
     * Alternative method to convert to Title Case without using StringBuilder
     * (Simpler but less efficient for very long strings)
     */
    public static String convertToTitleCaseSimple(String input)
    {
        // Handle empty or null input
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        // Trim and split
        String trimmed = input.trim();
        String[] words = trimmed.split("\\s+");
        String result = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            
            if (word.length() > 0) {
                // First character uppercase, rest lowercase
                String titleWord = word.substring(0, 1).toUpperCase() + 
                                   word.substring(1).toLowerCase();
                
                result += titleWord;
                
                // Add space between words (but not after the last word)
                if (i < words.length - 1) {
                    result += " ";
                }
            }
        }
        
        return result;
    }
}
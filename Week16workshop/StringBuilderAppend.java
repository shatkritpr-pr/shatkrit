package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class StringBuilderAppend here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class StringBuilderAppend
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== STRINGBUILDER APPEND DEMONSTRATION ==========");

        // 2. Take the initial string from the user
        System.out.print("Enter the initial string: ");
        String initialString = scanner.nextLine();
        
        // 3. Create a StringBuilder object with the initial string
        StringBuilder stringBuilder = new StringBuilder(initialString);
        
        System.out.println("\n--- Initial State ---");
        System.out.println("StringBuilder contains: \"" + stringBuilder.toString() + "\"");
        System.out.println("Current length: " + stringBuilder.length());

        // 4. Append a second string to the initial string
        System.out.print("\nEnter a second string to append: ");
        String secondString = scanner.nextLine();
        
        stringBuilder.append(secondString);
        System.out.println("After appending second string: \"" + stringBuilder.toString() + "\"");
        System.out.println("Current length: " + stringBuilder.length());

        // 5. Append an integer to the string
        System.out.print("\nEnter an integer to append: ");
        
        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            scanner.nextLine(); // Consume the newline left after nextInt()
            
            stringBuilder.append(number);
            System.out.println("After appending integer " + number + ": \"" + stringBuilder.toString() + "\"");
            System.out.println("Current length: " + stringBuilder.length());
        } else {
            System.out.println("Invalid input. Skipping integer append.");
            scanner.nextLine(); // Clear the invalid input
        }

        // 6. Append a special character to the string
        System.out.print("\nEnter a special character to append (e.g., ! @ # $ %): ");
        String specialCharInput = scanner.nextLine();
        
        if (specialCharInput.length() > 0) {
            char specialChar = specialCharInput.charAt(0); // Take only the first character
            stringBuilder.append(specialChar);
            System.out.println("After appending special character '" + specialChar + "': \"" + stringBuilder.toString() + "\"");
            System.out.println("Current length: " + stringBuilder.length());
        } else {
            System.out.println("No character entered. Skipping special character append.");
        }

        // 7. Print the final modified string after all append operations
        System.out.println("\n========== FINAL RESULT ==========");
        System.out.println("Final StringBuilder contents: \"" + stringBuilder.toString() + "\"");
        System.out.println("Final string length: " + stringBuilder.length());
        System.out.println("Final string as String: " + stringBuilder.toString());
        
        // 8. Demonstrate chaining of append methods (optional)
        System.out.println("\n--- Bonus: Method Chaining ---");
        StringBuilder chainBuilder = new StringBuilder("Start");
        System.out.println("Starting with: \"" + chainBuilder + "\"");
        
        chainBuilder.append(" + ").append("more").append(" + ").append(123).append(" + ").append('!');
        System.out.println("After chaining appends: \"" + chainBuilder + "\"");

        // Close the scanner
        scanner.close();
    }
}
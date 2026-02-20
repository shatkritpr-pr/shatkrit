package Week16workshop;
import java.util.Scanner;


/**
 * Write a description of class PalindromeChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//PART B que 6
public class PalindromeChecker
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== PALINDROME CHECKER ==========");
        System.out.println("A palindrome reads the same forwards and backwards");
        System.out.println("Examples: 'madam', 'racecar', 'level'\n");

        // 2. Take input string from the user
        System.out.print("Enter a string to check: ");
        String originalString = scanner.nextLine();
        
        // Remove any leading/trailing spaces for accurate comparison
        String trimmedString = originalString.trim();
        
        System.out.println("\nOriginal String: \"" + trimmedString + "\"");
        System.out.println("Length: " + trimmedString.length() + " characters");

        // 3. Reverse the string manually (using the method from Part A)
        String reversedString = reverseString(trimmedString);
        
        System.out.println("Reversed String: \"" + reversedString + "\"");
        
        // 4. Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(trimmedString, reversedString);
        
        // 5. Display the result
        System.out.println("\n========== RESULT ==========");
        if (isPalindrome) {
            System.out.println("✅ The string IS a palindrome!");
            System.out.println("   \"" + trimmedString + "\" reads the same forwards and backwards.");
        } else {
            System.out.println("❌ The string is NOT a palindrome.");
            System.out.println("   \"" + trimmedString + "\" does NOT read the same as \"" + reversedString + "\"");
        }
        
        // 6. Bonus: Show case-insensitive palindrome check
        System.out.println("\n--- Bonus: Case-Insensitive Check ---");
        boolean isPalindromeIgnoreCase = checkPalindromeIgnoreCase(trimmedString);
        System.out.println("Case-insensitive check: " + 
                          (isPalindromeIgnoreCase ? "✅ Is a palindrome" : "❌ Not a palindrome"));

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
        
        // Create a character array to build the reversed string
        // (Alternative to StringBuilder for pure manual approach)
        char[] reversedChars = new char[str.length()];
        
        // Loop from the last character index to the first
        for (int i = 0; i < str.length(); i++) {
            // Place characters in reverse order
            // First character of original (index 0) goes to last position
            reversedChars[str.length() - 1 - i] = str.charAt(i);
        }
        
        // Convert character array to string
        return new String(reversedChars);
        
        /* Alternative using StringBuilder (more efficient):
         * StringBuilder reversed = new StringBuilder();
         * for (int i = str.length() - 1; i >= 0; i--) {
         *     reversed.append(str.charAt(i));
         * }
         * return reversed.toString();
         */
    }
    
    /**
     * Checks if a string is a palindrome by comparing with its reverse.
     * 
     * @param original The original string
     * @param reversed The reversed string
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindrome(String original, String reversed)
    {
        // Compare the original and reversed strings
        return original.equals(reversed);
    }
    
    /**
     * Alternative method: Checks if a string is a palindrome without creating a separate reversed string.
     * Compares characters from both ends moving inward.
     * 
     * @param str The string to check
     * @return true if palindrome, false otherwise
     */
    public static boolean checkPalindromeDirect(String str)
    {
        if (str == null || str.isEmpty()) {
            return true; // Empty string is considered a palindrome
        }
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Mismatch found
            }
            left++;
            right--;
        }
        
        return true; // All characters matched
    }
    
    /**
     * Checks if a string is a palindrome ignoring case.
     * 
     * @param str The string to check
     * @return true if palindrome (case-insensitive), false otherwise
     */
    public static boolean checkPalindromeIgnoreCase(String str)
    {
        if (str == null || str.isEmpty()) {
            return true;
        }
        
        // Convert to lowercase for case-insensitive comparison
        String lowerStr = str.toLowerCase();
        
        int left = 0;
        int right = lowerStr.length() - 1;
        
        while (left < right) {
            if (lowerStr.charAt(left) != lowerStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
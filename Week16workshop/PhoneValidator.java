package Week16workshop;
import java.util.Scanner;


/**
 * - Exactly 10 digits
 * - Must start with 98 or 97
 * - No letters, spaces, or special characters
 *- question-7

 */
public class PhoneValidator
{
    public static void main(String[] args)
    {
        // 1. Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        System.out.println("========== NEPALI MOBILE NUMBER VALIDATOR ==========");
        System.out.println("Valid Nepali mobile numbers must:");
        System.out.println("✓ Be exactly 10 digits long");
        System.out.println("✓ Start with 98 or 97");
        System.out.println("✓ Contain only digits (no spaces, dashes, or letters)");
        System.out.println("\nExamples: 9841234567, 9776543210\n");

        // 2. Test with predefined examples (as given in the question)
        System.out.println("--- Testing with given examples ---");
        testPhoneNumber("9841234567");
        testPhoneNumber("1234567890");
        testPhoneNumber("98412345");
        testPhoneNumber("98-412-345");
        System.out.println();

        // 3. Allow user to test their own phone numbers
        System.out.println("--- Test your own phone numbers ---");
        System.out.println("Enter phone numbers to validate (type 'quit' to exit):");
        
        while (true) {
            System.out.print("\nEnter phone number: ");
            String phoneNumber = scanner.nextLine();
            
            if (phoneNumber.equalsIgnoreCase("quit")) {
                break;
            }
            
            boolean isValid = isValidPhone(phoneNumber);
            System.out.println("Result: " + phoneNumber + " → " + isValid + " (" + 
                              (isValid ? "valid" : "invalid") + ")");
            
            // Show detailed validation reasons
            showValidationDetails(phoneNumber);
        }

        System.out.println("\nThank you for using the Phone Validator!");
        scanner.close();
    }
    
    /**
     * Validates whether a given phone number is a valid Nepali mobile number.
     * 
     * @param phone The phone number string to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidPhone(String phone)
    {
        // Handle null or empty input
        if (phone == null || phone.isEmpty()) {
            return false;
        }
        
        // Regular expression explanation:
        // ^        - Start of string
        // [9]      - First digit must be 9
        // [87]     - Second digit must be either 8 or 7 (for 98 or 97)
        // [0-9]{8} - Followed by exactly 8 more digits (0-9)
        // $        - End of string
        String regex = "^[9][87][0-9]{8}$";
        
        // Using matches() method to check if the phone number matches the pattern
        return phone.matches(regex);
    }
    
    /**
     * Helper method to test phone numbers and display results.
     * 
     * @param phone The phone number to test
     */
    public static void testPhoneNumber(String phone)
    {
        boolean isValid = isValidPhone(phone);
        System.out.println("\"" + phone + "\" → " + isValid + " " + 
                          (isValid ? "✓ valid" : "✗ invalid"));
    }
    
    /**
     * Shows detailed validation information for a phone number.
     * 
     * @param phone The phone number to analyze
     */
    public static void showValidationDetails(String phone)
    {
        System.out.println("  Validation Details:");
        
        if (phone == null || phone.isEmpty()) {
            System.out.println("  - ❌ Phone number is null or empty");
            return;
        }
        
        // Check length
        if (phone.length() != 10) {
            System.out.println("  - ❌ Length: " + phone.length() + " characters (must be exactly 10)");
        } else {
            System.out.println("  - ✓ Length: 10 characters");
        }
        
        // Check if all characters are digits
        boolean allDigits = true;
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                allDigits = false;
                break;
            }
        }
        
        if (!allDigits) {
            System.out.println("  - ❌ Contains non-digit characters (only digits allowed)");
        } else if (phone.length() >= 2) {
            System.out.println("  - ✓ All characters are digits");
        }
        
        // Check if starts with 98 or 97
        if (phone.length() >= 2) {
            String prefix = phone.substring(0, 2);
            if (prefix.equals("98") || prefix.equals("97")) {
                System.out.println("  - ✓ Starts with " + prefix + " (valid prefix)");
            } else {
                System.out.println("  - ❌ Starts with " + prefix + " (must start with 98 or 97)");
            }
        }
    }
    
    /**
     * Alternative validation method using different regex approaches.
     * 
     * @param phone The phone number to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidPhoneAlternative(String phone)
    {
        // Alternative regex patterns that also work:
        
        // Pattern 1: Using character classes
        // String regex = "^9[87]\\d{8}$";
        
        // Pattern 2: More explicit
        // String regex = "^(98|97)\\d{8}$";
        
        // Pattern 3: With word boundaries
        // String regex = "\\b[9][87][0-9]{8}\\b";
        
        String regex = "^(98|97)\\d{8}$";
        return phone != null && phone.matches(regex);
    }
}
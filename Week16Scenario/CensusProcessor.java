package Week16Scenario;

/**
 * Write a description of class CensusProcessor here.
 * This class processes CSV data for the Ministry of Education census.
 * It includes validation, searching, statistical analysis, and report generation.
 *
 * @author (Your Name)
 * @version (Date)
 */
public class CensusProcessor
{
    // Hard-coded CSV data as specified in the question
    private static String[] csvData = {
        "Name,Age,School,Grade,Citizenship,Phone",
        "Ram Bahadur Thapa,18,Ithari Int. College,12,01-0012345,9841234567",
        "Sita Kumari Rai,17,Ithari Int. College,11,01-0054321,9807654321",
        "Hari Prasad Sharma,19,ICK College,12,02-0098765,9812345678",
        "Gita Devi Tamang,16,ICP College,10,03-0011111,9900000000",
        "Bikash Kumar Limbu,18,Ithari Int. College,12,01-0077777,9841111111",
        "Anita Rai,17,ICK College,11,04-0022222,981234",
        "Deepak Shah,20,ICP College,12,01-00ABCDE,9867890123"
    };
    
    /**
     * Main method to demonstrate all functionality including the report generator.
     */    
    
/**
    public static void main(String[] args)
    {
        System.out.println("========== CENSUS DATA PROCESSING SYSTEM ==========");
        System.out.println("A complete solution for the Ministry of Education\n");
        
        // SECTION B: Parse CSV data
        System.out.println("--- SECTION B: CSV Parsing ---");
        Student[] students = parseCSV(csvData);
        
        // SECTION C: Data Validation
        System.out.println("\n--- SECTION C: Data Validation ---");
        demonstrateValidation();
        
        // SECTION D: Searching & Statistical Analysis
        System.out.println("\n--- SECTION D: Searching & Statistical Analysis ---");
        demonstrateSearchAndAnalysis(students);
        
        // SECTION E: Generate Census Report
        System.out.println("\n--- SECTION E: Census Report Generator ---");
        String report = generateCensusReport(students);
        System.out.println(report);
    }
*/
   /**
 * Main method 1: Full demonstration (all sections)
 */

/**
public static void main(String[] args)
{
    System.out.println("========== CENSUS DATA PROCESSING SYSTEM ==========");
    System.out.println("A complete solution for the Ministry of Education\n");
    
    // SECTION B: Parse CSV data
    System.out.println("--- SECTION B: CSV Parsing ---");
    Student[] students = parseCSV(csvData);
    
    // SECTION C: Data Validation
    System.out.println("\n--- SECTION C: Data Validation ---");
    demonstrateValidation();
    
    // SECTION D: Searching & Statistical Analysis
    System.out.println("\n--- SECTION D: Searching & Statistical Analysis ---");
    demonstrateSearchAndAnalysis(students);
    
    // SECTION E: Generate Census Report
    System.out.println("\n--- SECTION E: Census Report Generator ---");
    String report = generateCensusReport(students);
    System.out.println(report);
}
*/

/**
 * Main method 2: Only report generator (as requested)
 */
public static void main(String[] args)
{
    // Parse CSV data
    Student[] students = parseCSV(csvData);
    
    // Generate and print the census report
    String report = generateCensusReport(students);
    System.out.println(report);
}
   
    // ========== SECTION B: CSV PARSING ==========
    
    /**
     * Parses raw CSV lines into an array of Student objects.
     * Skips the header row, splits each row by commas, trims fields,
     * converts numeric fields, and creates Student objects.
     * 
     * @param csvData Array of CSV strings (including header row)
     * @return Array of Student objects
     */
    public static Student[] parseCSV(String[] csvData)
    {
        // Check if csvData is null or has only header (no data rows)
        if (csvData == null || csvData.length <= 1) {
            System.out.println("No data rows found in CSV.");
            return new Student[0]; // Return empty array
        }
        
        // Number of data rows = total rows - header row
        int dataRowCount = csvData.length - 1;
        
        // Create an array to hold Student objects
        Student[] students = new Student[dataRowCount];
        
        System.out.println("Parsing " + dataRowCount + " CSV records...");
        
        // Process each data row (skip header row which is at index 0)
        for (int i = 1; i < csvData.length; i++) {
            String currentLine = csvData[i];
            
            // Split the CSV line by comma
            String[] fields = currentLine.split(",");
            
            // Check if we have all 6 fields
            if (fields.length < 6) {
                System.out.println("Warning: Row " + i + " has incomplete data. Skipping.");
                continue;
            }
            
            try {
                // Trim all fields to remove extra whitespace
                String name = fields[0].trim();
                String ageStr = fields[1].trim();
                String school = fields[2].trim();
                String gradeStr = fields[3].trim();
                String citizenship = fields[4].trim();
                String phone = fields[5].trim();
                
                // Convert numeric fields using Integer.parseInt()
                int age = Integer.parseInt(ageStr);
                int grade = Integer.parseInt(gradeStr);
                
                // Create a new Student object and store in array
                students[i - 1] = new Student(name, age, school, grade, citizenship, phone);
                
            } catch (NumberFormatException e) {
                System.out.println("Warning: Row " + i + " contains invalid number format. Skipping.");
                // This row will be null in the array
            }
        }
        
        System.out.println("Parsing complete. Created " + students.length + " student records.");
        return students;
    }
    
    // ========== SECTION C: DATA VALIDATION ==========
    
    /**
     * Validates a citizenship number according to Ministry rules.
     * Rules:
     * - Exactly 10 characters
     * - Format: NN-NNNNNN (first 2 digits, then hyphen, then 6 digits)
     * - First 2 characters must be digits
     * - Character at index 2 must be '-'
     * - Last 7 characters (index 3-9) must be digits
     * 
     * @param cit The citizenship number to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidCitizenship(String cit)
    {
        // Check for null
        if (cit == null) {
            return false;
        }
        
        // Rule 1: Exactly 10 characters
        if (cit.length() != 10) {
            return false;
        }
        
        // Rule 2: Character at index 2 must be '-'
        if (cit.charAt(2) != '-') {
            return false;
        }
        
        // Rule 3: First 2 characters must be digits (index 0 and 1)
        for (int i = 0; i < 2; i++) {
            if (!Character.isDigit(cit.charAt(i))) {
                return false;
            }
        }
        
        // Rule 4: Last 7 characters (index 3 to 9) must be digits
        for (int i = 3; i < 10; i++) {
            if (!Character.isDigit(cit.charAt(i))) {
                return false;
            }
        }
        
        // All rules passed
        return true;
    }
    
    /**
     * Validates a phone number (from Question 7).
     * Rules:
     * - Exactly 10 digits
     * - Must start with 98 or 97
     * - No letters, spaces, or special characters
     * 
     * @param phone The phone number to validate
     * @return true if valid, false otherwise
     */
    public static boolean isValidPhone(String phone)
    {
        // Check for null
        if (phone == null) {
            return false;
        }
        
        // Rule: Exactly 10 characters
        if (phone.length() != 10) {
            return false;
        }
        
        // Rule: All characters must be digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return false;
            }
        }
        
        // Rule: Must start with 98 or 97
        String prefix = phone.substring(0, 2);
        return prefix.equals("98") || prefix.equals("97");
    }
    
    /**
     * Validates both citizenship and phone for a student.
     * 
     * @param student The student to validate
     * @return true if both citizenship and phone are valid
     */
    public static boolean isValidStudent(Student student)
    {
        if (student == null) {
            return false;
        }
        return isValidCitizenship(student.getCitizenship()) && 
               isValidPhone(student.getPhone());
    }
    
    // ========== SECTION D: SEARCHING & STATISTICAL ANALYSIS ==========
    
    /**
     * 1. Find all students from a given school.
     * Uses equalsIgnoreCase() for case-insensitive comparison.
     * 
     * @param students Array of Student objects
     * @param school The school name to search for
     * @return Array of students from that school
     */
    public static Student[] findBySchool(Student[] students, String school)
    {
        if (students == null || students.length == 0 || school == null) {
            return new Student[0];
        }
        
        // First, count how many students match
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getSchool().equalsIgnoreCase(school)) {
                count++;
            }
        }
        
        // Create array of matching students
        Student[] result = new Student[count];
        int index = 0;
        
        for (Student s : students) {
            if (s != null && s.getSchool().equalsIgnoreCase(school)) {
                result[index++] = s;
            }
        }
        
        return result;
    }
    
    /**
     * 2. Count number of students in a specific grade.
     * 
     * @param students Array of Student objects
     * @param grade The grade to count
     * @return Number of students in that grade
     */
    public static int countByGrade(Student[] students, int grade)
    {
        if (students == null || students.length == 0) {
            return 0;
        }
        
        int count = 0;
        for (Student s : students) {
            if (s != null && s.getGrade() == grade) {
                count++;
            }
        }
        
        return count;
    }
    
    /**
     * 3. Calculate average age of all students.
     * 
     * @param students Array of Student objects
     * @return Average age as double (returns 0.0 if no valid students)
     */
    public static double averageAge(Student[] students)
    {
        if (students == null || students.length == 0) {
            return 0.0;
        }
        
        int totalAge = 0;
        int validCount = 0;
        
        for (Student s : students) {
            if (s != null) {
                totalAge += s.getAge();
                validCount++;
            }
        }
        
        if (validCount == 0) {
            return 0.0;
        }
        
        return (double) totalAge / validCount;
    }
    
    /**
     * 4. Find the student with the longest name.
     * Uses length() comparison.
     * 
     * @param students Array of Student objects
     * @return Student with the longest name (returns null if no valid students)
     */
    public static Student findLongestName(Student[] students)
    {
        if (students == null || students.length == 0) {
            return null;
        }
        
        Student longestNameStudent = null;
        int maxLength = -1;
        
        for (Student s : students) {
            if (s != null) {
                int nameLength = s.getName().length();
                if (nameLength > maxLength) {
                    maxLength = nameLength;
                    longestNameStudent = s;
                }
            }
        }
        
        return longestNameStudent;
    }
    
    // ========== SECTION E: CENSUS REPORT GENERATOR ==========
    
    /**
     * Generates a formatted census report using StringBuilder.
     * The report includes:
     * 1. Title banner + summary line (total, valid, invalid counts)
     * 2. Full student list with initials, name, age, grade, valid/invalid
     * 3. Statistics: average age, longest name, counts per school
     * 
     * @param students Array of Student objects
     * @return Formatted report as a String
     */
    public static String generateCensusReport(Student[] students)
    {
        StringBuilder report = new StringBuilder();
        
        // ========== 1. TITLE BANNER + SUMMARY LINE ==========
        report.append("=" .repeat(80)).append("\n");
        report.append("              NEPAL MINISTRY OF EDUCATION - CENSUS REPORT 2080\n");
        report.append("=" .repeat(80)).append("\n\n");
        
        // Calculate summary statistics
        int totalRecords = (students == null) ? 0 : students.length;
        int validCount = 0;
        int invalidCount = 0;
        
        if (students != null) {
            for (Student s : students) {
                if (s != null && isValidStudent(s)) {
                    validCount++;
                } else {
                    invalidCount++;
                }
            }
        }
        
        // Summary line
        report.append("SUMMARY:\n");
        report.append(String.format("  Total Records: %d\n", totalRecords));
        report.append(String.format("  Valid Records: %d\n", validCount));
        report.append(String.format("  Invalid Records: %d\n\n", invalidCount));
        
        // ========== 2. FULL STUDENT LIST ==========
        report.append("-" .repeat(80)).append("\n");
        report.append("STUDENT LIST:\n");
        report.append("-" .repeat(80)).append("\n");
        
        // Table header with aligned columns using String.format()
        report.append(String.format("%-4s | %-8s | %-25s | %-4s | %-6s | %-10s\n",
                  "S.N.", "Initials", "Full Name", "Age", "Grade", "Status"));
        report.append("-" .repeat(80)).append("\n");
        
        if (students == null || students.length == 0) {
            report.append("No student records found.\n");
        } else {
            int serialNo = 1;
            for (Student s : students) {
                if (s != null) {
                    String status = isValidStudent(s) ? "VALID" : "INVALID";
                    String statusDisplay = isValidStudent(s) ? "✓ VALID" : "✗ INVALID";
                    
                    report.append(String.format("%-4d | %-8s | %-25s | %-4d | Grade %-2d | %-10s\n",
                              serialNo++,
                              s.getNameInitials(),
                              truncateString(s.getName(), 25),
                              s.getAge(),
                              s.getGrade(),
                              statusDisplay));
                } else {
                    report.append(String.format("%-4d | %-8s | %-25s | %-4s | %-6s | %-10s\n",
                              serialNo++,
                              "N/A",
                              "NULL RECORD",
                              "?",
                              "?",
                              "✗ INVALID"));
                }
            }
        }
        
        report.append("-" .repeat(80)).append("\n\n");
        
        // ========== 3. STATISTICS ==========
        report.append("STATISTICAL ANALYSIS:\n");
        report.append("-" .repeat(40)).append("\n");
        
        // Average age
        double avgAge = averageAge(students);
        report.append(String.format("Average Age: %.2f years\n", avgAge));
        
        // Longest name
        Student longestNameStudent = findLongestName(students);
        if (longestNameStudent != null) {
            report.append(String.format("Longest Name: \"%s\" (%d characters)\n",
                          longestNameStudent.getName(),
                          longestNameStudent.getName().length()));
        } else {
            report.append("Longest Name: N/A\n");
        }
        
        // Counts per school
        report.append("\nStudent Count by School:\n");
        java.util.HashMap<String, Integer> schoolCounts = new java.util.HashMap<>();
        
        if (students != null) {
            for (Student s : students) {
                if (s != null) {
                    String school = s.getSchool();
                    schoolCounts.put(school, schoolCounts.getOrDefault(school, 0) + 1);
                }
            }
        }
        
        if (schoolCounts.isEmpty()) {
            report.append("  No schools found.\n");
        } else {
            for (String school : schoolCounts.keySet()) {
                report.append(String.format("  %-25s: %d student(s)\n", 
                              truncateString(school, 25), schoolCounts.get(school)));
            }
        }
        
        // Grade distribution
        report.append("\nStudent Count by Grade:\n");
        for (int grade = 10; grade <= 12; grade++) {
            int count = countByGrade(students, grade);
            report.append(String.format("  Grade %d: %d student(s)\n", grade, count));
        }
        
        // Validation summary
        report.append("\nValidation Summary:\n");
        report.append(String.format("  Valid Students  : %d\n", validCount));
        report.append(String.format("  Invalid Students: %d\n", invalidCount));
        
        if (students != null) {
            report.append("\nInvalid Records Details:\n");
            boolean hasInvalid = false;
            for (Student s : students) {
                if (s != null && !isValidStudent(s)) {
                    hasInvalid = true;
                    report.append(String.format("  - %s: ", s.getName()));
                    
                    if (!isValidCitizenship(s.getCitizenship())) {
                        report.append("Citizenship invalid, ");
                    }
                    if (!isValidPhone(s.getPhone())) {
                        report.append("Phone invalid");
                    }
                    report.append("\n");
                }
            }
            if (!hasInvalid) {
                report.append("  No invalid records found.\n");
            }
        }
        
        report.append("=" .repeat(80)).append("\n");
        report.append("END OF REPORT - Generated by Census Processing System\n");
        report.append("=" .repeat(80)).append("\n");
        
        return report.toString();
    }
    
    // ========== UTILITY METHODS ==========
    
    /**
     * Prints all students in a formatted table.
     * 
     * @param students Array of Student objects to print
     */
    public static void printAllStudents(Student[] students)
    {
        if (students == null || students.length == 0) {
            System.out.println("No student records to display.");
            return;
        }
        
        // Print header
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.printf("%-3s | %-25s | %-4s | %-8s | %-20s | %-15s | %-15s | %-8s\n", 
                          "SN", "Name (Initials)", "Age", "Grade", "School", "Citizenship", "Phone", "Valid");
        System.out.println("-----------------------------------------------------------------------------------------------------");
        
        // Loop through each student and print their details
        int validCount = 0;
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            
            if (s != null) {
                boolean valid = isValidStudent(s);
                if (valid) validCount++;
                
                System.out.printf("%-3d | %-25s | %-4d | Grade %-3d | %-20s | %-15s | %-15s | %-8s\n",
                                  i + 1,
                                  s.getName() + " (" + s.getNameInitials() + ")",
                                  s.getAge(),
                                  s.getGrade(),
                                  truncateString(s.getSchool(), 20),
                                  truncateString(s.getCitizenship(), 15),
                                  truncateString(s.getPhone(), 15),
                                  valid ? "✓" : "✗");
            } else {
                System.out.printf("%-3d | %-25s | %-4s | %-8s | %-20s | %-15s | %-15s | %-8s\n",
                                  i + 1, "INVALID RECORD", "?", "?", "?", "?", "?", "✗");
            }
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Total records: " + students.length + " | Valid records: " + validCount);
    }
    
    /**
     * Demonstrates all validation methods from Section C.
     */
    public static void demonstrateValidation()
    {
        System.out.println("Citizenship Validation (isValidCitizenship):");
        
        // Test valid citizenship
        String validCit = "01-0012345";
        System.out.println("  \"" + validCit + "\" → " + isValidCitizenship(validCit) + " (valid)");
        
        // Test invalid citizenships
        String[] testCitizenships = {
            "01-001234",    // Too short (9 chars)
            "01-00123456",  // Too long (11 chars)
            "011-001234",   // Hyphen at wrong position
            "A1-0012345",   // First char not digit
            "01A0012345",   // No hyphen
            "01-00A2345"    // Contains letter after hyphen
        };
        
        for (String cit : testCitizenships) {
            System.out.println("  \"" + cit + "\" → " + isValidCitizenship(cit) + " (invalid)");
        }
        
        System.out.println("\nPhone Validation (isValidPhone):");
        
        // Test valid phones
        String[] validPhones = {"9841234567", "9776543210"};
        for (String phone : validPhones) {
            System.out.println("  \"" + phone + "\" → " + isValidPhone(phone) + " (valid)");
        }
        
        // Test invalid phones
        String[] testPhones = {
            "984123456",    // Too short
            "98412345678",  // Too long
            "98-4123456",   // Contains dash
            "98412A4567",   // Contains letter
            "9941234567",   // Starts with 99 (invalid)
            "981234567"     // 9 digits
        };
        
        for (String phone : testPhones) {
            System.out.println("  \"" + phone + "\" → " + isValidPhone(phone) + " (invalid)");
        }
    }
    
    /**
     * Demonstrates all search and analysis methods from Section D.
     * 
     * @param students Array of Student objects
     */
    public static void demonstrateSearchAndAnalysis(Student[] students)
    {
        if (students == null || students.length == 0) {
            System.out.println("No student data available for analysis.");
            return;
        }
        
        // 1. Find by school
        System.out.println("1. findBySchool(\"Ithari Int. College\"):");
        Student[] ithariStudents = findBySchool(students, "Ithari Int. College");
        System.out.println("   Found " + ithariStudents.length + " students");
        for (Student s : ithariStudents) {
            if (s != null) {
                System.out.println("   - " + s.getName() + " (Grade " + s.getGrade() + ")");
            }
        }
        
        System.out.println("\n   findBySchool(\"ICK College\") with equalsIgnoreCase:");
        Student[] ickStudents = findBySchool(students, "ick college"); // lowercase to test ignoreCase
        System.out.println("   Found " + ickStudents.length + " students");
        for (Student s : ickStudents) {
            if (s != null) {
                System.out.println("   - " + s.getName() + " (Grade " + s.getGrade() + ")");
            }
        }
        
        // 2. Count by grade
        System.out.println("\n2. countByGrade:");
        for (int grade = 10; grade <= 12; grade++) {
            int count = countByGrade(students, grade);
            System.out.println("   Grade " + grade + ": " + count + " student(s)");
        }
        
        // 3. Average age
        System.out.println("\n3. averageAge:");
        double avgAge = averageAge(students);
        System.out.println("   Average age: " + String.format("%.2f", avgAge) + " years");
        
        // 4. Find longest name
        System.out.println("\n4. findLongestName:");
        Student longest = findLongestName(students);
        if (longest != null) {
            System.out.println("   Longest name: \"" + longest.getName() + "\"");
            System.out.println("   Length: " + longest.getName().length() + " characters");
            System.out.println("   Student: " + longest.toString());
        }
    }
    
    /**
     * Helper method to truncate a string if it's too long.
     * 
     * @param str The string to truncate
     * @param maxLength Maximum allowed length
     * @return Truncated string with ellipsis if needed
     */
    private static String truncateString(String str, int maxLength)
    {
        if (str == null) return "";
        if (str.length() <= maxLength) return str;
        return str.substring(0, maxLength - 3) + "...";
    }
    
    /**
 * Simplified main method to demonstrate the report generator.
 */

}
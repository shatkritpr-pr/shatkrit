package Week16Scenario;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    // Private fields (encapsulation)
    private String name;
    private int age;
    private String school;
    private int grade;
    private String citizenship;
    private String phone;
    
    /**
     * Constructor that initializes all fields.
     * 
     * @param name The student's full name
     * @param age The student's age
     @ @param school The school/college name
     * @param grade The student's grade/year level
     * @param citizenship The student's citizenship number
     * @param phone The student's phone number
     */
    public Student(String name, int age, String school, int grade, String citizenship, String phone)
    {
        this.name = name;
        this.age = age;
        this.school = school;
        this.grade = grade;
        this.citizenship = citizenship;
        this.phone = phone;
    }
    
    // ========== GETTER METHODS ==========
    
    /**
     * @return The student's name
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The student's age
     */
    public int getAge()
    {
        return age;
    }
    
    /**
     * @return The student's school/college name
     */
    public String getSchool()
    {
        return school;
    }
    
    /**
     * @return The student's grade/year level
     */
    public int getGrade()
    {
        return grade;
    }
    
    /**
     * @return The student's citizenship number
     */
    public String getCitizenship()
    {
        return citizenship;
    }
    
    /**
     * @return The student's phone number
     */
    public String getPhone()
    {
        return phone;
    }
    
    // ========== UTILITY METHODS ==========
    
    /**
     * Extracts initials from the student's full name.
     * Example: "Ram Bahadur Thapa" → "R.B.T."
     * 
     * @return The formatted initials with dots after each initial
     */
    public String getNameInitials()
    {
        // Handle null or empty name
        if (name == null || name.trim().isEmpty()) {
            return "";
        }
        
        // Split the name by spaces to get individual name parts
        String[] nameParts = name.trim().split("\\s+");
        
        // Use StringBuilder for efficient string construction
        StringBuilder initials = new StringBuilder();
        
        // Loop through each part of the name
        for (String part : nameParts) {
            if (part.length() > 0) {
                // Take the first character, convert to uppercase (in case it's lowercase)
                char initial = Character.toUpperCase(part.charAt(0));
                initials.append(initial).append(".");
            }
        }
        
        return initials.toString();
    }
    
    /**
     * Override toString() to return a formatted summary using String.format().
     * Format: "Ram Bahadur Thapa | 18 | Grade 12 | Itahari Int. College"
     * 
     * @return A formatted string representation of the student
     */
    @Override
    public String toString()
    {
        return String.format("%s | %d | Grade %d | %s", 
                             name, age, grade, school);
    }
    
    /**
     * Returns a detailed formatted string with all information.
     * Useful for debugging or detailed reports.
     * 
     * @return A detailed string with all student information
     */
    public String toDetailedString()
    {
        return String.format("Name: %s (%s)\nAge: %d\nSchool: %s\nGrade: %d\nCitizenship: %s\nPhone: %s",
                             name, getNameInitials(), age, school, grade, citizenship, phone);
    }
    
    /**
     * Main method for testing the Student class.
     * This allows us to test the class directly in BlueJ.
     */
    public static void main(String[] args)
    {
        System.out.println("========== STUDENT CLASS TEST ==========\n");
        
        // Create a few student objects for testing
        Student student1 = new Student("Ram Bahadur Thapa", 18, "Itahari Int. College", 12, "123-456-789", "9841234567");
        Student student2 = new Student("Sita Kumari Sharma", 17, "Valley Public School", 11, "987-654-321", "9776543210");
        Student student3 = new Student("Gita Devi KC", 16, "Himalaya H.S. School", 10, "456-789-123", "9812345678");
        Student student4 = new Student("Hari Prasad Poudel", 19, "Patan Multiple Campus", 13, "789-123-456", "9856789012");
        
        // Test the getter methods
        System.out.println("--- Testing Getter Methods ---");
        System.out.println("Student 1 Name: " + student1.getName());
        System.out.println("Student 1 Age: " + student1.getAge());
        System.out.println("Student 1 School: " + student1.getSchool());
        System.out.println("Student 1 Grade: " + student1.getGrade());
        System.out.println("Student 1 Citizenship: " + student1.getCitizenship());
        System.out.println("Student 1 Phone: " + student1.getPhone());
        System.out.println();
        
        // Test the getNameInitials() method
        System.out.println("--- Testing getNameInitials() Method ---");
        System.out.println("Full Name: \"Ram Bahadur Thapa\" → Initials: \"" + student1.getNameInitials() + "\"");
        System.out.println("Full Name: \"Sita Kumari Sharma\" → Initials: \"" + student2.getNameInitials() + "\"");
        System.out.println("Full Name: \"Gita Devi KC\" → Initials: \"" + student3.getNameInitials() + "\"");
        System.out.println("Full Name: \"Hari Prasad Poudel\" → Initials: \"" + student4.getNameInitials() + "\"");
        System.out.println();
        
        // Test edge cases for initials
        Student edgeCase1 = new Student("John", 20, "Test School", 12, "CIT001", "9800000000");
        Student edgeCase2 = new Student("   Multiple   Spaces   Here   ", 20, "Test School", 12, "CIT002", "9800000001");
        
        System.out.println("--- Testing Edge Cases for Initials ---");
        System.out.println("Single name \"John\" → Initials: \"" + edgeCase1.getNameInitials() + "\"");
        System.out.println("Multiple spaces \"   Multiple   Spaces   Here   \" → Initials: \"" + edgeCase2.getNameInitials() + "\"");
        System.out.println();
        
        // Test the toString() method (formatted summary)
        System.out.println("--- Testing toString() Method (Formatted Summary) ---");
        System.out.println("student1.toString():");
        System.out.println("  " + student1.toString());
        System.out.println("\nstudent2.toString():");
        System.out.println("  " + student2.toString());
        System.out.println();
        
        // Test the toDetailedString() method
        System.out.println("--- Testing toDetailedString() Method ---");
        System.out.println(student1.toDetailedString());
        System.out.println();
        System.out.println(student2.toDetailedString());
        System.out.println();
        
        // Display all students in a formatted table
        System.out.println("--- All Students (Formatted Table) ---");
        System.out.println("--------------------------------------------------------");
        System.out.printf("%-25s | %-3s | %-8s | %-25s\n", "Name (Initials)", "Age", "Grade", "School");
        System.out.println("--------------------------------------------------------");
        printStudentRow(student1);
        printStudentRow(student2);
        printStudentRow(student3);
        printStudentRow(student4);
        System.out.println("--------------------------------------------------------");
    }
    
    /**
     * Helper method to print a student row in table format.
     * 
     * @param student The student to print
     */
    private static void printStudentRow(Student student)
    {
        System.out.printf("%-25s | %-3d | Grade %-2d | %-25s\n",
                          student.getName() + " (" + student.getNameInitials() + ")",
                          student.getAge(),
                          student.getGrade(),
                          student.getSchool());
    }
}
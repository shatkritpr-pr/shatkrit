package WEEK10WORKSHOP;


/**
 * Write a description of class ExamApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExamApp {
    public static void main(String[] args) {
        ScienceStudent science = new ScienceStudent(101, "Alice", 42);
        ManagementStudent management = new ManagementStudent(102, "Bob", 38);

        System.out.println(science);
        System.out.println("Science Result: " + science.calculateResult());
        System.out.println("Science Result with Grace: " + science.calculateResult(3));

        System.out.println(management);
        System.out.println("Management Result: " + management.calculateResult());
        System.out.println("Management Result with Grace: " + management.calculateResult(12));
    }
}
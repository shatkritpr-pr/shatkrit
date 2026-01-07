package WEEK10WORKSHOP;


/**
 * Write a description of class ManagementStudent here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStudent extends Student {

    ManagementStudent(int rollNo, String name, int marks) {
        super(rollNo, name, marks);
    }

    @Override
    public String calculateResult() {
        return super.calculateResult();
    }

    public String calculateResult(int graceMarks) {
        int total = getMarks() + graceMarks;
        return total >= 50 ? "Pass" : "Fail";
    }
}
package WEEK10TUTORIAL;


public class OfflineCourse extends Course
{
    private double labFee;
    
    public OfflineCourse(int courseId, String courseName, double baseFee, double labFee)
    {
        super(courseId, courseName, baseFee);
        this.labFee= labFee;
    }
    
    @Override
    protected double calculateFee()
    {
        return super.getBaseFee() + this.labFee;
    }
    
    public void displayOfflineCourseDetails()
    {
        super.displayCourseDetails(); // course id , course name
        System.out.println("Total fee for this offline course: "+ this.calculateFee());
        
    }
    
    
}

package WEEK10WORKSHOP;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp {
    public static void main(String[] args) {
        Doctor doctor = new Doctor(1, "Dr. Shatkrit Pradhananga", 500000, "Orthopedic", 150000);
        Nurse nurse = new Nurse(2, "Ram", 300000, "Day", 50000);

        System.out.println(doctor);
        System.out.println("Doctor Salary with Emergencies: " + doctor.calculateSalary(2));
        System.out.println(nurse);
    }
}
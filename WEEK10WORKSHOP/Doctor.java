package WEEK10WORKSHOP;


/**
 * Write a description of class Docter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Doctor extends Person {
    private String specialization;
    private double consultationFee;

    Doctor(int id, String name, double baseSalary, String specialization, double consultationFee) {
        super(id, name, baseSalary);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        this.consultationFee = consultationFee;
    }

    public double calculateSalary() {
        return super.calculateSalary() + consultationFee;
    }

    public double calculateSalary(int emergencyCases) {
        return calculateSalary() + (emergencyCases * 2000);
    }

    public String toString() {
        return super.toString() +"\n"+" Specialization: " + specialization +"\n"+" Salary: " + calculateSalary();
    }
}

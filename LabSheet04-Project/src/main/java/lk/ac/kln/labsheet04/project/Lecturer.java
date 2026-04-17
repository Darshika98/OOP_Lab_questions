package lk.ac.kln.labsheet04.project; 
public class Lecturer extends StaffMember {
    private final int courseCount;
    private final double paymentPerCourse;
    public Lecturer(String fullName, String staffid, String department, int courseCount, double paymentPerCourse) {
        super(fullName, staffid, department); 
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }
    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }
    public void displayLecturerDetails() {
        displayBasicDetails(); 
        System.out.println("Course Count: " + courseCount);
        System.out.println("Payment Per Course: " + paymentPerCourse);
        System.out.println("Total Monthly Salary: " + calculateMonthlyPayment());
    }
}

package lk.ac.kln.labsheet04.project;
public class LabAssistant extends StaffMember {
    private final int hoursWorked;
    private final double hourlyRate;
    public LabAssistant(String fullName, String staffid, String department, int hoursWorked, double hourlyRate) {
        super(fullName, staffid, department); 
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double calculateMonthlyPayment() {
        return hoursWorked * hourlyRate;
    }
    public void displayLabAssistantDetails() {
        displayBasicDetails(); 
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println("Total Monthly Payment: " + calculateMonthlyPayment());
    }
}

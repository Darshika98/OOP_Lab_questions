package lk.ac.kln.labsheet04.project; 
public abstract class StaffMember {
    private final String fullName; 
    private final String staffid; 
    protected String department; 

    // Constructor [cite: 137]
    public StaffMember(String fullName, String staffid, String department) {
        this.fullName = fullName;
        this.staffid = staffid;
        this.department = department;
    }
    public String getFullName() { return fullName; }
    public String getStaffid() { return staffid; }
    public String getDepartment() { return department; }

    public final void displayBasicDetails() {
        System.out.println("Staff ID: " + staffid);
        System.out.println("Full Name: " + fullName);
        System.out.println("Department: " + department);
    }
    public abstract double calculateMonthlyPayment();
}
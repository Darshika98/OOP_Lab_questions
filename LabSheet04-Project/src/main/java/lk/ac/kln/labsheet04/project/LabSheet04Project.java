package lk.ac.kln.labsheet04.project;

public class LabSheet04Project {

    public static void main(String[] args) {
        System.out.println("--- Staff Management System ---\n");
        Lecturer lec = new Lecturer("Darshika Madhuwanthi", "L001", "Science", 3, 45000.0);
        System.out.println("Lecturer Information:");
        lec.displayLecturerDetails();
        System.out.println("\n-------------------------------\n");
        LabAssistant assistant = new LabAssistant("Sanduni Perera", "A005", "Physics", 40, 1500.0);
        System.out.println("Lab Assistant Information:");
        assistant.displayLabAssistantDetails();
    }
}

package model;

public class Bug implements ConsoleNotification {

    private String bugDescription;
    private BugReporter bugReporter;
    private int bugPriority;
    private String bugStatus;
    private String bugNumber;

    public Bug(String bugDescription, BugReporter bugReporter, int bugPriority, String bugNumber) {

        this.bugDescription = bugDescription;
        this.bugReporter = bugReporter;
        this.bugPriority = bugPriority;
        this.bugStatus = "Open";
        this.bugNumber = bugNumber;

    }

    public void setBugDescription(String bugDescription) {

        if (bugDescription.strip().length() >= 10) {
            this.bugDescription = bugDescription;
        } else {
            System.out.println("Description too short");
        }

    }

    public void setBugPriority(int bugPriority) {

        if (bugPriority >= 1 & bugPriority <= 5) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Invalid value for bugPriority");
        }
    }

   /* public void getFullInformation() {

        System.out.println("Full error information");
        System.out.println("Error number: " + bugNumber);
        System.out.println("Error description: " + bugDescription);
        System.out.println("The person reporting the bug: " + bugReporter.toString());
        System.out.println("Priority: " + bugPriority);
        System.out.println("error status: " + bugStatus);

    }*/


    public void getBugStatus() {

        System.out.println("The error status with the number: " + bugNumber + " - " + bugStatus);
    }

    public void setBugStatus(String bugStatus) {
        notifyStatusChange();
        this.bugStatus = bugStatus;
    }

    public int getPriority() {

        return bugPriority;
    }

    public BugReporter getBugReporter() {
        return bugReporter;
    }

    public void setBugReporter(BugReporter bugReporter) {
        this.bugReporter = bugReporter;
    }

    @Override
    public void notifyStatusChange() {
        System.out.println("!!! Bug status has changed !!!");
    }

    @Override
    public String toString() {
        return "Bug{" +
                "bugDescription='" + bugDescription + '\'' +
                ", bugReporter=" + bugReporter +
                ", bugPriority=" + bugPriority +
                ", bugStatus='" + bugStatus + '\'' +
                ", bugNumber='" + bugNumber + '\'' +
                '}';
    }
}

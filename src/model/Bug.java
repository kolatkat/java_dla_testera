package model;

import exceptions.IllegalBugPriorityException;

import java.util.Objects;

public class Bug implements ConsoleNotification, Comparable<Bug> {

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


    public void setBugPriority(int bugPriority) throws IllegalBugPriorityException {

        if (bugPriority >= 1 & bugPriority <= 5) {
            this.bugPriority = bugPriority;
        } else {
            throw new IllegalBugPriorityException("Invalid value for bugPriority. Please enter a number from 1 to 5");
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

    public String getBugDescription() {
        return bugDescription;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bug)) return false;
        Bug bug = (Bug) o;
        return bugPriority == bug.bugPriority &&
                Objects.equals(bugDescription, bug.bugDescription) &&
                Objects.equals(bugReporter, bug.bugReporter) &&
                Objects.equals(bugStatus, bug.bugStatus) &&
                Objects.equals(bugNumber, bug.bugNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bugDescription, bugReporter, bugPriority, bugStatus, bugNumber);
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

    @Override
    public int compareTo(Bug bug) {
        int compareResult = this.getBugDescription().compareTo(bug.getBugDescription());
        return compareResult;
    }
}

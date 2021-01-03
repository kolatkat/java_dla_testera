package model;

import java.util.Objects;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String email;

    public BugReporter(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setReporterFirstName(String reporterFirstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String reporterLastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else System.out.println("Incorrect e-mail address");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BugReporter that = (BugReporter) o;
        return Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "BugReporter{" +
                "reporterFirstName='" + firstName + '\'' +
                ", reporterLastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

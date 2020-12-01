package model;

public class Bug {

    private String bugDescription;
    private String bugSubmitterAddress;
    private int bugPriority;
    private String bugStatus;
    private String bugNumber;

    public Bug(String bugDescription, String bugSubmitterAddress, int bugPriority, String bugNumber) {

        this.bugDescription = bugDescription;
        this.bugSubmitterAddress = bugSubmitterAddress;
        this.bugPriority = bugPriority;
        this.bugStatus = "otwarty";
        this.bugNumber = bugNumber;

    }

    public void setBugSubmitterAddress(String bugSubmitterAddress) {

        if (bugSubmitterAddress.contains("@")) {
            this.bugSubmitterAddress = bugSubmitterAddress;
        } else System.out.println("Nieprawidłowy adres e-mail");
    }

    public void setBugDescription(String bugDescription) {

        if (bugDescription.strip().length() >= 10) {
            this.bugDescription = bugDescription;
        } else {
            System.out.println("Opis za krótki");
        }

    }

    public void setBugPriority(int bugPriority) {

        if (bugPriority >= 1 & bugPriority <= 5) {
            this.bugPriority = bugPriority;
        } else {
            System.out.println("Nieprawidłowa wartość dla bugPriority");
        }
    }

    public void getFullInformation() {

        System.out.println("Pełne informacje dot. błędu");
        System.out.println("Numer błędu: " + bugNumber);
        System.out.println("Opis błędu: " + bugDescription);
        System.out.println("Adrress eamil osoby zgłaszającej: " + bugSubmitterAddress);
        System.out.println("Priorytet: " + bugPriority);
        System.out.println("Status błędu: " + bugStatus);

    }

    public void getSubmitterAddress() {

        System.out.println("E-mail osoby zgłaszjącej błąd: " + bugSubmitterAddress);

    }

    public void getBugStatus() {

        System.out.println("Status błędu o numerze: " + bugNumber + " - " + bugStatus);
    }

    public int getPriority() {

        return bugPriority;
    }


}

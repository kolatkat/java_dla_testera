public class Bug {

    String bugDescription;
    String theBugSubmitterAddress;
    int priority;
    String bugStatus;
    String bugNumber;

    Bug(String bugDescription, String theBugSubmitterAddress, int priority, String bugNumber) {

        this.bugDescription = bugDescription;
        this.theBugSubmitterAddress = theBugSubmitterAddress;
        this.priority = priority;
        this.bugStatus = "otwarty";
        this.bugNumber = bugNumber;

    }

    void getFullInformation() {

        System.out.println("Pełne informacje dot. błędu");
        System.out.println("Numer błędu: " + bugNumber);
        System.out.println("Opis błędu: " + bugDescription);
        System.out.println("Adrress eamil osoby zgłaszającej: " + theBugSubmitterAddress);
        System.out.println("Priorytet: " + priority);
        System.out.println("Status błędu: " + bugStatus);

    }

    void getSubmitterAddress() {

        System.out.println("E-mail osoby zgłaszjącej błąd: " + theBugSubmitterAddress);

    }

    void getBugStatus() {

        System.out.println("Status błędu o numerze: " + bugNumber + " - " + bugStatus);
    }

    int getPriority() {

        return priority;
    }


}

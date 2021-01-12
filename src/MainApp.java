
import model.Bug;
import model.BugReporter;

import java.util.*;

public class MainApp<users> {

    public static void main(String[] args) {

        BugReporter bugReporter1 = new BugReporter("Kasia", "Testerka", "kasia@test.pl");
        BugReporter bugReporter2 = new BugReporter("Asia", "Malinowska", "asia@test.pl");

        List<Bug> bugs = new ArrayList<>();

        bugs.add(new Bug("Internet is not working!", bugReporter1, 5, "LW-111"));
        bugs.add(new Bug("Internet is not working!", bugReporter1, 5, "LW-111"));
        bugs.add(new Bug("An invoice cannot be issued", bugReporter2, 4, "LW-112"));
        bugs.add(new Bug("No validation for the email field", bugReporter2, 4, "LW-113"));
        bugs.add(new Bug("No validation for the email field", bugReporter2, 4, "LW-113"));

        for (Bug bug : bugs) {
            System.out.println(bug);
        }

        List<Bug> uniqueBugs = new ArrayList<>();

        uniqueBugs.add(bugs.get(0));

        for (int i = 0; i <bugs.size(); i++) {
            int counter = 0;
            for (int j = 0; j <uniqueBugs.size(); j++) {
                if (bugs.get(i).equals(uniqueBugs.get(j))) {
                    counter = 0;
                } else {
                    counter ++;
                    System.out.println(counter);
                }
            }
            if ( counter > 0) {
                uniqueBugs.add(bugs.get(i));
            }
        }

        System.out.println("==============================================");
        System.out.println("Prezentacja tylko unikalnych błędów, bez dubli");
        System.out.println("==============================================");

        for (Bug bug : uniqueBugs) {
            System.out.println(bug);
        }

        System.out.println("=========================================================");
        System.out.println("Posortowane unikalne błędy, bez dubli po polu Descryption");
        System.out.println("=========================================================");
        Collections.sort(uniqueBugs, Comparator.comparing(Bug::getBugDescription));
        for (Bug bug : uniqueBugs) {
            System.out.println(bug);
        }

        //drugi sposób - sposób Bartka, tworzymy Set-a podając jako argment naszą listę
        //Set<Bug> uniqueBug = new HashSet<>(bugs);
    }
}



import enums.Gender;
import model.Bug;
import model.BugReporter;
import model.User;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User("Alek", "b", "c@test.pl", 21, Gender.MALE));
        users.add(new User("Maja", "b", "m@test.pl", 51, Gender.FEMALE));
        users.add(new User("Mari", "m", "ma@test.pl", 41, Gender.FEMALE));
        users.add(new User("Matylda", "b", "mat@test.pl", 61, Gender.FEMALE));
        users.add(new User("Bartosz", "b", "b@test.pl", 34, Gender.MALE));
        users.add(new User("Franio", "b", "f@test.pl", 23, Gender.MALE));
        users.add(new User("Marcin", "b", "marcin@test.pl", 41, Gender.MALE));


        users.stream()
                .filter(s -> s.getGender().getName().equals("K"))
                .forEach(s -> System.out.println(s));

        //drugi sposób
//        users.stream()
//                .filter(s -> s.getGender().equals(Gender.FEMALE))
//                .forEach(s -> System.out.println(s));

        List<String> names = new ArrayList<>();
        Scanner line = new Scanner(System.in);
        System.out.println("Wprowadzanie danych do pliku, jeśli chcesz zakończyć wpisz literę q.");

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("imiona.txt"));

            boolean isTrue = true;
            while (isTrue) {
                System.out.println("Podaj imię -  zakończenie wprowadzania wpisz litere q: ");
                String imie = line.nextLine();
                if (imie.equalsIgnoreCase("q")) {
                    isTrue = false;
                } else {
                    names.add(imie);
                    bufferedWriter.write(imie);
                    bufferedWriter.newLine();
                }
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(names);

        names.stream()
                .filter(s -> s.startsWith("x"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Żadne imię nie rozpoczyna się na literę X"));

        Bug bug = new Bug("Opis błędu", new BugReporter("Kasia", "Test", "kasia@test.pl"), 1, "LW-12345");

        bug.setBugPriority(12);

    }
}



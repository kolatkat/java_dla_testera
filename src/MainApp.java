import computer.*;
import model.User;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp<users> {

    public static void main(String[] args) {

        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB Model 1", "PRO 1", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB Model 2", "PRO 2", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB Model 3", "PRO 3", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB Model 4", "PRO 4", new Hdd("HP", 500), new Ram("HP", 128), 100));
        computers.add(new Laptop("MB Model 5", "PRO 4", new Hdd("HP", 256), new Ram("HP", 128), 100));
        computers.add(new PC("PC 1", "ABC", new Hdd("HP", 500), new Ram("HP", 128)));
        computers.add(new PC("PC 2", "BCA", new Hdd("HP", 500), new Ram("HP", 256)));
        computers.add(new PC("PC 3", "CDE", new Hdd("HP", 256), new Ram("HP", 256)));

        // Zliczyć wszystkie komputery, które mają więcej niż 128 gb Ram-u

       long count = computers.stream()
                .filter(comp -> comp.getRam().getSize() > 128)
                .count();

        System.out.println("Liczba komputerów, których RAM jest większy > 128 wynosi: " +count);

        // Wyświetlić na konsolę wszystkie typy komputerów - map

        Set<String> uniqeType = computers.stream()
                .map(comp -> comp.getType())
                .collect(Collectors.toSet());

        System.out.println("Typy komputerów:");
        for (String type : uniqeType) {
            System.out.println(type);
        }
        // Drugi sposób
        computers.stream()
                .map(Computer::getType)
                .forEach(System.out::println);

        //Wyświetlić komputer, który ma najwięcej ram-u

      Optional<Integer> maxRam = computers.stream()
                .map(comp -> comp.getRam().getSize())
                .max(Integer::compareTo);

        List<Computer> computersMaxRam = computers.stream()
                .filter(comp -> comp.getRam().getSize() == maxRam.get())
                .collect(Collectors.toList());

        System.out.println("Komputery o największej pamięci Ram:");
        for (Computer comp : computersMaxRam) {
            System.out.println(comp);
        }

        // Drugi sposób

        System.out.println("Drugi sposób");

        Computer computer = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("Can not find any computer"));

        System.out.println(computer.getName());


        //Utworzyć nową kolekcję z komputerami, które mają dysk twardy mniejszy niż 500 gb

        List<Computer> computerHardDrive = computers.stream()
                .filter(comp -> comp.getHdd().getSize() < 500)
                .collect(Collectors.toList());

        System.out.println("Komputery - dysk twardy mniejszy od 500 gb:");
        for ( Computer comp : computerHardDrive) {
            System.out.println(comp);
        }

        //posortowac komputery po nazwie i typie

        List<Computer> sortedList = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());

        System.out.println("Posortowane komputery po nazwie i typie");
        for ( Computer comp : sortedList) {
            System.out.println(comp);
        }

        //przećwiczyć optional
        //ifPresent()

        System.out.println("==========================================================");
        computers.stream()
                .filter(comp -> comp.getRam().getSize() == maxRam.get())
                .findFirst()
                .ifPresent(comp -> System.out.println(comp));

        System.out.println("==========================================================");
        computers.stream()
                .filter(comp -> comp.getRam().getSize() > 500)
                .findFirst()
                .ifPresentOrElse(comp -> System.out.println(comp), () -> System.out.println("Nie ma komputera o pamięci większej od 500 Mb"));

        System.out.println("==========================================================");
        computers.stream()
                .filter(comp -> comp.getRam().getSize() > 500)
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Nie ma komputera o pamięci większej od 500 Mb"));

    }
}



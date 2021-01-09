import computer.Computer;
import computer.Hdd;
import computer.Laptop;
import computer.Ram;
import model.Bug;
import model.BugReporter;


public class MainApp {

    public static void main(String[] args) {

        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("AAA", 128);

        Computer mac = new Laptop("Mac", "PRO", hdd, ram, 100);

        // Inny sposób tworzenia obiektu Computer
        // Computer mac = new Laptop("Mac", "PRO", hdd, new Ram("AAA", 128), 100)

        System.out.println(mac.getRam().getSize());


        BugReporter bugReporter = new BugReporter("Kasia", "Testerka", "kasia@test.pl");
        Bug bug = new Bug("Internet is not working!", bugReporter, 5, "LW-111");

        System.out.println(bug);

        bug.setBugStatus("In progress");

        System.out.println(bug);
    }
}

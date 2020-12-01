import model.Bug;

public class MainApp {

    public static void main(String[] args) {

        Bug bugNumber1 = new Bug("Nie można wystawić faktury na osobę fizyczną", "test1@test.pl", 2, "LW-1111");

        System.out.println("Dane przy uzyciu konstruktora:");
        System.out.println("==========================================");
        bugNumber1.getFullInformation();
        System.out.println("==============================");


        bugNumber1.setBugPriority(4);

        bugNumber1.setBugSubmitterAddress("test2@test.pl");

        bugNumber1.setBugDescription("Problem z wystawieniem rachunku");


        System.out.println("Dane po uzyciu setterow:");
        System.out.println("==============================");

        bugNumber1.getFullInformation();
        System.out.println("==============================");


    }
}

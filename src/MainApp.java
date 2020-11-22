public class MainApp {

    public static void main(String[] args) {

        Bug bugNumber1 = new Bug("Nie można wystawić faktury na osobę fizyczną", "test1@test.pl", 2, "LW-1111");

        bugNumber1.getFullInformation();
        System.out.println("==============================");

        bugNumber1.getBugStatus();
        System.out.println("==============================");

        bugNumber1.getSubmitterAddress();

    }
}
